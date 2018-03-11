package test.stringedTest;

import main.musicalInstrument.stringed.Violin;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ViolinTest {

    private Violin violin;

    @Before
    public void setUp() {
        violin = new Violin();
    }

    @Test
    public void checkViolinOverriddenPlayMethodReturnsExpectedString() {
        assertEquals("Dzin - Dzin - Dzin - Dzin", violin.play());
    }

    @Test
    public void checkViolinSuperSetUpMethodReturnsExpectedString() {
        assertEquals("Tuned stringed instrument", violin.setUp());
    }

    @Test
    public void checkViolinSuperCleanUpMethodReturnsExpectedString() {
        assertEquals("Cleaned up stringed instrument", violin.cleanUp());
    }
}
