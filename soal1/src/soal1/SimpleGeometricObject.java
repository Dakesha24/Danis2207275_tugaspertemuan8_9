package soal1;

/**
 * @author Danis Keysara (2207275)
 */

// Kelas dasar SimpleGeometricObject yang akan diwarisi oleh kelas Segitiga.
public class SimpleGeometricObject {
    private String warna = "putih"; // Warna default adalah putih.
    private boolean terisi; // Menunjukkan apakah objek terisi atau tidak.
    private java.util.Date tanggalDibuat; // Tanggal pembuatan objek.

    // Konstruktor tanpa argumen yang menginisialisasi tanggal pembuatan.
    public SimpleGeometricObject() {
        tanggalDibuat = new java.util.Date();
    }

    // Konstruktor dengan argumen warna dan apakah terisi atau tidak.
    public SimpleGeometricObject(String warna, boolean terisi) {
        tanggalDibuat = new java.util.Date();
        this.warna = warna;
        this.terisi = terisi;
    }

    // Metode akses untuk warna.
    public String getWarna() {
        return warna;
    }

    // Metode untuk mengatur warna baru.
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Metode akses untuk mengecek apakah terisi.
    public boolean isTerisi() {
        return terisi;
    }

    // Metode untuk mengatur apakah terisi atau tidak.
    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    // Metode akses untuk mendapatkan tanggal pembuatan.
    public java.util.Date getTanggalDibuat() {
        return tanggalDibuat;
    }

    // Metode toString() untuk representasi string dari objek.
    @Override
    public String toString() {
        return "Dibuat pada " + tanggalDibuat + "\nwarna: " + warna + " dan terisi: " + terisi;
    }
}
