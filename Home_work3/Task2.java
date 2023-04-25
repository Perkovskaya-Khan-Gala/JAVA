package Home_work3;

import java.util.ArrayList;
import java.util.Random;

import java.util.Iterator;

/*
 * Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */
public class Task2 {

    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        Random rd=new Random();
        int sizeList=20;
        for (int index = 0; index < sizeList; index++) {
            list1.add(rd.nextInt(30));
        }
        System.out.println(list1);
        
        Iterator <Integer> itr = list1.iterator();

        while (itr.hasNext()) {
            if (itr.next() %2==0)
                itr.remove();
        }
        System.out.println(list1);

    }
}
