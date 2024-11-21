package lesson2;

import java.util.Scanner;


public class Test {

    public static void main (String[] args) {

        System.out.print("Write me");

        Scanner scanner = new Scanner(System.in);
        int numberScan = scanner.nextInt();

        Lesson2 lesson2 = new Lesson2();
        lesson2.nonStaticNum = scanner.nextInt();

        System.out.println(lesson2.nonStaticNum);
        System.out.println(lesson2.number);


    }
}

