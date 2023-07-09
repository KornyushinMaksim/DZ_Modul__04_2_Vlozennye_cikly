//  Задание 9
//        Необходимо нарисовать ёлочку символом «звёздочка».
//        Каждый новый ярус должен быть шире предыдущего.
//        С клавиатуры вводится количество ярусов, и высота первого (верхнего)
//        яруса ёлочки (количество строк в ярусе).
//        Ёлочка должна быть симметричная.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество ярусов и высоту первого");
        int a = in.nextInt();       //количество ярусов
        int b = in.nextInt();       //высота первого

        for (int i = 0; i < a; i++) {
            for ( int k = 0; k < b + i; k++) {
                for (int j = 0; j <= a * b; j++) {
                    if ((j >= (a * b) / 2 - k) && (j <= (a * b) / 2 + k)) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
