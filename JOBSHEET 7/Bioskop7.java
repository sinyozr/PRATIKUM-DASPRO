
import java.util.Scanner;

public class Bioskop7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_PER_TIKET = 50000;
        int totalTiketHarian = 0;
        double totalPenjualanHarian = 0.0;
        while (true) {
            System.out.print("\nMasukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            int jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }

            double hargaAwal = (double) jmlTiket * HARGA_PER_TIKET;
            double diskonDecimal = 0.0;
            double diskonPersen = 0.0;
            if (jmlTiket > 10) {
                diskonDecimal = 0.15;
                diskonPersen = 15.0;
            } else if (jmlTiket > 4) {
                diskonDecimal = 0.10;
                diskonPersen = 10.0;
            }

            double hargaSetelahDiskon = hargaAwal - (hargaAwal * diskonDecimal);

            System.out.println("Jumlah tiket \t: " + jmlTiket);
            System.out.println("Harga per tiket : Rp " + HARGA_PER_TIKET);
            System.out.println("Diskon \t\t: " + diskonPersen + "%");
            System.out.println("Total bayar \t: Rp " + hargaSetelahDiskon);

            totalTiketHarian += jmlTiket;
            totalPenjualanHarian += hargaSetelahDiskon;
        }

        System.out.println("\n====== Rekapitulasi Penjualan Hari Ini ======");
        System.out.println("Total tiket terjual : " + totalTiketHarian);
        System.out.println("Total penjualan \t: Rp " + totalPenjualanHarian);
        System.out.println("\nTerima kasih telah menggunakan program ini!");
        System.out.println("------------------------------------------");

        sc.close();
    }
}
