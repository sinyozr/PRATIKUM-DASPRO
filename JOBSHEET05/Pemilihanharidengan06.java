
import java.util.Scanner;

public class Pemilihanharidengan06 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Angka");
        int dayNumber = sc.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("weekday");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("weekend");
        } else {
            System.out.println("Invalid Number");
        }

    }
}
