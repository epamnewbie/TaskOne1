package kz.epam.taskone;

import java.util.Arrays;

public class Detective extends RealisticPerson {

    private String evidences[] = {"Socks", "Prints", "Hair"};


    public void sortEvidences(){
        Arrays.sort(evidences);
        for(int i = 0; i < 3; i++){
            System.out.println(evidences[i]);
        }
    }
}
