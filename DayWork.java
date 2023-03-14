

import java.util.ArrayList;
import java.util.List;

public class DayWork<T extends Aim>{
     private List<T> aims = new ArrayList<>();

     public DayWork(List<T> aims) {      
        this.aims = aims;
     }
    
    public void addAim(T someAim) {
        aims.add(someAim);
    }

    public void removeAim(Aim someAim) {
        aims.remove(someAim);
    }

    @Override
    public String toString() {
        return "в планах: " + aims ;
    }
    
   
    
    
//      public DayWork(String date, List<Aim> aims) {
//         this.date = date;
//         this.aims = aims;
//     }


//     public String getDate() {
//         return date;
//     }

//     public void setDate(String date) {
//         this.date = date;
//     }




}
