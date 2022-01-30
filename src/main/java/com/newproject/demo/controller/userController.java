package com.newproject.demo.controller;

import com.newproject.demo.dto.UserDTO;
import com.newproject.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class userController {
    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public String getUser()
    {
       return "getUser";

    }

    @PostMapping("/saveuser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO)
    {
        return userService.saveUser(userDTO);

    }

    @PutMapping("/updateuser")
    public String updateuser(){
        return "updateHiruna";
    }

    @DeleteMapping("/deleteuser")
    public String deleteuser(){
        return "deleteuser";
    }


}
