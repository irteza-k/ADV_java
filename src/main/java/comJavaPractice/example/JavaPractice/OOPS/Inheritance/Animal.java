package comJavaPractice.example.JavaPractice.OOPS.Inheritance;

import org.springframework.http.converter.json.GsonBuilderUtils;

class Animal {
     void sound(){
         System.out.println("Animal sound");
     }

}
class  Dog extends Animal{
    void bark() {
        System.out.println("Bark");
    }
    //method overriding

    void sound(){
        System.out.println("my dog is barking");
    }

    //method overloading
    void sound(String mood){
        System.out.println("Dog is " + mood);
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
        d.sound();
        d.sound("angry");



    }
}
