
import java.util.Scanner;

public class Javabookscenter1 {

    public static void main(String[] args) {

        //delkarasi scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("===Program Percetakan ===");

        //Input
        System.out.println("Masukan Jumlah Halaman buku yang dicetak");
        int jumlahhalaman = sc.nextInt();
        System.out.println("Masukan Jenis Cover (hard / soft):");
        String jenisCover = sc.next().toLowerCase();

        System.out.println("Masukan jenis kota pelanggam:");
        String kotaPelanggan = sc.next().toLowerCase();

        //deklarasis
        int biayaperhalaman = 200;
        int jumlahlembar = (int) Math.ceil((double) jumlahhalaman / 2);
        int biayacetak = jumlahhalaman * biayaperhalaman;
        int beratkertas = jumlahlembar * 3;
        int beratCover, biayaCover;

        //if else
        if (jenisCover.equalsIgnoreCase("hard")) {
            beratCover = 250;
            biayaCover = 20000;
        } else if (jenisCover.equalsIgnoreCase("soft")) {
            beratCover = 100;
            biayaCover = 10000;
        } else {
            System.out.println("Jenis cover tidak valid!");
            return;
        }

        //Perhitungan
        int beratKemasan = 300;
        int beratKertas = 0;
        int totalBerat = beratKertas + beratCover + beratKemasan;
        int totalBeratKg = (int) Math.ceil((double) totalBerat / 1000);
        int biayaPengiriman = totalBeratKg * 15000;
        int biayaCetak = 0;

        if (kotaPelanggan.equals("malang") || kotaPelanggan.equals("Batu")) {
            biayaPengiriman -= 20000;
        } else if (kotaPelanggan.equals("Batu")) {
            biayaPengiriman -= 25000;
        }

        biayaPengiriman = totalBeratKg * 15000;

        // Total biaya keseluruhan
        int totalBiaya = biayaCetak + biayaCover + biayaPengiriman;

        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("kota pelanggan: " + kotaPelanggan.substring(0, 1).toUpperCase() + kotaPelanggan.substring(1));
        System.out.println("Jenis cover: " + jenisCover);
        System.out.println("Total berat: " + totalBerat + " gram (" + totalBeratKg + " kg)");
        System.out.println("Biaya pengiriman: Rp" + biayaPengiriman);
        System.out.println("------------------------------");
        System.out.println("Total biaya percetakan: Rp" + totalBiaya);
    }

    public void Javabookscenter() {
    }
}
