package com.javalikes.javalikes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javalikes.javalikes.model.Enquiry;

public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {
}
