package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4Two {
    public void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите числа через пробел: ");
        String line = sc.nextLine();
        int[] arr = Arrays.stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.print("Введите число для вставки: ");
        int x = sc.nextInt();

        int max = Arrays.stream(arr).max().getAsInt();

        int countMax = (int) Arrays.stream(arr).filter(num -> num == max).count();

        int[] newArr = new int[arr.length + countMax];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            newArr[j++] = arr[i];
            if (arr[i] == max) {
                newArr[j++] = x;
            }
        }

        System.out.println("Новый массив: " + Arrays.toString(newArr));
    }
}
