package main.java.ru.geekbrains.core;

public class Freelancer extends Employee{

    //region Методы

    public static Freelancer create(String name, String position, int hourlyRate) {
        if (hourlyRate < 0) {
            throw new RuntimeException("Некорректная часовая ставка");
        }
        return new Freelancer(name, position, hourlyRate);
    }

    @Override
    public double calculateMonthlySalary(){
        return 20.8 * 8 * hourlyRate;
    }

    //endregion

    //region Конструкторы

    public Freelancer(String name, String position, int hourlyRate){
        super(name, position);
        this.name = name;
        this.position = position;
        this.hourlyRate = hourlyRate;

    }

    //endregion

    // region Свойства

    public int getHourlyRate() {
        return hourlyRate;
    }

    //endregion

    //region Поля

    private int hourlyRate;

    //endregion
}
