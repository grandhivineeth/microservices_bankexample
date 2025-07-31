package com.vineeth.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema for Account information"
)
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be empty")
    @Pattern(regexp = "$|[0-9]{10}", message = "Invalid account number")
    @Schema(
            description = "Account number", example = "1234567890"
    )
    private Long accountNumber;

    @Schema(
            description = "Account type", example = "Savings"
    )
    @NotEmpty(message = "Account type cannot be empty")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be empty")
    @Schema(
        description = "Branch address", example = "123 Main Street"
    )
    private String branchAddress;
}
