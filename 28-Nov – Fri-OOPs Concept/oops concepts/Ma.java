class BankAccount {
    protected String accountNo;
    protected double balance;

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest + " | Updated Balance: " + balance);
    }
}

class SalaryAccount extends BankAccount {
    private double monthlySalary;

    public SalaryAccount(String accountNo, double balance, double monthlySalary) {
        super(accountNo, balance);
        this.monthlySalary = monthlySalary;
    }

    public void creditSalary() {
        balance += monthlySalary;
        System.out.println("Salary Credited: " + monthlySalary + " | New Balance: " + balance);
    }
}

public class Ma {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA001", 5000, 5);
        System.out.println("\n--- Savings Account Operations ---");
        sa.deposit(2000);
        sa.addInterest();
        sa.withdraw(3000);

        SalaryAccount salAcc = new SalaryAccount("SAL001", 1000, 25000);
        System.out.println("\n--- Salary Account Operations ---");
        salAcc.creditSalary();
        salAcc.withdraw(5000);
    }
}
