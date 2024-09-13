package open.close.adapters;

import open.close.interfaces.Instrument;
import open.close.Drum;

public class DrumAdapter implements Instrument {
    private final Drum drum;

    public DrumAdapter(Drum drum) {
        this.drum = drum;
    }

    @Override
    public void playNotes(int n) {
        for (int i = 0; i < n; i++) {
            drum.play();
        }
    }
}
