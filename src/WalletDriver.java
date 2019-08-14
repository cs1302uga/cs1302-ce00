public class WalletDriver {

    private static boolean testConstructor1() {
        Wallet wallet = new Wallet(null);
        printResult(wallet.getTotalValue() == 0, "testConstructor1");
    } // testConstructor1

    private static boolean testConstructor2() {
        Money[] monies = new Money[10];
        monies[0] = new Money(10, 25);
        monies[1] = new Money(1, 25);
        monies[2] = new Money(2, 25);
        monies[4] = new Money(3, 26);
        
        Wallet wallet = new Wallet(monies);
        printResult(wallet.getTotalValue() == 17.01, "testConstructor2");
    } // testConstructor2

    private static boolean testAddMoney1() {
        Wallet wallet = new Wallet(null);
        wallet.addMoney(new Money(3.25));

        printResult(wallet.getTotalValue() == 3.25, "testAddMoney1");
    } // testAddMoney1

    private static boolean testAddMoney2() {
        Money[] monies = new Money[1];
        monies[0] = new Money(3, 25);

        Wallet wallet = new Wallet(monies);
        wallet.addMoney(new Money(3.25));

        printResult(wallet.getTotalValue() == 6.50, "testAddMoney2");
    } // testAddMoney2
    
    private static boolean testConstructor3() {
        Money[] monies = new Money[2];
        monies[0] = new Money(5, 10);
        Wallet wallet = new Wallet(monies);   
        wallet.addMoney(new Money(2, 25));
        wallet.addMoney(new Money(3, 10));

        printResult(wallet.getTotalValue() == 10.45, "testConstructor3");
    } // testConstructor3
    
    private static void printResult(boolean test, String method) {
        if(test) {
            System.out.println("PASS: " + method);
        } else {
            System.out.println("FAIL: " + method);
        } // if
    } // printResult


    /**
     * Entry point into the application.
     * @param args  the command-line arguments
     */
    public static void main(String[] args) {

    } // main

} // WalletDriver
