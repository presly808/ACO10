package homework_1;

import java.util.Scanner;

//Написать класс число.
//- сложение
//- вычитание
//- умножение
//- деление
//- возведение в степень
//- вычисление факториала
//- вычисление остатка от деления
//- метод который сравнивает два числа
public class DigitMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation: ");
        String add = "add";
        String difference = "difference";
        String multiplication = "multiplication";
        String differentiation = "differentiation";
        String involution = "involution";
        String factorial = "factorial";
        String remain = "remain";
        String compare = "compare";


        String operation = scanner.next();
        System.out.println("Enter first digit:");
        Digit digit = new Digit(scanner.nextInt());
        System.out.println("Enter second digit:");

        if (operation.equals(add)) {
            int sum = digit.sum(scanner.nextInt());
            System.out.println(sum);
        }

        if (operation.equals(difference)) {
            int dif = digit.dif(scanner.nextInt());
            System.out.println(dif);
        }

        if (operation.equals(multiplication)) {
            int diff = digit.diff(scanner.nextInt());
            System.out.println(diff);
        }

        if (operation.equals(differentiation)) {
            int mult = digit.mult(scanner.nextInt());
            System.out.println(mult);
        }

        if (operation.equals(involution)) {
            double inv = digit.inv(scanner.nextInt());
            System.out.println(inv);
        }

        if (operation.equals(factorial)) {
            int fact = digit.fact(scanner.nextInt());
            System.out.println(fact);
        }

        if (operation.equals(remain)) {
            int rem = digit.rem(scanner.nextInt());
            System.out.println(rem);
        }

        if (operation.equals(compare)) {
            int comp = digit.comp(scanner.nextInt());
            if (comp == 0) System.out.println("Digits equals");
            else System.out.println(comp + " is bigger");
        }


    }
}
