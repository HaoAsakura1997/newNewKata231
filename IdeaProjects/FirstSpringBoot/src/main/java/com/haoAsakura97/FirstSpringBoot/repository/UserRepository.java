package com.haoAsakura97.FirstSpringBoot.repository;

import com.haoAsakura97.FirstSpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
