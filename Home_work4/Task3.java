package Home_work4;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
 * Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
 *  Например:
 * 5 4 3 - + => 5 1 + => 6
 */
public class Task3 {

    public static void main(String[] args) {
        Stack<Float> st = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        float res;
        float a, b;
        String expr;
        String[] parts;
        boolean flag;
        while (true) {
            if (!st.empty()) {
                st.clear();
            }
            flag = true;

            System.out.printf("Введите выражение типа a b c xx xx, где a и b числа, xx: /, *, +, - и нажмите Enter:\n");
            expr = scanner.nextLine();
            parts = expr.split(" ");

            for (String iterable_element : parts) {
                if (iterable_element.equals("*")) {
                    if (st.size() >= 2) {
                        res = st.pop() * st.pop();
                        st.push(res);
                    } else {
                        flag = false;
                    }

                } else if (iterable_element.equals("+")) {
                    if (st.size() >= 2) {
                        res = st.pop() + st.pop();
                        st.push(res);
                    } else {
                        flag = false;
                    }
                } else if (iterable_element.equals("-")) {
                    if (st.size() >= 2) {
                        res = -st.pop() + st.pop();
                        st.push(res);
                    } else {
                        flag = false;
                    }
                } else if (iterable_element.equals("/")) {
                    if (st.size() >= 2) {
                        b = st.pop();
                        a = st.pop();
                        res = a / b;
                        st.push(res);
                    } else {
                        flag = false;
                    }
                } else {
                    try {
                        st.push(Float.parseFloat(iterable_element.trim()));
                    } catch (NumberFormatException e) {
                        flag = false;
                    }
                }

            }

            if (st.size() == 1 && flag) {
                System.out.printf("= %.2f\n", st.pop());
            } else
                System.out.printf("Введено неверное выражение, попробуйте еще раз!\n");

        }

    }

}
