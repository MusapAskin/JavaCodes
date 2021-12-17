package ThrowSample;

public class AccountManager {
    private double balance;
    public void depozit(double amount){
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws BalanceInsufficentException {
        if (balance>=amount)
            balance = getBalance() - amount;
        else
            throw new BalanceInsufficentException("Bakiye Yetersiz.");
    }

    public double getBalance() {
        return balance;
    }
}
