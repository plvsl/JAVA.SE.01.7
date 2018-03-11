package main.musicalInstrument.stringed;

import main.musicalInstrument.IMusicalInstrument;

public abstract class StringedInstrument implements IMusicalInstrument {

    String basicAction = "Plunk";

    public String play() {
        return basicAction + basicAction + basicAction + basicAction;
    }

    public String setUp() {
        return "Tuned stringed instrument";
    }

    public String cleanUp() {
        return "Cleaned up stringed instrument";
    }

}
