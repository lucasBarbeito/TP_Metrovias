import java.time.LocalTime;

public class Person {

    private LocalTime entryTime;

    public Person(LocalTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }
}
