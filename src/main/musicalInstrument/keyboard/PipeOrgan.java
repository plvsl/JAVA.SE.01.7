package main.musicalInstrument.keyboard;

public class PipeOrgan extends KeyboardInstrument {
    private boolean footKeyboardUsing;

    @Override
    public String play() {
        return "Pam - Pam - Pam - Pam";
    }

    public String play(String customAction, int value) {
        String temp = "";
        for (int i = 0; i < value; i++) {
            temp += customAction;
        }
        return customAction = temp;
    }

    @Override
    public String cleanUp() {
        return "Now Pipe Organ is cleaned up";
    }

    @Override
    public String setUp() {
        return "Pipe organ is set up";
    }

    public boolean getFootKeyboardUsing() {
        return footKeyboardUsing;
    }

    public void useFootKeyboard(boolean value) {
        footKeyboardUsing = value;
    }
}
