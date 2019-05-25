package kz.epam.taskone;
import java.lang.Math;

public class RealisticPerson extends  ImaginePerson {

    private int age = 0;

    public void setAge(int age) {
        this.age = age;
    }

    public  String birthedChildren(){
        String Sex = "Can't Birth";
        if (age > 18){
            if (((int) (Math.random()*2)) == 1){
                Sex = "Male";
            }
            else {
                Sex = "Female";
            }
        }

        return Sex;
    }

}
