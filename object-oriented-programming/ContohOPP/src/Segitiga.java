public class Segitiga {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int hitungLuas() {
        return this.alas * this.tinggi / 2 ;
    }

}
