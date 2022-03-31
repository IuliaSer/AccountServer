package com.example.springaccount;

import com.example.springaccount.Controller.AccountController;
import com.example.springaccount.Model.Account;
import com.example.springaccount.Service.AccountService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(Demo.class)
@SpringBootTest
public class AccountControllerIntegrationTest {
    @Autowired
    AccountController accountController;

    @Autowired
    AccountService accountService;

    @Test
    public void transfer() {
        RestTemplate restTemplate = new TestRestTemplate();
        ResponseEntity response = restTemplate.postForEntity("http://localhost:8080/transfer",10,  Integer.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

        accountController.transfer(10);
        Account account = accountService.findById(1).get();
        Assert.assertEquals(120040, account.getSum());

    }
}
