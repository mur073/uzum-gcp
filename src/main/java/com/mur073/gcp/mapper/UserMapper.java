package com.mur073.gcp.mapper;

import com.mur073.gcp.dto.request.CreateUserDto;
import com.mur073.gcp.dto.response.UserResponseDto;
import com.mur073.gcp.entity.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(CreateUserDto user);

    List<User> toEntity(List<CreateUserDto> users);

    UserResponseDto toDto(User user);

    List<UserResponseDto> toDto(List<User> user);
}
