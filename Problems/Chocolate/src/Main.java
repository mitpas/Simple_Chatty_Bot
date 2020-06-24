import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int n = scnr.nextInt();
        int m = scnr.nextInt();
        int k = scnr.nextInt();

        if (((k % n == 0) && (n * m > k)) || ((k % m == 0) && (n * m > k))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}