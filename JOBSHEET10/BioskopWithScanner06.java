
import java.util.Scanner;

public class BioskopWithScanner06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                String nama;
                int baris, kolom;

                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                penonton[baris - 1][kolom - 1] = nama;

            } else if (menu == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print((penonton[i][j] == null ? "***" : penonton[i][j]) + "\t");
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Keluar dari program...");
                break;

            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}
