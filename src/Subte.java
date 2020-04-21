import java.lang.Math;

public class Subte {

    private Window[] windows;
    private Stack<Person> attendedPersons;
    private int numberOfWindows;

    public Subte (int numberOfWindows) {
        windows = new Window[numberOfWindows];
        this.numberOfWindows = numberOfWindows;
        for (int i = 0; i < numberOfWindows; i++) {
            windows[i] = new Window();
        }
    }

    public void attendArrivals() {
        for (int i = 0; i < 4; i++) {
            int selectedWindowNumber = (int) (numberOfWindows * Math.random());
            int ticketNumber = (int) (100 * Math.random());
            windows[selectedWindowNumber].addPerson(new Person(ticketNumber));
        }
    }

    public void attendDepartures() {
        for (int i = 0; i < numberOfWindows; i++) {
            if ((int) (100 * Math.random()) < 30) {
                Person p = windows[i].dispatchPerson();
                attendedPersons.push(p);
            }
        }
    }

    public float[] averageWaitingTime() {
        return new float[0]; // le puse esto solo para que no tirara error -Dimi
    }

    public float[] totalAmounts() {
        return new float[0]; // le puse esto solo para que no tirara error -Dimi
    }

    public Stack<Person> allAttendedPersons() {
        return attendedPersons;
    }

}