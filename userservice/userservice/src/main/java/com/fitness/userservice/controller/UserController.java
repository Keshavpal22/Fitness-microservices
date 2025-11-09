package com.fitness.userservice.controller;


<<<<<<< HEAD
import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
=======
import com.fitness.userservice.dto.ResponseRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 6bfd4b050440436870b860d104ba30333646c307

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    private UserService userService;

<<<<<<< HEAD

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUserProfile(@PathVariable String userId){
        return ResponseEntity.ok(userService.getUserProfile(userId));
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@Valid @RequestBody RegisterRequest request){
=======
    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody ResponseRequest request){
>>>>>>> 6bfd4b050440436870b860d104ba30333646c307
        return ResponseEntity.ok(userService.register(request));
    }

}
