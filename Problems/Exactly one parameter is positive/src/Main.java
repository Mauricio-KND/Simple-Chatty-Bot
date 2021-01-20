import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();
        int thirdInteger = scanner.nextInt();

        boolean firstCheck = firstInteger > 0 && secondInteger <= 0 && thirdInteger <= 0;
        boolean secondCheck = firstInteger <= 0 && secondInteger > 0 && thirdInteger <= 0;
        boolean thirdCheck = firstInteger <= 0 && secondInteger <= 0 && thirdInteger > 0;

        boolean checker = firstCheck || secondCheck || thirdCheck;
        System.out.println(checker);
    }
}