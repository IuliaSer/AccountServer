package com.example.springaccount.Controller;

import com.example.springaccount.Model.Account;
import com.example.springaccount.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping(value = "/transfer",
            produces = { MediaType.APPLICATION_JSON_VALUE,  MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void transfer(@RequestBody Account account) {
        accountService.save(account);
    }

}
