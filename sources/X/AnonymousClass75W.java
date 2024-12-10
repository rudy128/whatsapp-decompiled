package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.75W  reason: invalid class name */
public class AnonymousClass75W implements MediaPlayer.OnVideoSizeChangedListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass75W(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.A00 != 0) {
            C121986Mi r6 = (C121986Mi) this.A01;
            r6.A05 = i;
            r6.A04 = i2;
            if (!(i == 0 || i2 == 0)) {
                int width = r6.getWidth();
                int height = r6.getHeight();
                int i3 = r6.A05;
                int i4 = i3 * height;
                int i5 = r6.A04;
                int i6 = i5 * width;
                if (i4 > i6) {
                    height = i6 / i3;
                } else {
                    width = i4 / i5;
                }
                int width2 = r6.getWidth();
                r6.setTop((r6.getHeight() - height) / 2);
                r6.setBottom(r6.getTop() + height);
                r6.setLeft((width2 - width) / 2);
                r6.setRight(r6.getLeft() + width);
            }
            r6.requestLayout();
            return;
        }
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A01;
        videoSurfaceView.A07 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        videoSurfaceView.A06 = videoHeight;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoView/onVideoSizeChanged: ");
        A10.append(videoSurfaceView.A07);
        C17900vP.A0j("x", A10, videoHeight);
        if (videoSurfaceView.A07 != 0 && videoSurfaceView.A06 != 0) {
            videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A07, videoSurfaceView.A06);
            videoSurfaceView.requestLayout();
        }
    }
}
