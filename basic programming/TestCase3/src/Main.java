import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Mencetak faktor suatu bilangan;
        System.out.print("Berapa faktor dari bilangan: ");

        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();

        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}