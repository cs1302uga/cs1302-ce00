package cs1302.ce00;

/**
 * Represents a unit of currency. Each {@code Money} object contains fields for dollars and cents
 * which can be accessed via their respective getter methods.
 */
public class Money {
    private int dollars;
    private int cents;

    /**
     * Constructs a new {@code Money} object using the user-specified
     * values for dollars and cents. If dollars is negative, a default
     * value of 0 will be assigned. If cents is less than 0 or greater 
     * than 99, a default value of 0 will be assigned.
     *
     * @param dollars the number of dollars for this {@code Money} object.
     * @param cents the number of cents for this {@code Money} object.
     */
    public Money(int dollars, int cents) {
        if (dollars > 0) {
            this.dollars = dollars;
        } else {
            this.dollars = 0;
        } // if

        if (cents > 0 && cents < 100) {
            this.cents = cents;
        } else {
            this.cents = 0;
        } // if
            
    } // Money Constructor

    /**
     * Returns the dollars for this {@code Money} object.
     * @return dollars
     */
    public int getDollars() {
        return this.dollars;
    } // getDollars

    /**
     * Returns the cents for this {@code Money} object.
     * @return cents
     */
    public int getCents() {
        return this.cents;
    } // getCents

} // Money
