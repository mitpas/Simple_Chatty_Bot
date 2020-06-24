import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int a = scnr.nextInt();
        int b = scnr.nextInt();
        double c = 0;
        double s = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                s += i;
                c++;
            }
        }
        double res = s / c;
        System.out.println(res);
    }
}