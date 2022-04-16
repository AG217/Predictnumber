import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int turnQuantity = turnq();
        int lowerBound = lowerb();
        int upperBound = upperb();
        int compNumber = random(lowerBound, upperBound);
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        boolean status = false;
        while (counter <= turnQuantity) {
            System.out.print("Введите число: ");
            int humanNumber = scanner.nextInt();
            if (humanNumber == compNumber) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                status = true;
                break;
            } else if (humanNumber > compNumber) {
                System.out.println("Загаданное мною число меньше.");
                status = false;
            } else {
                System.out.println("Загаданное мною число больше.");
                status = false;
            }

            counter++;
        }
        if (status == false) {
            System.out.println("Конец игры.");
            System.out.println("Мною было загадано число: " + compNumber);
        }
    }


    public static int turnq() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальное количество попыток ");
        int turnQuantity = scanner.nextInt();
        return turnQuantity;
    }

    public static int lowerb() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нижний предел числа ");
        int lowerBound = scanner.nextInt();
        return lowerBound;
    }

    public static int upperb() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите верхний предел числа ");
        int upperBound = scanner.nextInt();
        return upperBound;
    }

    public static int random(int lowerBound, int upperBound) {
        Random newRandom = new Random();
        int compNumber = lowerBound + newRandom.nextInt(upperBound);
        return compNumber;
    }

}