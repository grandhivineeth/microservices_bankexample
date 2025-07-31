package com.vineeth.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(name = "Cards",
        description = "Schema to hold Card information")

@Data
public class CardsDto {
    @NotEmpty(message = "Mobile Number cannot be empty")
    @Pattern(regexp = "$|[0-9]{10}", message = "Invalid mobile number")
    @Schema(
            description = "Mobile number of the customer", example = "1234567890"
    )
    private String mobileNumber;

    @NotEmpty(message = "Card Number cannot be empty")
    @Pattern(regexp = "$|[0-9]{12}", message = "Invalid card number")
    @Schema(
            description = "Card number of the customer", example = "123456789012"
    )
    private String cardNumber;

    @NotEmpty(message = "Card Type cannot be empty")
    @Schema(
            description = "Card type of the customer", example = "Credit Card"
    )
    private String cardType;

    @Positive(message = "Total Limit must be a non-negative number")
    @Schema(
            description = "Total limit of the customer", example = "100000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Amount Used must be a non-negative number")
    @Schema(
            description = "Amount used by the customer", example = "50000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Available Amount must be a non-negative number")
    @Schema(
            description = "Available amount of the customer", example = "50000"
    )
    private int availableAmount;
}
