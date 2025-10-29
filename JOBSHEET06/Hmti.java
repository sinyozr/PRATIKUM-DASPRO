
import java.util.Scanner;

public class Hmti {

    public static void main(String[] args) {

        // untuk mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        int jumlahTim,
                biayaPublikasi = 300000,
                biayaDekorasi = 500000,
                biayaKonsumsiPanitiaJuri = 500000,
                biayaHadiah = 4000000,
                biayaOperasionalLain = 500000,
                biayaKonsumsiPesertaPerOrang = 25000,
                honorariumJuriPerJudul = 75000,
                biayaPendaftaranPerTim = 50000,
                jumlahPesertaPerTim = 3,
                totalPeserta, totalKonsumsiPeserta, totalHonorariumJuri,
                totalPendaftaran, totalAnggaran;

        double danaPolinema, danaSponsorship, presentaseBantuan;

        System.out.println("====PROGRAM DANA SPONSORSHIP INTERCOMP====");

        // input jumlah tim
        System.out.print("Masukkan jumlah tim yang mengikuti Intercomp: ");
        jumlahTim = sc.nextInt();

        // perhitungan komponen variabel
        totalPeserta = jumlahTim * jumlahPesertaPerTim;
        totalKonsumsiPeserta = totalPeserta * biayaKonsumsiPesertaPerOrang;
        totalHonorariumJuri = jumlahTim * honorariumJuriPerJudul;
        totalPendaftaran = jumlahTim * biayaPendaftaranPerTim;

        // hitung total anggaran keseluruhan
        totalAnggaran = biayaPublikasi + biayaDekorasi + biayaKonsumsiPanitiaJuri
                + biayaHadiah + biayaOperasionalLain
                + totalKonsumsiPeserta + totalHonorariumJuri;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total anggaran kegiatan: Rp " + totalAnggaran);
        System.out.println("Total dana dari pendaftaran: Rp " + totalPendaftaran);
        System.out.println("--------------------------------------------");

        // input persentase bantuan Polinema
        System.out.print("Masukkan persentase bantuan Polinema (60 / 80 / 100): ");
        presentaseBantuan = sc.nextDouble();

        // ubah ke bentuk desimal (misal 60 jadi 0.60)
        presentaseBantuan = presentaseBantuan / 100;

        // proses hitung
        danaPolinema = presentaseBantuan * totalAnggaran;

        // variasi presentase bantuan dari polinema
        if (presentaseBantuan == 1.00) {
            System.out.println("Polinema menanggung 100% dana (Tidak memerlukan sponsorship).");
        } else if (presentaseBantuan == 0.80) {
            danaSponsorship = totalAnggaran - danaPolinema - totalPendaftaran;
            System.out.println("Polinema menanggung 80% dana:");
            System.out.println("Dana sponsorship yang dibutuhkan: Rp " + (int) danaSponsorship);
        } else if (presentaseBantuan == 0.60) {
            danaSponsorship = totalAnggaran - danaPolinema - totalPendaftaran;
            System.out.println("Polinema menanggung 60% dana:");
            System.out.println("Dana sponsorship yang dibutuhkan: Rp " + (int) danaSponsorship);
        } else {
            System.out.println("Persentase tidak dikenali! Masukkan hanya 45, 60, 70, atau 100.");
        }

        System.out.println("--------------------------------------------");
    }
}
