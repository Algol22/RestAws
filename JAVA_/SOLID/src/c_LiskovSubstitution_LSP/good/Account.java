package c_LiskovSubstitution_LSP.bad;

import java.math.BigDecimal;

/*
The LSP states that objects of a superclass
should be replaceable with objects of its
subclasses without affecting the correctness of the program.

Robert C. Martin summarizes it:
Subtypes must be substitutable for their base types.

By not supporting the withdrawal method,
the FixedTermDepositAccount violates this method specification.
We cannot substitute FixedTermDepositAccount for Account.
 */
public abstract class Account {
    protected abstract void deposit(BigDecimal amount);
    protected abstract void withdraw(BigDecimal amount);
}

