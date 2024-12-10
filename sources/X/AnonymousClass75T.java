package X;

import android.media.MediaPlayer;

/* renamed from: X.75T  reason: invalid class name */
public class AnonymousClass75T implements MediaPlayer.OnPreparedListener {
    public final int A00;

    public AnonymousClass75T(int i) {
        this.A00 = i;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (this.A00 != 0) {
            C18070vi.A0d(mediaPlayer, 0);
            mediaPlayer.setLooping(true);
            mediaPlayer.setVolume(0.0f, 0.0f);
            return;
        }
        mediaPlayer.setLooping(true);
    }
}
