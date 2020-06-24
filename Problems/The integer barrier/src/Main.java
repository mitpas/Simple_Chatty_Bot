import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        int s = 0;
        while (true) {
            i = scnr.nextInt();
            if (i == 0) {
                break;
            } else {
                s += i;
                if (s >= 1000) {
                    s -= 1000;
                    break;
                }
            }
        }
        System.out.println(s);
    }
}