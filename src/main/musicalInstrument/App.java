package main.musicalInstrument;

import main.musicalInstrument.keyboard.Piano;
import main.musicalInstrument.keyboard.PipeOrgan;
import main.musicalInstrument.stringed.Harp;
import main.musicalInstrument.stringed.Violin;

public class App {

    public static void main(String[] args) {

        IMusicalInstrument musicalInstruments[] = new IMusicalInstrument[4];

        musicalInstruments[0] = new Piano();
        musicalInstruments[1] = new Violin();
        musicalInstruments[2] = new PipeOrgan();
        musicalInstruments[3] = new Harp();

        for (IMusicalInstrument musicalInstrument : musicalInstruments) {

            if (musicalInstrument instanceof Piano) {
                musicalInstrument.play(); // using overrided method in the Piano class
                ((Piano) musicalInstrument).play("Press Keys", "Push the treadle"); // using overloaded method in the Piano class
                ((Piano) musicalInstrument).pushOnTreadle(true); //using specific method in the Piano class
                ((Piano) musicalInstrument).setUp(true); //  using overloaded method in the Piano class
                musicalInstrument.cleanUp(); // go to method in parent class KeyboardInstrument

            } else if (musicalInstrument instanceof Violin) {
                musicalInstrument.play(); // using overrided method in the Violin class
                musicalInstrument.cleanUp(); // go to method in parent class StringedInstrument
                musicalInstrument.setUp(); //go to method in parent class StringedInstrument

            } else if (musicalInstrument instanceof PipeOrgan) {
                musicalInstrument.cleanUp(); // using overrided method in the PipeOrgan class
                ((PipeOrgan) musicalInstrument).useFootKeyboard(true); //using specific method in the PipeOrgan class
                ((PipeOrgan) musicalInstrument).play("pressKeys", 9); // using overloaded method
                musicalInstrument.cleanUp(); // using overrided method in the PipeOrgan class
                System.out.println(((PipeOrgan) musicalInstrument).getFootKeyboardUsing()); // Getter of the private variable in the PipeOrgan class

            } else if (musicalInstrument instanceof Harp) {
                ((Harp) musicalInstrument).electronicHarp(false); // using specific method of the Harp class
                musicalInstrument.cleanUp(); // using overrided method of the Harp class
                ((Harp) musicalInstrument).play("plunk", 12); // using overloaded method
                musicalInstrument.setUp(); // using overrided method of the Harp class
            }
        }

    }
}