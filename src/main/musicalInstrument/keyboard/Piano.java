package main.musicalInstrument.keyboard;

public class Piano extends KeyboardInstrument {
    private boolean treadleIsPushed;

    @Override
    public String play() {
        return "La - la - la - la";
    }

    public String play(String customAction1, String customAction2) {
        return customAction1 + customAction2 + customAction1 + customAction2;
    }

    public String play(String customAction, int value) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < value; i++) {
            temp.append(customAction);
        }
        return temp.toString();
    }

    public String setUp(boolean possibilityOfSettingUp) {
        if (possibilityOfSettingUp) {
            return "Now Piano is set up";
        }
        else {
            return "Piano is broken and can not be configured";
        }
    }

    public boolean isTreadleIsPushed() {
        return treadleIsPushed;
    }

    public void pushOnTreadle(boolean value) {
        treadleIsPushed = value;
    }
}
