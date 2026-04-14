package com.yazhini.hirehub.repository;

import com.yazhini.hirehub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
