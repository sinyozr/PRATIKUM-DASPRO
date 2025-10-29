
import java.util.Scanner;

public class tariflistrik {

    public static void main(String[] args) {
        //delkarasi scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int kwh, daya;
        int biayaBulanan = 50000;
        int tarif; // akan ditentukan berdasarkan daya
        double ppn = 0.1, total;

        System.out.println("====PROGRAM TARIF LISTRIK (IF-ELSE)====");

        // input daya
        System.out.print("Masukkan daya listrik (900 / 1300 / 2200 / 3500 / 5500 VA): ");
        daya = sc.nextInt();

        // menentukan tarif berdasarkan daya if else
        if (daya == 900) {
            tarif = 1300;
        } else if (daya == 1300 || daya == 2200) {
            tarif = 1500;
        } else if (daya == 3500 || daya == 5500) {
            tarif = 1700;
        } else {
            System.out.println("Daya tidak valid!");
            return; // keluar dari program jika input salah
        }

        // input kWh
        System.out.print("Masukkan jumlah pemakaian (kWh): ");
        kwh = sc.nextInt();

        // proses
        ppn = ppn * (biayaBulanan + (kwh * tarif));
        total = (kwh * tarif) + biayaBulanan + ppn;

        // output total tagihan listrik
        System.out.println("--------------------------------------");
        System.out.println("Daya: " + daya + " VA");
        System.out.println("Tarif Per kWh: Rp " + tarif);
        System.out.println("Total Tarif Per KWH: Rp" + ((int) tarif * kwh));
        System.out.println("Biaya Bulanan: Rp " + biayaBulanan);
        System.out.println("Total PPN: Rp" + (int) ppn);
        System.out.println("Total Tagihan Listrik (Biaya Bulanan + Total Tarif/Kwh + PPN): Rp " + (int) total);
    }
}
