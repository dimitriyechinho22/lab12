import jdk.internal.icu.lang.UCharacterDirection;
import org.testng.annotations.Test;
import task1.Handler20;
import task1.Handler5;
import task1.Handler50;
import org.junit.jupiter.api.Assertions;


public class ATMtest {

    Handler50 handler50 = new Handler50();
    Handler20 handler20 = new Handler20();
    Handler5 handler5 = new Handler5();
    private UCharacterDirection outContent;

    public ATMtest(UCharacterDirection outContent) {
        this.outContent = outContent;
    }

    @Test
    public void IllegalArgumentTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {handler50.process(126);});
    }

    @Test
    public void Handler50Test() {
        handler50.process(100);
        Assertions.assertEquals("2 * 50", outContent.toString().strip());
    }

    @Test
    public void Handler20Test() {
        handler20.process(100);
        Assertions.assertEquals("5 * 20", outContent.toString().strip());
    }

    @Test
    public void Handler5Test() {
        handler5.process(100);
        Assertions.assertEquals("20 * 5", outContent.toString().strip());
    }
}
