import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int n = scnr.nextInt();
        int c = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}