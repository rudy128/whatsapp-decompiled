package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.CeY  reason: case insensitive filesystem */
public abstract class C25373CeY {
    public static final AudioAttributes A00 = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int A00(int i, int i2) {
        int i3 = 8;
        while (!AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(Util.A00(i3)).build(), A00)) {
            i3--;
            if (i3 <= 0) {
                return 0;
            }
        }
        return i3;
    }
}
