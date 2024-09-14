class InsufficientFundsException extends Exception {
public InsufficientFundsException(String message) {
super(message);
}
}
class NegativeAmountException extends Exception {
public NegativeAmountException(String message) {
super(message);
}
}
class BankAccount {
private double balance;
public BankAccount(double initialBalance) {
this.balance = initialBalance;
}
public void deposit(double amount) throws NegativeAmountException
{
if (amount <= 0) {
throw new NegativeAmountException("Deposit amount must be
positive.");
}
balance += amount;
System.out.println("Deposited: $" + amount + ", New Balance: $" +
balance);
}
public void withdraw(double amount) throws
InsufficientFundsException,
NegativeAmountException {
if (amount <= 0) {
throw new NegativeAmountException("Withdrawal amount must be
positive.");
} if (
amount >
balance) {
throw new InsufficientFundsException("Insufficient funds.
Available balance: $" +
balance);
}
balance -= amount;
System.out.println("Withdrew: $" + amount + ", New Balance: $" +
balance);
}
}
public class BankTransactionSimulation {
public static void main(String[] args) {
BankAccount account = new BankAccount(1000.0);
try {
account.deposit(500.0);
account.deposit(-100.0);
} catch (NegativeAmountException e) {
System.err.println(e.getMessage());
} finally {
System.out.println("Deposit operation completed.");
}
try {
account.withdraw(200.0);
account.withdraw(2000.0);
} catch (InsufficientFundsException | NegativeAmountException e)
{
System.err.println(e.getMessage());
} finally {
System.out.println("Withdrawal operation completed.");
}
}
}
