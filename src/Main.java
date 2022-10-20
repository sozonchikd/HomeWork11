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

    }

    // Метод задания 1.
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный!");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static void requiredApplicationVersion(int operatingSystem, int requiredYear) {
        if (operatingSystem == 0) {
            if (requiredYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите приложение для iOS по ссылке");
            }
        }
        if (operatingSystem == 1) {
            if (requiredYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android  по ссылке");
            } else {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }


}