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


    }
}
