import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fourDigitNUmber = scanner.nextInt();

        int firstDigit = fourDigitNUmber / 1000;
        int secondDigit = (fourDigitNUmber / 100) % 10;
        int thirdDigit = (fourDigitNUmber / 10) % 10;
        int fourthDigit = fourDigitNUmber % 10;

        if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.println("1");
        } else {
            System.out.println("1001");
        }
    }
}