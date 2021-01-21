import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputInt = scanner.nextInt();

        if (inputInt > -15 && inputInt <= 12 || inputInt > 14 && inputInt < 17 || inputInt >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}