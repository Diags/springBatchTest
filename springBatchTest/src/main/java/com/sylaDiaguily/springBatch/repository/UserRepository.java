package com.sylaDiaguily.springBatch.repository;

import com.sylaDiaguily.springBatch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
