package com.gitaction.demo.repository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.gitaction.demo.entity.Account;

@DataJpaTest
public class AccountRepositoryTest {

    @Autowired
    AccountRepository repository;

    @Test
    @Transactional
    void repositoryTest() {
        Account account = new Account();
        account.setFirstName("first");
        account.setLastName("lastname");

        repository.save(account);

        Optional<Account> result = repository.findById(1);
        assertThat(result.orElse(new Account()).getFirstName()).isEqualTo("first");

        assertThat(true).isFalse();

    }
}
