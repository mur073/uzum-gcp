package com.mur073.gcp.dto.request;

import com.mur073.gcp.constant.enums.DocumentType;
import com.mur073.gcp.constant.enums.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.LocalDateTime;

public record CreateUserDto(
    @NotBlank @Email String email,
    @NotBlank String firstName,
    String middleName,
    @NotBlank String lastName,
    @NotBlank String address,
    @NotBlank String citizenship,
    @NotNull @Past LocalDateTime birthdate,
    @NotNull Gender gender,
    String photoUrl,
    @NotNull DocumentType documentType,
    @NotNull LocalDateTime issuedAt,
    @NotNull LocalDateTime validThrough) {
}
