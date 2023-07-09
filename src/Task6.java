//  Задание 6
//        Нарисовать на экране лесенку. Количество ступенек указывает пользователь с клавиатуры.
//        Пример лесенки на 3 ступеньки:

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество ступенек: ");
        int a = in.nextInt();

        for (int i = 0; i < a * 2; i++) {
            for (int j = 0; j <= (i + 2); j++) {
                if ( i % 2 == 0) {
                    if (j < i) System.out.print(" ");
                    else {
                        System.out.print("*");
//                        System.out.println();
                    }
                }

                if ( i % 2 != 0) {
                    if (j < i + 1) System.out.print(" ");
                    else if (j == i + 1) System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}

