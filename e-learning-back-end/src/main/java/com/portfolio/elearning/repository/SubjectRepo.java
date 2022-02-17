package com.portfolio.elearning.repository;

import com.portfolio.elearning.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {
}
