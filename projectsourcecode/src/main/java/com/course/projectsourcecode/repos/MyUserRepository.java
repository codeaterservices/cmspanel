package com.course.projectsourcecode.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.projectsourcecode.model.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {
    Optional<MyUser> findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
