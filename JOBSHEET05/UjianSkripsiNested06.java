
import java.util.Scanner;

public class UjianSkripsiNested06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.println("Apakah Mahasiswa bebas kompen? (ya/tidak):)");
        String bebaskompen = sc.nextLine().trim();
        System.out.println("Masukan Jumlah log bimbingan pembimbing 1: ");
        int BimbinganP1 = sc.nextInt();
        System.out.println("Masukan Jumlah log bimbingan Pembembing 2: ");
        int BimbinganP2 = sc.nextInt();
        if (bebaskompen.equalsIgnoreCase("ya")) {
            if (BimbinganP1 >= 8 && BimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (BimbinganP1 < 8 && BimbinganP2 < 4) {
                pesan = "Gagal! log bimbingan P1 Kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (BimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggung kompen";
        }
        System.out.println(pesan);
    }
}
