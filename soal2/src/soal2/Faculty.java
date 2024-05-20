package soal2;

/**
 * @author Danis Keysara (2207275)
 */

public class Faculty extends Employee {
    // Atribut untuk menyimpan data fakultas.
    private String jamKerja;
    private String pangkat;

    // Konstruktor untuk inisialisasi data personal, kantor, gaji, tanggal dipekerjakan, jam kerja, dan pangkat.
    public Faculty(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, String jamKerja, String pangkat) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    // Metode toString() untuk menghasilkan representasi string dari informasi personal, kantor, gaji, tanggal dipekerjakan, jam kerja, dan pangkat.
    @Override
    public String toString() {
        return super.toString() + "\nJam Kerja: " + jamKerja + "\nPangkat: " + pangkat;
    }
}
