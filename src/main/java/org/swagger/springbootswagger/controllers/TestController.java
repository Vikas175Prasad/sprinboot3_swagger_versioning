package org.swagger.springbootswagger.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/users/v1")
    public String test() {
        return "v1 user";
    }
    
    @GetMapping("/users/v2")
    public String test2() {
        return "v2 user";
    }

    @GetMapping("/users")
    public String test3() {
        return "users";
    }

    @PostMapping("/users/add_user")
    public ResponseEntity<?> createUser(@RequestBody User user)
    {
        return ResponseEntity.ok("New user created successfully");
    }

    @PutMapping("/users/update_user/{userId}")
    public ResponseEntity<?> updateUser(@PathVariable String userId, @RequestBody User user)
    {
        return ResponseEntity.ok("User "+userId+" updated successfully");
    }
}
