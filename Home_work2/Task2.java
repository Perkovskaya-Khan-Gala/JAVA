package Home_work2;

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.io.IOException;

/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * 10);
            System.out.printf("%d ", array[index]);
        }

        int temp = 0;
        boolean flag = true;

        Logger logger = Logger.getLogger("My log");
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("c:\\Users\\hgala\\GB_Programs\\Level2\\Lection\\Java\\Home_work2\\app1.log", true);
            logger.addHandler(fileHandler);

            while (flag) {
                flag = false;
                for (int index1 = 0; index1 < array.length - 1; index1++) {
                    if (array[index1] > array[index1 + 1]) {
                        temp = array[index1];
                        array[index1] = array[index1 + 1];
                        array[index1 + 1] = temp;
                        flag = true;

                        logger.info(Arrays.toString(array));
                    }
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
