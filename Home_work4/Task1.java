package Home_work4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class Task1 {
    private static void flipOver(List<Integer> llist) {
        Stack<Integer> st = new Stack<>();
        for (Integer iterable_element : llist) {
            st.push(iterable_element);
        }
        int lsize = llist.size();
        llist.removeAll(llist);
        for (int index = 0; index < lsize; index++) {
            llist.add(st.pop());
        }

    }

    private static void fillListRandom(List<Integer> llist, int lSize) {
        Random rd = new Random();
        for (int index = 0; index < lSize; index++) {
            llist.add(rd.nextInt(100));
        }

    }

    public static void main(String[] args) {

        List<Integer> lst = new LinkedList<Integer>();

        fillListRandom(lst, 20);
        System.out.printf("Исходный LinkedList:\n");
        System.out.println(lst);

        System.out.printf("Перевернутый LinkedList:\n");
        flipOver(lst);
        System.out.println(lst);

    }
}
