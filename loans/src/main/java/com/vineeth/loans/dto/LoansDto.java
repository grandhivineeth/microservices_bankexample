package com.vineeth.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(
    description = "Loan details"
)
@Data
public class LoansDto {

    @NotEmpty(message = "Mobile Number cannot be empty")
    @Pattern(regexp = "$|[0-9]{10}", message = "Invalid mobile number")
    @Schema(
            description = "Mobile number of the customer", example = "1234567890"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan Number cannot be empty")
    @Pattern(regexp = "$|[0-9]{12}", message = "Invalid loan number")
    @Schema(
            description = "Loan number of the customer", example = "123456789012"
    )
    private String loanNumber;

    @NotEmpty(message = "Loan Type cannot be empty")
    @Schema(
            description = "Loan type of the customer", example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Total Loan must be a positive number")
    @Schema(
            description = "Total loan of the customer", example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Amount Paid must be a non-negative number")
    @Schema(
            description = "Amount paid by the customer", example = "50000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "Amount Paid must be a non-negative number")
    @Schema(
            description = "Outstanding amount of the customer", example = "50000"
    )
    private int outstandingAmount;

}
