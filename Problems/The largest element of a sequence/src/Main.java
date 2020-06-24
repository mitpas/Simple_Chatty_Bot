import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int in_s = 0;
        int s = 0;
        do {
            in_s = scnr.nextInt();
            if (in_s > s) {
                s = in_s;
            }
        } while (in_s != 0);

        System.out.println(s);
    }
}