import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsGroup1 = scanner.nextInt();
        int studentsGroup2 = scanner.nextInt();
        int studentsGroup3 = scanner.nextInt();

        // Remember if a class has 15 students , it needs (15/2 + 15%2) number of desks.
        int overallGroup1 = studentsGroup1 / 2 + studentsGroup1 % 2;
        int overallGroup2 = studentsGroup2 / 2 + studentsGroup2 % 2;
        int overallGroup3 = studentsGroup3 / 2 + studentsGroup3 % 2;

        int minimumOdDesks = overallGroup1 + overallGroup2 + overallGroup3;

        System.out.println(minimumOdDesks);
    }
}