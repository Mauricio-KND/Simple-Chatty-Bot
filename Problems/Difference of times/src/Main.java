import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstMomentHour = scanner.nextInt();
        int firstMomentMinute = scanner.nextInt();
        int firstMomentSecond = scanner.nextInt();

        int secondMomentHour = scanner.nextInt();
        int secondMomentMinute = scanner.nextInt();
        int secondMomentSecond = scanner.nextInt();

        int hoursToSecondsFirstMoment = firstMomentHour * 3600;
        int minutesToSecondsFirstMoment = firstMomentMinute * 60;

        int hoursToSecondsSecondMoment = secondMomentHour * 3600;
        int minutesToSecondsSecondMoment = secondMomentMinute * 60;

        int valueInSecondsFirstMoment = hoursToSecondsFirstMoment + minutesToSecondsFirstMoment + firstMomentSecond;
        int valueInSecondsSecondMoment = hoursToSecondsSecondMoment + minutesToSecondsSecondMoment + secondMomentSecond;

        int firstResult = valueInSecondsFirstMoment - valueInSecondsSecondMoment;
        int positiveResult = firstResult * -1;

        System.out.println(positiveResult);
    }
}