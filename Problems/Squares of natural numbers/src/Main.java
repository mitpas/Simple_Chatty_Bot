import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int N = scnr.nextInt();
        int i = 1;

        while (i*i <= N){
            System.out.println(i*i);
            i++;
        }
    }
}