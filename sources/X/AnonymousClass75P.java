package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.75P  reason: invalid class name */
public class AnonymousClass75P implements MediaPlayer.OnBufferingUpdateListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public AnonymousClass75P(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.A00.A00 = i;
    }
}
