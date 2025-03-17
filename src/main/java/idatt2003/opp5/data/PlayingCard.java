package idatt2003.opp5.data;

public class PlayingCard {
    private String type;
    private int number;

    PlayingCard(String type, int number) {
        this.type = type;
        this.number = number;
    }

    /**
     *  Returns number of card.
     *
     * @return number int
     */
    public int getNumber() {
        return number;
    }

    /**
     * Returns the type.
     * 
     * @return type string
     */
    public String getType() {
        return type;
    }

    /**
     *  Sets new type.
     * 
     * @param newType new type String
     */
    public void setType(String newType) {
        this.type = newType;
    }

    /**
     *  Set new number.
     * 
     * @param newNumber number value
     */
    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    @Override
    public String toString() {
        return type + number;
    }
}
