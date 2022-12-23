import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // menghitung luas segitiga;
/*      int alas = 20;
        int tinggi = 25;
        int luasSegitiga = (alas * tinggi) / 2;
        System.out.print(luasSegitiga);
*/
        float hasil;

        System.out.println("Berapa luas segitiga?");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai alas: ");
                int alas = input.nextInt( );
        System.out.print("Masukkan nilai tinggi: ");
                int tinggi = input.nextInt( );
        hasil = (alas * tinggi) / 2;
        System.out.println("Luas segitiga = " + hasil);
    }

}