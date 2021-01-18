//put imports you need here

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create an object of Scanner class, to use its methods.
        //System.in indicates that the program read text typed in the standard input.
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        String cuisinePreferences = scanner.next();

        System.out.println("The form for "+firstName+" is completed. We will contact you if we need a chef that cooks "+cuisinePreferences+" dishes.");
    }
}