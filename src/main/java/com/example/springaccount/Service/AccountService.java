package com.example.springaccount.Service;

import com.example.springaccount.Model.Account;
import com.example.springaccount.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

//    public Account update(int sumToAdd) {
//        return accountRepository.update(sumToAdd);
//    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }
}
