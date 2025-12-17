package com.mur073.gcp.mapper;

import com.mur073.gcp.dto.request.CreateUserDto;
import com.mur073.gcp.dto.response.UserResponseDto;
import com.mur073.gcp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "status", constant = "NEW")
    User toEntity(CreateUserDto user);

    UserResponseDto toDto(User user);
}
