import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aInt = scanner.nextInt();
        int bInt = scanner.nextInt();
        int cInt = scanner.nextInt();


        boolean add1 = aInt + bInt == 20;
        boolean add2 = aInt + cInt == 20;
        boolean add3 = bInt + cInt == 20;

        boolean checker = add1 || add2 || add3;

        System.out.println(checker);
    }
}