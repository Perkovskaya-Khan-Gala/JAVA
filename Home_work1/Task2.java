package Home_work1;

/*Вывести все простые числа от 1 до 1000 */
public class Task2 {
    static void findSimpleDigits(int range) {
        for (int index = 2; index <= range; index++) {
            boolean flag = true;
            for (int j = 2; j < index; j++) {
                if (index % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.printf("%d ",index);
            }
        }
       
    }

    public static void main(String[] args) {
        findSimpleDigits(1000);
    }
}
