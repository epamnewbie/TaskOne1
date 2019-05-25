package kz.epam.taskone;

public class Killer extends RealisticPerson {
    private byte accuracy = 0;

    public void todayDeal(String Deal){
        if(Deal.equals("Drink Vodka")){
            accuracy -= 10;
        }
        else if (Deal.equals("Drink Milk")){
            accuracy +=10;
        }
        if(accuracy < 0){
            accuracy = 0;
        }
        else if (accuracy > 100){
            accuracy = 100;
        }
        System.out.println("Today Accuracy is " + accuracy + "%");
    }
}
