package comJavaPractice.example.JavaPractice.Collection;

import java.util.Stack;

public class stackk {
    public static void main(String[] args) {

         Stack<String> stack = new Stack<>();

        // push()
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println(stack);

        // peek()
        System.out.println("Top : " + stack.peek());

        // pop()
        System.out.println("Removed : " + stack.pop());

        System.out.println(stack);

        // size()
        System.out.println(stack.size());
    }
}
