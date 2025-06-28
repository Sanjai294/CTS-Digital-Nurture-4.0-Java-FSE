package exercise4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
        account.deposit(1000);
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(200);
        assertEquals(800, account.getBalance());
    }

    @AfterEach
    void tearDown() {
        account = null;
    }
}
