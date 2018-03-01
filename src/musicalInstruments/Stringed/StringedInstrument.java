package musicalInstruments.Stringed;

import musicalInstruments.IMusicalInstrument;

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
