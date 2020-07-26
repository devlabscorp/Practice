package practice.home.creationalpatterns.builder;

import java.math.BigDecimal;

public class BankAccount {

    private Integer accountNumber;
    private String branch;
    private BigDecimal balance;
    private String routing;

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", routing='" + routing + '\'' +
                '}';
    }

    private BankAccount() {

    }

    static class Builder {

        private Integer accountNumber;
        private String branch;
        private BigDecimal balance;
        private String routing;

        public Builder(Integer accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder atBranch(String branch) {
            this.branch = branch;

            return this;
        }

        public Builder withBalance(BigDecimal balance) {
            this.balance = balance;

            return this;
        }

        public Builder withRouting(String routing) {
            this.routing = routing;

            return this;
        }

        public BankAccount build() {
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.balance = this.balance;
            account.branch = this.branch;
            account.routing = this.routing;

            return account;
        }
    }

}
