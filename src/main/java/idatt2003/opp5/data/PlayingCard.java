package idatt2003.opp5.data;

public class PlayingCard {
    private String type;
    private int number;

    PlayingCard(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    @Override
    public String toString() {
        return type + number;
    }
}
