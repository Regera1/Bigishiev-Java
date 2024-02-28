// 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
// - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
// - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

import java.util.Scanner;

public class inteview {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число а ");
        int a = s.nextInt();
        System.out.println("Введите число b ");
        int b = s.nextInt();
        if (a == b) {
            System.out.println("a = b");

        } else if (a < b) {
            

                System.out.println("a < b");

            

        } else {
            System.out.println("a > b");
        }
        System.out.println("Результат прибавления чисел a и b - " + (a + b));
        System.out.println("Результат вычитания чисел а и b - " + (a - b));
        System.out.println("Результат умножения чисел а и b - " + (a * b));
        System.out.println("Результат деления чисел a и b - " + (a / b));

        s.close();

    }
}
