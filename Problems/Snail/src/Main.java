import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int d = 0;

        for (int i = 1; i < 100; i++){
            s += a;
            if (s >= h) {
                d = i;
                break;
            };
            s -= b;
        }

        System.out.println(d);
    }
}