
public class Bintang {

    public static void main(String[] args) {
        int n = 10; // Jumlah baris bintang

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
