package com.mytube.mytube.user.controller;

import com.mytube.mytube.user.domain.User;
import com.mytube.mytube.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class userController {
    private final UserService userService;

    @PostMapping("/join")
    public String getUser(@RequestBody User user){

        userService.join(user);
        return "user";
    }
}
