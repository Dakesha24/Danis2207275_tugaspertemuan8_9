package soal1;

/**
 * @author Danis Keysara (2207275)
 */

// Kelas Segitiga yang mewarisi SimpleGeometricObject.
public class Segitiga extends SimpleGeometricObject {
    private double sisi1;
    private double sisi2;
    private double sisi3;

    // Konstruktor tanpa argumen yang membuat segitiga dengan sisi default 1.0.
    public Segitiga() {
        this.sisi1 = 1.0;
        this.sisi2 = 1.0;
        this.sisi3 = 1.0;
    }

    // Konstruktor dengan argumen untuk menginisialisasi sisi segitiga.
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Konstruktor dengan argumen untuk menginisialisasi sisi segitiga dan properti warna serta terisi.
    public Segitiga(double sisi1, double sisi2, double sisi3, String warna, boolean terisi) {
        super(warna, terisi); // Memanggil konstruktor superclass
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Metode akses untuk mendapatkan nilai sisi1.
    public double getSisi1() {
        return sisi1;
    }

    // Metode akses untuk mendapatkan nilai sisi2.
    public double getSisi2() {
        return sisi2;
    }

    // Metode akses untuk mendapatkan nilai sisi3.
    public double getSisi3() {
        return sisi3;
    }

    // Metode untuk menghitung luas segitiga menggunakan rumus Heron.
    public double getLuas() {
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    // Metode untuk menghitung keliling segitiga.
    public double getKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    // Metode toString() untuk representasi string dari objek segitiga.
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }
}
