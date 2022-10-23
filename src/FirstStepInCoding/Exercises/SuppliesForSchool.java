package BasicLesonsPracticeReal;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int packOfPens = Integer.parseInt(scanner.nextLine());
        int packOfMarker = Integer.parseInt(scanner.nextLine());
        int literCleaningDetergent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double priceOfPens = 5.80;
        double priceOfMarkers = 7.20;
        double priceOfCleaningDetergent = 1.20;
        double totalPriceOfPens = packOfPens * priceOfPens;
        double totalPriceOfMarkers = packOfMarker * priceOfMarkers;
        double totalPriceOfDetergent = literCleaningDetergent * priceOfCleaningDetergent;
        double totalPrice = totalPriceOfPens  + totalPriceOfMarkers
                + totalPriceOfDetergent;
        double result = totalPrice - (totalPrice * (discount / 100));


        System.out.println(result);
    }
}
