package com.example.springaccount;

import com.example.springaccount.Controller.AccountController;
import com.example.springaccount.Model.Account;
import com.example.springaccount.Service.AccountService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountControllerTest {
    @Autowired
    AccountController accountController;

    @Autowired
    AccountService accountService;

    @Test
    public void transfer() {
        AccountController accountControllerMock = Mockito.mock(AccountController.class);
        int sum = 10;
        accountControllerMock.transfer(sum);
//        Account account = accountService.findById(1).get();
        int summ = 0;
        Mockito.when(accountControllerMock.transfer(sum)).thenReturn(summ);
        Assert.assertEquals(80040, summ);
    }
}
