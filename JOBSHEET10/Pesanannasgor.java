
import java.util.Scanner;

public class Pesanannasgor {

    public static void main(String[] args) {

        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int[] daftarPesanan = new int[daftarMenu.length];
            double totalBayar = 0;
            System.out.print("Masukkan jumlah pesanan (ketik 0 untuk keluar): ");
            int jumlahItem = scanner.nextInt();
            scanner.nextLine();
            if (jumlahItem == 0) {
                System.out.println("Terima kasih!");
                break;
            }
            for (int i = 1; i <= jumlahItem; i++) {
                System.out.print("Masukkan menu " + i + ": ");
                String inputMenu = scanner.nextLine();

                System.out.print("Masukkan jumlah: ");
                int inputQty = scanner.nextInt();
                scanner.nextLine();
                boolean ditemukan = false;
                for (int j = 0; j < daftarMenu.length; j++) {
                    if (daftarMenu[j].equalsIgnoreCase(inputMenu)) {
                        ditemukan = true;

                        daftarPesanan[j] = inputQty;
                        totalBayar += (daftarHarga[j] * inputQty);

                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Maaf, menu '" + inputMenu + "' tidak tersedia.");
                    i--;
                }
            }
            System.out.println("Total: " + (int) totalBayar);
            System.out.println();
        }

        scanner.close();
    }
}
