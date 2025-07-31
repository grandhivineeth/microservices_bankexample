package com.vineeth.loans.service;

import com.vineeth.loans.dto.LoansDto;
import jakarta.validation.Valid;

public interface ILoansService {

    void createLoan(String mobileNumber);

    LoansDto fetchLoans(String mobileNumber);

    boolean updateLoanDetails(LoansDto loansDto);

    boolean deleteLoan(String mobileNumber);
}
