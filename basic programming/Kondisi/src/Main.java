import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//membuat test case dengan kondisi di mana hanya usia 18 tahun ke atas yang boleh nonton bioskop:
        int umur;
        String isEntry = " ";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan umur: ");
        umur = scanner.nextInt();

        if (umur >= 18 && umur < 80) {
            isEntry = "Masuk";
        } else if (umur > 80) {
            isEntry = "Boleh masuk dengan didampingi"
        } else {
            isEntry = "Tidak Masuk";
        }

        System.out.println("Kamu boleh masuk gak: " + isEntry);
    }
}