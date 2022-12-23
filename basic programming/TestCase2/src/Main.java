import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Membuat kriteria penilaian mahasiswa dari Dosen

        System.out.print("Masukkan nilai mahasiswa: ");
        Scanner input = new Scanner(System.in);
        int studentScore = input.nextInt( );
        String hasil = " ";

        if (studentScore >= 80 && studentScore <= 100) {
            hasil = "A";
        }
        else if (studentScore >= 65 && studentScore < 80) {
            hasil = "B+";
        }
        else if (studentScore >= 50 && studentScore < 65) {
            hasil = "B";
        }
        else if (studentScore >= 35 && studentScore < 50) {
            hasil = "C";
        }
        else if (studentScore >= 0 && studentScore < 35) {
            hasil = "D";
        }
        else {
            hasil = "invalid";
        }
        System.out.print("Status nilai:  " + hasil);
    }
}