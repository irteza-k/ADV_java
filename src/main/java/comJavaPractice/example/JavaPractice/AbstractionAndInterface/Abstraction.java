package comJavaPractice.example.JavaPractice.AbstractionAndInterface;

abstract class Animal{
    //normal method
    void eat(){
        System.out.println("Animal is eating");
    }

    //abstract method
    abstract  void sound();
}

// child class
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog is barking");
    }
}



public class Abstraction {

    public static void main(String[] args) {
        Dog d=  new Dog();
        d.eat();
        d.sound();
    }
}
