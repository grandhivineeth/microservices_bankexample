package com.vineeth.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
@Schema(
        name = "Response",
        description = "Response object"
)
public class ResponseDto {

    @Schema(
            description = "Status code")
    private String statusCode;

    @Schema(
            description = "Status message")
    private String statusMsg;

}
