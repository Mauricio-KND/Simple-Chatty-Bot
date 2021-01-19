import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nIntegerValue = scanner.nextInt();
        int arithmeticExpression = ((nIntegerValue + 1) * nIntegerValue + 2) * nIntegerValue + 3;

        System.out.println(arithmeticExpression);
    }
}