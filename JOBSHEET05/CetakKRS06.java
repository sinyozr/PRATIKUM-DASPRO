
import java.util.Scanner;

public class CetakKRS06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("---Apakah UKT suddah lunas? (true/false):");
        boolean UKTlunas = sc.nextBoolean();
        if (UKTlunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan ke DPA");
        } else {
            System.out.println("Registrasi ditolak silakan lunasi UKT terlebih dahulu");
        }
    }
}
