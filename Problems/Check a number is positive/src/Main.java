import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        if (inputNumber > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}