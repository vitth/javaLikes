package com.javalikes.javalikes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javalikes.javalikes.model.MockInterviewSlot;

@Repository
public interface MockInterviewSlotRepository extends JpaRepository<MockInterviewSlot, Long> {
    List<MockInterviewSlot> findByIsBookedFalse();
}
