package Exercise_1;
import java.util.Scanner;

public class Quastion_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        while (x > 0) {
            int z = x % 10;
            x = x / 10;
            int s = y;
            while (s > 0) {
                if (z == s%10) {
                    System.out.println(z);
                }
                s/=10;

            }
        }
    }
}
