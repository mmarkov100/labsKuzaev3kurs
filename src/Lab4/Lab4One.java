package Lab4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab4One {

    public void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите числа через пробел: ");
        String line = sc.nextLine();

        List<Integer> nums = Arrays.stream(line.split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = 0;

        for (int i = 0; i < nums.size() - 1; i++) {
            result += nums.get(i) * nums.get(i + 1);
        }

        System.out.println("Результат: " + result);
    }
}
