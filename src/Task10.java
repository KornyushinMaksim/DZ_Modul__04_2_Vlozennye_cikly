//Задание 10
//        Напишите программу, которая будет считывать с консоли любое число (от 0 до 99999999)
//        и выводить его цифры в виде «звёздочек» (см. рисунок).
//        Пример для числа 41072819:

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int reversNum = 0;
        int temp = 0;
        
        while (num > 0){        //доработать, съедает 0
            temp = num % 10;
            if (num >= 10) {
                reversNum = (reversNum + temp) * 10;
            }
            else reversNum = (reversNum + temp);
            temp = num / 10;
            num = temp;
        }

        do {
            int key = reversNum % 10;
            switch (key) {
                case 0:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 7; j++) {
                            if ((i == 0 && j > 1 && j < 5) || (i == 6 && j > 1 && j < 5)) System.out.print("*");
                            else if ((j == 0 && i > 1 && i < 5) || (j == 6 && i > 1 && i < 5)) System.out.print("*");
                            else if (i == 1 && (j == 1 || j == 5)) System.out.print("*");
                            else if (i == 5 && (j == 1 || j == 5)) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 1:
                    for (int i = 0; i < 7; i++){
                        for (int j = 0; j < 3; j++){
                            if (j == 1) System.out.print("*");
                            else if (i == 1 && j == 0) System.out.print("*");
                            else if (i == 6) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
            }
            //int temp = reversNum / 10;
            reversNum = temp;
        } while (reversNum > 0);
    }
}
