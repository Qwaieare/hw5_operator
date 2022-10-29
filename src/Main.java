public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int clientOS = 1;
        if (clientOS ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");

        int clientOS1 = 1;
        int clientDeviceYear = 2018;

        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS1 == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3");

        int year = 2021;

        if (year % 4 ==0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется " + deliveryDays + " день");
        }
        else if (deliveryDistance >=20 && deliveryDistance < 60) {
            System.out.println("Потребуется " + (deliveryDays + 1) + " дня");
        }
        else if (deliveryDistance >=60 && deliveryDistance < 100) {
            System.out.println("Потребуется " + (deliveryDays + 2) + " дня");
        }
        else {
            System.out.println("Доставка до этого адреса невозможна");
        }

        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 12: case 1: case 2:
                System.out.println("Зима");
                break;
            case 3: case 4: case 5:
                System.out.println("Весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Лето");
                break;
            case 9: case 10: case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный месяц " + monthNumber);
        }

    }
}