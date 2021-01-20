import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peanutButterCups = scanner.nextInt();
        boolean weekendOrNot = scanner.nextBoolean();

        boolean cupsIfIsWeek = peanutButterCups >= 10 && peanutButterCups <= 20;
        boolean cupsIfIsWeekend = peanutButterCups >= 15 && peanutButterCups <= 25;

        boolean successfulOnWeekend = cupsIfIsWeekend && weekendOrNot;
        boolean successfulOnWeek = cupsIfIsWeek && !weekendOrNot;

        boolean successfulParty = successfulOnWeekend || successfulOnWeek;

        System.out.println(successfulParty);
    }
}