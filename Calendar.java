
import java.util.ArrayList;
import java.util.List;

public class Calendar<K> {
    
    private List<K> days = new ArrayList<>();
    

    public Calendar(List<K> days) {
        this.days = days;
    }

    public void AddDay(K someDay) {
        days.add(someDay);
    }

    public void RemoveDay(K someDay) {
        days.remove(someDay);
    }

}
