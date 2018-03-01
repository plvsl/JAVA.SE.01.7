package musicalInstruments.Stringed;

public class Harp extends StringedInstrument {
    private boolean electronicPickups;

    @Override
    public String play() {
        return "Dzin - Dzin - Dzin - Dzin";
    }

    public String play(String customAction, int value) {
        String temp = null;
        for (int i = 0; i < value; i++) {
            temp += customAction;
        }
        return customAction = temp;
    }

    public void electronicHarp(boolean value) {
        electronicPickups = value;
    }

    @Override
    public String setUp() {
        return "Harp is set up";
    }

    @Override
    public String cleanUp() {
        return "Now Harp is cleaned up";
    }



}