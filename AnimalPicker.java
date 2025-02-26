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
            animal = input.nextLine();
            System.out.println();

            switch (animal.trim().toLowerCase()) {
                case "dog":
                    System.out.println("            __\n(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
                    choice = true;
                    break;
                case "cat":
                    System.out.println(
                            " _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
                    choice = true;
                    break;
                case "fish":
                    System.out.println(
                            "      /`·.¸\n     /¸...¸`:·\n ¸.·´  ¸   `·.¸.·´)\n: © ):´;      ¸  {\n `·.¸ `·  ¸.·´\\`·¸)\n     `\\\\´´\\¸.·´");
                    choice = true;
                    break;
                default:
                    System.out.println("Invalid Animal, please choose another.");
                    System.out.println("Restarting prompt...");
                    System.out.println();
            }
        }

    }

}