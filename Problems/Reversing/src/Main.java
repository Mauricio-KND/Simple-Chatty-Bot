import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int threeDigitNumber = scanner.nextInt();

        int firstDigit = threeDigitNumber / 100;
        int secondDigit = (threeDigitNumber % 100) / 10;
        int lastDigit = threeDigitNumber % 10;

        int reverseNumber = lastDigit * 100 + secondDigit * 10 + firstDigit;

        System.out.println(reverseNumber);
    }
}