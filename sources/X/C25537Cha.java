package X;

import android.media.AudioTrack;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cha  reason: case insensitive filesystem */
public class C25537Cha {
    public static final long A02 = TimeUnit.SECONDS.toMicros(1);
    public final long A00;
    public final AudioTrack A01;

    public C25537Cha(AudioTrack audioTrack) {
        this.A01 = audioTrack;
        this.A00 = (long) audioTrack.getSampleRate();
    }
}
