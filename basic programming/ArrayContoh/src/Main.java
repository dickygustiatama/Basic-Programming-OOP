import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] kumpulanAngka = new int[5];

        kumpulanAngka[0] = 15;
        kumpulanAngka[1] = 9;
        kumpulanAngka[2] = 9;
        kumpulanAngka[3] = 8;
        kumpulanAngka[4] = 1;

        for(int i = 0; i<kumpulanAngka.length; i++){
            System.out.println(kumpulanAngka[i]);
        }

        for (int i: kumpulanAngka){
            System.out.println("For simple " +i);
        }

        String[] daftarNama = new String[5];
        Scanner input = new Scanner(System.in);
        for(int j = 0; j<daftarNama.length; j++){
            daftarNama[j] = input.nextLine();
        }

        for (String j: daftarNama){
            System.out.println("Nama "+ j);
        }
    }
}
