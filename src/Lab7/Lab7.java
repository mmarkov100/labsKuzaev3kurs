package Lab7;

public class Lab7 {

    public static void main(String[] args) {

        String[] lines = {
                "Короткая строка",
                "Это строка немного длиннее",
                "Строка",
                "Самая длинная строка? Возможно!",
                "А эта?",
                "1234567890",
                "Java",
                "Еще одна строка посередине",
                "Максимально длинная строкаааааа",
                "Коротко"
        };

        int maxLength = 0;

        for (String line : lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }

        System.out.println("Максимальная длина строки: " + maxLength);
        System.out.println("Строки с максимальной длиной:");

        for (String line : lines) {
            if (line.length() == maxLength) {
                System.out.println(line);
            }
        }
    }
}
