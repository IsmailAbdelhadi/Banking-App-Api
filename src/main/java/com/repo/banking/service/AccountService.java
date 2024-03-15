package com.repo.banking.service;

import com.repo.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    List<AccountDto> getAllAccounts();
}
