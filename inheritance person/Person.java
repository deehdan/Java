class Person {
 protected String name;
 protected int age;
 protected String ssn;

 public Person(String name, int age, String ssn) {
 this.name = name;
 this.age = age;
 this.ssn = ssn;
 System.out.println("Person constructor called");
 }

 public void display() {
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 }

 public void work() {
 System.out.println(name + " is working");
 }
}
class Employee extends Person {
 private String employeeId;
 private double salary;

 public Employee(String name, int age, String ssn, String employeeId, double salary) {
 super(name, age, ssn); // Must be first statement
 this.employeeId = employeeId;
 this.salary = salary;
 System.out.println("Employee constructor called");
 }

 @Override
 public void display() {
 super.display(); // Call parent's display
 System.out.println("Employee ID: " + employeeId);
 System.out.println("Salary: $" + salary);
 }

 @Override
 public void work() {
 super.work(); // Call parent's work
 System.out.println("Also managing team and attending meetings");
 }

 public void showSSN() {
 // Can't access private ssn, but can use getter if available
 System.out.println("SSN is protected information");
 }
}
class Manager extends Employee {
 private int teamSize;

 public Manager(String name, int age, String ssn, String employeeId,
 double salary, int teamSize) {
 super(name, age, ssn, employeeId, salary);
 this.teamSize = teamSize;
 System.out.println("Manager constructor called");
 }

 @Override
 public void display() {
 super.display();
 System.out.println("Team Size: " + teamSize);
 }

 @Override
 public void work() {
 System.out.println(name + " is planning, delegating, and leading the team");
 }
}
