// AUTHOR : FAFALI CARYN AKU AWITTOR
// DATE : 29TH SEPTEMBER,2025
// LECTURER : MR. DANIEL ADDO
// DESCRIPTION: THIS CODE IS TO HELP ASHESI UNIVERSITY'S HEALTH CENTER PILOT A TINY SELF SERVICE INTAKE KIOSK

import java.util.Scanner;
public class HealthKiosk {
    public static void main(String[] args) {

        // declaring variables
        char service;
        char kindOfService;
        double weight;
        double height;
        double bmi;
        String Category = "";
        double dosage;
        int healthMetric;
        double angle;
        int tablets;
        double convertAngle;
        char randomLetter;
        int number1;
        int number2;
        int number3;
        int number4;
        String summary ="";
        String ID ;
        String firstName;
        char baseCode;
        char shiftedLetter;


        //Task 1
        // allowing user input to determine service
        Scanner input = new Scanner(System.in);
        System.out.print("Enter service code (P/L/T/C): ");
        service = input.next().charAt(0);
        kindOfService = Character.toUpperCase(service);


        if (kindOfService == 'P') {
            summary = "PHARMACY";
        } else if (kindOfService == 'T') {
            summary = "TRIAGE";
        } else if (kindOfService == 'L') {
            summary = "LAB";
        } else if (kindOfService == 'C') {
            summary = "COUNSELLING";
        }


        // switch case to determine which desk user should go
        switch (kindOfService) {
            case 'P':
                System.out.print(" Go to: Pharmacy Desk ");
                break;
            case 'L':
                System.out.print(" Go to: Lab Desk ");
                break;
            case 'T':
                System.out.print(" Go to: Triage Desk ");
                break;
            case 'C':
                System.out.print(" Go to: Counselling Desk ");
                break;
            default:
                System.out.print("Invalid service code");
        }


        if (service == 'T') {
            System.out.println("Enter health metric:");
            healthMetric = input.nextInt();

            if (healthMetric == 1) {
                // asking user to enter weight and height to calculate BMI
                System.out.println("Enter your weight in kilograms");
                weight = input.nextDouble();
                System.out.println("Enter your height in meters");
                height = input.nextDouble();

                bmi = weight / (Math.pow(height, 2));

                // determining category based on BMI
                if (bmi < 18.5) {
                    Category = "Underweight";
                } else if (bmi >= 18.5 && bmi <= 24.9) {
                    Category = "Normal";
                } else if (bmi >= 25.0 && bmi <= 29.9) {
                    Category = "Overweight";
                } else if (bmi >= 30) {
                    Category = "Obese";
                }
            } else if (healthMetric == 2) {
                // determine dosage round up
                System.out.println("Enter the required dosage (mg)");
                dosage = input.nextDouble();

                tablets = (int) Math.ceil(dosage / 250);
                System.out.println("You need " + tablets + " tablet(s)");

            } else if (healthMetric == 3) {
                System.out.println("Enter angle in degrees");
                angle = input.nextDouble();

                convertAngle = Math.toRadians(angle);
                convertAngle = Math.round(convertAngle * 1000) / 1000.0;

            }



    }
}
