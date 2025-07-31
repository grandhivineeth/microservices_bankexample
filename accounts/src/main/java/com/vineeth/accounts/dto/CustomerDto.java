package com.vineeth.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema for Customer & Account information"
)
public class CustomerDto {
    @Schema(
            description = "Name of the customer", example = "John Doe"
    )
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 5, max = 30, message = "Name must be between 5 and 30 characters")
    private String name;

    @Schema(
            description = "Email of the customer", example = "ZDxu2@example.com"
    )
    @NotEmpty(message = "Email address cannot be empty")
    @Email(message = "Invalid email address")
    private String email;

    @Schema(
            description = "Mobile number of the customer", example = "1234567890"
    )
    @Pattern(regexp = "$|[0-9]{10}", message = "Invalid mobile number")
    private String mobileNumber;

    @Schema(
            description = "Account details"
    )
    private AccountsDto accountsDto;
}
