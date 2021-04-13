public class SavingsAccount extends BankAccount {

    private double rate;
    private static int savingsNumber;
    private String accountNumber;

    public SavingsAccount(String name, double initial) {

        super(name, initial);

        rate = 0.025;
        savingsNumber = 0;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public SavingsAccount(SavingsAccount original, double initial) {

        super( original, initial);
    }

    public void postInterest() {

        super.deposit((super.getBalance())*rate);
    }

    public String getAccountNumber() {

        return accountNumber;
    }
}

