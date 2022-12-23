public class Main {
    public static void main(String[] args) {

        Persegi main1 = new Persegi(4, 4);
        System.out.println("Luas persegi = " + main1.hitungLuasPersegi());
        System.out.println("Keliling persegi = " + main1.hitungKelilingPersegi());

        PersegiPanjang main2 = new PersegiPanjang(7, 8);
        System.out.println("Luas persegi panjang = " + main2.hitungLuasPersegiPanjang());
        System.out.println("Keliling persegi panjang = " + main2.hitungKelilingPersegiPanjang());

        Segitiga2 main3 = new Segitiga2 (3, 4);
        System.out.println("Luas segitiga = " + main3.hitungLuasSegitiga2());
        System.out.println("Keliling segitiga = " + main3.hitungKelilingSegitiga2());
    }
}