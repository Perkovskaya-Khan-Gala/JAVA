package Home_work5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * Пусть дан список сотрудников:

Иван Иванов

Светлана Петрова

Кристина Белова

Анна Мусина

Анна Крутова

Иван Юрин

Петр Лыков

Павел Чернов

Петр Чернышов

Мария Федорова

Марина Светлова

Мария Савина

Мария Рыкова

Марина Лугова

Анна Владимирова

Иван Мечников

Петр Петин

Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        Map<String, Integer> mpSorted = new LinkedHashMap<>();

        String[] name;
        List<String> list1 = List.of("Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");

        int temp = 0;
        for (String iterable_element : list1) {
            name = iterable_element.split(" ");
            if (mp.containsKey(name[0])) {
                temp = mp.get(name[0]) + 1;
                mp.put(name[0], temp);
            } else
                mp.put(name[0], 1);
        }
        System.out.println(mp);

        int max = 0;
        for (var item : mp.entrySet()) {
            if (item.getValue() >= max)
                max = item.getValue();
        }

        while (max > 0) {
            for (var item : mp.entrySet()) {
                if (item.getValue().equals(max))
                    mpSorted.put(item.getKey(), item.getValue());
            }
            max--;
        }
        System.out.println(mpSorted);

    }
}
