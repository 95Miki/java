package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("Введите первое число:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: Введите число:");
            scanner.next(); // Пропускаем некорректный ввод
        }
        num1 = scanner.nextDouble();

        System.out.println("Введите оператор (+, -, *, /, √):");
        operator = scanner.next().charAt(0);

        double result;

        switch(operator) {
            case '+':
                System.out.println("Введите второе число:");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Ошибка: Введите число:");
                    scanner.next(); // Пропускаем некорректный ввод
                }
                num2 = scanner.nextDouble();
                result = num1 + num2;
                break;
            case '-':
                System.out.println("Введите второе число:");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Ошибка: Введите число:");
                    scanner.next(); // Пропускаем некорректный ввод
                }
                num2 = scanner.nextDouble();
                result = num1 - num2;
                break;
            case '*':
                System.out.println("Введите второе число:");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Ошибка: Введите число:");
                    scanner.next(); // Пропускаем некорректный ввод
                }
                num2 = scanner.nextDouble();
                result = num1 * num2;
                break;
            case '/':
                System.out.println("Введите второе число:");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Ошибка: Введите число:");
                    scanner.next(); // Пропускаем некорректный ввод
                }
                num2 = scanner.nextDouble();
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                    return;
                }
                break;
            case '√':
                result = Math.sqrt(num1);
                break;
            default:
                System.out.println("Ошибка: неправильный оператор");
                return;
        }

        System.out.println("Результат: " + result);
    }
}



