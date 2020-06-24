import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int a = scnr.nextInt();
        int b = scnr.nextInt();
        long prdct = 1;

        for (int i = a; i < b; i++) {
            prdct *= i;
        }
        System.out.println(prdct);
    }
}