package com.example.springaccount;

import com.example.springaccount.Controller.AccountController;
import com.example.springaccount.Model.Account;
import com.example.springaccount.Repository.AccountRepository;
import com.example.springaccount.Service.AccountService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class AccountServiceTest {

    AccountRepository accountRepository = mock(AccountRepository.class);
    AccountService accountService = new AccountService(accountRepository);

    @Test
    public void save() {
        Account account = new Account(1, 20);
        accountService.save(account);
        verify(accountRepository).save(account);
    }

    @Test
    public void findById() {
        accountService.findById(1);
        verify(accountRepository).findById(1);
    }
}

