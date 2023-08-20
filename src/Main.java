import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 0;
        int km = 0;
        int tripType = 1;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometers");
        km = sc.nextInt();
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter your tripType \\n1. One way \\n2. Round trip");
        tripType = sc.nextInt();


        if (km > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            double ticketPrice = km * 0.10;

            double ageDiscountRate = 0;

            if (age < 12) {
                ageDiscountRate = 0.50;
            } else if (age >= 12 && age <= 24) {
                ageDiscountRate = 0.10;
            } else if (age > 65) {
                ageDiscountRate = 0.30;
            }
            ticketPrice -= ticketPrice * ageDiscountRate;

            if (tripType == 2) {
                ticketPrice -= ticketPrice * 0.20;
                ticketPrice *= 2;

            }
            System.out.println("Total amount " + ticketPrice);

        } else {
            System.out.println("You entered wrong data ");
        }


    }
}
