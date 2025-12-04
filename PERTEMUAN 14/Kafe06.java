
public class Kafe06 {

    public static void main(String[] args) {
        Menu("Sinyo", true);
    }

    public static void Menu(String NamaPelanggan, boolean isMember) {
        System.out.println("Selamat datang di Kafe Kami, " + NamaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapat diskon 10% untuk setiap pembelian!");

            System.out.println("===== MENU KAFE =====");
            System.out.println("1. Kopi Hitam - 15.000");
            System.out.println("2. Cappuccino - 20.000");
            System.out.println("3. Latte - 22.000");
            System.out.println("4. Teh Tarik - 12.000");
            System.out.println("5.Roti Bakar - 10.000");
            System.out.println("6. Mie Goreng - 18.000");
            System.out.println("=====================");
            System.out.println("Silakan pilih menu yang Anda inginkan.");
        }
    }
}
