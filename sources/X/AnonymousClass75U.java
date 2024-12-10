package X;

import android.media.MediaPlayer;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.75U  reason: invalid class name */
public class AnonymousClass75U implements MediaPlayer.OnPreparedListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass75U(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        switch (this.A00) {
            case 0:
                C108965cb.A1N(this.A01);
                return;
            case 1:
                MetaAiVoiceSettingViewModel metaAiVoiceSettingViewModel = (MetaAiVoiceSettingViewModel) this.A01;
                metaAiVoiceSettingViewModel.A05.execute(new C21446AkD(metaAiVoiceSettingViewModel, 0));
                return;
            case 2:
                MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A01;
                messageGifVideoPlayer.A07 = true;
                MessageGifVideoPlayer.A01(messageGifVideoPlayer);
                return;
            case 3:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A01;
                videoSurfaceView.A01 = 2;
                videoSurfaceView.A0G = true;
                videoSurfaceView.A0F = true;
                videoSurfaceView.A0E = true;
                MediaPlayer.OnPreparedListener onPreparedListener = videoSurfaceView.A0A;
                if (onPreparedListener != null) {
                    onPreparedListener.onPrepared(videoSurfaceView.A0B);
                }
                videoSurfaceView.A07 = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();
                videoSurfaceView.A06 = videoHeight;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("VideoView/onPrepare: ");
                A10.append(videoSurfaceView.A07);
                C17900vP.A0j("x", A10, videoHeight);
                int i = videoSurfaceView.A02;
                if (i >= 0) {
                    videoSurfaceView.seekTo(i);
                }
                if (!(videoSurfaceView.A07 == 0 || videoSurfaceView.A06 == 0)) {
                    videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A07, videoSurfaceView.A06);
                    if (!(videoSurfaceView.A04 == videoSurfaceView.A07 && videoSurfaceView.A03 == videoSurfaceView.A06)) {
                        return;
                    }
                }
                if (videoSurfaceView.A05 == 3) {
                    videoSurfaceView.start();
                    return;
                }
                return;
            default:
                C121986Mi r2 = (C121986Mi) this.A01;
                r2.A00 = 2;
                if (r2.A0G) {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                }
                if (r2.A0F) {
                    mediaPlayer.setLooping(true);
                }
                r2.A0E = true;
                r2.A0D = true;
                r2.A0C = true;
                int i2 = r2.A02;
                if (i2 >= 0) {
                    r2.seekTo(i2);
                }
                if (r2.A03 == 3) {
                    r2.start();
                }
                MediaPlayer.OnPreparedListener onPreparedListener2 = r2.A08;
                if (onPreparedListener2 != null) {
                    onPreparedListener2.onPrepared(mediaPlayer);
                    return;
                }
                return;
        }
    }
}
