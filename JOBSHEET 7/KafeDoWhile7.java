
import java.util.Scanner;

public class KafeDoWhile7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String NamaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.println("Masukan nama Pelanggan (Ketik 'batal' untuk keluar):");
            NamaPelanggan = sc.nextLine();
            if (NamaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.println("jumlah Teh: ");
            teh = sc.nextInt();
            System.out.println("jumlah Roti: ");
            roti = sc.nextInt();
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga untuk " + NamaPelanggan + " adalah: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        sc.close();
    }
}
