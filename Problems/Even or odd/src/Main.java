import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int i = 1;

        do {
            i = scnr.nextInt();
            if (i == 0) {
                break;
            }
            else if (i % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } while (true);
    }
}