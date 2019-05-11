package com.jwagner.RecipeAPI.service;

import com.jwagner.RecipeAPI.entity.User;
import com.jwagner.RecipeAPI.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User getUserById(Long id){
        return userRepo.findById(id).get();
    }

    public User createOrUpdateUser(User user){
        return userRepo.save(user);
    }

    public User deleteUser(Long id){
        User u = getUserById(id);
        userRepo.delete(u);
        return u;
    }
}
