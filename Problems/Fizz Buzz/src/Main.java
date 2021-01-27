import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();

        for (int index = firstInput; index <= secondInput; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                System.out.println(" FizzBuzz");
            } else if (index % 5 == 0) {
                System.out.println("Buzz");
            } else if (index % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(index);
            }
        }
    }
}