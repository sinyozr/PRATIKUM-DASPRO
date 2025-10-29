
import java.util.Scanner;

public class PemilihanHari06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayname, dayType;
        System.out.println("Input day name");
        dayname = sc.nextLine();
        switch (dayname.toLowerCase()) {
            case "monday":
            case "tuseday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";

            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }
        System.out.println(dayname + "is a" + dayType);
    }
}
