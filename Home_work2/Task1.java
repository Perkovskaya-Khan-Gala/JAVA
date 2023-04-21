package Home_work2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */
public class Task1 {
    private static String readStringFromFile(String fileName) {
        String line1 = "";
        try (BufferedReader rd = new BufferedReader(new FileReader(fileName))) {
            line1 = rd.readLine();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return line1;
    }

       public static void main(String[] args) {
        String lineFromFile = readStringFromFile(
                "c:\\Users\\hgala\\GB_Programs\\Level2\\Lection\\Java\\Home_work2\\file1.txt");
        System.out.println(lineFromFile);

        StringBuilder sb = new StringBuilder();
        String newLine = lineFromFile.substring(1, lineFromFile.length() - 1); //убираем { }
        String strNew = newLine.replaceAll(":", "=");// заменияем : на =
        String[] parts = strNew.split(",");
        sb.append("SELECT * FROM students Where");
        for (String iterable_element : parts) {
            if (!iterable_element.contains("null")) {
                sb.append(" AND ");
                String newElement = iterable_element.replaceFirst("\"", "");
                String newElement1 = newElement.replaceFirst("\"", "");
                sb.append(newElement1);
            }
        }
        String result = sb.toString().replaceFirst("AND", "");
        System.out.print(result);
    }
}
