package com.vineeth.accounts.service;

import com.vineeth.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * @param customerDto
     **/
    void createAccount(CustomerDto customerDto);
}
