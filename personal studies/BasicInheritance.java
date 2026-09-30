public class BasicInheritance {
 public static void main(String[] args) {
 // Dog inherits from Animal
 Dog dog = new Dog();
 dog.name = "Buddy";
 dog.age = 3;
 dog.breed = "Golden Retriever";

 dog.eat(); // Inherited from Animal
 dog.sleep(); // Inherited from Animal
 dog.bark(); // Dog's own method
 dog.wagTail(); // Dog's own method

 System.out.println();

 // Cat inherits from Animal
 Cat cat = new Cat();
 cat.name = "Whiskers";
 cat.age = 2;

 cat.eat(); // Inherited from Animal
 cat.sleep(); // Inherited from Animal
 cat.meow(); // Cat's own method
 cat.climb(); // Cat's own method
 }
}