import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sampleInput = scanner.nextInt();

        if (sampleInput < 1) {
            System.out.println("no army");
        } else if (sampleInput >= 1 && sampleInput < 20) {
            System.out.println("pack");
        } else if (sampleInput > 19 && sampleInput < 250) {
            System.out.println("throng");
        } else if (sampleInput > 249 && sampleInput < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}