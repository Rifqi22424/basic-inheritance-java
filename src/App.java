/**
 * App.java: Main Class
 */
public class App {

    public static void main(String[] args) {
        //Lingkaran extends bangun datar
        Lingkaran lingkaran1 = new Lingkaran(7, "lingkaran 1");
        lingkaran1.getInfo();

        System.out.println("\t");
        //Persegi extends bangun datar
        Persegi persegi1 = new Persegi("Persegi 1", 5);
        persegi1.getInfo();
        
        System.out.println("\t");
        //Segitiga Sama Kaki extends Segitiga, belum diketahui tingginya
        SegitigaSamaKaki segitigaSamaKaki1 = new SegitigaSamaKaki("Segitiga Sama Kaki 1", 5, 3);
        segitigaSamaKaki1.getInfo();

        System.out.println("\t");
        //Segitiga Sama Sisi extends Segitiga, belum diketahui tingginya
        SegitigaSamaSisi segitigaSamaSisi1 = new SegitigaSamaSisi("Segitiga Sama Sisi 1", 12);
        segitigaSamaSisi1.getInfo();

        System.out.println("\t");
        //Segitiga Siku Siku extends Segitiga, belum diketahui tingginya
        SegitigaSikuSiku segitigaSikuSiku1 = new SegitigaSikuSiku("Segitiga Siku Siku 1", 5, 3);
        segitigaSikuSiku1.getInfo();

        System.out.println("\t");
        //Segitiga Sembarang extends Segitiga, using rumus heron yang hanya memiliki panjang sisi sisinya
        SegitigaSembarangHeron segitigaSembarangHeron1 = new SegitigaSembarangHeron("Segitiga Sembarang Using Heron 1", 10, 14, 12);
        segitigaSembarangHeron1.getInfo();

        System.out.println("\t");
        //Segitiga Sembarang extends Segitiga, using rumus normal yang memiliki radius sudut
        SegitigaSembarang segitigaSembarang1 = new SegitigaSembarang("Segitiga Sembarang Normal 1", 16, 12, 10, 30);
        segitigaSembarang1.getInfo();
    }
}