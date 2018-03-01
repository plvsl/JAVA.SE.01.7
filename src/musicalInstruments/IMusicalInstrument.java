package musicalInstruments;

public interface IMusicalInstrument {

    public String owner = null;
    public String basicAction = null;

    public abstract String play();

    public abstract String setUp();

    public abstract String cleanUp();

}
