import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: 12.5");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: 7.5");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;

        System.out.println("сумма чисел:" +sum);



    }
}


