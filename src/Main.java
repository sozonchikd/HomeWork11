import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задание 1.
        System.out.println("Задание 1");
        int year = 2024;
        checkYear(year);

        // Задание 2.
        System.out.println("Задание 2");

        int currentYear = LocalDate.now().getYear();
        int clientOS = 0;
        requiredApplicationVersion(clientOS, currentYear);

        // Задание 3.
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int days = deliveryPeriod(deliveryDistance);
        System.out.println("Потребуется дней: " + days);
    }

    // Метод задания 1.
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный!");
        } else {
            System.out.println(year + " год не високосный.");
        }
    }

    // Метод задания 2.
    public static void requiredApplicationVersion(int operatingSystem, int requiredYear) {
        if (operatingSystem == 0) {
            if (requiredYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите приложение для iOS по ссылке.");
            }
        }
        if (operatingSystem == 1) {
            if (requiredYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android  по ссылке.");
            } else {
                System.out.println("Установите приложение для Android по ссылке.");
            }
        }
    }

    // Метод задания 3.
    public static int deliveryPeriod(int distance) {
        int deliveryDays = 1;
        if (distance > 20) {
            deliveryDays++;
        }
        if (distance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }

}