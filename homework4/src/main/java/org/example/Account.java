package org.example;

public class Account {

    private static double balance;

    public static double getBalance() {
        return balance;
    }

    /**
     * Конструктор для создания нового счета
     * @param initialBalance начальный баланс
     * @throws IllegalArgumentException проверка что баланс не отрицательный
     */
    public Account(double initialBalance) throws IllegalArgumentException{
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
        this.balance = initialBalance;
    }

    /**
     * Внесение депозита
     * @param amount сумма депозита
     * @throws IllegalArgumentException проверка что сумма депозита не отрицательна
     */
    public void deposit(double amount) throws IllegalArgumentException{
        if (amount < 0) {
            throw new IllegalArgumentException("Вносимая сумма не может быть отрицательной");
        }
        this.balance += amount;
    }

    /**
     * Снятие денег со счета
     * @param amount сумма снятия
     * @throws InsufficientFundsException проверка что средств на счете достаточно для снятия
     */
    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете");
        } else {
            this.balance -= amount;
        }
    }

}
