public class Tabung {
    double jariJariTabung;
    double tinggiTabung;


    public Tabung(double jariJariTabung, double tinggiTabung) {
        this.jariJariTabung = jariJariTabung;
        this.tinggiTabung = tinggiTabung;
    }

    public double hitungVolumeTabung() {
        return this.tinggiTabung * this.jariJariTabung * this.jariJariTabung * 22/7;
    }
}
