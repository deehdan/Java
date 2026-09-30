class Animal{
    void eat(){
        System.out.println("This animal eats food.");
    }
    void move(){
        System.out.println("Animals walk.");
    }
}





class Dog extends Animal{
    void sound(){
        System.out.println("Dogs bark.");
    }
    @Override
    void eat(){
        System.out.println("Dogs eat meat");
    }
    void move(){
        super.move();
        System.out.println("Dogs chase humans");
    }
}



public class Main{
    public static void main(String[]args){
        Dog d = new Dog();
        d.eat();
        d.sound();
        d.move();
    }
}