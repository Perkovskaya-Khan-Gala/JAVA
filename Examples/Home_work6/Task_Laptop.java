package Home_work6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task_Laptop {
        static Set<Laptop> setLaptop = new HashSet<>();
        static Set<Laptop> resultSetLaptop = new HashSet<>();

        static Set<Laptop> setLaptopToFind0 = new HashSet<>();
        static Set<Laptop> setLaptopToFind1 = new HashSet<>();
        static Set<Laptop> setLaptopToFind2 = new HashSet<>();
        static Set<Laptop> setLaptopToFind3 = new HashSet<>();
        static Set<Laptop> setLaptopToFind4 = new HashSet<>();
        static Set<Laptop> setLaptopToFind5 = new HashSet<>();
        static Set<Laptop> setLaptopToFind6 = new HashSet<>();
        static Set<Laptop> setLaptopToFind7 = new HashSet<>();
        static Set<Laptop> setLaptopToFind8 = new HashSet<>();
        static Set<Laptop> setLaptopToFind9 = new HashSet<>();
        static Set<Laptop> setLaptopToFind10 = new HashSet<>();
        static Set<Laptop> setLaptopToFind11 = new HashSet<>();

        static Map<Integer, Object> mapRequest = new HashMap<>();
        static Map<Integer, String> filterChoice = new HashMap<>();

        /*
         * Подумать над структурой класса Ноутбук для магазина техники — выделить поля и
         * методы. Реализовать в Java.
         * 
         * Создать множество ноутбуков.
         * 
         * Написать метод, который будет запрашивать у пользователя критерий (или
         * критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
         * фильтрации можно хранить в Map. Например:
         * 
         * “Введите цифру, соответствующую необходимому критерию:
         * 
         * 1 - ОЗУ
         * 
         * 2 - Объём ЖД
         * 
         * 3 - Операционная система
         * 
         * 4 - Цвет …
         * 
         * Далее нужно запросить минимальные значения для указанных критериев —
         * сохранить параметры фильтрации можно также в Map.
         * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
         * условиям.
         */

        private static void getRequest() {

                System.out.println(
                                "Введите необходимый параметр(или минимальные значения) с указанием номера через двоеточие и нажмите Enter. Для перехода к поиску введите find с новой строки:");
                for (Map.Entry<Integer, String> pair : filterChoice.entrySet()) {
                        System.out.printf("%d : %s\n", pair.getKey(), pair.getValue());
                }

                Scanner scanner = new Scanner(System.in, "cp866");
                String answer = "";
                String[] answerArray;
                Integer number = 0;
                while (true) {
                        try {
                                answer = scanner.nextLine();
                                if (answer.equals("find"))
                                        break;
                                answerArray = answer.split(":");
                                number = Integer.parseInt(answerArray[0].trim());

                                if (answerArray.length == 2 && number >= 0
                                                && number < filterChoice.size()) {
                                        if (number == 0 || number == 1 || number == 2 || number == 6 || number == 8
                                                        || number == 9)
                                                mapRequest.putIfAbsent(number,
                                                                answerArray[1].trim().toLowerCase());
                                        if (number == 3 || number == 7 || number == 10 || number == 11)

                                                mapRequest.putIfAbsent(number,
                                                                Integer.parseInt(answerArray[1].trim()));
                                        if (number == 4 || number == 5)
                                                mapRequest.putIfAbsent(number,
                                                                Float.parseFloat(answerArray[1].trim()));
                                } else
                                        System.out.println("Введены некоректные данные попробуйте еще раз");
                        } catch (Exception ex) {
                                System.out.printf("Ошибка ввода: %s . Попробуйте еще раз.\n ", ex.getMessage());
                        }
                }
        }

        private static void findLaptop() {
                for (Map.Entry<Integer, Object> pair : mapRequest.entrySet()) {
                        if (pair.getKey().equals(0)) {
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getModelName().toLowerCase().equals(pair.getValue())) {
                                                setLaptopToFind0.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(1)) {
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getManufacturer().toLowerCase()
                                                        .equals(pair.getValue())) {
                                                setLaptopToFind1.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(2)) {
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getOriginCountry().toLowerCase()
                                                        .equals(pair.getValue())) {
                                                setLaptopToFind2.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(3)) {
                                int a = (int) pair.getValue();
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getYearOfIssue() == a) {
                                                setLaptopToFind3.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(4)) {
                                float a = (float) pair.getValue();
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getScreenDiagonal() >= a) {
                                                setLaptopToFind4.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(5)) {
                                float a = (float) pair.getValue();
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getWeight() >= a) {
                                                setLaptopToFind5.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(6)) {
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getColour().toLowerCase()
                                                        .equals(pair.getValue())) {
                                                setLaptopToFind6.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(7)) {
                                int a = (int) pair.getValue();
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getCorsNumber() == a) {
                                                setLaptopToFind7.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(8)) {
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getCpuName().toLowerCase()
                                                        .equals(pair.getValue())) {
                                                setLaptopToFind8.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(9)) {
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getVideoCardModel().toLowerCase()
                                                        .equals(pair.getValue())) {
                                                setLaptopToFind9.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(10)) {
                                int a = (int) pair.getValue();
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getRam() >= a) {
                                                setLaptopToFind10.add(laptop);
                                        }
                                }
                        }
                        if (pair.getKey().equals(11)) {
                                int a = (int) pair.getValue();
                                for (Laptop laptop : setLaptop) {
                                        if (laptop.getSsd() >= a) {
                                                setLaptopToFind11.add(laptop);
                                        }
                                }
                        }
                }

                if (!setLaptopToFind0.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind0);

                if (!setLaptopToFind1.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind1);
                else if (!setLaptopToFind1.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind1);

                if (!setLaptopToFind2.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind2);
                else if (!setLaptopToFind2.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind2);

                if (!setLaptopToFind3.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind3);
                else if (!setLaptopToFind3.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind3);

                if (!setLaptopToFind4.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind4);
                else if (!setLaptopToFind4.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind4);

                if (!setLaptopToFind5.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind5);
                else if (!setLaptopToFind5.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind5);

                if (!setLaptopToFind6.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind6);
                else if (!setLaptopToFind6.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind6);

                if (!setLaptopToFind7.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind7);
                else if (!setLaptopToFind7.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind7);

                if (!setLaptopToFind8.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind8);
                else if (!setLaptopToFind8.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind8);

                if (!setLaptopToFind9.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind9);
                else if (!setLaptopToFind9.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind9);

                if (!setLaptopToFind10.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind10);
                else if (!setLaptopToFind10.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind10);

                if (!setLaptopToFind11.isEmpty() && resultSetLaptop.isEmpty())
                        resultSetLaptop.addAll(setLaptopToFind11);
                else if (!setLaptopToFind11.isEmpty() && !resultSetLaptop.isEmpty())
                        resultSetLaptop.retainAll(setLaptopToFind11);

        }

        private static void showResult() {
                System.out.println("Результаты поиска:");
                if (resultSetLaptop.isEmpty())
                        System.out.println("Поиск не дал результатов. Попробуйте еще раз.");
                else
                        for (Laptop lt : resultSetLaptop) {
                                System.out.printf(
                                                "Модель: %s,\n Цена: %.2f,\n Производитель: %s,\n Страна производства : %s,\n Год производства : %d,\n Диагональ экрана : %.1f,\n Модель видеокарты : %s,\n Объем ОП :%d,\n Модель процессора : %s,\n OS : %s,\n SSD: %d,\n Количество ядер :%d, \n Цвет : %s  \n\n",
                                                lt.getModelName(), lt.getPrice(), lt.getManufacturer(),
                                                lt.getOriginCountry(), lt.getYearOfIssue(), lt.getScreenDiagonal(),
                                                lt.getVideoCardModel(), lt.getRam(), lt.getCpuName(), lt.getOs(),
                                                lt.getSsd(), lt.getCorsNumber(), lt.getColour());
                        }
        }

        public static void main(String[] args) {
                Laptop laptop0 = new Laptop(0, "Irbis NB263", 18999, "Irbis", "Китай", 2022, 1.7f, 15.6f,
                                "Intel HD Graphics 500",
                                4,
                                "Intel Celeron N3350", "Windows 10 Home Single Language", 128, 2, 1.1f, "белый");

                Laptop laptop1 = new Laptop(1, "ASUS Laptop E410KA-BV1422W", 24999, "ASUS", "Китай", 2021, 1.3f, 14f,
                                "Intel UHD Graphics", 4, "Intel Celeron N4020", "Windows 11 Home Single Language", 128,
                                2, 1.1f,
                                "синий");

                Laptop laptop2 = new Laptop(2, "Lenovo V15 4th Gen", 32999, "Lenovo", "Китай", 2023, 1.65f, 15.6f,
                                "AMD Radeon 610M", 8, "AMD Athlon Silver 7120U", "без ОС", 265, 2, 2.4f, "черный");
                Laptop laptop3 = new Laptop(3, "HUAWEI MateBook D 15 BoDE-WFH9", 63999, "HUAWEI", "Китай", 2022, 1.56f,
                                15.6f,
                                "Intel Iris Xe Graphics", 16, "Intel Core i5-1135G7", "Windows 11 Home Single Language",
                                512, 4, 2.4f,
                                "серый");
                Laptop laptop4 = new Laptop(4, "MSI Stealth GS77 12UHS-030RU", 308999, "MSI", "Китай", 2022, 2.8f,
                                17.3f,
                                "Intel UHD Graphics", 64, "Intel Core i9-12900H", "Windows 11 Home Single Language",
                                2000, 14, 1.8f,
                                "черный");
                Laptop laptop5 = new Laptop(5, "MSI CreatorPro Z17 A12UMST-260RU", 505999, "MSI", "Китай", 2022, 2.49f,
                                17.3f,
                                "Intel UHD Graphics", 64, "Intel Core i9-12900H", "Windows 11 Pro", 2000, 14, 1.8f,
                                "серый");

                setLaptop.add(laptop0);
                setLaptop.add(laptop1);
                setLaptop.add(laptop2);
                setLaptop.add(laptop3);
                setLaptop.add(laptop4);
                setLaptop.add(laptop5);

                filterChoice.put(0, "Название модели     ");
                filterChoice.put(1, "Марка производителя     ");
                filterChoice.put(2, "Страна производства на русском языке      ");
                filterChoice.put(3, "Год выпуска      ");
                filterChoice.put(4, "Диагональ экрана - минимальное значение, дюймы    ");
                filterChoice.put(5, "Вес - минимальное значение, кг     ");
                filterChoice.put(6, "Цвет    ");
                filterChoice.put(7, "Количество ядер     ");
                filterChoice.put(8, "Модель процессора    ");
                filterChoice.put(9, "Модель видеокарты      )");
                filterChoice.put(10, "Объем ОП - минимальное значение, Гб     ");
                filterChoice.put(11, "SSD  - минимальное значение, Гб     ");

                getRequest();
                findLaptop();
                showResult();

        }
}
