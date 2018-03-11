package main.musicalInstrument.stringed;

public class Harp extends StringedInstrument {
    private boolean electronicPickups;

    @Override
    public String play() {
        return "Dzin - Dzin - Dzin - Dzin";
    }

    public String play(String customAction, int value) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < value; i++) {
            temp.append(customAction);
        }
        return temp.toString();
    }

    @Override
    public String setUp() {
        return "Harp is set up";
    }

    @Override
    public String cleanUp() {
        return "Now Harp is cleaned up";
    }

    public void electronicHarp(boolean value) {
        electronicPickups = value;
    }

    public boolean isElectronicPickups() {
        return electronicPickups;
    }
}