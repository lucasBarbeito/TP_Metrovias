import StackAndQueue.Stack;
import java.time.LocalTime;

public class Subway {

    private Window[] windows;
    private LocalTime startingTime;
    private Stack<Ticket> tickets;

    public Subway(int numberOfWindows, float price, LocalTime startingTime) {
        windows = new Window[numberOfWindows];
        for (int i = 0; i < numberOfWindows; i++) {
            windows[i] = new Window(price);
        }
        tickets = new Stack<>();
        this.startingTime = startingTime;
    }

    public void receivePerson(int windowChosen, Person person){
        windows[windowChosen].addPerson(person);
    }

    public void callNextInWindow(int windowChosen, LocalTime finishingTime){
        try {
            tickets.push(windows[windowChosen].callNext(finishingTime));
        } catch (WindowIsEmptyException e){
            System.out.println("Window was empty");
        }
    }

    public void showWindowsAverageTime(){
        for (int i = 0; i < windows.length; i++) {
            System.out.println("Window " + i + " average time is: " +
                    windows[i].getAverageTimeInSeconds(startingTime));
        }
    }

    public void showWindowsEarnings(){
        for (int i = 0; i < windows.length; i++) {
            System.out.println("Window " + i + " earnings are: " +
                    windows[i].getTotalMoneyEarned());
        }
    }


}