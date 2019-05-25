package kz.epam.taskone;

public class StarkFamily extends FantasyPerson {
    private boolean head = true;

    public boolean isHeadLost(){
        if (!head){
            this.killPerson();
        }
        return !head;
    }
}
