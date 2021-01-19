import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();

        System.out.print(secondInteger + " " + firstInteger);
    }
}