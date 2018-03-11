package test.keyboardTest;

import main.musicalInstrument.keyboard.PipeOrgan;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PipeOrganTest {

    private PipeOrgan pipeOrgan;

    @Before
    public void SetUp() {
        pipeOrgan = new PipeOrgan();
    }

    @Test
    public void checkPipeOrganOverriddenPlayMethodReturnsExpectedString() {
        assertEquals("Pam - Pam - Pam - Pam", pipeOrgan.play());
    }

    @Test
    public void checkPipeOrganOverloadedMethodPlayReturnsExpectedString() {
        assertEquals("Press KeysPress KeysPress KeysPress KeysPress KeysPress KeysPress Keys", pipeOrgan.play("Press Keys", 7));
    }

    @Test
    public void checkPipeOrganOverriddenCleanUpMethodReturnsExpectedString() {
        assertEquals("Now Pipe Organ is cleaned up", pipeOrgan.cleanUp());

    }

    @Test
    public void checkPipeOrganOverriddenSetUpMethodReturnsExpectedString() {
        assertEquals("Pipe organ is set up", pipeOrgan.setUp());
    }

    @Test
    public void checkPipeOrganUseFootKeyboardMethodSetsTrueValueIntoVariable() {
        pipeOrgan.useFootKeyboard(true);
        assertEquals(true, pipeOrgan.getFootKeyboardUsing());
    }

    @Test
    public void checkPipeOrganUseFootKeyboardMethodSetsFalseValueIntoVariable() {
        pipeOrgan.useFootKeyboard(false);
        assertEquals(false, pipeOrgan.getFootKeyboardUsing());
    }

}
