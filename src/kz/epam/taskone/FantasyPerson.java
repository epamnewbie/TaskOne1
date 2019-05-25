package kz.epam.taskone;

public class FantasyPerson extends ImaginePerson {
    private byte mana = 0;

    public byte getMana() {
        return mana;
    }

    public void setMana(byte mana) {
        if (mana < 100){
            this.mana = 100;
        }
        if (mana < 0 ){
            this.mana = 0;
        }
        this.mana = mana;
    }

    public String castSpell(byte manacost, String NameOfSpell){

        String returnedMessage;

        if (manacost > mana){
            returnedMessage = "Oops Spell " + NameOfSpell + " is not casted";
        }
        else {
            mana -= manacost;
            returnedMessage = "Spell " + NameOfSpell + " casted used " + manacost + " of mana points.";
        }

        return  returnedMessage;

    }

}