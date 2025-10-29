
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Bioskop7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_PER_TIKET = 50000;
        int totalTiketHarian = 0;
        double totalPenjualanHarian = 0.0;

        Locale localeID = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("--- PROGRAM KASIR BIOSKOP ---");
        System.out.println("Harga per tiket: " + formatRupiah.format(HARGA_PER_TIKET));
        System.out.println("=========================================");

        while (true) {
            System.out.print("\nMasukkan jumlah tiket (atau 0 untuk selesai): ");
            int jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                System.out.println("Menutup program dan menghitung total...");
                break;
            }

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif.");
                continue;
            }

            double hargaAwal = (double) jmlTiket * HARGA_PER_TIKET;
            double diskon = 0.0;
            double hargaSetelahDiskon = 0.0;

            if (jmlTiket > 10) {
                diskon = 0.15;
                System.out.println("Mendapat diskon 15%!");
            } else if (jmlTiket > 4) {
                diskon = 0.10;
                System.out.println("Mendapat diskon 10%!");
            }

            hargaSetelahDiskon = hargaAwal - (hargaAwal * diskon);
            System.out.println("Total harga transaksi ini: " + formatRupiah.format(hargaSetelahDiskon));

            totalTiketHarian += jmlTiket;
            totalPenjualanHarian += hargaSetelahDiskon;
        }

        System.out.println("\n=========================================");
        System.out.println("--- LAPORAN PENJUALAN HARIAN ---");
        System.out.println("Total Tiket Terjual: " + totalTiketHarian + " tiket");
        System.out.println("Total Penjualan: " + formatRupiah.format(totalPenjualanHarian));
        System.out.println("=========================================");
        sc.close();
    }
}
