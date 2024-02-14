import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ввод данных с консоли:
        System.out.print("Первая строка: ");
        String a = sc.nextLine();
        System.out.print("Вторая строка: ");
        String b = sc.nextLine();
        //Основная логика
        if (Objects.equals(a, b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
