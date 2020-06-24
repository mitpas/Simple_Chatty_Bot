import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String burg = scnr.nextLine();
        System.out.print(burg.endsWith("burg"));
    }
}