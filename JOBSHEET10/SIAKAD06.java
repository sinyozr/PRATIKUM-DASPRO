
import java.util.Scanner;

public class SIAKAD06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Siswa (N): ");
        int JML_SISWA = sc.nextInt();

        System.out.print("Masukkan jumlah Mata Kuliah (M): ");
        int JML_MATKUL = sc.nextInt();

        int[][] nilai = new int[JML_SISWA][JML_MATKUL];

        System.out.println("===============================");
        System.out.println("INPUT NILAI");
        System.out.println("===============================");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Input nilai mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(" - Nilai Mata Kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata siswa ke-" + (i + 1) + ": " + totalPersiswa / nilai[i].length);
        }

        System.out.println("\n===============================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");
        System.out.println("===============================");

        for (int j = 0; j < JML_MATKUL; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah ke-" + (j + 1) + ": " + totalPerMatkul / nilai.length);
        }
    }
}
