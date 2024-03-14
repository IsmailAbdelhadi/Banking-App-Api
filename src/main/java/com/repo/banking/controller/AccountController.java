package com.repo.banking.controller;

import com.repo.banking.dto.AccountDto;
import com.repo.banking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {

    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/accounts")
    public AccountDto addAccount(@RequestBody AccountDto accountDto) {
        AccountDto add = accountService.createAccount(accountDto);
        return add;
    }
}
