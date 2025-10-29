
import java.util.Scanner;

public class GanjilGenap06 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int angka;

        // input dari user
        System.out.println("Masukan Angka: ");
        angka = sc.nextInt();

        // if else untuk menentukan ganjil genap
        if (angka % 2 == 0) {
            System.out.println("Angka" + angka + "adalah bilangan genap");
        } else {
            System.out.println("Angka" + angka + "adalah bilangan ganjil");
        }

    }

}
