import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberA = scanner.nextInt(); // According to TV.
        int numberB = scanner.nextInt(); // No more than this number.
        int numberH = scanner.nextInt(); // How many hours Ann sleeps.

        if (numberH < numberA) {
            System.out.println("Deficiency");
        } else if (numberH > numberB) {
            System.out.println("Excess");
        } else if (numberH <= numberB) {
            System.out.println("Normal");
        }
    }
}