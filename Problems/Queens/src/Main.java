import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        /* Verify the position of the queens in x and y vector.
        You can do this with Math abs() method: Math.abs(x1 - x2) == Math.abs(y1 - y2)*/
        if (x1 + y1 == x2 + y2 || x1 + y2 == x2 + y1 || x1 == x2 || y1 == y2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}