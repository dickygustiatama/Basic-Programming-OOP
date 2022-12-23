public class dimensiBarang {
    double panjang;
    double lebar;
    double tinggi;

    double berat;


    public dimensiBarang(double panjang, double lebar, double tinggi, double berat) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public double totalDimensiBarang() {
        return this.panjang * this.lebar * this.tinggi;
    }

    public double beratBarang() {

    }

}