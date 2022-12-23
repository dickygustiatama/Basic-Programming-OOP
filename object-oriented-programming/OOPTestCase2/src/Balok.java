public class Balok {
    double panjangBalok;
    double lebarBalok;
    double tinggiBalok;


    public Balok(double panjangBalok, double lebarBalok, double tinggiBalok) {
        this.panjangBalok = panjangBalok;
        this.lebarBalok = lebarBalok;
        this.tinggiBalok = tinggiBalok;
    }


    public double hitungVolumeBalok() {
        return (this.panjangBalok * this.lebarBalok * this.tinggiBalok);
    }

}