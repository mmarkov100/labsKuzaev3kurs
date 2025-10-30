package Lab3;

import java.util.Scanner;

public class Lab3Thirth {
    private int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        int digit = n % 10;
        reversed = reversed * 10 + digit;
        return reverseNumber(n / 10, reversed);
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("число: ");
        int n = scanner.nextInt();

        int result = reverseNumber(n, 0);

        System.out.println("Число в обратном порядке: " + result);
    }
}
