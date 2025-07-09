package com.javalikes.javalikes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javalikes.javalikes.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
