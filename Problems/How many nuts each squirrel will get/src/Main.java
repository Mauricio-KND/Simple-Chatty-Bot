import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squirrelsN = scanner.nextInt(); // < 1000
        int nutsK = scanner.nextInt(); // < 1000

        int nutsPerSquirrel = nutsK / squirrelsN;

        System.out.println(nutsPerSquirrel);
    }
}