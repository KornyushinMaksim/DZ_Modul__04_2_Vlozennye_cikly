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
        int copyNum = num;
        int count = 0;

        while (copyNum > 0) {
            copyNum /= 10;
            count++;

        }

        for (int d = count; d > 0; d--) {
            int key = (int) (num / Math.pow(10, d - 1));
            switch (key) {
                case 0:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 7; j++) {
                            if (((i == 0 && j > 1 && j < 5) || (i == 6 && j > 1 && j < 5)) ||
                                    ((j == 0 && i > 1 && i < 5) || (j == 6 && i > 1 && i < 5)) ||
                                    (i == 1 && (j == 1 || j == 5)) ||
                                    (i == 5 && (j == 1 || j == 5))) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 1:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 3; j++) {
                            if ((j == 1) ||
                                    (i == 1 && j == 0) ||
                                    (i == 6)) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                            if ((i == 0 && j > 0 && j < 4) ||
                                    (j == 0 && i > 0 && i < 3) ||
                                    (j == 4 && i == 1) ||
                                    (i + j == 6) ||
                                    (i == 6)) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                            if ((i == 0) ||
                                    ((i - 1) + (j - 1) == 2 && i < 3) ||
                                    (i == 2 && j != 0 && j != 4) ||
                                    ((j == 4 && i > 2 && i < 6) || (i == 5 && j == 0)) ||
                                    (i == 6 && j != 0 && j != 4)) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 6; j++) {
                            if ((i == 4) || (j == 3) || (i + j == 3)) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                            if ((i == 0) || (j == 0 && i < 2) ||
                                    (i == 2 && j < 4) || (j == 4 && i > 2 && i < 6) ||
                                    (i == 6 && j != 0 && j != 4) ||
                                    (i == 5 && j == 0)) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j == 0 && i != 0 && i != 6 ||
                                    j == 4 && i > 2 && i < 6 ||
                                    i == 0 && j != 0 && j != 4 ||
                                    i == 2 && j != 4 ||
                                    i == 6 && j != 0 && j != 4) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                            if ((i == 0) || (i + j == 5) || (i == 6 && j == 0)) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 8:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                            if ((i == 0 && j != 0 && j != 4) ||
                                    (i == 3 && j != 0 && j != 4) ||
                                    (i == 6 && j != 0 && j != 4) ||
                                    (j == 0 && i != 0 && i != 3 && i != 6) ||
                                    (j == 4 && i != 0 && i != 3 && i != 6)) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 9:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                            if ((i == 0 && j != 0) ||
                                    (i == 3 && j != 0) ||
                                    (j == 0 && i > 0 && i < 3) ||
                                    (j == 4)) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
            }
            int temp = num - ( key * ((int) Math.pow(10, d - 1)));
            num = temp;
        }
    }
}
