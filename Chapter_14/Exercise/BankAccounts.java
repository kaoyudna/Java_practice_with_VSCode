public class BankAccounts {

    String accountNumber;
    int balance;

    @Override
    public String toString() {
        return "¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
    }

    public BankAccounts(String number, int balance) {
        this.accountNumber = number;
        this.balance = balance;
    }
}