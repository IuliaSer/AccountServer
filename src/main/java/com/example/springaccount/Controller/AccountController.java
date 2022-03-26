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
        produces = { MediaType.APPLICATION_JSON_VALUE,
                MediaType.APPLICATION_XML_VALUE},
            consumes = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public ResponseEntity<Account> transfer(@RequestBody Account account) {
        return new ResponseEntity(accountService.save(account), HttpStatus.OK);
    }

}
