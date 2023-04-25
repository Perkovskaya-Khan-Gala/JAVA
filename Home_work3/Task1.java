package Home_work3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Реализовать алгоритм сортировки слиянием.
 */
public class Task1 {
    static void mergeSort(List<Integer> arrayList1) {
        List<Integer> aListLeft = new ArrayList<>();
        List<Integer> aListLeft1 = new ArrayList<>();
        List<Integer> aListRight1 = new ArrayList<>();
        List<Integer> aListRight = new ArrayList<>();

        if (arrayList1.size() > 1) {

            int rightHalf = arrayList1.size() / 2;
            int leftHalf = arrayList1.size() - rightHalf;

            aListLeft = arrayList1.subList(0, leftHalf);
            mergeSort(aListLeft);
            aListRight = arrayList1.subList(leftHalf, arrayList1.size());
            mergeSort(aListRight);

            aListLeft1 = List.copyOf(aListLeft);
            aListRight1 = List.copyOf(aListRight);

        } else {
            return;
        }

        int i, j, k;
        i = j = k = 0;
        int a, b;
        a = b = 0;

        while (i < aListLeft1.size() && j < aListRight1.size()) {
            a = aListLeft1.get(i);
            b = aListRight1.get(j);
            if (a < b) {
                arrayList1.set(k, a);
                i++;
            } else {
                arrayList1.set(k, b);
                j++;
            }
            k++;
        }
        while (i < aListLeft1.size()) {
            a = aListLeft1.get(i);
            arrayList1.set(k, a);
            k++;
            i++;
        }
        while (j < aListRight1.size()) {
            b = aListRight1.get(j);
            arrayList1.set(k, b);
            k++;
            j++;
        }

    }

    public static void main(String[] args) {
        int arraySize = 10;
        List<Integer> aList = new ArrayList<>(arraySize);
        
        Random random = new Random();
        for (int index = 0; index < arraySize; index++) {
            aList.add(random.nextInt(20));
        }

        System.out.println(aList);
        mergeSort(aList);
        System.out.println(aList);

    }
}
