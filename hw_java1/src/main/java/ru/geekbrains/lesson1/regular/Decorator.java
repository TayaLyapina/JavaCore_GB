package ru.geekbrains.lesson1.regular;

/**
 * Декоратор. Он декорирует, то есть, накладывает на результат декорации.
 * Внешний вид важен, поэтому этот класс существует.
 */
public class Decorator {
    /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки с преамбулой 'Вот Ваше число'
     *
     * @param a число, требующее декорации
     * @return Отформатированная строка.
     */
    public static String decordiv(int a) {
        /*
         * Метод декорирует число, добавляя к нему строку
         * при помощи функции форматирования строк
         * */
        return String.format("Результат деления: %d.", a);
    }
}

