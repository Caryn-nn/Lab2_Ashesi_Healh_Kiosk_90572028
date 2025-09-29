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
        double bmi= 0;
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
        String summary = "";
        String ID;
        String firstName;
        char baseCode;
        char shiftedLetter;
        long metric =0;
        double roundedAngle;
        double sinOfAngle;
        double cosOfAngle;
        double roundedBmi;

        // displaying a short welcome line to the user
        System.out.println("Welcome to Health Kiosk");
        System.out.println(" ");


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


        // the process a user goes through after choosing 'T'
        if (kindOfService == 'T') {
            System.out.println("  ");
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
                System.out.println("BMI : " + bmi + "| Category: " + Category);
                metric=Math.round((float)bmi);
                roundedBmi = Math.round(bmi *10)/10.0;

            } else if (healthMetric == 2) {
                // determine dosage round up
                System.out.println("Enter the required dosage (mg)");
                dosage = input.nextDouble();

                tablets = (int) Math.ceil(dosage / 250);
                System.out.println("You need " + tablets + " tablet(s)");
                metric=Math.round(tablets);

            } else if (healthMetric == 3) {
                System.out.println("Enter angle in degrees");
                angle = input.nextDouble();

                convertAngle = Math.toRadians(angle);
                roundedAngle =  Math.round( convertAngle * 1000) / 1000.0;
                sinOfAngle=Math.sin(roundedAngle);
                cosOfAngle=Math.cos(roundedAngle);
                System.out.printf("Angle (radians) : %.3f%n", roundedAngle);
                System.out.printf("sin : %.3f%n", sinOfAngle);
                System.out.printf("cos : %.3f%n", cosOfAngle);
                metric=Math.round((float)sinOfAngle*100);

            }



            // TASK 3
            // generating a random letter and four random numbers to create a short code
            randomLetter = (char) ('A' + (int) (Math.random() * 26));
            number1 = (int) (Math.random() * (9 - 3 + 1) + 3);
            number2 = (int) (Math.random() * (9 - 3 + 1) + 3);
            number3 = (int) (Math.random() * (9 - 3 + 1) + 3);
            number4 = (int) (Math.random() * (9 - 3 + 1) + 3);

            ID = "" + randomLetter + number1 + number2 + number3 + number4;

            if (ID.length() == 5 && Character.isLetter(ID.charAt(0)) && Character.isDigit(ID.charAt(1)) && Character.isDigit(ID.charAt(2)) && Character.isDigit(ID.charAt(3)) && Character.isDigit(ID.charAt(4))) {
                System.out.println("ID OK");
            } else {
                System.out.println("Invalid: first char must be a letter, the last four must be digits and the length must be 5");
            }



            //TASK 4
            // Allowing user input and generating a code for the user
            System.out.println(" ");
            System.out.println("Enter your first name:");
            input.nextLine();
            firstName = input.nextLine();

            baseCode = Character.toUpperCase(firstName.charAt(0));
            shiftedLetter = (char) ('A' + (baseCode - 'A' + 2) % 26);
            String lastTwo = ID.substring(ID.length() - 2);
            String Code = shiftedLetter + lastTwo + "-" + metric;


            //TASK 5
            // Printing final summary
            if(kindOfService=='T') {
                System.out.println("  ");
                System.out.println("Summary: " + summary + " | ID: " + ID + " | BMI: " + bmi + "| Code: " + Code);
            }else{
                System.out.println("  ");
                System.out.println("Summary: " + summary + " | ID: " + ID + " | Code: " + Code);
            }







        }
    }
}
