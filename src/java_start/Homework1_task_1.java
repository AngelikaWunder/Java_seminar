import java.util.Scanner;

public class Homework1_task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int num = scanner.nextInt();
        System.out.printf("N факториал равен % 2f \n", factorial(num));
        System.out.printf("N-ое треугольное число равно: %d \n", n_triangular_number(num));

    }
    static double factorial (int number){
        int fact =1;
        for (int i = 1; i <= number; i++) {
            fact = fact* i;
        }
        return  fact;
    }
    static int n_triangular_number (int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
       }
        return sum;
    }
}
