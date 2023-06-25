import java.util.Scanner;

public class Homework1_task_3 {
//    Реализовать простой калькулятор
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Введите число а: ");
    double a = scanner.nextDouble();
    System.out.printf("Введите число b: ");
    double b = scanner.nextDouble();
    System.out.printf("Введите знак операции (+, -, *, /): ");
    char operator = scanner.next().charAt(0);
    double result =0;
    switch (operator){
        case '+': result = a+b;
            break;
        case '_': result = a-b;
            break;
        case '*': result= a*b;
            break;
        case '/': result = a/b;
            break;
        default:
            System.out.println("Ошибка. Введите знак операции, который указан в скобках.");
    }
    System.out.printf ("Результат операции равен: % 2f %c % 2f = % 2f \n", a,operator, b, result);
    System.out.println (a + " " + operator + " "  + b + " " + "=" + " " + result);
    }
}
