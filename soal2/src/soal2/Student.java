package soal2;

/**
 * @author Danis Keysara (2207275)
 */

public class Student extends Person {
    // Konstanta untuk status mahasiswa.
    public static final String MAHASISWA_BARU = "Mahasiswa Baru";
    public static final String MAHASISWA_TAHUN_KEDUA = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    // Atribut untuk menyimpan status mahasiswa.
    private String status;

    // Konstruktor untuk inisialisasi data personal dan status mahasiswa.
    public Student(String nama, String alamat, String nomorTelepon, String email, String status) {
        super(nama, alamat, nomorTelepon, email);
        this.status = status;
    }

    // Metode toString() untuk menghasilkan representasi string dari informasi personal dan status mahasiswa.
    @Override
    public String toString() {
        return super.toString() + "\nStatus: " + status;
    }
}
