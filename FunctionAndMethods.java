import java.util.*;

public class FunctionAndMethods {

    public static void printhelloWorld() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        printhelloWorld();
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        System.out.println("sum of two number is " + sum(numberOne, numberTwo));

    }
}
