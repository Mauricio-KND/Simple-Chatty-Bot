import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naturalNumber = scanner.nextInt();

        int evenOrOdd = naturalNumber % 2; //0=Even, 1=Odd

        int followingEvenNumber = naturalNumber + 2 - evenOrOdd;

        System.out.println(followingEvenNumber);
    }
}