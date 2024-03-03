public class SegitigaSembarangHeron extends Segitiga{
    double alas;
    double sisiB;
    double sisiC;

    public SegitigaSembarangHeron(String name, double alas, double sisiB, double sisiC) {
        super.setNama(name);

        this.alas = alas;
        this.sisiB = sisiB;
        this.sisiC = sisiC;

        super.setSegitiga(alas, 0, alas, sisiB, sisiC);

        this.hitungLuas();
        hitungKeliling();
    }

    @Override
    public void hitungLuas() {
        double s = (this.alas + this.sisiB + this.sisiC) / 2;  
        // System.out.println("cek s " + s);
        super.luas = Math.round(Math.sqrt(s * (s - this.alas) * (s - this.sisiB) * (s - this.sisiC)));
        // System.out.println(this.sisiA);
        // System.out.println(this.sisiB);
        // System.out.println(this.sisiC);
        // System.out.println(super.luas);
    }
}
