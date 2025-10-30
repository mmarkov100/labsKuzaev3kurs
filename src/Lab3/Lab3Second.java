package Lab3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lab3Second {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("день: ");
        int d = scanner.nextInt();

        System.out.print("месяц: ");
        int m = scanner.nextInt();

        System.out.print("год: ");
        int y = scanner.nextInt();
        LocalDate currentDate = LocalDate.of(y, m, d);
        LocalDate newYear = LocalDate.of(y + 1, 1, 1);
        long daysUntilNewYear = ChronoUnit.DAYS.between(currentDate, newYear);

        System.out.println("до нг дней: " + daysUntilNewYear);
    }
}
