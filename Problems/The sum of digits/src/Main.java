import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int threeDigitInteger = scanner.nextInt();

        int firstDigit = threeDigitInteger / 100;
        int secondDigit = (threeDigitInteger % 100) / 10;
        int thirdDigit = threeDigitInteger % 10;

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;

        System.out.println(sumOfDigits);
    }
}