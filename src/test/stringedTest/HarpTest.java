package test.stringedTest;

import main.musicalInstrument.stringed.Harp;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HarpTest {

    private Harp harp;

    @Before
    public void setUp() {
        harp = new Harp();
    }

    @Test
    public void checkHarpOverriddenMethodPlayWithoutArgsReturnsExpectedString() {
        assertEquals("Dzin - Dzin - Dzin - Dzin", harp.play());
    }

    @Test
    public void checkHarpOverloadedMethodPlayStringIntReturnsExpectedString() {
        assertEquals("PlunkPlunkPlunkPlunk", harp.play("Plunk", 4));
    }

    @Test
    public void checkHarpOverriddenSetUpMethodReturnsExpectedString() {
        assertEquals("Harp is set up", harp.setUp());
    }

    @Test
    public void checkHarpOverriddenCleanUpMethodReturnsExpectedString() {
        assertEquals("Now Harp is cleaned up", harp.cleanUp());
    }

    @Test
    public void checkHarpElectronicHarpMethodSetsTrueValueIntoVariable() {
        harp.electronicHarp(true);
        assertEquals(true, harp.isElectronicPickups());
    }

    @Test
    public void checkHarpElectronicHarpMethodSetsFalseValueIntoVariable() {
        harp.electronicHarp(false);
        assertEquals(false, harp.isElectronicPickups());
    }
}
