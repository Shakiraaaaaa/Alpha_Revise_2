import java.util.*;

public class Problem1 {
    public static void main(String args[]) {
        // question 1- average of 3 numbers
        Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int c = scanner.nextInt();
        // int average = (a + b + c) / 3;
        // System.out.println(average);

        // 2. area of a square
        // int side = scanner.nextInt();
        // int area = side * side;
        // System.out.println("area " + area);

        // 3.total bill with tax
        float pen = scanner.nextFloat();
        float pencil = scanner.nextFloat();
        float eraser = scanner.nextFloat();

        float totalBill = (pen + pencil + eraser);
        float tax = (totalBill * 0.18f);
        float totalBillWithTax = (totalBill + tax);
        System.out.println(tax);
        System.out.println(totalBill);
        System.out.println(totalBillWithTax);

    }
}
