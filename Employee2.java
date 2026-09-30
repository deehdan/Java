
class Employee {
    // Private fields (Encapsulation)
    private String name;
    private double salary;

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return this.salary;
    }

    // Setter for salary with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("❌ Error: Salary cannot be negative!");
        }
    }
}


// ================= Bad Implementation =================
class BadBankAccount {
    public double balance;
    public String pin;
}


// ================= Good Implementation =================
class GoodBankAccount {
    private double balance; // Hidden
    private String pin;     // Hidden

    // Constructor
    public GoodBankAccount(String pin) {
        this.pin = pin;
        this.balance = 0;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    // Withdraw method with validation
    public boolean withdraw(double amount, String enteredPin) {
        if (!pin.equals(enteredPin)) {
            System.out.println("❌ Wrong PIN!");
            return false;
        }

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        System.out.println("❌ Insufficient balance or invalid amount!");
        return false;
    }

    // Getter for balance (read-only)
    public double getBalance() {
        return balance;
    }
}


// ================= Main Class =================
