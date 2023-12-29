package tests.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factories.AccountFactory;

public class AccountTests {
    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {

        double amount = 200.0;
        double expectedValue = 196.0;
       // Account acc = new Account(1L, 0.0);
        Account acc = AccountFactory.createEmptyAccout();

        acc.deposit(amount);

        Assertions.assertEquals(expectedValue, acc.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {

        double amount = -200.0;
        double expectedValue = 100.0;
        //Account acc = new Account(1L, expectedValue);
        Account acc = AccountFactory.createAccount(expectedValue);

        acc.deposit(amount);

        Assertions.assertEquals(expectedValue, acc.getBalance());
    }

    @Test
    public void fullWithdrawShouldClearBalanceAndReturnFullBalance() {

        // Preparar os dados
        double expectedValue = 0.0;
        double initialBalance = 800.0;
        Account acc = AccountFactory.createAccount(initialBalance);

        // Ação
        final double result = acc.fullWithdraw();

        Assertions.assertEquals(expectedValue, acc.getBalance());
        Assertions.assertTrue(expectedValue == acc.getBalance());
        Assertions.assertTrue(result == initialBalance);
    }
}
