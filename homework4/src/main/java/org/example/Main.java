package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите начальный баланс счета: ");
            double initialBalance = scanner.nextDouble();

            Account account = new Account(initialBalance);

            try {
                System.out.print("Введите сумму депозита: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);

                try {
                    System.out.print("Введите сумму для снятия: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                } catch (InsufficientFundsException e) {
                    System.out.printf("Ошибка: %s\n", e.getMessage());
                }

            } catch (IllegalArgumentException e) {
                System.out.printf("Ошибка: %s\n", e.getMessage());
            }

            finally {
                System.out.printf("Текущий баланс: %.2f", account.getBalance());
            }

        } catch (IllegalArgumentException e) {
            System.out.printf("Ошибка: %s\n", e.getMessage());
        }

        scanner.close();
    }


}
