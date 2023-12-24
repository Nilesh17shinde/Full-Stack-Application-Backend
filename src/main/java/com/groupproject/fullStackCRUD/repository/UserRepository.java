package com.groupproject.fullStackCRUD.repository;

import com.groupproject.fullStackCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
