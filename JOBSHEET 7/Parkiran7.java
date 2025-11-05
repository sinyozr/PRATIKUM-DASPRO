import java.util.Scanner;

public class Parkiran7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPendapatan = 0;
        int durasi;
        int tarifSaatIni;
        System.out.println("=== PROGRAM PARKIR KENDARAAN ===");

        while (true) {

            System.out.print("\nMasukkan jenis kendaraan (mobil/motor, ketik 'selesai' untuk keluar): ");
            String jenisKendaraan = sc.next();
            if (jenisKendaraan.equalsIgnoreCase("selesai")) {
                System.out.println("Input selesai. Menghitung total pembayaran...");
                break;
            }
            if (jenisKendaraan.equalsIgnoreCase("mobil")) {

                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                tarifSaatIni = durasi * 3000;

                System.out.println("Biaya parkir kendaraan ini: Rp " + tarifSaatIni);
                totalPendapatan += tarifSaatIni;

            } else if (jenisKendaraan.equalsIgnoreCase("motor")) {

                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                tarifSaatIni = durasi * 2000;
                System.out.println("Biaya parkir kendaraan ini: Rp " + tarifSaatIni);
                totalPendapatan += tarifSaatIni;

            } else {
                System.out.println("Input tidak valid. Coba lagi.");
            }
        }
        System.out.println("\n=== RINGKASAN PARKIR HARI INI ===");
        System.out.println("Total pendapatan parkir: Rp " + totalPendapatan);

        sc.close();
    }
}
