
import java.util.Scanner;

public class Persegiangka07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan nilai n (minimal 3): ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("Nilai n harus minimal 3! Silakan coba lagi.\n");
            }
        } while (n < 3);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
