import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String str1 = scnr.nextLine().trim().replace(" ", "");
        String str2 = scnr.nextLine().trim().replace(" ", "");

        System.out.print(str1.equals(str2));
    }
}