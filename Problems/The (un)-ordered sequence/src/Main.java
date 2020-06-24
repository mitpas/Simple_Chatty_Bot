import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        int prev_i = 0;
        int prev_i_d = 1000000;
        boolean ifOrderedUP = true;
        boolean ifOrderedDOWN = true;
        while (true){
            i = scnr.nextInt();
            if (i == 0) {
                break;
            }
            if (ifOrderedUP) {ifOrderedUP = i >= prev_i;}
            if (ifOrderedDOWN) {ifOrderedDOWN = i <= prev_i_d;}
            prev_i = i;
            prev_i_d = i;
        }
        System.out.println(ifOrderedDOWN || ifOrderedUP);
    }
}