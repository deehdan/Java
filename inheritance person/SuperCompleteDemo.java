public class SuperCompleteDemo {
 public static void main(String[] args) {
 System.out.println("=== Creating Manager ===");
 Manager mgr = new Manager("Alice Johnson", 35, "123-45-6789", "EMP001", 95000
, 8);

 System.out.println("\n=== Displaying Manager Info ===");
 mgr.display();

 System.out.println("\n=== Work Behavior ===");
 mgr.work();

 System.out.println("\n=== Polymorphic Behavior ===");
 Person p = mgr;
 p.display(); // Calls Manager's display (polymorphism)
 p.work(); // Calls Manager's work
 }
}
