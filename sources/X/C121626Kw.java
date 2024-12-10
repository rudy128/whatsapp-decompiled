package X;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.6Kw  reason: invalid class name and case insensitive filesystem */
public final class C121626Kw extends AnonymousClass70T {
    public AnonymousClass88K A00;
    public final MediaPlayer A01;
    public final Handler A02;

    public boolean A0D(AnonymousClass190 r7, float f) {
        try {
            MediaPlayer mediaPlayer = this.A01;
            PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
            playbackParams.allowDefaults();
            if (C108945cZ.A00(playbackParams.getSpeed(), f) >= 0.1f) {
                mediaPlayer.setPlaybackParams(playbackParams.setSpeed(f));
            }
            return true;
        } catch (IllegalArgumentException | IllegalStateException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("audioplayer/setPlaybackSpeed failed: currSpeed: ");
            A10.append(-1.0f);
            A10.append(" newSpeed: ");
            A10.append(f);
            A10.append(" ");
            C17890vO.A19(A10, e.toString());
            return false;
        }
    }

    public C121626Kw(Looper looper, int i) {
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        this.A02 = new Handler(looper);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.A01 = mediaPlayer;
        mediaPlayer.setAudioStreamType(i);
    }
}
