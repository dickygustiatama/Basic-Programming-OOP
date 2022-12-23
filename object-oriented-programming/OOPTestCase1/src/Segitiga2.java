public class Segitiga2 {
    double alasSegitiga2;
    double tinggiSegitiga2;

    public Segitiga2(double alasSegitiga2, double tinggiSegitiga2) {
        this.alasSegitiga2 = alasSegitiga2;
        this.tinggiSegitiga2 = tinggiSegitiga2;
    }

    public double hitungLuasSegitiga2() {
        return this.alasSegitiga2 * this.tinggiSegitiga2 / 2;
    }

/*
    public double hitungSisiMiringSegitiga2() {
        sisiMiringSegitiga2 = Math.sqrt(Math.pow(this.alasSegitiga2,2) + Math.pow(tinggiSegitiga2, 2));
        return sisiMiringSegitiga2;
    }
*/
    public double hitungKelilingSegitiga2() {
        return (alasSegitiga2 + tinggiSegitiga2 + (Math.sqrt(Math.pow(this.alasSegitiga2,2) + Math.pow(tinggiSegitiga2, 2))));
    }


}