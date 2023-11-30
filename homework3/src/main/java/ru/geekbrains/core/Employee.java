package main.java.ru.geekbrains.core;

import java.util.Comparator;

public abstract class Employee {

    //region Методы

    public abstract double calculateMonthlySalary();


    //endregion

    //region Конструкторы

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    //endregion

    // region Свойства

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    //endregion

    //region Поля

    protected String name;
    protected String position;

    //endregion
}
