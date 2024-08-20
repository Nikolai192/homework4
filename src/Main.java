public class Main {
    public static void main(String[] args) {
        char clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для IOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Для вашего устройства приложения нет");
        }
            int clientPhoneOS = 1;
            int clientDeviceYear = 2013;
            if ( clientPhoneOS == 1 && clientDeviceYear <= 2015 ) {
                System.out.println("Скачай облегченную версию приложения для Android по ссылке");
            } else if (clientPhoneOS == 1 && clientDeviceYear > 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (clientPhoneOS == 0 && clientDeviceYear <= 2015) {
                    System.out.println("Скачай облегченную версию приложения для IOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для IOS по ссылке");
                }
            char year = 1590;
            if ( year < 1584) {
                System.out.println("Високосный год не введен");
            } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println( + year + " год високосный");
            } else {
                System.out.println( + year + " год не високосный");
            }
        int deliveryDistance = 5;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуются одни сутки на доставку");
            if (deliveryDistance > 20 && deliveryDistance < 60) {
                System.out.println("Потребуется двое суток на доставку");
            }
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется трое суток на доставку");
        } else {
            System.out.println("Доставка не осуществляется");
        }
        int monthNumber = 13;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца еще не придумали");
        }

    }
}