import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intN = scanner.nextInt();
        int intM = scanner.nextInt();
        int intK = scanner.nextInt();

        if (intK % intN == 0 && intK / intN < intM || intK % intM == 0 && intK / intM < intN) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}