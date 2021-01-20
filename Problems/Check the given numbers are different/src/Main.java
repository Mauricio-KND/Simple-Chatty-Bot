import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int thirdDigit = scanner.nextInt();

        boolean checker = firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit;

        System.out.println(checker);
    }
}