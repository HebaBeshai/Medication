/***********************************************************************************************************************
 * @file  CreativeExercise.java
 * @brief This program helps people to determine if they should take medication (and which type) or if that would not help
 *         by inputting their symptoms
 * @author Heba Beshai
 * @date   February 15, 2016
 **********************************************************************************************************************/
import java.util.Scanner;
public class CreativeExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String yesno, ear;
        String  sto, pain, soar;
        int HT, J, FCT, tt, hours;
        HT =0;
        J=0;
        int counter =2;
        int choice;


        System.out.println("Welcome! This program will help you determine if you need to take medication for your" +
                "\n                        illness or if that would be unbeneficial. ");
        System.out.println();
        System.out.println("Here are your options:");
        System.out.println("1. Headache");
        System.out.println("2. Cold or Flu");
        System.out.println("3. Stomach ache");
        System.out.println("4. Soar Throat");
        System.out.println("5. Ear Pain");
        System.out.println();
        System.out.print("Enter your choice here: ");
        choice = input.nextInt();


        while (counter >= choice ) {
            System.out.print("How long has this been going on?(Minutes) ");
            HT = input.nextInt();

            System.out.print("How many times this week, has it happened?");
            J = input.nextInt();
            if (choice == 1 ) {
                if (HT >= 90) {
                    if (J >= 3) {
                        System.out.println();
                        System.out.println("You should take medication,\nbelow are the top over the counter ones :");
                        System.out.println("\n1. Tylenol" +
                                "           \n2. Bayer   " +
                                "           \n3. Nalfon         ");
                    }
                } else {
                    System.out.println("Your headache will go away soon, you do not need medication.");

                }
                System.exit(0);      }

            if (choice == 2) {
                System.out.print("How many times have you thrown up?\n(Please enter a numerical digit)");
                FCT = input.nextInt();
                if (FCT == 0) {
                    System.out.print("Do you feel your pain has subsided in the past days?");
                    yesno = input.next();
                    if (yesno.equals("yes")) {
                        System.out.println("Do not take medication, you will get better soon");
                    } else {
                        System.out.println("Take medication, here are the top medicines:" +
                                " \n 1. Sudafed" +
                                " \n 2. Mucinex" +
                                " \n 3. Tylenol ");
                    }


                } else {
                    System.out.println("Go see a doctor");
                }


            }
            System.exit(0);

        }



    if (choice == 3 ){
        System.out.print("Has your pain been continuous? (Yes/No)");
        sto = input.next();
        if (sto.equals("yes")) {
            System.out.print("How long has it been since your stomach ache began? (In minutes)");
            tt = input.nextInt();
            System.out.println();
              if (tt >= 15){
                  System.out.println("You should take medication, the best ones are:" +
                          "          \n 1. Pepto-Bismal" +
                          "          \n 2. Emetrol" +
                          "          \n 3. Alka-Seltzer");
              }
        }
        else {
            System.out.println("Do not take any medication");
        }
    }
    if (choice == 4 ){
        System.out.print("Have you been able to eat and swallow your food without stopping\nbecause of pain? (Yes/No) ");
        pain = input.next();
            if (pain.equals("yes")){
                System.out.print("How long have you been unable to eat because of the pain?(Hours)");
                hours = input.nextInt();
                    if(hours >= 1){
                        System.out.print("Have you had fever, headache and stomachache along with\nyour throat pain? ");
                        soar = input.next();
                          if (soar.equals("yes")){
                              System.out.println("Consider taking one of these medications" +
                                      "\n1.Cepacol" +
                                      "\n2.Chloraseptic" +
                                      "\n3.Robitussin");
                          }
                        else{
                              System.out.println("Consider resting or cough drops");
                          }
                    }
            }
         else{
                 System.out.println("You do not need medication, your illness will subside soon");}

    }
        if (choice == 5 ) {
            System.out.print("Do you experience a sharp, dull, and  burning pain? (Yes/No) ");
            ear = input.next();
            if (ear.equals("yes")) {
                System.out.println("You may have an infection");
                System.out.println();
                System.out.println("Take antibiotics and call your doctor");
            } else {
                System.out.println("The following medications may help your pain to subside");
                System.out.println("1. Acetaminophen" +
                        "         \n2. Ibuprofen" +
                        "         \n3. Similasan Ear Drops");
            }
        }
}}
