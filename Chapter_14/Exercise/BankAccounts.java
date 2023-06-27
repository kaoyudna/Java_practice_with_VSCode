public class BankAccounts {

    String accountNumber;
    int balance;

    @Override
    public String toString() {
        return "¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o instanceof BankAccounts) {
            BankAccounts b = (BankAccounts)o;
            String an1 = this.accountNumber.trim();
            String an2 = b.accountNumber.trim();
            if (an1.equals(an2)) {
                return true;
            }
        }
        return false;
    }

    public BankAccounts(String number, int balance) {
        this.accountNumber = number;
        this.balance = balance;
    }
}