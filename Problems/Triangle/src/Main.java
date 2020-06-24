import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c = scnr.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}