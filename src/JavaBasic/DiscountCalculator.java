package JavaBasic;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input unit price:");
        float unitPrice = input.nextFloat();
        System.out.println("Input quantity:");
        int unitQuantity = input.nextInt();
        if (unitQuantity < 100) {
            float discount = 0;
            System.out.println("The revenue from the sale is: " + (unitPrice * unitQuantity - (discount / 100) * unitPrice * unitQuantity) + "$");
            System.out.println("Discount: " + (discount / 100) * unitPrice * unitQuantity + "$" + " (" + discount + "%)");
        } else if (unitQuantity > 120) {
            float discount = 20;
            System.out.println("The revenue from the sale is: " + (unitPrice * unitQuantity - (discount / 100) * unitPrice * unitQuantity) + "$");
            System.out.println("Discount: " + (discount / 100) * unitPrice * unitQuantity + "$" + " (" + discount + "%)");
        } else {
            float discount = 15;
            System.out.println("The revenue from the sale is: " + (unitPrice * unitQuantity - (discount / 100) * unitPrice * unitQuantity) + "$");
            System.out.println("Discount: " + (discount / 100) * unitPrice * unitQuantity + "$" + " (" + discount + "%)");
        }
    }
}
