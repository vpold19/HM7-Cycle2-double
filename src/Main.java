public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int wanted = 2_459_000;
        int total = 0;
        int save = 15_000;
        int month = 0;
        while (total < wanted) {
            month = month + 1;
            total = total + save;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %d рублей", month, total);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();

        for (int o = 10; o >= 1; o = o - 1) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");
        int countryY = 12_000_000;
        int birthStatisticsForThousand = 17;
        int deathStatisticsForThousand = 8;
        int years = 10;
        int counter = 0;
        while (counter < years) {
            counter++;
            countryY = countryY + (countryY * (birthStatisticsForThousand - deathStatisticsForThousand) / 1000);
            System.out.printf("Год %d, численность населения составляет %d", counter, countryY);
            System.out.println();
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int cashTotal = 12_000_000;
        int month = 0;
        int cash = 15_000;
        int monthPercent = 7;
        while (cash <= cashTotal) {
            cash = cash + (cash * monthPercent / 100);
            month++;
            System.out.printf("сумма %d накоплений по каждому месяцу %d", cash, month);
            System.out.println();
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int cashTotal = 12_000_000;
        int month = 0;
        int cash = 15_000;
        int monthPercent = 7;
        while (cash <= cashTotal) {
            cash = cash + (cash * monthPercent / 100);
            month++;
            if (month % 6 == 0) {
                System.out.printf("сумма %d накоплений по каждому месяцу %d", cash, month);
                System.out.println();
            }
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        int cash = 15_000;
        int year = 9;
        int counter = 0;
        int monthPercent = 7;
        while (counter <= year * 12) {
            cash = cash + (cash * monthPercent / 100);
            counter++;
            if (counter % 6 == 0) {
                System.out.printf("Сумма %d накоплений за каждые полгода %d в течение 9 лет", cash, counter);
                System.out.println();
            }
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int totalDays = 31;
        int friday = 1;
        while (friday < totalDays) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет", friday);
            System.out.println();
            friday = friday + 7;
        }
    }

    public static void task8() {
        System.out.println("Задание 8");
        int period = 79;
        int yearNow = 2023;
        int flyStart = yearNow - 200;//2023 г - 200
        int flyEnd = yearNow + 100;//2023 г +100
        for (int year = flyStart; year <= flyEnd; year = year + 1) {
            if (year % period == 0) {
                System.out.println(year);
            }
        }
    }
}