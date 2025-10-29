
import java.util.Scanner;

public class SiakadFor17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        int jumlahMahasiswa = 0;
        int jumlahtidakLulus = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai < 60) {
                jumlahtidakLulus++;
            } else {
                jumlahMahasiswa++;
            }

        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah siswa lulus: " + jumlahMahasiswa);
        System.out.println("Jumlah siswa tidak lulus: " + jumlahtidakLulus);

        sc.close();
    }
}
