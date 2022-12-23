public class Main {
    public static void main(String[] args) {

        Mobil mobil1 = new Mobil();
        mobil1.caraBerhenti();
        mobil1.setNamaBrand("Jaguar");

        System.out.println(mobil1.namaBrand + " " + mobil1.tipeMobil);
    }
}