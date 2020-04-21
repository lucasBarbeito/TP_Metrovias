import java.lang.String;
import java.util.Scanner;

public class Subteimpl {

    public static void main (String [] Args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of windows");
        int numberOfWindows = scanner.nextInt();
        Subte elSubte = new Subte(numberOfWindows);

        System.out.print("Press 1 to start and 2 to finish");
        int option = scanner.nextInt();

        while (option == 1) {
            elSubte.attendArrivals();
            elSubte.attendDepartures();
            System.out.print("Press 1 to continue and 2 to finish");
            option = scanner.nextInt();
        }

        float averageWaitingTimes[]  = elSubte.averageWaitingTime();
        float totalAmount[] = elSubte.totalAmounts();
        Stack atendidos = elSubte.allAttendedPersons();

        //MostrarPila(atendidos);
    }
}