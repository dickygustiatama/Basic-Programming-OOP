public class Main {
    public static void main(String[] args) {

        Penjumlahan main1 = new Penjumlahan(3, 4);
        System.out.println("Penjumlahan = " + main1.hasilPenjumlahan());

        Pengurangan main2 = new Pengurangan(15, 4);
        System.out.println("Pengurangan = " + main2.hasilPengurangan());

        Perkalian main3 = new Perkalian(10, 10);
        System.out.println("Perkalian = " + main3.hasilPerkalian());

        Pembagian main4 = new Pembagian(12, 3);
        System.out.println("Pembagian = " + main4.hasilPembagian());

    }
}