package practice.home.creationalpatterns.builder;

import java.math.BigDecimal;

public class BankAccountBuilder {

    public static void main(String[] args) {

        BankAccount account
                = new BankAccount.Builder(1234).atBranch("Roseville").withBalance(BigDecimal.valueOf(100.00)).withRouting("789").build();

        System.out.println(account.toString());

    }
}
