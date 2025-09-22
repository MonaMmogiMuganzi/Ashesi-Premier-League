//Mona Mmogi Muganzi
//61132028
//Cohort B
//22/09/2025
//Purpose of this project is to practice java syntax and practice various operators.
//Instructor - David Ebo Adjepon-Yamoah


import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {
        //declaring variables
        String name;
        int age;
        float height;
        float weight;
        int jerseyNumber;

        //Asking for the details from the player
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = input.nextLine();
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        System.out.print("Please enter your height(in meters): ");
        height = input.nextFloat();
        System.out.print("Please enter your weight(in pounds): ");
        weight = input.nextFloat();
        System.out.print("Please enter your jersey number: ");
        jerseyNumber = input.nextInt();


        //declaring pound and meter as constant variables and assigning constant values
        final double POUND = 0.45359237;
        final float METER = 100;
        //conversion of height and weight
        double heightInCentimeters = height * METER;
        int weightInKilograms = (int) (weight * POUND);

        //printing out players information
        System.out.println("\nPlayer -  " + name);
        System.out.println("Age - " + age);
        System.out.println("Height in centimeters - " + heightInCentimeters + "cm");
        System.out.println("Weight in kilograms - " + weightInKilograms + "kg");
        System.out.println("Jersey Number - " + jerseyNumber);


        //decreasing the jersey number and increasing the age both by one
        System.out.println("\nPlayer's age now : " + age);
        age++;
        jerseyNumber--;
        System.out.println("\nnew jersey number: " + jerseyNumber);
        System.out.println("new player's age: " + age);


        //checking eligibility
        if (age >= 18 && age <= 35 && weightInKilograms < 90) {
            System.out.println("\nYou are Eligible");
        } else {
            System.out.println("\nYou are Not eligible");
        }

        if (age < 18 || weightInKilograms >= 90) {
            System.out.println("Either too young or too heavy");

        }

        //if (!(age >= 18 && age <= 35 && weightInKilograms < 90)) {
        //    System.out.println("Not eligible");



        //checking the category the player falls in
        if (age < 20) {
            System.out.println("\nYou are a rising star");
        } else if (age > 20 && age <= 30) {
            System.out.println("You are a prime player");
        } else {
            System.out.println("You are a veteran");
        }



        //assigning position if the jersey number is part of he numbers
        switch (jerseyNumber) {
            case 1:
                System.out.println("\nPosition: Goalkeeper.");
                break;

            case 2:
            case 5:
                System.out.println("Position: Defender");
                break;


            case 6:
            case 8:
                System.out.println("Position: Midfielder");
                break;

            case 9:
                System.out.println("Position: Striker");
                break;

            case 10:
                System.out.println("Position: Playmaker");
                break;

            case 7:
            case 11:
                System.out.println("Position: Winger");
                break;

            default:
                System.out.println("player position not known");

        }

        //determining whether a player is an attacker or not
        if(jerseyNumber == 9 || jerseyNumber == 10 || jerseyNumber == 7 || jerseyNumber == 11) {
            System.out.println("\nYou are an attacker");
        }
        else{
            System.out.println("\nYou are not an attacker");
        }

        //lineup decision
        if (age > 20 && age <= 30) {


            if (weightInKilograms < 80) {
                System.out.println("\nYou are in the lineup");
            } else {
                System.out.println("You are benched");
            }
        }

        //final decision
        String checker = age >= 18 && age <= 35 && weightInKilograms < 90 ? "play" : "rest";

        System.out.println("\nYou can " + checker);



    }

}
