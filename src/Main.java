public class Main {
    public static void main(String[] args) {

        // Задание 1 (ver.0)

        int systemType = 1;
        if (systemType == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Задание 1 (ver.1)

        boolean thisIsAndroid = false;
        if (thisIsAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Задание 2

        int clientDeviceYear = 2015;

        if (systemType == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (systemType == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (systemType == 2 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (systemType == 2 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Задание 3

        float year = 2000F;


        if (year % 4 == 0 || year % 400 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }

        }

        // Задача 4

        int deliveryDistance = 95;
        int deliveryPeriod = deliveryDistance / 40;


        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else {
            System.out.println("Потребуется дней: " + (deliveryPeriod + 1));
        }

        // Задача 5

        int monthNumber = 2;
        if (monthNumber > 12) {
            System.out.println("Не бывает такого месяца!");
        } else {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Это зима!");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Это весна!");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Это лето!");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Это осень!");
                    break;

            }
        }
    }
}