package soal1;

/**
 * @author Danis Keysara (2207275)
 */

import java.util.Scanner;

public class TestSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan sisi-sisi segitiga.
        System.out.print("Masukkan sisi1 dari segitiga: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi2 dari segitiga: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi3 dari segitiga: ");
        double sisi3 = input.nextDouble();
        input.nextLine(); // Konsumsi karakter newline

        // Meminta pengguna memasukkan warna segitiga.
        System.out.print("Masukkan warna dari segitiga: ");
        String warna = input.nextLine();

        // Meminta pengguna memasukkan apakah segitiga diisi atau tidak.
        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean terisi = input.nextBoolean();

        // Membuat objek Segitiga dengan sisi-sisi yang dimasukkan oleh pengguna, serta properti warna dan terisi.
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3, warna, terisi);

        // Menampilkan hasil.
        System.out.println("\n" + segitiga.toString());
        System.out.println("Luasnya adalah " + segitiga.getLuas());
        System.out.println("Kelilingnya adalah " + segitiga.getKeliling());
        System.out.println("Warnanya adalah " + segitiga.getWarna());
        System.out.println("Apakah segitiga terisi? " + segitiga.isTerisi());
    }
}
