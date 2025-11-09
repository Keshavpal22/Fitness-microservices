package com.fitness.userservice.services;

import com.fitness.userservice.UserRepository;
<<<<<<< HEAD
import com.fitness.userservice.dto.RegisterRequest;
=======
import com.fitness.userservice.dto.ResponseRequest;
>>>>>>> 6bfd4b050440436870b860d104ba30333646c307
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

<<<<<<< HEAD
    public UserResponse register(RegisterRequest request) {
=======
    public UserResponse register(ResponseRequest request) {
>>>>>>> 6bfd4b050440436870b860d104ba30333646c307

        if (repository.existsByEmail(request.getEmail())){
            throw new RuntimeException("Email already exist");
        }

        User user = new User();
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
<<<<<<< HEAD
        user.setPassword(request.getPassword());

        User savedUser = repository.save(user);
=======
        user.setPassword(user.getPassword());

        User savedUser = new User();
>>>>>>> 6bfd4b050440436870b860d104ba30333646c307
        UserResponse userResponse = new UserResponse();
        userResponse.setId(savedUser.getId());
        userResponse.setPassword(savedUser.getPassword());
        userResponse.setEmail(savedUser.getEmail());
        userResponse.setFirstName(savedUser.getFirstName());
        userResponse.setLastName(savedUser.getLastName());
        userResponse.setCreatedAt(savedUser.getCreatedAt());
        userResponse.setUpdatedAt(savedUser.getUpdatedAt());
        return userResponse;

    }
<<<<<<< HEAD

    public UserResponse getUserProfile(String userId) {
        User user = repository.findById(userId);
    }
=======
>>>>>>> 6bfd4b050440436870b860d104ba30333646c307
}
