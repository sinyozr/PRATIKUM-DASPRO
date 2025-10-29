
import java.util.Scanner;

public class latihan1 {

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
        int biayaBahanBakarPerKm;
        String jenisBahanBakar;

        System.out.println("===== PROGRAM SEWA MOBIL =====");

        // input lama sewa dan jarak tempuh
        System.out.print("Masukkan lama sewa (dalam hari): ");
        lamaSewa = sc.nextInt();
        System.out.print("Masukkan jarak tempuh (dalam km): ");
        jarakTempuh = sc.nextInt();
        sc.nextLine();

        // input jenis bahan bakar
        System.out.print("Pilih jenis bahan bakar (Pertalite/Pertamax): ");
        jenisBahanBakar = sc.nextLine();

        // menentukan biaya bahan bakar per km berdasarkan jenis bahan bakar
        if (jenisBahanBakar.equalsIgnoreCase("Pertalite")) {
            biayaBahanBakarPerKm = 1000;
        } else if (jenisBahanBakar.equalsIgnoreCase("Pertamax")) {
            biayaBahanBakarPerKm = 1300;
        } else {
            System.out.println("Jenis bahan bakar tidak dikenal, default ke Pertalite.");
            biayaBahanBakarPerKm = 1000;
            jenisBahanBakar = "Pertalite";
        }

        // proses perhitungan biaya
        int biayaBahanBakar = biayaBahanBakarPerKm * jarakTempuh;
        int biayaSupir = hargaSewaSupir * lamaSewa;
        int biayaSewaMobil = hargaSewaMobil * lamaSewa;
        totalBiaya = biayaSewaMobil + biayaSupir + biayaBahanBakar;

        // output atau hasil
        System.out.println("\n===== RINCIAN BIAYA SEWA =====");
        System.out.println("Lama sewa: " + lamaSewa + " hari");
        System.out.println("Jarak tempuh: " + jarakTempuh + " km");
        System.out.println("Jenis bahan bakar: " + jenisBahanBakar);
        System.out.println("Biaya bahan bakar: Rp" + biayaBahanBakar);
        System.out.println("Biaya sewa mobil: Rp" + biayaSewaMobil);
        System.out.println("Biaya sewa supir: Rp" + biayaSupir);
        System.out.println("--------------------------------");
        System.out.println("Total biaya keseluruhan: Rp" + totalBiaya);
    }
}
