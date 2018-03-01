package musicalInstruments.Keyboards;

public class PipeOrgan extends KeyboardInstrument {
    private boolean FootKeyboardUsing;

    @Override
    public String play() {
        return "Pam - Pam - Pam - Pam";
    }

    public String play(String customAction, int value) {
        String temp = null;
        for (int i = 0; i < value; i++) {
            temp += customAction;
        }
        return customAction = temp;
    }

    public void useFootKeyboard(boolean value) {
        FootKeyboardUsing = value;
    }

    @Override
    public String cleanUp() {
        return "Now Pipe Organ is cleaned up";
    }

    @Override
    public String setUp() {
        return "Pipe organ is set uo";
    }

    public boolean getFootKeyboardUsing() {
        return FootKeyboardUsing;
    }

    public void setFootKeyboardUsing(boolean footKeyboardUsing) {
        FootKeyboardUsing = footKeyboardUsing;
    }
}
