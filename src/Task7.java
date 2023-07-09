//  Задание 7
//        С клавиатуры вводится целое положительное число любой
//        разрядности. Необходимо перевернуть это число, т. е.
//        цифры должны располагаться в обратном порядк
//        (например, вводим число 1234 – в результате будет 4321).
//        Не использовать строки и массивы.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int a = in.nextInt();

        if (a > 0) {
            while (a > 0) {
                int temp = a % 10;
                System.out.print(temp);
                temp = a / 10;
                a = temp;
            }
        }
        else if (a < 0) {
            System.out.println("Ошибка!!! Введено отрицательное число");
        }
    }
}
