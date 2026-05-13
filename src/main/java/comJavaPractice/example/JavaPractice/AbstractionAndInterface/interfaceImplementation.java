package comJavaPractice.example.JavaPractice.AbstractionAndInterface;

public class interfaceImplementation implements LearnInterface{
    @Override
    public void sount() {
        System.out.println("Interface implemented");
    }

    public static void main(String[] args) {
        interfaceImplementation c=  new interfaceImplementation();
        c.sount();

    }
}
