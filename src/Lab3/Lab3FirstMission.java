package Lab3;

import java.util.*;

public class Lab3FirstMission {
    private int gcd(int a, int b) {
        while (b != 0) {
            b = a % b;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = lcm(lcm(a, b), c);

        System.out.println("Наименьшее общее кратное: " + result);
    }
}
