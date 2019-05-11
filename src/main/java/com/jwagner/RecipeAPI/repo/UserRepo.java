package com.jwagner.RecipeAPI.repo;

import com.jwagner.RecipeAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.id = ?1")
    User findUserById(Long id);
}
