package comJavaPractice.example.JavaPractice.OOPS.Encapsulation;

public class Ecapsulation {

    //private data hidden
    private int age;

    //setter method
    public void setAge(int age){
        this.age= age;
    }

    //getter method
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Ecapsulation s = new Ecapsulation();

        //setting value using setter
        s.setAge(33);

        //getting value using getter
        System.out.println("Age is " + s.getAge());
    }
}

