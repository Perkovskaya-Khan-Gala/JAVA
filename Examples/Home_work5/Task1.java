package Home_work5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Task1 {
    public static void main(String[] args) {

        Map<String, List<String>> mp = new HashMap<>();
        Scanner sc = new Scanner(System.in, "cp866");
        while (true) {
            
            System.out.println("Введите Имя и Фамилию человека(Для просмотра записей введите 1):");
            String name = sc.nextLine();
            if (name.equals("1")) break;
            System.out.println("Введите телефоны человека через запятую, если их несколько");
            String phoneNumberS = sc.nextLine();      
            String[] phoneNumberSS = phoneNumberS.split(",");
            List<String> list1 = new ArrayList<>();
            for (String iterable_element : phoneNumberSS) {
                list1.add(iterable_element);
            }
            if (!mp.containsKey(name)) {
                mp.put(name, list1);
            }
        }
        System.out.println(mp);
    }

}
