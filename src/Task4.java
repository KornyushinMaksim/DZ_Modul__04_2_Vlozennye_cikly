//        В заданиях с 1-го по 5-е, используя операторы ветвления и цикла написать программу,
//        алгоритм которой будет выводить геометрические фигуры в консоль в виде «звёздочек» (псевдографика).
//        Грани фигур должны быть ровными, фигуры – симметричными.
//        Высота каждой фигуры должны задаваться с клавиатуры.
//        Можно использовать вывод только одной «звёздочки» в System.out.print(“*”).
//
//        Ромб: заполненный и пустой.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите высоту фигуры: ");
        int a = in.nextInt();

        System.out.println("\nЗаполненный");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                if (i >= j && i + j >= a - 1) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
        for (int i = 1; i < a; i++){
            for (int j = 0; j < a; j++){
                if (i <= j && i + j <= a - 1) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }

//        for (int i = 1; i < a; i++){
//            for (int j = 0; j < a * 2; j++){
//                if (i <= a - j && i >= a + j) System.out.print(" * ");
//                else System.out.print("   ");
//            }
//            System.out.println();
//        }
    }
}
