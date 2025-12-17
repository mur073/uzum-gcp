package com.mur073.gcp.service.impl;

import com.mur073.gcp.dto.request.CreateUserDto;
import com.mur073.gcp.dto.response.UserResponseDto;
import com.mur073.gcp.entity.User;
import com.mur073.gcp.exception.UserNotFoundException;
import com.mur073.gcp.mapper.UserMapper;
import com.mur073.gcp.repository.UserRepository;
import com.mur073.gcp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    @Transactional
    public UserResponseDto createUser(CreateUserDto request) {
        var user = userMapper.toEntity(request);
        var result = userRepository.save(user);

        return userMapper.toDto(result);
    }

    @Override
    public UserResponseDto findUserById(UUID userId) {
        var user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId.toString()));

        return userMapper.toDto(user);
    }

    @Override
    public @Nullable List<UserResponseDto> findAll() {
        var users = userRepository.findAll();
        return users.stream().map(userMapper::toDto).toList();
    }
}
