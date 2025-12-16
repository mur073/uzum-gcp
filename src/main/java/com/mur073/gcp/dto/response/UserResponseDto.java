package com.mur073.gcp.dto.response;

import com.mur073.gcp.constant.enums.DocumentType;
import com.mur073.gcp.constant.enums.Gender;

import java.time.LocalDateTime;

public record UserResponseDto(
    Long id,
    String email,
    String firstName,
    String middleName,
    String lastName,
    String address,
    String citizenship,
    LocalDateTime birthdate,
    Gender gender,
    String photoUrl,
    DocumentType documentType,
    LocalDateTime issuedAt,
    LocalDateTime validThrough,
    LocalDateTime createdAt,
    LocalDateTime updatedAt) {
}
