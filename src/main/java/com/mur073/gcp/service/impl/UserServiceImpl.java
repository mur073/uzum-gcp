package com.mur073.gcp.service.impl;

import com.mur073.gcp.mapper.UserMapper;
import com.mur073.gcp.repository.UserRepository;
import com.mur073.gcp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
}
