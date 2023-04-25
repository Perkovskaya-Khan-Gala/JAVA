package Home_work3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * (Необязательная задача повышенной сложности)
Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
Разность:
A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
B - A = все числа из второй коллекции, которые не содержатся в первой
Симметрическая разность:
A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
 */
public class Task4add {

    public static void main(String[] args) {
        int arraySize = 10;
        List<Integer> aList1 = new ArrayList<>();
        List<Integer> bList2 = new ArrayList<>();
        List<Integer> aMinusb = new ArrayList<>();
        List<Integer> bMinusa = new ArrayList<>();
        List<Integer> abSimmetr = new ArrayList<>();

        Random random = new Random();
        for (int index = 0; index < arraySize; index++) {
            aList1.add(random.nextInt(20));
            bList2.add(random.nextInt(20));
        }
        
        System.out.printf("Лист A:");
        System.out.println(aList1);

        System.out.printf("Лист B:");
        System.out.println(bList2);
        
        for (Integer iterable_element : aList1) {
            aMinusb.add(iterable_element);
        }

        for (Integer iterable_element : bList2) {
            bMinusa.add(iterable_element);
        }
 
        System.out.printf("A - B:");
        aMinusb.removeAll(bList2);
        System.out.println(aMinusb);

        System.out.printf("B - A:");
        bMinusa.removeAll(aList1);
        System.out.println(bMinusa);

        abSimmetr.addAll(aMinusb);
        abSimmetr.addAll(bMinusa);
        System.out.printf("Симметрическая разность:");
        System.out.println(abSimmetr);





    }
}
