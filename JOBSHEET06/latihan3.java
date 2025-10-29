
import java.util.Scanner;

public class latihan3 {

    public static void main(String[] args) {

        // mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        int jarakTempuh, lamaSewa;
        int hargaSewaSupir = 200000;
        int hargaSewaMobil = 300000;
        int totalBiaya;

        // variabel bahan bakar
        int biayaBahanBakarPerKm = 1000;

        System.out.println("===== PROGRAM SEWA MOBIL =====");

        // input lama sewa dan jarak tempuh
        System.out.print("Masukkan lama sewa (dalam hari): ");
        lamaSewa = sc.nextInt();
        if (lamaSewa > 30) {
            System.out.println("Lama sewa harus lebih dari 30 hari.");

        } else {
            System.out.print("Masukkan jarak tempuh (dalam km): ");
            jarakTempuh = sc.nextInt();
            sc.nextLine();

            // proses perhitungan biaya
            int biayaBahanBakar = biayaBahanBakarPerKm * jarakTempuh;
            int biayaSupir = hargaSewaSupir * lamaSewa;
            int biayaSewaMobil = hargaSewaMobil * lamaSewa;
            totalBiaya = biayaSewaMobil + biayaSupir + biayaBahanBakar;

            // output atau hasil
            System.out.println("\n===== RINCIAN BIAYA SEWA =====");
            System.out.println("Lama sewa: " + lamaSewa + " hari");
            System.out.println("Jarak tempuh: " + jarakTempuh + " km");
            System.out.println("Biaya bahan bakar: Rp" + biayaBahanBakar);
            System.out.println("Biaya sewa mobil: Rp" + biayaSewaMobil);
            System.out.println("Biaya sewa supir: Rp" + biayaSupir);
            System.out.println("--------------------------------");
            System.out.println("Total biaya keseluruhan: Rp" + totalBiaya);
        }
    }
}
