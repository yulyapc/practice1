package open.close.adapters;

import open.close.interfaces.Instrument;
import open.close.Guitar;

public class GuitarAdapter implements Instrument {
    private final Guitar guitar;

    public GuitarAdapter(Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public void playNotes(int n) {
        for (int i = 0; i < n; i++) {
            guitar.play();
        }
    }
}