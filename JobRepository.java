package com.yazhini.hirehub.repository;

import com.yazhini.hirehub.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
