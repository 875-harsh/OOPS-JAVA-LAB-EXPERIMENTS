public class BankAccount {
  String accountHolderName;
  String accountNumber;
  double balance;
  public BankAccount(String accountHolderName, String accountNumber, double balance) {
      this.accountHolderName = accountHolderName;
      this.accountNumber = accountNumber;
      this.balance = balance;
  }
  public void deposit(double amount) {
      balance += amount;
      System.out.println("Deposited: " + amount);
  }
  public void withdraw(double amount) {
      if (amount <= balance) {
          balance -= amount;
          System.out.println("Withdrawn: " + amount);
      } else {
          System.out.println("Insufficient funds!");
      }
  }
  public void transfer(BankAccount targetAccount, double amount) {
      if (amount <= balance) {
          this.withdraw(amount);
          targetAccount.deposit(amount);
          System.out.println("Transferred: " + amount + " to account " + targetAccount.accountNumber);
      } else {
          System.out.println("Insufficient funds for transfer!");
      }
  }
  public double getBalance() {
      return balance;
  }
  public static void main(String[] args) {
      BankAccount account1 = new BankAccount("John Doe", "12345", 1000.00);
      BankAccount account2 = new BankAccount("Jane Doe", "67890", 500.00);

      account1.deposit(200);
      account1.withdraw(150);
      account1.transfer(account2, 300);

      System.out.println("Account 1 Balance: " + account1.getBalance());
      System.out.println("Account 2 Balance: " + account2.getBalance());
  }
}
