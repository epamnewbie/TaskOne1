package kz.epam.taskone;
import java.lang.Math;

public class Robot extends SciFiPerson {

    private int version = (int) (Math.random()*10000);

    public Robot(){
        setName("T");
    }

    public Robot(String NewName){
        setName(NewName);
    }

    public String getRobotVersion(){
        return getName() + version;
    }

    public void newVersion(){
        version = (int) (Math.random()*10000);
    }
}
