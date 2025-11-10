
public class PerulanganBersarang07 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int total = 0;

            System.out.print("n = " + i + " > jumlah kuadrat = ");

            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                total += kuadrat;
                System.out.print(kuadrat);

                if (j < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + total);
        }
    }
}
