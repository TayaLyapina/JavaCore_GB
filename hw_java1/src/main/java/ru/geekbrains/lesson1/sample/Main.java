package ru.geekbrains.lesson1.sample;


import ru.geekbrains.lesson1.regular.Calculator;
import ru.geekbrains.lesson1.regular.Decorator;
import ru.geekbrains.lesson1.regular.DecoratorAdd;
import ru.geekbrains.lesson1.regular.DecoratorSub;
import ru.geekbrains.lesson1.regular.DecoratorMult;

import java.util.Scanner;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */
public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int result = Calculator.add(num1, num2);
        System.out.println(DecoratorAdd.decoradd(result));
        result = Calculator.sub(num1, num2);
        System.out.println(DecoratorSub.decorsub(result));
        result = Calculator.mul(num1, num2);
        System.out.println(DecoratorMult.decormult(result));
        result = Calculator.div(num1, num2);
        System.out.println(Decorator.decordiv(result));
    }
}
