package main.musicalInstrument.keyboard;

import main.musicalInstrument.IMusicalInstrument;

public abstract class KeyboardInstrument implements IMusicalInstrument {

    String basicAction = "Press keys";

    public String play() {
        return basicAction + basicAction + basicAction;
    }

    public String setUp() {
        return "Tuned keyboard instrument";
    }

    public String cleanUp() {
        return "Cleaned up keyboard instrument";
    }
}