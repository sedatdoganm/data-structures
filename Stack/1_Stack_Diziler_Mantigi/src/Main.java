import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackClass stack = new StackClass(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println("Çıkan: " + stack.pop());
        System.out.println("Çıkan: " + stack.pop());
        System.out.println("Çıkan: " + stack.pop());
        System.out.println("Çıkan: " + stack.pop());
        System.out.println("Çıkan: " + stack.pop());
        System.out.println("Çıkan: " + stack.pop());
    }
}

// Stack'te LIFO mantigi vardir: Son giren, ilk cikar.