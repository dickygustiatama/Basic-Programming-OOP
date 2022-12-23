public class PersegiPanjang {
    double panjang;
    double lebar;


    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuasPersegiPanjang() {
        return this.panjang * this.lebar;
    }

    public double hitungKelilingPersegiPanjang() {
        return (this.panjang + this.lebar) * 2 ;
    }

}

