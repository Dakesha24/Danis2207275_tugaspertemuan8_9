package soal2;

/**
 * @author Danis Keysara (2207275)
 */

public class Person {
    // Atribut untuk menyimpan data personal.
    protected String nama;
    protected String alamat;
    protected String nomorTelepon;
    protected String email;

    // Konstruktor untuk inisialisasi data personal.
    public Person(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    // Metode toString() untuk menghasilkan representasi string dari informasi personal.
    @Override
    public String toString() {
        return "Nama: " + nama + "\nAlamat: " + alamat + "\nNomor Telepon: " + nomorTelepon + "\nEmail: " + email;
    }
}
