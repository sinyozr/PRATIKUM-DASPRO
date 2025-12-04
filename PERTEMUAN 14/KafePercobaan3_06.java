
import java.util.Scanner;

public class KafePercobaan3_06 {

    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungDiskon(int total, String kodePromo) {
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = total / 2;
            System.out.println("Promo DISKON50! Potongan: Rp " + diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = (int) (total * 0.3);
            System.out.println("Promo DISKON30! Potongan: Rp " + diskon);
        } else if (!kodePromo.equalsIgnoreCase("NONE")) {
            System.out.println("Kode promo tidak valid! Tidak ada diskon.");
        }

        return diskon;
    }

    public static void menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15.000");
        System.out.println("2. Cappuccino   - Rp 20.000");
        System.out.println("3. Latte        - Rp 22.000");
        System.out.println("4. Teh Tarik    - Rp 12.000");
        System.out.println("5. Roti Bakar   - Rp 10.000");
        System.out.println("6. Mie Goreng   - Rp 18.000");
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String lanjut;

        menu();

        do {
            System.out.print("\nMasukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int subtotal = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);
            totalKeseluruhan += subtotal;

            System.out.println("Subtotal menu ini: Rp " + subtotal);

            System.out.print("Apakah ingin pesan menu lain? (y/n): ");
            lanjut = sc.next();

        } while (lanjut.equalsIgnoreCase("y"));

        sc.nextLine();

        System.out.print("\nMasukkan kode promo (DISKON50 / DISKON30 / NONE): ");
        String kodePromo = sc.nextLine();

        int diskon = hitungDiskon(totalKeseluruhan, kodePromo);
        int totalAkhir = totalKeseluruhan - diskon;

        System.out.println("\n===== RINCIAN PEMBAYARAN =====");
        System.out.println("Total sebelum diskon : Rp " + totalKeseluruhan);
        System.out.println("Diskon               : Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalAkhir);
    }
}
