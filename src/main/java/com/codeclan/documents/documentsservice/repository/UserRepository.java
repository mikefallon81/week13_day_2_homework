package com.codeclan.documents.documentsservice.repository;

import com.codeclan.documents.documentsservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
