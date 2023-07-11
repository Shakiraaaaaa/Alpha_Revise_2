import java.util.*;

public class Hello {
    public static void main(String[] args) {
        // System.out.println("hello world");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // sum of two number

        // Scanner scanner = new Scanner(System.in);
        // int numberOne = scanner.nextInt();
        // int numberTwo = scanner.nextInt();
        // int sum = numberOne + numberTwo;
        // System.out.println(sum);

        // product of two number

        // Scanner scanner = new Scanner(System.in);
        // int numberOne = scanner.nextInt();
        // int numberTwo = scanner.nextInt();
        // int product = numberOne * numberTwo;
        // System.out.println(product);

        // area of a circle
        Scanner scanner = new Scanner(System.in);
        // float rad = scanner.nextFloat();
        // float area = 3.14f * rad * rad;
        // System.out.println(area);

        // type conversion-> convertion from bigger data to smaller data

        // int a = 12;
        // long b = a;
        // System.out.println(b);

        // type casting -> forcibly conversion from smaller data to bigger data

        // double a = 12.12;
        // int b = (int) a;
        // System.out.println(b);

        // If else

        // lagest of two numbers

        // int numberOne = scanner.nextInt();
        // int numberTwo = scanner.nextInt();
        // if (numberOne > numberOne) {
        // System.out.println(numberOne + " is greater");
        // }

        // else {
        // System.out.println(numberTwo + " is greater");

        // }

        // odd or even

        // int number = scanner.nextInt();
        // if (number % 2 == 0) {
        // System.out.println("even");
        // }

        // else {
        // System.out.println("odd");
        // }

        // income tax calculator
        // float income = scanner.nextInt();
        // int tax = 0;
        // if (income < 500000) {
        // tax = 0;
        // }

        // if (income >= 500000 && income < 1000000) {
        // tax = (int) (income * 0.2);
        // }

        // if (income <= 2000000) {
        // tax = (int) (income * 0.3);
        // }

        // System.out.println(tax);

        // print largest of 3 numbers

        // int numberOne = scanner.nextInt();
        // int numberTwo = scanner.nextInt();
        // int numberThree = scanner.nextInt();

        // if (numberOne > numberTwo && numberOne > numberThree) {
        // System.out.println(numberOne + " number one is largest");
        // }

        // else if (numberTwo > numberThree) {
        // System.out.println(numberTwo + "number two is largest");
        // }

        // else {
        // System.out.println(numberThree + " number three is largest");
        // }

        // ternary operator

        // int number = scanner.nextInt();
        // String type = ((number % 2) == 0) ? "even" : "odd";
        // System.out.println(type);

        // positive or negative

        // int number = scanner.nextInt();
        // if (number >= 0) {
        // System.out.println("positive");
        // }

        // else {
        // System.out.println("negative");
        // }

        // int day = 5;
        // switch (day) {
        // case 1:
        // System.out.println("saturday");
        // break;
        // case 2:
        // System.out.println("sunday");
        // break;
        // case 3:
        // System.out.println("monday");
        // break;
        // case 4:
        // System.out.println("tuesday");
        // break;
        // case 5:
        // System.out.println("wednesday");
        // break;
        // case 6:
        // System.out.println("thursday");
        // break;
        // case 7:
        // System.out.println("friday");
        // break;
        // }

        // int year = scanner.nextInt();
        // if (((year % 4) == 0 && (year % 400) == 0) || (year % 100) == 0) {
        // System.out.println("leap year");
        // }

        // else {
        // System.out.println("not a leap year");
        // }

        // while loop
        // int i = 0;
        // while (i < 10) {
        // System.out.println("hello world");
        // i++;
        // }

        // print 1 to 10 with while loop
        // int i = 1;
        // while (i < 11) {
        // System.out.print(i + " ");
        // i++;
        // }

        // print 1 to n
        // int n = scanner.nextInt();
        // int i = 0;
        // while (i <= n) {
        // System.out.print(i + " ");
        // i++;
        // }

        // sum of n natural number
        // int number = scanner.nextInt();
        // int i = 0;
        // int sum = 0;
        // while (i <= number) {
        // sum = sum + i;
        // i++;
        // System.out.print(i + " ");
        // }
        // System.out.println();

        // System.out.println(sum);

        // square pattern
        // for (int i = 1; i <= 4; i++) {
        // System.out.println("****");
        // }

        // reverse a number
        // int number = 123456789;

        // while (number > 0) {
        // int lastDigit = number % 10;
        // System.out.print(lastDigit);
        // number /= 10;
        // }

        // reverse the given number

        // int number = 123;
        // int reverse = 0;
        // while (number > 0) {

        // int lastDigit = number % 10;
        // reverse = (reverse * 10) + lastDigit;
        // number /= 10;
        // }

        // System.out.print(reverse);

        // do while loop

        // int i = 0;
        // do {
        // System.out.println("hello world");
        // i++;
        // } while (i < 11);

        // input every number but not multiple of 10

        // do {
        // int number = scanner.nextInt();
        // if (number % 10 == 0) {
        // break;
        // }
        // System.out.println(number);
        // } while (true);

        // prime number
        // int number = scanner.nextInt();
        // boolean isPrime = true;
        // for (int i = 2; i <= Math.sqrt(number); i++) {

        // if (number == 2) {
        // isPrime = true;
        // }

        // else {
        // if (number % i == 0) {
        // isPrime = false;
        // }
        // }
        // }

        // if (isPrime == true) {
        // System.out.println("prime number");

        // }

        // else {
        // System.out.println("not a prime number");
        // }

        // print sum of odd and even integers
        // int number = scanner.nextInt();
        // int evenSum = 0;
        // int oddSum = 0;
        // for (int i = 1; i <= number; i++) {
        // if ((i % 2) == 0) {
        // evenSum = evenSum + i;
        // }

        // else {
        // oddSum = oddSum + i;
        // }
        // }

        // System.out.println("even sum" + evenSum);
        // System.out.println("odd sum" + oddSum);

        // factorial

        // int number = scanner.nextInt();
        // int facto = 1;
        // for (int i = 1; i <= number; i++) {
        // facto = facto * i;
        // }

        // System.out.println("factorial of " + number + " is " + facto);

        // table of a number
        // int number = scanner.nextInt();
        // int table = 1;
        // for (int i = 1; i <= 10; i++) {
        // table = number * i;
        // System.out.println(number + "*" + i + "=" + table);

        // }

        // star pattern
        // for (int i = 0; i <= 3; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // int num = scanner.nextInt();

        // for (int i = 0; i < num; i++) {
        // for (int j = num; j > 0; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted star pattern
        // int number = scanner.nextInt();
        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= number - i + 1; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // half pyramid pattern

        // int num = 4;
        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }

        // System.out.println();
        // }

        // character pattern
        // int num = 4;
        // char ch = 'a';
        // for (int i = 1; i <= num; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(ch);
        //         ch++;
        //     }

        //     System.out.println();
        // }
    }

}
