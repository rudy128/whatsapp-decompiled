package X;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

public final class CSE {
    public long A00;
    public long A01;
    public long A02;
    public final AudioTimestamp A03 = new AudioTimestamp();
    public final AudioTrack A04;

    public CSE(AudioTrack audioTrack) {
        this.A04 = audioTrack;
    }
}
