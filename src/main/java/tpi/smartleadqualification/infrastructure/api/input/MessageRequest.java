package tpi.smartleadqualification.infrastructure.api.input;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

record MessageRequest(
        @NotBlank @NotNull String username,
        @NotNull @Email String email,
        String phoneNumber,
        @NotBlank @NotNull String content) {
}