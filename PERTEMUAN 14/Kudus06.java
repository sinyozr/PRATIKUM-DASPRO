
import java.util.Scanner;

public class Kudus06 {

    public static double hitungVolumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaanKubus(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();

        double volume = hitungVolumeKubus(sisi);
        double luasPermukaan = hitungLuasPermukaanKubus(sisi);

        System.out.println("Volume Kubus = " + volume);
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan);
    }

}
