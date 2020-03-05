package com.dope;

public class Main {


    public static void main(String[] args) {

        task2();
        //task7_1();
        //task7_2();
        //task8();
        //task9();
        //task10();

    }

    private static void task2() {
        final int A = 3, B = -5;
        for (double x = 1; x <= 5; x += 0.5) {
            double y = A * x * x + B;
            System.out.println("y = " + y);
        }
    }

// Я посмотрел видео, где Вы разобрали этот пример и решил сделать НЕ так, как у Вас. Но вот начальные условия из
// первой части перенести во вторую у меня получилось только вручную. Можно ли как-то реализовать, чтоб они переносились
// автоматически, или подобный вариант просто не имеет смысла?

    private static void task7_1() {
        for (int x = 100; x <= 118; x++) {
            if (x % 19 == 0) {
                int z = x + 19 * 14;
                System.out.println("x1 = " + x);
                System.out.println("x15 = " + z);
                System.out.println();
            }
        }
    }


    private static void task7_2() {
        for (int y = 114; y <= 380; y += 19)
            System.out.println("x = " + y);
    }

    private static void task8() {
        final int N = 20;
        int n = 0, x = 500;
        while (n < N) {
            if ((x % 17 == 0) || (x % 13 == 0)) {
                System.out.println("x = " + x);
                n++;
            }
            x++;
        }
    }


    private static void task9() {
        final int Z = 228;
        int a = 2, b = 4, n = 1, sum = 2;
        do {
            a = a + b;
            sum = sum + a;
            n++;
        } while (sum < Z);
        System.out.println("Количество слагаемых " + n + " Сумма " + sum + " Последнее " + a);
    }

    private static void task10() {
        int a = 1, b = 4, n = 1, sum = 1;
        do {
            System.out.println("A = " + a);
            a = a + b;
            sum = sum + a;
            n++;
        } while (n <= 9);
        System.out.println("A = " + a + " Сумма " + sum);
    }
}



//uHtepecHo, no4emy taK He pa6otaet

//    private static void task7_1() {
//                int x = 100;
//                int y;
//                do {
//                x++;
//                y = x;
//                }
//                while (x % 19 == 0);
//                System.out.println(y);

//    private static void task7_1() {
//        int x = 100;
//        while (x % 19 == 0) {
//            x++;
//        }
//        int y = x;
//        System.out.println(y);