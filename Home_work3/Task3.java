package Home_work3;

import java.util.ArrayList;
import java.util.Random;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Random rd = new Random();
        int sizeList = 20;
        for (int index = 0; index < sizeList; index++) {
            list1.add(rd.nextInt(30));
        }
        System.out.println(list1);

        int min = 1000;
        int max = 0;
        int result = 0;
        int count = 0;
        for (Integer iterable_element : list1) {
            if (iterable_element < min) {
                min = iterable_element;
            }
            if (iterable_element > max) {
                max = iterable_element;
            }
            result += iterable_element;
            count++;
        }
        double result1 = (double) result /(double) count;
        System.out.printf("min: %d, max: %d, average: %f", min, max, result1);

    }

}
