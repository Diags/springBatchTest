package com.sylaDiaguily.springBatch.repository;

import com.sylaDiaguily.springBatch.model.User;
import com.sylaDiaguily.springBatch.model.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRolesRepository extends JpaRepository<UserRoles,Long> {
}
