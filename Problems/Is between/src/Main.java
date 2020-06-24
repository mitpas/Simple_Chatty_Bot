import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println(((i >= j) && (i <= h)) || ((i >= h) && (i <= j)));
    }
}