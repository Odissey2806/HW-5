public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Условный оператор Урок 2

        // Задача №1

        char clientOS = 1; // где, 0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        } else if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }

        // Задача №2
        char clientDeviceYear = 2015;// выбор года выпуска
        char clientOs = 1; // где, 0 — iOS, 1 — Android
        if (clientOs == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
            if (clientDeviceYear < 2015) {
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
            } else if (clientDeviceYear >= 2015) {
                System.out.println("Обычная установка приложения");
            }
        }
        if (clientOs == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
            if (clientDeviceYear < 2015) {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
            }else if (clientDeviceYear >= 2015) {
                System.out.println("Обычная установка приложения");
            }
        }
        // Задача № 3
        int year = 2024; // любой год
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("« " + year + " год является високосным»");
        } else if (year >= 1584 && year % 4 != 0 ){
            System.out.println("« " + year + " год не является високосным»");
        }        else {
            System.out.println("Не имеет значения");
        }

        // Задача №4
        int deliveryDistance = 101; // расстояние любое
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        }else {
            System.out.println("Доставка отсутсвует");
        }

        // Задача №5
        int monthNumber = 17;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такой месяц  отсуствует");
        }
    }
    }