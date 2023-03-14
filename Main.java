
import java.util.ArrayList;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        AimKind1 aim1 = new AimKind1(3, "16:00", "Сделать это", "Пупкин");
        AimKind2 aim2 = new AimKind2(2, "20:30", "Сделать то", "Пупыркин");
        AimKind1 aim3 = new AimKind1(2, "10:15", "Сделать другое", "Пупсов");
        AimKind2 aim4 = new AimKind2(4, "21:40", "Сделать третье", "Пупочкин");


        DayWork<AimKind1> monday = new DayWork(new ArrayList());
        monday.addAim(aim1);
        monday.addAim(aim3);

        DayWork<AimKind2> tuesday = new DayWork(new ArrayList());
        tuesday.addAim(aim2);
        // monday.addAim(aim4);

        System.out.println("На понедельник " + monday);
        System.out.println("На вторник " + tuesday);

        // Calendar calendar = new Calendar(new ArrayList<>());
        // calendar.AddDay(monday);
        // calendar.AddDay(tuesday);

    }
}
