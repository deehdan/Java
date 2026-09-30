 // Parent class (superclass, base class)
class Animal {
 String name;
 int age;

 void eat() {
 System.out.println(name + " is eating");
 }

 void sleep() {
 System.out.println(name + " is sleeping");
 }
}
// Child class (subclass, derived class)
class Dog extends Animal {
 String breed;

 void bark() {
 System.out.println(name + " is barking: Woof! Woof!");
 }
 void wagTail() {
 System.out.println(name + " is wagging tail");
 }
}
// Another child class
class Cat extends Animal {
 void meow() {
 System.out.println(name + " says: Meow!");
 }

 void climb() {
 System.out.println(name + " is climbing");
 }
}
