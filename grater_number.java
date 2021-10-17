import java.util.Scanner;

public class grater_number {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a = s.nextInt();
        System.out.println("Enter the second number: ");
        b = s.nextInt();
        System.out.println("Enter the third number: ");
        c = s.nextInt();
        if (a > b && a > c) {
            System.out.println("Grater Number is a:" + a);
        } else if (b > c) {
            System.out.println("Grater Number is b:" + b);
        } else {
            System.out.println("Gratter Number is c:" + c);
        }

    }
}
