import java.lang.Float;
import
public class Window {
    private Queue espera;
    private float recaudado;
    private int cantpersonas;
    private Float averageTime;

    //int totalMoneyCollected;
    //Stack<Person> people;

    public Window() {

    }

    public void addPerson(Person p) {
        espera.encolar(p);
        recaudado = recaudado + 0,70;
    }

    public Person dispatchPerson() {
        Person p = (Person) espera.getFrente();
        p.closeTime();
        cantpersonas++;
        averageTime = averageTime +p.getTime();
        return p;
    }

}
