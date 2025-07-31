package com.vineeth.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
    description = "Error Response"
)
@Data @AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
        description = "API path"
    )
    private String apiPath;

    @Schema(
        description = "Error Code"
    )
    private HttpStatus errorCode;

    @Schema(
        description = "Error Message"
    )
    private String errorMessage;

    @Schema(
        description = "Error Time"
    )
    private LocalDateTime errorTime;
}
