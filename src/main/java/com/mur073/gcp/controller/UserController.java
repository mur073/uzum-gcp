package com.mur073.gcp.controller;

import com.mur073.gcp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/gcp/users")
public class UserController {

    private final UserService userService;
}
