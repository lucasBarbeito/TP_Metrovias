import StackAndQueue.Queue;
import StackAndQueue.QueueIsEmptyException;

import java.time.LocalTime;

public class Window {

    private Queue<Person> waitingLine;
    private float price;
    private int totalPeopleAttended;
    private LocalTime lastClientAttended;


    public Window(float price) {
        this.waitingLine = new Queue<>();
        this.totalPeopleAttended = 0;
        this.price = price;
    }

    public void addPerson(Person person){
        waitingLine.enqueue(person);
        totalPeopleAttended++;
    }

    public Ticket callNext(LocalTime finishingTime) throws WindowIsEmptyException {
        try {
            waitingLine.dequeue();
            lastClientAttended = finishingTime;
            return new Ticket(finishingTime);
        } catch (QueueIsEmptyException e){
            throw new WindowIsEmptyException();
        }

    }

    public double getTotalMoneyEarned(){
        return price*totalPeopleAttended;
    }

    public float getAverageTimeInSeconds(LocalTime startingTime) {
        int differenceInSeconds = lastClientAttended.getSecond() - startingTime.getSecond();
        int differenceInMinutes = lastClientAttended.getMinute() - startingTime.getMinute();
        int differenceInHours = lastClientAttended.getHour() - startingTime.getHour();
        if (differenceInSeconds < 0){
            differenceInSeconds += 60;
            --differenceInMinutes;
        }
        if (differenceInMinutes < 0){
            differenceInMinutes += 60;
            --differenceInHours;
        }
        return (differenceInHours*3600 + differenceInMinutes * 60 + differenceInSeconds)/totalPeopleAttended;
    }

}
