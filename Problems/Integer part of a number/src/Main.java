import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static int extractInt(double d) {
        int i = (int) d;
        return i;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}