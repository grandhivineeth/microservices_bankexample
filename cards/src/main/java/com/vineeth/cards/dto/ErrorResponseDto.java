package com.vineeth.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(name = "Error Response",
        description = "Schema to hold successful error response information")
@Data
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "API path"
    )
    private String apiPath;

    @Schema(
            description = "Error code"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message"
    )
    private String errorMessage;

    @Schema(
            description = "Error time"
    )
    private LocalDateTime errorTime;
}
