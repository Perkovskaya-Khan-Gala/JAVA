package Home_work5;

import java.net.Socket;
import java.util.Random;

/*
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */
public class Task3 {
    private static void sortTriangle(int[] array, int index1, int lastIndex) {
        int leftIndex = index1 * 2 + 1;
        int rightIndex = index1 * 2 + 2;
        int temp;
        if (rightIndex <= lastIndex && array[index1] < array[rightIndex]) {
            temp = array[rightIndex];
            array[rightIndex] = array[index1];
            array[index1] = temp;
        }
        if (array[index1] < array[leftIndex]) {
            temp = array[leftIndex];
            array[leftIndex] = array[index1];
            array[index1] = temp;
        }
    }

    private static void sortPiramide(int[] array, int lastIndex) {
        int lastTop = (lastIndex - 1) / 2;
        for (int index = lastTop; index >= 0; index--) {
            sortTriangle(array, index, lastIndex);
        }
        for (int index = 0; index <= lastTop; index++) {
            sortTriangle(array, index, lastIndex);
        }
    }

    public static void main(String[] args) {

        Random rd = new Random();
        int[] array1 = new int[11];
        for (int index = 0; index < array1.length; index++) {
            array1[index] = rd.nextInt(20);
            System.out.printf("%d ", array1[index]);
        }

        int size = array1.length - 1;
        int temp = 0;
        while (size > 0) {
            sortPiramide(array1, size);
            temp = array1[0];
            array1[0] = array1[size];
            array1[size] = temp;
            size--;
        }

        System.out.println();
        for (int index = 0; index < array1.length; index++) {
            System.out.printf("%d ", array1[index]);
        }
    }

}
