package test.keyboardTest;

import main.musicalInstrument.keyboard.Piano;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {
    private Piano piano;

    @Before
    public void setUp() {
        piano = new Piano();
    }

    @Test
    public void checkPianoOverriddenMethodPlayWithoutArgsReturnsExpectedString() {
        assertEquals("La - la - la - la", piano.play());
    }

    @Test
    public void checkPianoOverloadedStringStringMethodPlayReturnsExpectedString() {
        assertEquals("Press KeysPush the treadlePress KeysPush the treadle", piano.play("Press Keys", "Push the treadle"));
    }

    @Test
    public void checkPianoOverloadedStringIntMethodPlayReturnsExpectedString() {
        assertEquals("Press KeysPress KeysPress KeysPress KeysPress Keys", piano.play("Press Keys", 5));
    }

    @Test
    public void checkPianoSetUpMethodReturnsExpectedStringForTrueArgument() {
        assertEquals("Now Piano is set up", piano.setUp(true));
    }

    @Test
    public void checkPianoSetUpMethodReturnsExpectedStringForFalseArgument() {
        assertEquals("Piano is broken and can not be configured", piano.setUp(false));
    }

    @Test
    public void checkPianoSuperSetUpMethodReturnsExpectedString() {
        assertEquals("Tuned keyboard instrument", piano.setUp());
    }

    @Test
    public void checkPianoPushOnTreadleMethodSetsTrueValueIntoVariable() {
        piano.pushOnTreadle(true);
        assertEquals(true, piano.isTreadleIsPushed());
    }

    @Test
    public void checkPianoPushOnTreadleMethodSetsFalseValueIntoVariable() {
        piano.pushOnTreadle(false);
        assertEquals(false, piano.isTreadleIsPushed());
    }

    @Test
    public void checkPianoSuperCleanUpMethodReturnsExpectedString() {
        assertEquals("Cleaned up keyboard instrument", piano.cleanUp());
    }
}
