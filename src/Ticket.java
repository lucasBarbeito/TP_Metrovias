import java.time.LocalTime;

public class Ticket {

    private int code;
    LocalTime waitingTime;

    public Ticket(LocalTime waitingTime) {
        this.code = (int) Math.round(Math.random() * 100000);
        this.waitingTime = waitingTime;
    }

    public LocalTime getWaitingTime() {
        return waitingTime;
    }

}
