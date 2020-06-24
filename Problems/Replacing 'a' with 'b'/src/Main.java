import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        String str = scnr.next();
        System.out.print(str.replace('a', 'b'));
    }
}