import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        if ((ch + 32 == 'a') || (ch == 'a') ||
                (ch + 32 == 'a') || (ch == 'a') ||
                (ch + 32 == 'e') || (ch == 'e') ||
                (ch + 32 == 'i') || (ch == 'i') ||
                (ch + 32 == 'o') || (ch == 'o') ||
                (ch + 32 == 'u') || (ch == 'u')) {
            return true;
        } else {
            return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        char letter = scanner.nextLine().charAt(0);
        //System.out.println((int) letter);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}