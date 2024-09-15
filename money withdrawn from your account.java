class InsufficientFundsException extends Exception {
public InsufficientFundsException(String message) {
super(message);
}
}
class BankAccount {
private double balance;
public BankAccount() {
this.balance = 0.0;
}
public BankAccount(double initialBalance) {
if (initialBalance < 0) {
3
throw new IllegalArgumentException("Initial balance cannot be
negative");
} this.balance =
initialBalance;
}
public double getBalance() {
return balance;
}
public void deposit(double amount) {
if (amount <= 0) {
throw new IllegalArgumentException("Deposit amount must be
positive");
}
balance += amount;
}
public void withdraw(double amount) throws
InsufficientFundsException {
if (amount <= 0) {
throw new IllegalArgumentException("Withdrawal amount must be
positive");
} if (amount >
balance) {
throw new InsufficientFundsException("Insufficient funds for
withdrawal");
}
balance -= amount;
}
}
public class Question {
public static void main(String[] args) {
BankAccount account = new BankAccount(100.0);
try{ System.out.println("Current balance: " +
account.getBalance());
account.deposit(50.0);
System.out.println("After deposit, balance: " +
account.getBalance());
account.withdraw(30.0);
System.out.println("After withdrawal, balance: " +
account.getBalance());
account.withdraw(150.0);
} catch (InsufficientFundsException e) {
System.err.println(e.getMessage());
} catch (IllegalArgumentException e) {
System.err.println(e.getMessage());
}
}
}
