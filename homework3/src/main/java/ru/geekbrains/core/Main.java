package main.java.ru.geekbrains.core;

public class Main {
    public static void main(String[] args) {

        Employee[] employees =  {
                Worker.create("Александр", "дворник", 20000),
                Worker.create("Маша", "бухгалтер", 50000),
                Freelancer.create("Катя", "smm", 800),
                Freelancer.create("Василий", "оператор", 1500)
        };

        for (Employee employee : employees) {
            System.out.printf("%s по профессии %s зарабатывает %.2f рублей\n", employee.name, employee.position,
                    employee.calculateMonthlySalary());
        }
    }


}
