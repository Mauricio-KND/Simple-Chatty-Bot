import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intN = scanner.nextInt(); // Length (longest side).
        int intM = scanner.nextInt(); // Width.
        int intK = scanner.nextInt(); // A Segment

        if (intK % intN == 0 && intK < intM * intN || intK % intM == 0 && intK < intM * intN) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}