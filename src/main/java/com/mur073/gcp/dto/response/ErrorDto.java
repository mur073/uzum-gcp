package com.mur073.gcp.dto.response;

import com.mur073.gcp.constant.enums.ErrorType;
import lombok.Builder;

import java.util.List;

@Builder
public record ErrorDto(
        int code,
        String message,
        ErrorType type,
        List<String> validationErrors) {
}
