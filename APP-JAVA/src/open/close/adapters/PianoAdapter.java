package open.close.adapters;

import open.close.Instrument;
import open.close.instruments.Piano;

public class PianoAdapter implements Instrument {
    private final Piano piano;

    public PianoAdapter(Piano piano) {
        this.piano = piano;
    }

    @Override
    public void playNotes(int n) {
        for (int i = 0; i < n; i++) {
            piano.play();
        }
    }
}
