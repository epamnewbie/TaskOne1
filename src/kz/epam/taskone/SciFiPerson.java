package kz.epam.taskone;

public class SciFiPerson extends ImaginePerson {
    private String inventory = "Pocket";

    public String putInBag (String Request, String Item){
        if (Request.equals("Item")) {
            inventory += ", " + Item;
        }
        return inventory;
    }
}
