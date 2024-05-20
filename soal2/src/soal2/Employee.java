package soal2;

/**
 * @author Danis Keysara (2207275)
 */

public class Employee extends Person {
    // Atribut untuk menyimpan data karyawan.
    private String kantor;
    private double gaji;
    private MyDate tanggalDipekerjakan;

    // Konstruktor untuk inisialisasi data personal, kantor, gaji, dan tanggal dipekerjakan.
    public Employee(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    // Metode toString() untuk menghasilkan representasi string dari informasi personal, kantor, gaji, dan tanggal dipekerjakan.
    @Override
    public String toString() {
        return super.toString() + "\nKantor: " + kantor + "\nGaji: " + gaji + "\nTanggal Dipekerjakan: " + tanggalDipekerjakan;
    }
}
