package com.javalikes.javalikes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javalikes.javalikes.model.MockInterviewSlot;
import com.javalikes.javalikes.repository.MockInterviewSlotRepository;

@RestController
@RequestMapping("/api/interviews")

public class MockInterviewController {
	@Autowired
	private MockInterviewSlotRepository slotRepo;

	@GetMapping("/available")
	public List<MockInterviewSlot> availableSlots() {
		return slotRepo.findByIsBookedFalse();
	}

	@PostMapping("/book/{slotId}")
	public String bookSlot(@PathVariable Long slotId, @RequestParam String studentEmail) {
		var slot = slotRepo.findById(slotId).orElseThrow();
		slot.setBooked(true);
		slot.setBookedBy(studentEmail);
		slotRepo.save(slot);
		return "Slot booked. Check email for Google Meet link.";
	}
}
