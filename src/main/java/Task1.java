import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ввод данных с консоли:
        System.out.print("Число 1:");
        int a = sc.nextInt();
        System.out.print("Число 2:");
        int b = sc.nextInt();
        //Основная логика/вычисления
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        //Деление
        if (b == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            double y = (double) a / b;
            String result = String.format("%.2f", y);
            System.out.println("a / b = " + result);
        }
        //Математические операции умножение, сложение, вычитание
        System.out.println("a * b = " + (a * b));
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
    }
}
