package com.example.springaccount.Service;

import com.example.springaccount.Model.Account;
import com.example.springaccount.Repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void update(int sumToAdd) {
        accountRepository.update(sumToAdd);
    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }

    public Optional<Account> findById(int id) {
        return accountRepository.findById(id);
    }
}
