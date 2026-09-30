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

