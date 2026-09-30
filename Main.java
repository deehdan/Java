// Import statements (optional)
import java.util.Date;
import java.util.ArrayList;
// Class declaration
public class Employee1 {
 
 // 1. STATIC VARIABLES (Class variables)
 private static String companyName = "TechCorp";
 private static int employeeCount = 0;
 
 // 2. CONSTANTS
 public static final double TAX_RATE = 0.20;
 public static final int MAX_VACATION_DAYS = 30;
 
 // 3. INSTANCE VARIABLES (Fields)
 private int employeeId;
 private String name;
 private double salary;
 private Date hireDate;
 
 // 4. STATIC INITIALIZATION BLOCK
 static {
 System.out.println("Class is loaded into memory");
 companyName = "TechCorp";
 employeeCount = 0;
 }
 
 // 5. INSTANCE INITIALIZATION BLOCK
 {
 System.out.println("Instance initialization block");
 this.hireDate = new Date();
 }
 
 // 6. CONSTRUCTORS
 public Employee1(String name, double salary) {
 this.employeeId = ++employeeCount;
 this.name = name;
 this.salary = salary;
 System.out.println("Constructor called for " + name);
 }
 
 // 7. METHODS (Instance methods)
 public void displayInfo() {
 System.out.println("ID: " + employeeId);
 System.out.println("Name: " + name);
 System.out.println("Salary: $" + salary); }
 
 public void giveRaise(double percentage) {
 if (percentage > 0) {
 salary += salary * (percentage / 100);
 }
 }
 
 // 8. STATIC METHODS
 public static void displayCompanyInfo() {
 System.out.println("Company: " + companyName);
 System.out.println("Total Employees: " + employeeCount);
 }
 
 // 9. GETTERS AND SETTERS
 public String getName() {
 return name;
 }
 
 public void setName(String name) {
 if (name != null && !name.trim().isEmpty()) {
 this.name = name;
 }
 }
 
 // 10. toString() METHOD
 @Override
 public String toString() {
 return String.format("Employee{id=%d, name='%s', salary=%.2f}", 
 employeeId, name, salary);
 }
}


public class Main {
    public static void main(String[] args) {

        // -------- BAD EXAMPLE --------
        System.out.println("=== Bad Bank Account Example ===");
        BadBankAccount badAccount = new BadBankAccount();

        badAccount.balance = -1000; // ❌ No control
        badAccount.pin = "1234";
        badAccount.balance = 999999; // ❌ Can cheat system

        System.out.println("Direct balance access: " + badAccount.balance);


        // -------- GOOD EXAMPLE --------
        System.out.println("\n=== Good Bank Account Example ===");
        GoodBankAccount goodAccount = new GoodBankAccount("1234");

        goodAccount.deposit(1000);
        System.out.println("Successfully deposited $1000");

        boolean success = goodAccount.withdraw(500, "1234");
        System.out.println("Withdrawal successful: " + success);

        System.out.println("Final Safe Balance: $" + goodAccount.getBalance());


        // -------- EMPLOYEE EXAMPLE --------
        System.out.println("\n=== Employee Example ===");
        Employee1 emp = new Employee1();

        emp.setName("Dedan");
        emp.setSalary(50000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: $" + emp.getSalary());

        // Test validation
        emp.setSalary(-100); // ❌ Should trigger error
    }
}