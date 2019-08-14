public class WalletDriver {

    private boolean testConstructor1() {
	Wallet wallet = new Wallet(null);
	return wallet.getTotalValue() == 0;
    } // testConstructor1

    /**
     * Entry point into the application.
     * @param args  the command-line arguments
     */
    public static void main(String[] args) {

    } // main

} // WalletDriver
