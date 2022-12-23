public class Persegi {
    double sisi1;
    double sisi2;


    public Persegi(double sisi1, double sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    public double hitungLuasPersegi() {
        return this.sisi1 * this.sisi2;
    }

    public double hitungKelilingPersegi() {
        return (this.sisi1 + sisi2) * 2;
    }

}
