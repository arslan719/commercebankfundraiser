package com.commerce.commercebankfundraiser.UserResouce;

import com.commerce.commercebankfundraiser.model.User;
import com.commerce.commercebankfundraiser.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserResouce {
    private final UserService userService;

    public UserResouce(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<User>> getUsers(){
        List<User> users = userService.findAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id")Long id){
        User users = userService.findUser(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user)
    {
        User UpdateUser = userService.updateUser(user);
        return new ResponseEntity<>(UpdateUser,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id")Long id)
    {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
