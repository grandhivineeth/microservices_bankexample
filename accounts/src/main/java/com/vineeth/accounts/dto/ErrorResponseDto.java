package com.vineeth.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
@Schema(name = "Error response"
    , description = "Error response for all the APIs")
public class ErrorResponseDto {

    @Schema(
        description = "API path", example = "/create"
    )
    private String apiPath;

    @Schema(
        description = "Error code", example = "500"
    )
    private HttpStatus errorCode;

    @Schema(
        description = "Error message", example = "Internal Server Error"
    )
    private String errorMessage;

    @Schema(
            description = "Error time", example = "2023-08-15T10:15:30"
    )
    private LocalDateTime errorTime;
}
