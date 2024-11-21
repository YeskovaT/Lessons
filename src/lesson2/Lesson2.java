package lesson2;


import java.util.Scanner;

public class Lesson2 {

    public class int number = 5;

    public int nonStaticNum;

    public void method(){
        int temp = 6;
        temp = temp + 7;
    }
}


public class Calculator {
    private double number1;
    private double number2;

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator  calculator = new Calculator();

        System.out.print();
        Calculator.number1 = scanner.nextDouble();


        System.out.print();
        Calculator.number2 = scanner.nextDouble();


        System.out.println();





    }
}