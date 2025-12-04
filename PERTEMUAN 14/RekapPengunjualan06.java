
import java.util.Scanner;

public class RekapPengunjualan06 {

    static Scanner sc = new Scanner(System.in);

    static String[] menu = {"Kopi", "Teh", "Roti", "Nasi Goreng", "Mie Ayam"};

    public static void inputPenjualan(int[][] data) {
        System.out.println("=== Input Data Penjualan 7 Hari ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int hari = 0; hari < 7; hari++) {
                System.out.print("  Hari " + (hari + 1) + ": ");
                data[i][hari] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilTabel(int[][] data) {
        System.out.println("\n===== Tabel Penjualan Cafe =====");
        System.out.print("Menu/Hari\t");
        for (int h = 1; h <= 7; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int hari = 0; hari < 7; hari++) {
                System.out.print(data[i][hari] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTerlaris(int[][] data) {
        int maxTotal = -1;
        int indexMenu = -1;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int hari = 0; hari < 7; hari++) {
                total += data[i][hari];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMenu = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + menu[indexMenu]);
        System.out.println("Total Penjualan: " + maxTotal);
    }

    public static void rataRataMenu(int[][] data) {
        System.out.println("\n=== Rata-rata Penjualan Setiap Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int hari = 0; hari < 7; hari++) {
                total += data[i][hari];
            }
            double rata = total / 7.0;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {

        int[][] penjualan = new int[5][7];

        inputPenjualan(penjualan);
        tampilTabel(penjualan);
        menuTerlaris(penjualan);
        rataRataMenu(penjualan);
    }
}
