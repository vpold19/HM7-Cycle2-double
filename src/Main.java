public class Main {
    public static void main(String[] args) {
      //  task1();
        // task2();
        //task3();
       task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Задание 1");
        int wanted =2_459_000;
        int total=0;
        int save=15_000;
        int month=0;
        while(total<wanted){
            month=month+1;
            total=total+save;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %d рублей",month,total);
        System.out.println();
    }
    public static void task2(){
        System.out.println("Задание 2");
        int i=0;
        while(i<10){
            i=i+1;
            System.out.print(i +" ");
        }
        System.out.println();

        for(int o=10;o>=1;o=o-1){
            System.out.print(o+" ");
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Задание 3");
        int countryY=12_000_000;
        int birthStatisticsForThousand=17;
        int deathStatisticsForThousand=8;
        int years=10;
        int counter=0;
        while(counter<years){
            counter++;
            countryY=countryY+(countryY*(birthStatisticsForThousand-deathStatisticsForThousand)/1000);
            System.out.printf("Год %d, численность населения составляет %d",counter,countryY);
            System.out.println();
        }
    }
    public static void task4(){
        System.out.println("Задание 4");

     }
    public static void task5(){
        System.out.println("Задание 5");
    }
    public static void task6(){
        System.out.println("Задание 6");
    }
    public static void task7(){
        System.out.println("Задание 7");
    }
    public static void task8(){
        System.out.println("Задание 8");
    }
    }