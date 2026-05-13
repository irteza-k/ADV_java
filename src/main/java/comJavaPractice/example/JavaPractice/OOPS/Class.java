package comJavaPractice.example.JavaPractice.OOPS;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class Class {
    // class is blue print we will create the car class
    String color;

    void drive(){
        System.out.println("Driving.....");
    }

    public static void main(String[] args) {
        Class car = new Class();

        car.color = "Red";
        car.drive();
        System.out.println(car.color);
    }
}
