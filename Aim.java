
public class Aim {
    
    int duration;
    String deadline;
    String subject;
    String responsible;

    public Aim(int duration, String deadline, String subject, String responsible) {
        this.duration = duration;
        this.deadline = deadline;
        this.subject = subject;
        this.responsible = responsible;
        
    }

    @Override
    public String toString() {
        return subject + ": время на выполнение - " + duration + " часа" + 
        ", крайний срок - " + deadline + 
        ", ответственный - " + responsible;
    }

    
}
 
