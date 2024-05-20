package soal2;

/**
 * @author Danis Keysara (2207275)
 */

public class Staff extends Employee {
    // Atribut untuk menyimpan data staf.
    private String gelar;

    // Konstruktor untuk inisialisasi data personal, kantor, gaji, tanggal dipekerjakan, dan gelar.
    public Staff(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }

    // Metode toString() untuk menghasilkan representasi string dari informasi personal, kantor, gaji, tanggal dipekerjakan, dan gelar.
    @Override
    public String toString() {
        return super.toString() + "\nGelar: " + gelar;
    }
}

