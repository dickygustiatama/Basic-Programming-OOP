public class Kubus {
    double panjangSisiKubus;

    public Kubus(double panjangSisiKubus) {
        this.panjangSisiKubus = panjangSisiKubus;
    }
/*
    public double hitungLuasSisiKubus() {
        return Math.pow(this.panjangSisiKubus, 2);
    }
*/
    public double hitungVolumeKubus() {
        return Math.pow(this.panjangSisiKubus, 3) ;
    }

}