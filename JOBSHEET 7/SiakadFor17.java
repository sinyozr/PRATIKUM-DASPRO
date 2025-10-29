
import java.util.Scanner;

public class SiakadFor17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        String[] nama = new String[n];
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = input.next();
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println("\nDaftar Mahasiswa dan Nilainya:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nama: " + nama[i] + ", Nilai: " + nilai[i]);
        }
        input.close();
    }
}
