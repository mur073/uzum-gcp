package com.mur073.gcp.service;

import com.mur073.gcp.dto.request.CreateUserDto;
import com.mur073.gcp.dto.response.UserResponseDto;
import jakarta.validation.Valid;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public interface UserService {
    UserResponseDto createUser(CreateUserDto request);

    UserResponseDto findUserById(UUID userId);

    @Nullable List<UserResponseDto> findAll();
}
