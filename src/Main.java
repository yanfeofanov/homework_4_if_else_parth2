public class Main {
    public static void main(String[] args) {

        //Задача №1

        int clientOS = 0;
        int clientOSa = 1;
        if (clientOSa == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задача №2

        int clientOS1 = 0;
        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        if (clientOS2 == 1 && clientOS2 < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientOS2 >= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS1 == 0 && clientOS1 < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientOS >= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задача №3

        int year = 2021;
        if (year % 400 == 0 && year % 100 == 0) {
            System.out.println(year + " год является не високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год является не високосным");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год является не високосным");
        }

        //Задача №4

        int deliveryDistance = 95;
        int delivery = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + delivery+" срок доставки" );
        }
        else  if (deliveryDistance>=20 && deliveryDistance<=60){
            System.out.println("Потребуется дней: " + (delivery+1)+" срок доставки" );
        }
        else  if (deliveryDistance>=60 && deliveryDistance<=100){
            System.out.println("Потребуется дней: " + (delivery+2)+" срок доставки" );
        }
        else  if (deliveryDistance>100){
            System.out.println("Доставки нет");
        }

        //Задача №5

        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}