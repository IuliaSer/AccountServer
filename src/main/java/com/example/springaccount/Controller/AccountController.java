package com.example.springaccount.Controller;

import com.example.springaccount.Model.Account;
import com.example.springaccount.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping(value = "/transfer",
        produces = { MediaType.APPLICATION_JSON_VALUE},
            consumes = { MediaType.APPLICATION_JSON_VALUE,})
    @ResponseBody
    public int transfer(@RequestBody Integer sumToAdd) {
        Account account = accountService.findById(1).get();
        Account newAccount = accountService.save(new Account(1, (account.getSum() + sumToAdd)));
        return newAccount.getSum();
    }

//    @ResponseBody
//    public void transfer(@RequestBody Integer sumToAdd) {
//        accountService.update(sumToAdd);
//    }
}
