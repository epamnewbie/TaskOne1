package kz.epam.taskone;

public class ImaginePerson {
    private String Name = "";
    private boolean alive = true;

    public void killPerson(){
        alive = false;
    }

    public void ressurectPerson(){
        alive = true;
    }

    public boolean isAlive(){
        return alive;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

