import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integerValue = scanner.nextInt();

        boolean lessThanTen = integerValue < 10;
        boolean greaterThanZero = integerValue > 0;

        boolean checker = lessThanTen && greaterThanZero;

        System.out.println(checker);
    }
}