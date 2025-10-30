import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args){
//        firstMission();
//        secondMission();
        thirdMissionWhile();
//        thirdMissionDoWhile();
//        thirdMissionFor();
    }

    public static void firstMission(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Минуты: ");
        int minutes = scanner.nextInt();

        System.out.print("1-секунды, 2-часы, 3-сутки: ");
        int N = scanner.nextInt();

        double result;

        switch (N) {
            case 1:
                result = minutes * 60;
                System.out.println(minutes + " минут = " + result + " секунд");
                break;
            case 2:
                result = minutes / 60.0;
                System.out.println(minutes + " минут = " + result + " часов");
                break;
            case 3:
                result = minutes / 1440.0;
                System.out.println(minutes + " минут = " + result + " суток");
                break;
            default:
                System.out.println("Ошибка: номер должен быть от 1 до 3");
        }
    }

    public static void secondMission(){
        for (int number = 1000; number <= 9999; number++) {
            int firstDigit = number / 1000;
            int secondDigit = (number / 100) % 10;
            int thirdDigit = (number / 10) % 10;
            int fourthDigit = number % 10;

            if (firstDigit + fourthDigit == secondDigit + thirdDigit) {
                System.out.println(number);
            }
        }
    }

    public static void thirdMissionWhile(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        double n = scanner.nextDouble();

        System.out.print("Введите ε: ");
        double epsilon = scanner.nextDouble();

        double sum = 0;
        int v = 1;
        double a;

        while (v <= n) {
            a = (2.0 * n - 1) / Math.pow(2, v);
            if (Math.abs(a) >= epsilon) {
                sum += a;
            }
            v++;
        }

        System.out.println("Сумма членов ряда: " + sum);
    }

    public static void thirdMissionDoWhile(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        System.out.print("Введите ε: ");
        double epsilon = scanner.nextDouble();

        double sum = 0;
        int v = 1;
        double a;

        do {
            a = (2.0 * n - 1) / Math.pow(2, v);
            if (Math.abs(a) >= epsilon) {
                sum += a;
            }
            v++;
        } while (v <= n);

        System.out.println("Сумма членов ряда: " + sum);
    }

    public static void thirdMissionFor(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        System.out.print("Введите ε: ");
        double epsilon = scanner.nextDouble();

        double sum = 0;
        double a;

        for (int v = 1; v <= n; v++) {
            a = (2.0 * n - 1) / Math.pow(2, v);
            if (Math.abs(a) >= epsilon) {
                sum += a;
            }
        }

        System.out.println("Сумма членов ряда: " + sum);
    }
}
