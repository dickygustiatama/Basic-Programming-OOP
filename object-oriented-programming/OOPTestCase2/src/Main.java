public class Main {
    public static void main(String[] args) {

        Kubus main1 = new Kubus(10);
        System.out.println("Volume kubus = " + main1.hitungVolumeKubus());

        Balok main2 = new Balok(3, 6, 10);
        System.out.println("Volume balok = " + main2.hitungVolumeBalok());

        Tabung main3 = new Tabung (7, 10);
        System.out.println("Volume Tabung = " + main3.hitungVolumeTabung());

    }
}