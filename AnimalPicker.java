// J Jackson   
// Animal Picker 

import java.util.Scanner;

public class AnimalPicker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String animal;
        boolean choice = false;

        while (!choice) {
            System.out.println("Enter an animal.");
            System.out.println();
            String userAnimal = input.nextLine();
            System.out.println();

            switch (userAnimal.trim().toLowerCase()) {
                case "dog":
                    System.out.println(" DOG ASCII HERE");
                    choice = true;
                    break;
                case "cat":
                    System.out.println("CAT ASCII HERE");
                    choice = true;
                    break;
                default:
                    System.out.println("Invalid Animal");
                    System.out.println();
            }
        }

    }

}