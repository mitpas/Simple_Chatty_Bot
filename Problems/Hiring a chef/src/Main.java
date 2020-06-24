import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String age = scanner.nextLine();
        String stageOfEdu = scanner.nextLine();
        String yearsOfExp = scanner.nextLine();
        String cuisinePref = scanner.nextLine();

        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef that cooks " + cuisinePref + " dishes.");
    }
}