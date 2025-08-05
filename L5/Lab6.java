import java.time.LocalDate;

class Person {
    String name;
    String surname;
    int age;
    LocalDate bdate;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bdate = LocalDate.now();
    }
}

class Account {
    private String id;
    private double balance;
    private double annualInterestRate = 0.045;
    private LocalDate dateCreate;

    Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreate = LocalDate.now();
    }

    Account() {
        this.id = "1122";
        this.balance = 0;
        this.dateCreate = LocalDate.now();
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setId(String id) {
        this.id = id;
    }

    void setannualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    void setdateCreate() {
        this.dateCreate = LocalDate.now();
    }
    
    void setDateCreate(LocalDate date) {
        this.dateCreate = date;
    }

    public double getBalance() {
        System.out.println("Balance : " + this.balance);
        return this.balance;
    }

    void getId() {
        System.out.println("Id : " + this.id);
    }

    void getdateCreate() {
        System.out.println("Date Created : " + this.dateCreate);
    }

    void getannualInterestRate() {
        System.out.println("Annual Interest Rate : " + this.annualInterestRate);
    }

    void getMonthlyInterest() {
        LocalDate now = LocalDate.now();
        int monthsPassed = (now.getYear() - dateCreate.getYear()) * 12 + (now.getMonthValue() - dateCreate.getMonthValue());
        if (monthsPassed < 0) monthsPassed = 0;
        double totalInterest = balance * annualInterestRate * monthsPassed / 12;
        System.out.println("Total Interest since account created (" + monthsPassed + " months): " + totalInterest);
    }

    void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient Balance");
        } else {
            this.balance -= amount;
            System.out.println("Withdraw: " + amount);
            System.out.println("Current Balance: " + this.balance);
        }
    }

    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit: " + amount);
        System.out.println("Current Balance: " + this.balance);
    }

    void TranferMoney(Account acc1, double amount) {
        if ((balance - amount) - 20 < 0) {
            System.out.println("Insufficient Balance");
            return;
        }
        acc1.deposit(amount);
        this.balance -= (amount + 20);
        System.out.println("Transfer Success!");
        System.out.println("Current Balance: " + this.balance);
    }
}
class SavingAccount extends Account {

    public SavingAccount(String id, double balance) {
        super(id, balance); 
    }

    @Override
    void TranferMoney(Account acc1, double amount) {
        double fee = 20;

        if (getBalance() < amount + fee) {
            System.out.println("Insufficient Balance (SavingAccount with fee)");
            return;
        }

        acc1.deposit(amount);         
        this.withdraw(amount + fee);   

        System.out.println("Transfer Success with 20 Baht Fee (SavingAccount)");
        System.out.println("Current Balance :" + getBalance());
    }
}

class FixAccount extends Account {
    public FixAccount(String id, double balance) {
        super(id, balance);
    }

    @Override
    void TranferMoney(Account acc1, double amount) {
        System.out.println("FixAccount cannot transfer money.");
    }
}

public class App {
    public static void main(String[] args) {
        Person p = new Person("Narin", "Suksawang", 24);

        Account acc1 = new Account("1122", 20000);
        acc1.setannualInterestRate(0.045);

        acc1.setDateCreate(LocalDate.now().minusYears(10));

        System.out.println("\n=== Test Withdraw (2500) ===");
        acc1.withdraw(2500);

        System.out.println("\n=== Test Deposit (3000) ===");
        acc1.deposit(3000);

        System.out.println("\n=== Test getBalance & getMonthlyInterest ===");
        acc1.getBalance();
        acc1.getMonthlyInterest();

        FixAccount fixAcc = new FixAccount("3344", 10000);
        Account acc2 = new Account("2233", 5000);

        System.out.println("\n=== Test FixAccount TransferMoney ===");
        fixAcc.TranferMoney(acc2, 1000);

        System.out.println("\n=== Test Account TransferMoney with fee 20 ===");
        acc1.TranferMoney(acc2, 3000);

        System.out.println("\n=== Final Balances ===");
        System.out.print("acc1: ");
        acc1.getBalance();
        System.out.print("acc2: ");
        acc2.getBalance();
        System.out.println("\n=== Test SavingAccount TransferMoney ===");
        SavingAccount saving = new SavingAccount("7788", 10000);
        saving.TranferMoney(acc2, 3000);    

        System.out.println("\n=== SavingAccount Final Balance ===");
        saving.getBalance();
    }
}
