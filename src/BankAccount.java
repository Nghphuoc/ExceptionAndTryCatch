public class BankAccount {
    private int accountNumber;
    private float balance;
    private String accountHolder;

    public BankAccount(int accountNumber, float balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public float deposit( float amount) throws ValidateAmountException {
        if(amount <=0){
            throw new ValidateAmountException("Error can not deposit low more 0!");
        }else {
            this.balance += amount;
            return amount;
        }
    }

    public float transferMoney(float amount) throws ValidateBalanceException{
        if(amount > balance){
            throw new ValidateBalanceException("Error: Cannot transfer more money than the current amount");
        }else {
            this.balance = balance - amount;
            return balance;
        }
    }
}
