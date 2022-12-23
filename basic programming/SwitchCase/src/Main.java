import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//membuat program untuk men-define hasil nilai mahasiswa

        String inputan;
        String hasil = "";
        Scanner input = new Scanner(System.in);
        inputan = input.nextLine();

        switch (inputan) {
            case "A":
                hasil = "Memuaskan";
                break;
            case "B":
                hasil = "Baik";
                break;
            case "C":
                hasil = "Cukup";
                break;
            default:
                hasil = "Undefined";
                break;
        }

        System.out.println(hasil);
    }
}