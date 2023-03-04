package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/vender")
public class ApiController {
    @Autowired
    UserService UserService;

    @GetMapping("/getuser")
    public List<User> list() {
        return UserService.listAllUser();
    }

    @GetMapping("/getuserbyid/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        try {
            User user = UserService.getUser(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/adduser")
    public void add(@RequestBody User user) {
        UserService.saveUser(user);
    }
    @PutMapping("/updatebyid/{id}")
    public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
        try {
            User existUser = UserService.getUser(id);
            user.setId(id);
            UserService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/deletebyid/{id}")
    public void delete(@PathVariable Integer id) {

        UserService.deleteUser(id);
    }
}
