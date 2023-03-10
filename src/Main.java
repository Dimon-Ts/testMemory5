public class Main {
    public static void main(String[] args) {
        //Урок с Ильёй Сазоновым
        int ageMan = 7;
        if ( ageMan == 18 ) {
            System.out.println("Поздравляем с окончанием школы!Теперь тебе можно водить машину!");}
        else if ( ageMan ==21 ) {
            System.out.println("Можешь отпраздновать с употреблением алкоголя в баре!");}
        else if ( ageMan == 7 ) {
            System.out.println("Иди в школу!");
        } else {
            System.out.println("Пока тебе нечего посоветовать!");
        }
        int ageMan1 = 22;
        if ( ageMan1 >= 18 ) {
            System.out.println("Поздравляем теперь ты можешь водить машину!");
            if ( ageMan1 >= 21 ) {
                System.out.println("Можешь отпраздновать получение прав с употреблением алкоголя в баре!");}}
        //Из шпаргалки.
        int dayOfWeekNumber = 3;

        switch (dayOfWeekNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
        int dayOfWeekNumberMeaning = 3;

        switch (dayOfWeekNumberMeaning) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будний день");
                break;
            case 6:
            case 7:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
        //Задание 1
        //Представим, что мы работаем в банке. У нашего банка есть сайт, на который можно зайти с компьютера
        // или телефона, а также мобильное приложение. И нам, и клиенту удобнее с телефона пользоваться
        // мобильным приложением. Поэтому каждый раз, когда пользователь заходит на сайт с телефона, мы должны
        // выдавать ему ссылку на скачивание приложения. Но мы не знаем, iOS или Android он использует.
        //Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает
        // соответствующее сообщение для обоих вариантов.
        //Объявите переменную clientOS, которая равна 0 или 1. (0 — iOS, 1 — Android)
        //При отработке программы в консоли должно выдаваться сообщение об установке соответствующего
        // приложения.
        //Например, для iOS оно будет звучать так:
        //«Установите версию приложения для iOS по ссылке».
        //А для Android так:
        //«Установите версию приложения для Android по ссылке».
        int clientOS = 0;
        if ( clientOS == 1 ) {
            System.out.println("Установите версию приложения для Android по ссылке!");} else {
            System.out.println("Установите версию приложения для iOS по ссылке!");}
        //Задание 2
        //К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона,
        // но и год его создания: от этого зависит, подойдет ли приложение для телефона или оно просто
        // не установится.
        //Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
        //Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную
        // версию приложения.
        //Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии
        // двух условий — операционной системы телефона (iOS или Android) и года производства.
        //Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об
        // облегченной версии.
        //Например, для iOS оно будет звучать так:
        //«Установите облегченную версию приложения для iOS по ссылке».
        //А для Android так:
        //«Установите облегченную версию приложения для Android по ссылке».
        //При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение
        // об установке приложения.
        //Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать 2015 год.
        //Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
        int clientOSVer = 0;
        int clientOSYear = 2014;
        if ( clientOSVer == 1 && clientOSYear >= 2015 ) {
            System.out.println("Установите версию приложения для Android по ссылке!");}
        else if ( clientOSVer == 0 && clientOSYear >= 2015 ){
            System.out.println("Установите версию приложения для iOS по ссылке!");}
        if ( clientOSVer == 1 && clientOSYear < 2015 ) {
            System.out.println("Установите облегчённую версию для Android поссылке!");}
        else if ( clientOSVer == 0 && clientOSYear < 2015 ) {
            System.out.println("Установите облегчённую версию для iOS по ссылке!");}
        //Задание 3
        //Напишите программу, которая определяет, является ли год високосным или нет.
        //Переменную года назовите year, в которую можно подставить значение интересующего нас года.
        // Например, 2021.
        //Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        //« …. год является високосным».
        //или
        //«... год не является високосным».
        //Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
        //Также високосным является каждый четырехсотый год.
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным!");} else {
            System.out.println("Год не является високосным!");}
        //Задание 4
        //Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку
        // банковских карт на дом с четкой датой доставки. Чтобы известить клиента о том, когда будет
        // доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
        //Правила доставки такие:
        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //Напишите программу, которая выдает сообщение в консоль:
        //"Потребуется дней: " + срок доставки
        //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        int deliveryDistance = 40;
        if ( deliveryDistance <= 20 ) {
            System.out.println("Для доставки вашей банковской карты потребуется один день.");}
        else if ( deliveryDistance > 20 && deliveryDistance <= 60 ) {
            System.out.println("Для доставки вашей банковской карты потребуется 2 дня.");}
        else if ( deliveryDistance > 60 && deliveryDistance <= 100 ) {
            System.out.println("Для доставки вашей банковской карты потребуется 3 дня.");}
        else {
            System.out.println("Когда ваша банковская карта прибудет в ваш район,мы вас уведомим.");}
        //Задание 5
        //Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1 месяц (он же январь) принадлежит к сезону зима.
        //Для написания программы используйте оператор switch. Для обозначения номера месяца используйте
        // переменную monthNumber = 12.
        //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
        int monthNumber = 12;
        switch ( monthNumber ) {
            case 12:
            case 1:
            case 2:
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
                System.out.println("Такого месяца не существует!");
        }
        System.out.println("Hello Russia!Hello China!Hello world!");
    }
}
