package Home_work4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task2 {
    private static List<Integer> lst;

    private static void enqueueLL(List<Integer> llist, int newElm) {
        llist.add(newElm);
    }

    private static Integer dequeueLL(List<Integer> llist) {
        return llist.remove(0);
    }

    private static Integer firstLL(List<Integer> llist) {
        int temp = llist.remove(0);
        ((LinkedList<Integer>) llist).addFirst(temp);
        return temp;

    }

    private static void fillListRandom(List<Integer> llist, int lSize) {
        Random rd = new Random();
        for (int index = 0; index < lSize; index++) {
            llist.add(rd.nextInt(100));
        }
    }

    public static void main(String[] args) {
        lst = new LinkedList<>();

        fillListRandom(lst, 10);
        System.out.println(lst);

        System.out.printf("Добавление элемента в конец очереди:\n");
        enqueueLL(lst, 54);
        System.out.println(lst);

        System.out.printf("Возвращение и удаление первого элемента:\n");
        int firstDel = dequeueLL(lst);
        System.out.println(firstDel);
        System.out.println(lst);

        System.out.printf("Возвращение первого элемента без удаления:\n");
        int firstShow = firstLL(lst);
        System.out.println(firstShow);
        System.out.println(lst);

    }
}
