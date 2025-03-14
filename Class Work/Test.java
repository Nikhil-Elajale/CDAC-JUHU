class Bank {
    private long accountnumber; 
    private String accountHolder;
    private double balance;
    private static int Total; 

    
    public Bank(long accountnumber, String accountHolder, double balance) {
        this.accountnumber = accountnumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        Total++; 
    }


    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid amount or Insufficient balance");
        }
    }


    public long getAccountNumber() {
        return accountnumber;
    }

    
    public void setAccountNumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public static int getTotalAccounts() {
        return Total;
    }
}


public class Test {
    public static void main(String[] args) {
        Bank bank1 = new Bank(123456789, "Nikhil", 500);
		Bank bank2 = new Bank(123478934, "El NINo", 1000);

        bank1.deposite(-10); 
        bank1.withdraw(10);  
        bank1.deposite(100); 
        bank1.withdraw(10);  
        System.out.println("Balance: $" + bank1.getBalance());
		
		
		bank2.deposite(400); 
        bank2.withdraw(900);
        bank2.deposite(300); 
        bank2.withdraw(500);  
        System.out.println("Balance: $" + bank2.getBalance());


        
        System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());
    }
}
