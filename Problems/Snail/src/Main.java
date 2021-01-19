import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightH = scanner.nextInt(); // Vertical Pole Height. heightH>feetDownB
        int feetUpA = scanner.nextInt(); // Feet Up Per Day. feetUpA>feetDownB
        int feetDownB = scanner.nextInt(); // Feet Down Per Day.

        int topOfThePoleDay = (heightH - feetDownB - 1) / (feetUpA - feetDownB) + 1;

        System.out.println(topOfThePoleDay);
    }
}