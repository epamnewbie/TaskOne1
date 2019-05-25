package kz.epam.taskone;

public class TargaryenFamily extends FantasyPerson {
    private String Title = "";

    public TargaryenFamily(){
        setName("Daenerys Targaryen");
    }

    public TargaryenFamily(String NewName){
        setName(NewName + " Targaryen");
    }

    public String extendTitle(String NewTitle){
        Title += " " + NewTitle;
        return this.getName() + " " + NewTitle;
    }
}
