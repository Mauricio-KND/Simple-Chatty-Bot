import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int durationDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int hotelNight = scanner.nextInt();  //Number of nights = Duration - 1

        int numberOfNights = durationDays - 1;

        int totalHotelNights = numberOfNights * hotelNight;
        int totalFlights = oneWayFlightCost * 2;
        int foodMoney = durationDays * foodCostPerDay;
        int totalMoney = foodMoney + totalHotelNights + totalFlights;

        System.out.println(totalMoney);
    }
}