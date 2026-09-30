import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Enter year: ");
        year = scanner.nextInt();

        System.out.println("We are in " + year);

        scanner.close();
    }
}