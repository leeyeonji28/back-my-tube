package com.mytube.mytube.user.dao;


import com.mytube.mytube.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
