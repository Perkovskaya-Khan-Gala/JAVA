package Home_work1;
/*Реализовать простой калькулятор */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Введите выражение типа a xx b, где a и b числа, xx: /, *, +, - и нажмите Enter:\n");
            String expr = scanner.nextLine();
            int index1 = 0;
            int type = 0;
            if (expr.contains("+")) {
                index1 = expr.indexOf("+");
                type = 1;
            } else if (expr.contains("*")) {
                index1 = expr.indexOf("*");
                type = 2;
            } else if (expr.contains("/")) {
                index1 = expr.indexOf("/");
                type = 3;
            } else if (expr.contains("-")) {
                index1 = expr.indexOf("-");
                type = 4;
            }
            String operand1 = expr.substring(0, index1);
            int a = Integer.parseInt(operand1.trim());
            String operand2 = expr.substring(index1 + 1, expr.length());
            int b = Integer.parseInt(operand2.trim());
            switch (type) {
                case 1:
                    System.out.printf("= %d\n", a + b);
                    break;
                case 2:
                    System.out.printf("= %d\n", a * b);
                    break;
                case 3:
                    System.out.printf("= %f\n", (float) a / (float) b);
                    break;
                case 4:
                    System.out.printf("= %d\n", a - b);
                    break;
            }

        }
    }
}
