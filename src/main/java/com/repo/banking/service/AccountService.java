package com.repo.banking.service;

import com.repo.banking.dto.AccountDto;
import com.repo.banking.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
}
