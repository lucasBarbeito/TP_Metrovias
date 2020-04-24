import java.time.LocalDateTime;

public class Person {

    private LocalDateTime entryTime;

    public Person(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
