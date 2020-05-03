import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class SubwaySimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime startingTime = LocalTime.now();
        System.out.print("Price: ");
        float price = scanner.nextFloat();
        int amountOfWindows;
        do {
            System.out.print("Amount of windows: ");
            amountOfWindows = scanner.nextInt();
        } while (!(amountOfWindows <= 25 && amountOfWindows >= 5));
        Subway subway = new Subway(amountOfWindows, price, startingTime);
        int option;
        LocalTime entryTime = startingTime;
        Random randomNumberGenerator = new Random();
        do {
            do {
                System.out.print("Insert 1 to continue 30 seconds or insert 2 to finish simulation: ");
                option = scanner.nextInt();
            } while (option != 1 && option != 2);
            if (option == 1){
                entryTime = entryTime.plusSeconds(30);
                for (int i = 0; i < 5; i++) {
                    subway.receivePerson(randomNumberGenerator.nextInt(amountOfWindows), new Person(entryTime));
                }
                for (int i = 0; i < amountOfWindows; i++) {
                    if (Math.random() >= 0.5){
                        subway.callNextInWindow(i, entryTime);
                    }
                }
            }
        }while (option == 1);
        subway.showWindowsAverageTime();
        subway.showWindowsEarnings();
    }
}
