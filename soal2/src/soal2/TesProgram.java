package soal2;

/**
 * @author Danis Keysara (2207275)
 */

public class TesProgram {
    public static void main(String[] args) {
        // Membuat objek untuk setiap kelas dan memanggil metode toString() untuk menampilkan informasi.
        Person person = new Person("Danis", 
                "Derwati", "08313339292", "daniskeysara@upi.edu");
        
        Student student = new Student("Danis", "Derwati", "08313339292", 
                "daniskeysara@upi.edu", Student.MAHASISWA_TAHUN_KEDUA);
        
        Employee employee = new Employee("Yogi", "789 Jalan Depan", "456789012", 
                "david.brown@example.com", "ABC Corporation", 50000, new MyDate(2023, 5, 15));
        
        Faculty faculty = new Faculty("Putra", "246 Jalan Belakang", "321654098", 
                "alice.green@example.com", "XYZ University", 80000, new MyDate(2020, 3, 10), "9-5", "Professor");
        
        Staff staff = new Staff("Sahrul", "135 Jalan Samping", "987321654", 
                "robert.johnson@example.com", "DEF Corporation", 40000, new MyDate(2021, 8, 20), "Associate");

        // Menampilkan informasi setiap objek menggunakan metode toString().
        System.out.println("Informasi Person:");
        System.out.println(person);

        System.out.println("\nInformasi Student:");
        System.out.println(student);

        System.out.println("\nInformasi Employee:");
        System.out.println(employee);

        System.out.println("\nInformasi Faculty:");
        System.out.println(faculty);

        System.out.println("\nInformasi Staff:");
        System.out.println(staff);
    }
}
