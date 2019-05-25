import kz.epam.taskone.*;


public class Main {

    public static void main(String[] args) {

        Detective Detective = new Detective();
        Killer Killer = new Killer();
        Robot Robot = new Robot();
        SithPerson Sith = new SithPerson();
        StarkFamily Stark = new StarkFamily();
        TargaryenFamily Targaryen = new TargaryenFamily();

        Detective.setName("Sherlok Holmes");
        Detective.setAge(42);
        System.out.println("New Detective Called: " + Detective.getName());
        System.out.println("His Trick:");
        Detective.sortEvidences();
        System.out.println("Detectives can give birth for child: ");
        System.out.println("And child gender is: "+ Detective.birthedChildren());
        System.out.println("Another realistic person is Killer, and he can drink Milk");
        Killer.todayDeal("Drink Milk");
        System.out.println("Next Part Fantasy Persons");
        System.out.println("IDK Why but they are all from GOT");
        if (Stark.isHeadLost()){
            System.out.println("For example this Stark have no Head");
        }
        else{
            System.out.println("For example this Stark have Head");
        }
        System.out.println("What else they can do? They have mane, lets give some for spell to Stark");
        Stark.setMana((byte) 80);
        System.out.println("Let's cast FusRoDah spell!");
        System.out.println(Stark.castSpell((byte) 10, "FusRoDah!"));;
        System.out.println("Fantastic!");
        System.out.println("Let's check opportunities Targaryen Family: ");

        System.out.println("New title for Dany will be " + Targaryen.extendTitle("Brownish"));
        System.out.println("Almost Done, now we will see SciFi Persons");
        System.out.println("Say Hello, our new robot " + Robot.getRobotVersion());
        System.out.println("Let's put some stuff in his back");

        System.out.println("Now he have: " + Robot.putInBag("Item", "Needle From GOT"));
        System.out.println("And the last one, Sith! Gain you'r power!");
        for (int i = 0; i < 8800555; i++){
            Sith.incrementMadness();
        }
        System.out.println("Now Sith's madnes equals crazy " + Sith.getMadness() + " Points!!1!");


        }
}
