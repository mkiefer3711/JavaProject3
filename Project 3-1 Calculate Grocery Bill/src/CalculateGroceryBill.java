// @author Maddison Kiefer

import java.util.Scanner;

public class CalculateGroceryBill {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      // Creating the variables
      double couponAmount;
      int numWeeks;
      double totalBill = 0;
      double monthlyTotalWithoutCoupon;
      double weeklyAverageWithoutCoupon;
      double monthlyTotalWithCoupon;
      double weeklyAverageWithCoupon;
      
      // Prompting the user for a coupon amount
      System.out.println("Enter a coupon amount as a decimal (ex. .10): ");
      couponAmount = scnr.nextDouble();
      
      // Setting couponAmount equal to .10 if less than or equal to 0 or greater than 1
      if(couponAmount > 1 || couponAmount <= 0){
          couponAmount = .10;
      }
      
      // Prompting the user for the number of weeks
      System.out.println("Enter number of weeks, between 2 and 4: ");
      numWeeks = scnr.nextInt();
      
      // If less than 2 or greater than 4, the number of weeks is not valid
      if(numWeeks < 2 || numWeeks > 4) {
          System.out.println("Invalid number of weeks.");
          return;
      }
      // Prompting the user for the grocery bill for the first week and adding that to the totalBill
      System.out.println("Enter grocery bill for the first week: ");
      double weekOneBill = scnr.nextDouble();
      totalBill += weekOneBill;
      
      // Prompting the user for the grocery bill for the second week and adding that to the totalBill
      System.out.println("Enter grocery bill for the second week: ");
      double weekTwoBill = scnr.nextDouble();
      totalBill += weekTwoBill;
      
      // If the user entered a week number greater than 2, prompt them for the bill for the third week and add that to billTotal
      if(numWeeks > 2) {
        System.out.println("Enter grocery bill for the third week: ");
        double weekThreeBill = scnr.nextDouble();
        totalBill += weekThreeBill;
      }
      
      // If the user entered a week number greater than 3, prompt them for the bill for the fourth week and add that to billTotal
      if(numWeeks > 3) {
        System.out.println("Enter grocery bill for the fourth week: ");
        double weekFourBill = scnr.nextDouble();
        totalBill += weekFourBill;
      }
      
      // Calculating the monthly total and weekly average with no coupon
      monthlyTotalWithoutCoupon = totalBill;
      weeklyAverageWithoutCoupon = totalBill / numWeeks;
      
      // Calculating the monthly total and weekly average with a coupon
      monthlyTotalWithCoupon = totalBill * (1 - couponAmount);
      weeklyAverageWithCoupon = monthlyTotalWithCoupon / numWeeks;
      
      // Outputting the totals to the console
      System.out.println("");
      System.out.println("Totals:");
      System.out.printf("Monthly total without a coupon is: $" + "%.2f", monthlyTotalWithoutCoupon);
      System.out.printf("%nWeekly average without a coupon is: $" + "%.2f", weeklyAverageWithoutCoupon);
      System.out.printf("%nMonthly total with a coupon is: $" + "%.2f", monthlyTotalWithCoupon);
      System.out.printf("%nWeekly average with a coupon is: $" + "%.2f", weeklyAverageWithCoupon);
      System.out.println("");
    }
}
