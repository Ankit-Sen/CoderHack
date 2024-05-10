package com.crio.coderHack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crio.coderHack.entity.UserEntity;
import com.crio.coderHack.exceptions.InvalidUserDetails;
import com.crio.coderHack.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
        try {
            userService.createUser(user);
			return ResponseEntity.ok(user);
		} catch (InvalidUserDetails e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
    }

    @GetMapping
    public List<UserEntity> getAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public UserEntity getUserByName(@PathVariable Integer userId){
        return userService.findUserById();
    }

    @PutMapping("/{userId}")
    public UserEntity updateUserById(@PathVariable Integer userId){
        return userService.updateUserById();
    }

    @DeleteMapping("/{userId}")
    public boolean deleteUserById(@PathVariable Integer userId){
        return userService.deleteById();
    }
}
