
import java.util.Scanner;

public class Star07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan nilai n =");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
