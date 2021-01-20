import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer1 = scanner.nextInt();
        int integer2 = scanner.nextInt();
        int integer3 = scanner.nextInt();

        boolean checker1 = integer1 == integer2 && integer2 == integer3;
        boolean checker2 = integer1 > integer2 && integer2 < integer3;
        boolean checker3 = integer1 < integer2 && integer2 > integer3;

        boolean finalChecker = checker1 || checker2 || checker3;

        System.out.println(finalChecker);
    }
}