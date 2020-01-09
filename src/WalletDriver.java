public class WalletDriver {

    /**
     * Used to indicate that a test has passed.
     * @param testName     name of the test to pass
     */
    private static void pass(String testName) {
        System.out.printf("PASS: %s\n", testName);
    } // pass

    /**
     * Used to indicate that a test has failed.
     * @param testName     name of the test to fail
     */
    private static void fail(String testName) {
        System.out.printf("FAIL: %s\n", testName);
    } // fail

    /**
     * Assert that the test passes when {@code expr == false} and fails otherwise.
     * @param testName  name of the test
     * @param expr      expression to test
     */
    private static void assertFalse(String testName, boolean expr) {
        if (expr) {
            fail(testName);
        } else {
            pass(testName);
        } // if
    } // assertFalse

    /**
     * Assert that the test passes when {@code expr == true} and fails otherwise.
     * @param testName  name of the test
     * @param expr      expression to test
     */
    private static void assertTrue(String testName, boolean expr) {
        if (expr) {
            pass(testName);
        } else {
            fail(testName);
        } // if
    } // assertTrue

    /**
     * Assert that the test passes when {@code Math.abs(d1 - d2) < tolerance} and fails otherwise.
     * @param testName  name of the test
     * @param d1        first double
     * @param d2        second double
     */
    private static void assertDoubleEquals(String testName, Double d1, Double d2,
                                           double tolerance) {
        if (Math.abs(d1 - d2) < tolerance) {
            pass(testName);
        } else {
            fail(testName);
        } // if
    } // assertDoubleEquals

    private static void testConstructor0() {
        Wallet wallet = new Wallet(null);
        assertDoubleEquals("testConstructor0", wallet.getTotalValue(), 0.0, 0.01);
    } // testConstructor1

    private static void testConstructor1() {
        Wallet wallet = new Wallet();
        assertDoubleEquals("testConstructor1", wallet.getTotalValue(), 0.0, 0.01);
    } // testConstructor1

    private static void testConstructor2() {
        Money[] monies = new Money[10];
        monies[0] = new Money(10, 25);
        monies[1] = new Money(1, 25);
        monies[2] = new Money(2, 25);
        monies[4] = new Money(3, 26);
        Wallet wallet = new Wallet(monies);
        assertDoubleEquals("testConstructor2", wallet.getTotalValue(), 17.01, 0.01);
    } // testConstructor2

    private static void testConstructor3() {
        Money[] monies = new Money[2];
        monies[0] = new Money(5, 10);
        Wallet wallet = new Wallet(monies);
        wallet.addMoney(new Money(5, 10));
        wallet.addMoney(new Money(5, 10));
        assertDoubleEquals("testConstructor3", wallet.getTotalValue(), 15.30, 0.01);
    } // testConstructor3

    private static void testConstructor4() {
        Money[] monies = new Money[2];
        monies[0] = new Money(5, 10);
        Wallet wallet = new Wallet(monies);
        wallet.addMoney(new Money(5, 10));
        wallet.addMoney(new Money(5, 10));

	// Changing the monies array after creating the wallet, should not change the total value of the wallet
	monies[1] = new Money(5, 10);
        assertDoubleEquals("testConstructor4", wallet.getTotalValue(), 15.30, 0.01);
    } // testConstructor3

    private static void testAddMoney0() {
        Wallet wallet = new Wallet(null);
        wallet.addMoney(null);
        assertDoubleEquals("testAddMoney0", wallet.getTotalValue(), 0.0, 0.01);
    } // testAddMoney0

    private static void testAddMoney1() {
        Wallet wallet = new Wallet();
        wallet.addMoney(null);
        assertDoubleEquals("testAddMoney1", wallet.getTotalValue(), 0.0, 0.01);
    } // testAddMoney1

    private static void testAddMoney2() {
        Money[] monies = new Money[] { new Money(5, 10) };
        Wallet wallet = new Wallet(monies);
        wallet.addMoney(null);
        assertDoubleEquals("testAddMoney2", wallet.getTotalValue(), 5.10, 0.01);
    } // testAddMoney2

    private static void testAddMoney3() {
        Wallet wallet = new Wallet(null);
        wallet.addMoney(new Money(10, 10));
        assertDoubleEquals("testAddMoney3", wallet.getTotalValue(), 10.10, 0.01);
    } // testAddMoney3

    private static void testAddMoney4() {
        Wallet wallet = new Wallet();
        wallet.addMoney(new Money(10, 10));
        assertDoubleEquals("testAddMoney4", wallet.getTotalValue(), 10.10, 0.01);
    } // testAddMoney4

    private static void testAddMoney5() {
        Money[] monies = new Money[] { new Money(5, 10) };
        Wallet wallet = new Wallet(monies);
        wallet.addMoney(new Money(10, 10));
        assertDoubleEquals("testAddMoney5", wallet.getTotalValue(), 15.20, 0.01);
    } // testAddMoney5

    private static void testAddMoney6() {
        Wallet wallet = new Wallet(null);
        wallet.addMoney(new Money(10, 10));
        wallet.addMoney(new Money(10, 10));
        assertDoubleEquals("testAddMoney6", wallet.getTotalValue(), 20.20, 0.01);
    } // testAddMoney6

    private static void testAddMoney7() {
        Wallet wallet = new Wallet();
        wallet.addMoney(new Money(10, 10));
        wallet.addMoney(new Money(10, 10));
        assertDoubleEquals("testAddMoney7", wallet.getTotalValue(), 20.20, 0.01);
    } // testAddMoney7

    private static void testAddMoney8() {
        Money[] monies = new Money[] { new Money(5, 10) };
        Wallet wallet = new Wallet(monies);
        wallet.addMoney(new Money(10, 10));
        wallet.addMoney(new Money(10, 10));
        assertDoubleEquals("testAddMoney8", wallet.getTotalValue(), 25.30, 0.01);
    } // testAddMoney8

    /**
     * Entry point into the application.
     * @param args  the command-line arguments
     */
    public static void main(String[] args) {
        testConstructor0();
        testConstructor1();
        testConstructor2();
        testConstructor3();
        testConstructor4();
        testAddMoney0();
        testAddMoney1();
        testAddMoney2();
        testAddMoney3();
        testAddMoney4();
        testAddMoney5();
        testAddMoney6();
        testAddMoney7();
        testAddMoney8();
    } // main

} // WalletDriver
