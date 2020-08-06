/**
 * Represents a container for {@link Money} objects. A {@code Wallet} object
 * can contain any number of {@code Money} references.
 */
public class Wallet {

    // Declare an array reference for all of the Money object references
    private Money[] monies;

    /**
     * Makes a copy of the array referenced by the formal parameter and
     * assigns the copy to the instance variable of the class. If the array
     * parameter contains empty (null) values, those values should not be
     * copied. In other words, it is entirely possible for the instance
     * variable to reference a smaller array than the parameter. The instance
     * variable could even reference an array of size 0 if all values of the
     * parameter are null.
     *
     * If the parameter reference is null, the instance variable
     * should be assigned to a new Money array of size 0. Note: this is different
     * from a non-null reference which contains nulls.
     *
     * @param m A reference to an array containing references to {@link Money}
     * objects.
     */
    public Wallet(Money[] m) {

    } // Wallet Constructor

    /**
     * The default constructor for the {@code Wallet} class.
     * This constructor calls the one-parameter constructor and passes in null.
     * No more than one line of code should be written in the method body.
     */
    public Wallet() {

    } // Wallet Constructor

    /**
     * Calculates the total value of all {@link Money} objects refereced by this
     * {@code Wallet}. The value of a single {@link Money} is computed with the
     * formula (dollars + cents/100). You can
     * assume that cents will be between 0 and 99 (inclusive). If the wallet
     * contains no references to {@link Money} objects, this method returns 0.0.
     *
     * @return a double representing the sum of the values for all monies
     */
    public double getTotalValue() {
        //Return statement for compilation. Proper implementation needed.
        return 0.0;
    } // getTotalValue

    /**
     * Adds the specified {@link Money} object to the Wallet. If the {@code Wallet}
     * is full, the size of the internal array storing the monies should double in
     * size to hold the new reference. If the internal array size is zero, then the
     * new array size should be 2. If the parameter is null, this method simply
     * does nothing.
     *
     * @param m A {@link Money} reference to be added to the Wallet.
     */
    public void addMoney(Money m) {

    } // addMoney

} // Wallet
