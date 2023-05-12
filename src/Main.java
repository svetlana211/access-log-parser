import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число 1");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите число 2");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Сумма двух чисел : "+(x+y));
        System.out.println("Разность двух чисел : "+(x-y));
        System.out.println("Произведение двух чисел : "+(x*y));
        System.out.println("Частное двух чисел : "+(double)(x/y));
    }
}
