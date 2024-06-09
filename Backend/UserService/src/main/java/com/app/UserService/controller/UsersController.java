package com.app.UserService.controller;
import com.app.UserService.entity.Users;
import com.app.UserService.payload.UsersDTO;
import com.app.UserService.service.impl.UserServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UsersController {

    private UserServiceImpl userService;
    @PostMapping("/register")
    public ResponseEntity<UsersDTO> addUser(@Valid @RequestBody UsersDTO usersDto) {
        UsersDTO newUser = userService.createUser(usersDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping("/{userId}")
    public UsersDTO getUsersById(@PathVariable Long userId) {
        return userService.getById(userId);
    }

    @GetMapping("/all")
    public List<UsersDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/{userId}")
    public UsersDTO updateUser(@PathVariable Long userId, @RequestBody UsersDTO usersDTO) {
        return userService.updateUser(userId, usersDTO);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        String message = userService.deleteUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UsersDTO usersDTO){

        boolean isAuthenticated = userService.authenticateUser(usersDTO.getUserEmail(), usersDTO.getUserPassword());
        if (isAuthenticated){
            return ResponseEntity.ok("Login Successful!!!");
        }
        else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invallid email or password!!!");
        }
    }

}

