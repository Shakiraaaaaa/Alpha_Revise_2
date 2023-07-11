import java.util.*;

public class Function {

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);
    }

    public static int product(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    public static int factorial(int number) {
        int facto = 1;
        for (int i = 1; i <= number; i++) {
            facto = facto * i;
        }

        return facto;
    }

    public static int bionomialCooficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int NminusR = factorial(n - r);
        int bionomialCooficientt = fact_n / (fact_r * NminusR);
        return bionomialCooficientt;
    }

    public static boolean isPrime(int number) {
        boolean isPrimee = true;
        if (number == 2) {
            return isPrimee = true;
        }

        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return isPrimee = false;
                }
            }
        }

        return isPrimee = true;
    }

    public static boolean isPrimeOptitmized(int number) {
        boolean isPrimee = true;
        if (number == 2) {
            return isPrimee = true;
        }

        else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return isPrimee = false;
                }
            }
        }

        return isPrimee = true;
    }

    public static void primesInRange(int number) {

        for (int i = 2; i < number; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void decimalToBinary(int binaryNumber) {
        int decimalNumber = 0;
        int power = 0;
        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10;
            decimalNumber = decimalNumber + lastDigit * (int) Math.pow(2, power);
            binaryNumber = binaryNumber / 10;
            power++;

        }
        System.out.print(decimalNumber);
    }

    public static void binarytoDecimal(int decimalNumber) {
        int myNum = decimalNumber;
        int binaryNumber = 0;
        int power = 0;
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber = binaryNumber + (remainder * (int) Math.pow(2, power));
            power++;
            decimalNumber = decimalNumber / 2;
        }

        System.out.println(binaryNumber);
    }

    // Write a Java method to compute the average of three numbers

    public static int average(int num1, int num2, int num3) {
        int averagee = (num1 + num2 + num3) / 3;
        return averagee;
    }

    // Write a method named isEven that accepts an intargument.The method should
    // return true
    // if the argument is even, or false otherwise.Also write a program to test your
    // method

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }

        return false;
    }

    // Write a Java program to check if a number is a palindrome in Java
    public static void isPalindrome(int number) {
        int myNum = number;
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        System.out.println(reverse);
        if (myNum == reverse) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    // Write a Java method to compute the sum of the digits in an integer

    public static int sumOfDigitsOfInteger(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        // int a = 2;
        // int b = 4;
        // // swap(a, b);
        // System.out.println(product(a, b));

        Scanner scanner = new Scanner(System.in);
        // int number = scanner.nextInt();
        // System.out.println(factorial(number));

        // int n = 5;
        // int r = 2;
        // System.out.println(bionomialCooficient(n, r));

        // int number = scanner.nextInt();
        // System.out.println(isPrime(number));
        // System.out.println(isPrimeOptitmized(number));
        // primesInRange(6);
        // decimalToBinary(1000);
        // binarytoDecimal(8);
        // System.out.println(average(2, 6, 4));

        int num = scanner.nextInt();
        // System.out.println(isEven(num));
        // isPalindrome(num);
        System.out.println(sumOfDigitsOfInteger(num));

    }
}
