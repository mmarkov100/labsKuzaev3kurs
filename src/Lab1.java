import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args)
    {
//        firstMission();
//        secondMission();
//    thirdMission();
    fourthMission();
    }

    public static void firstMission(){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(1/(2*a*b-3)-3*c^2);
    }

    public static void secondMission(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int secondDigit = (N / 100) % 10;
        int thirdDigit = (N / 10) % 10;

        int result = secondDigit * secondDigit + thirdDigit * thirdDigit * thirdDigit;

        System.out.println(+ result);
    }

    public static void thirdMission(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int firstDigit = N / 1000;
        int secondDigit = (N / 100) % 10;
        int thirdDigit = (N / 10) % 10;
        int fourthDigit = N % 10;

        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
        int product = firstDigit * secondDigit * thirdDigit * fourthDigit;

        boolean result = sum == product + 1;

        System.out.println(result ? 1 : 0);
    }

    public static void fourthMission(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        while (N > 0) {
            int digit = N % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            N /= 10;
        }
    }
}
