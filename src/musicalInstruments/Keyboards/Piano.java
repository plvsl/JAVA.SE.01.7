package musicalInstruments.Keyboards;

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
        String temp = null;
        for (int i = 0; i < value; i++) {
            temp += customAction;
        }
        return customAction = temp;
    }

    public void pushOnTreadle(boolean value) {
        treadleIsPushed = value;
    }

    public void setUp(boolean possibilityOfSettingUp) {
        if (possibilityOfSettingUp) {
            System.out.println("Now Piano is set up");
        }
        if (!possibilityOfSettingUp) {
            System.out.println("Piano is broken and can not be configured");
        }
    }


    public boolean isTreadleIsPushed() {
        return treadleIsPushed;
    }

    public void setTreadleIsPushed(boolean treadleIsPushed) {
        this.treadleIsPushed = treadleIsPushed;
    }
}
