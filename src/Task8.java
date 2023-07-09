//  Задание 8
//        С клавиатуры вводится целое число любой разрядности.
//        Программа должна определить и вывести на консоль
//        количество цифр в этом числе, а так же сумму этих чисел.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        System.out.print("Введите целое число: ");
        int a = in.nextInt();

        while (a > 0){
            sum += a % 10;
            count++;
            int temp = a / 10;
            a = temp;
        }
        System.out.printf("Сумма цифр: %d\nКоличество цифр: %d", sum, count);
    }
}
