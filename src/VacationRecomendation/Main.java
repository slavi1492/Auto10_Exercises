package VacationRecomendation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int var = 0;
        while (var < 10) {
            System.out.println("Please select type of the desired holyday");
            System.out.println("Enter 1 for Beach");
            System.out.println("Enter 2 for Mountain");
            int vacationType = input.nextInt();
            if (vacationType == 1 || vacationType == 2) {
                System.out.println("Enter budged per day per person:");
                float budged = input.nextFloat();
                if (vacationType == 1) {
                    if (budged < 50) {
                        System.out.println("We recommend Bulgaria as a destination for your Beach vacation.");
                    } else {
                        System.out.println("We recommend Outside Bulgaria as a destination for your Beach vacation.");
                    }
                } else {
                    if (budged < 30) {
                        System.out.println("We recommend Bulgaria as a destination for your Mountain vacation.");
                    } else {
                        System.out.println("We recommend Outside Bulgaria as a destination for your Mountain vacation.");
                    }
                }
                break;
            } else {
                System.out.println("Please enter a valid option");
                var++;
            }
        }
        System.out.println("Please be serious about your vacation");

    }
}

