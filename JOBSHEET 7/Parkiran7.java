
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Parkiran7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPendapatan = 0;
        int jenis;
        int durasi;
        int tarifSaatIni;

        Locale localeID = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        while (true) {

            System.out.println("\n------------------------------------");
            System.out.println("Masukkan jenis kendaraan:");
            System.out.println("Mobil");
            System.out.println("Motor");
            System.out.println("Selesai (Tampilkan Total)");
            System.out.print("Pilihan Anda: ");

            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Menghitung total pendapatan...");
                break;
            }

            if (jenis == 1 || jenis == 2) {

                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                // Validasi input durasi (praktik yang baik)
                if (durasi <= 0) {
                    System.out.println("Durasi tidak valid, transaksi dibatalkan.");
                    continue;
                }

                if (durasi > 5) {
                    tarifSaatIni = 12500;
                } else {

                    if (jenis == 1) {
                        tarifSaatIni = durasi * 3000;
                    } else {
                        tarifSaatIni = durasi * 2000;
                    }
                }

                System.out.println("Biaya parkir untuk kendaraan ini: " + formatRupiah.format(tarifSaatIni));
                totalPendapatan += tarifSaatIni;

            } else {
                System.out.println("Input jenis kendaraan tidak valid. Silakan coba lagi.");
            }
        }
        System.out.println("\n====================================");
        System.out.println("Total Pendapatan Hari Ini: " + formatRupiah.format(totalPendapatan));
        System.out.println("====================================");
        sc.close();
    }
}
