
import java.util.Scanner;

public class Nilaikelompok07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float totalNilai;
        float rataNilai;
        float rataTertinggi = 0;
        int kelompokTertinggi = 0;

        while (i <= 6) {
            System.out.println("\nKelompok " + i);
            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
                float nilai = sc.nextFloat();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " : nilai rata-rata = " + rataNilai);
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println("\nKelompok dengan nilai rata-rata tertinggi adalah Kelompok " + kelompokTertinggi + " dengan nilai " + rataTertinggi);

        sc.close();
    }
}
