package com.javalikes.javalikes.controller;

import com.javalikes.javalikes.model.Enquiry;
import com.javalikes.javalikes.model.Registration;
import com.javalikes.javalikes.repository.EnquiryRepository;
import com.javalikes.javalikes.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EnquiryController {

    @Autowired
    private EnquiryRepository enquiryRepo;

    @Autowired
    private RegistrationRepository registrationRepo;

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("/enquiry")
    public String submitEnquiry(@RequestBody Enquiry enquiry) {
        enquiryRepo.save(enquiry);
        
        // Send email
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("vitthalwankhade95@gmail.com", "dhage.sagar17@gmail.com");
        message.setSubject("New Enquiry Received");
        message.setText("New enquiry for course: " + enquiry.getCourse()
                + "\nName: " + enquiry.getName()
                + "\nPhone: " + enquiry.getPhone()
                + "\nMessage: " + enquiry.getMessage());
        
        mailSender.send(message);

        return "Enquiry received! Our team will contact you shortly on WhatsApp.";
    }

    @PostMapping("/register")
    public String submitRegistration(@RequestBody Registration reg) {
    	 registrationRepo.save(reg);

    	    // ✅ Send mail to participant
    	    SimpleMailMessage participantMsg = new SimpleMailMessage();
    	    participantMsg.setTo(reg.getEmail());
    	    participantMsg.setSubject("Demo Class Registration Confirmation");
    	    participantMsg.setText("Hi " + reg.getName() + ",\n\n"
    	            + "Thanks for registering for the demo class on " + reg.getCourse() + ".\n"
    	            + "Here is your Google Meet link: https://meet.google.com/xyz-abc-def\n\n"
    	            + "Please join on time. For any help, contact us on WhatsApp at +91-9158810907.\n\n"
    	            + "Best Regards,\nJavaLikes Team");
    	    mailSender.send(participantMsg);

    	    // ✅ Also notify admins
    	    SimpleMailMessage adminMsg = new SimpleMailMessage();
    	    adminMsg.setTo("vitthalwankhade95@gmail.com", "dhage.sagar17@gmail.com");
    	    adminMsg.setSubject("New Registration for " + reg.getCourse());
    	    adminMsg.setText("New participant registered:\n\n"
    	            + "Name: " + reg.getName() + "\n"
    	            + "Email: " + reg.getEmail() + "\n"
    	            + "Phone: " + reg.getPhone() + "\n"
    	            + "Whatsapp: " + reg.getWhatsapp());
    	    mailSender.send(adminMsg);

    	    return "Registration successful. Check your email for the demo link!";
    }
}
