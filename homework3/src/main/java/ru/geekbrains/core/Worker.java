package main.java.ru.geekbrains.core;

public class Worker extends Employee{

    //region Методы

    public static Worker create(String name, String position, int fixedPayment) {
        if (fixedPayment < 0) {
            throw new RuntimeException("Некорректная фиксированная месячная оплата");
        }
        return new Worker(name, position, fixedPayment);
    }

    @Override
    public double calculateMonthlySalary() {
        return fixedPayment;
    }

    //endregion

    //region Конструкторы

    public Worker(String name, String  position, int fixedPayment) {
        super(name, position);
        this.name = name;
        this.position = position;
        this.fixedPayment = fixedPayment;
    }

    //endregion

    // region Свойства

    public int getFixedPayment() {
        return fixedPayment;
    }

    //endregion

    // region Поля

    private int fixedPayment;

    //endregion
}
