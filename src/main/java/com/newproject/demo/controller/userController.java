package com.newproject.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class userController {

    @GetMapping("/getuser")
    public String getUser(){
        return "Hirunagrad";
    }

    @PostMapping("/saveuser")
    public String saveUser(){
        return "saveHiruna";
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
