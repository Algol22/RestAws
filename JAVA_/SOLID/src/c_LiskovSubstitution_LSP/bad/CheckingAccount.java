package c_LiskovSubstitution_LSP.bad;

import java.math.BigDecimal;

public class SavingsAccount extends Account {
    @Override
    protected void deposit(BigDecimal amount) {
        // Deposit into this account
    }

    @Override
    protected void withdraw(BigDecimal amount) {
      //withdrawal
    }
}