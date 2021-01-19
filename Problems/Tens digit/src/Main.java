import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        long digitInput = scanner.nextLong();

        System.out.println((digitInput % 100) / 10);
    }
}