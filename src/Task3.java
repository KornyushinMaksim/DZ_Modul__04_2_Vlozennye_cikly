//        В заданиях с 1-го по 5-е, используя операторы ветвления и цикла написать программу,
//        алгоритм которой будет выводить геометрические фигуры в консоль в виде «звёздочек» (псевдографика).
//        Грани фигур должны быть ровными, фигуры – симметричными.
//        Высота каждой фигуры должны задаваться с клавиатуры.
//        Можно использовать вывод только одной «звёздочки» в System.out.print(“*”).
//
//        Задание 3
//        Равнобедренный треугольник: заполненный и пустой.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите высоту фигуры: ");
        int a = in.nextInt();

        System.out.println("\nЗаполненный");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a * 2; j++){
                if ((j >= a - i) && (j <= a + i)) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }

        System.out.println("\nПустой");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a * 2; j++){
                if ((j == a - i) || (j == a + i) || ( i == a - 1 && j > 1)) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
