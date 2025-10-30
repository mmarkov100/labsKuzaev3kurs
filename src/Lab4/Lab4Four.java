package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4Four {

    public void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите цены 20 видов конфет через пробел:");
        int[] prices = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int minPrice = Arrays.stream(prices).min().getAsInt();

        long count = Arrays.stream(prices).filter(p -> p == minPrice).count();

        System.out.println("Самая дешевая конфета стоит: " + minPrice);
        System.out.println("Количество самых дешевых конфет: " + count);
    }
}
