package com.example.springaccount.Repository;

import com.example.springaccount.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

//    @Modifying
//    @Query("update Account a set a.sum = ?1 where a.id = 1")
//    Account update(int sumToAdd);
}
