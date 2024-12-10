package X;

import android.media.MediaPlayer;

/* renamed from: X.75R  reason: invalid class name */
public class AnonymousClass75R implements MediaPlayer.OnErrorListener {
    public final int A00;

    public AnonymousClass75R(int i) {
        this.A00 = i;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.A00 != 0) {
            return false;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaViewFragment/prepareAudioPlayback/error: what:");
        A10.append(i);
        C17900vP.A0i("  extra:", A10, i2);
        return false;
    }
}
