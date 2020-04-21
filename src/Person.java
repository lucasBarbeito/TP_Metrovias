import static java.lang.System.currentTimeMillis;

public class Person {
    private int ticketNumber;
    private float time;

    public Person(int ticketNumber) {
        this.ticketNumber = ticketNumber;
        time = currentTimeMillis();
    }

    public void closeTime() {
        time = currentTimeMillis()- time;
    }

    public float getTime() {
        return time;
    }
}
