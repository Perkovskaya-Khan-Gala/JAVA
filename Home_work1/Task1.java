package Home_work1;
/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n) */

public class Task1 {
    static int sumNumber(int n) {
        int sum = 0;
        for (int index = 1; index <= n; index++) {
            sum += index;
        }
        return sum;
    }

    static int factorialNumber(int n) {
        int result = 1;
        for (int index = 1; index <= n; index++) {
            result *= index;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 9;
        System.out.printf(" %d треугольное число: %d\n",number, sumNumber(number));
        System.out.printf("Факториал %d!: %d",number, factorialNumber(number));

    }
}
