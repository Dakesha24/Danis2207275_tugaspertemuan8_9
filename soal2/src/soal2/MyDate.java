package soal2;

/**
 * @author Danis Keysara (2207275)
 */

public class MyDate {
    // Atribut untuk menyimpan tahun, bulan, dan hari.
    private int tahun;
    private int bulan;
    private int hari;

    // Konstruktor untuk inisialisasi tanggal.
    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    // Metode toString() untuk menghasilkan representasi string dari tanggal.
    @Override
    public String toString() {
        return tahun + "/" + bulan + "/" + hari;
    }
}
