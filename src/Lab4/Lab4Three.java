package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4Three {

    public void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите числа через пробел: ");
        String line = sc.nextLine();
        int[] arr = Arrays.stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("Массив без минимального элемента: " + Arrays.toString(newArr));
    }


}
