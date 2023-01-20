// Дано два числа, например 3 и 56, 
// необходимо составить следующие строки: 
// 3 + 56 = 59 
// 3 – 56 = -53
// 3 * 56 = 168 
// Используем метод StringBuilder.append().

import java.util.Scanner;

public class ProgramNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        int a = 56;
        int b = 3;
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%d + %d = %d\n", a, b, a + b));
        builder.append(String.format("%d - %d = %d\n", a, b, a - b));
        builder.append(String.format("%d * %d = %d\n", a, b, a * b));
        builder.append(String.format("%d / %d = %d\n", a, b, a / b));
        // System.out.println(builder.toString());
        System.out.println(builder.toString().replaceAll("=", "равно"));
    }
}
