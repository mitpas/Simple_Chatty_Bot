import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int M = scnr.nextInt();
        int P = scnr.nextInt();
        int K = scnr.nextInt();

        int i = 0;
        double s = M;

        while (s < K) {
            s += (s * P / 100);
            i++;
        }

        System.out.println(i);
    }
}