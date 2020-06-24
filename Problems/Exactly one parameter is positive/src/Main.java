import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int h = scanner.nextInt();

        System.out.println((i > 0 && j <= 0 && h <=0) || (j > 0 && i <= 0 && h <= 0) || (h > 0 && i <= 0 && j <= 0));
    }
}