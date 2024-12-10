package X;

import android.media.MediaPlayer;
import android.view.View;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.75Q  reason: invalid class name */
public class AnonymousClass75Q implements MediaPlayer.OnCompletionListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass75Q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer.OnCompletionListener onCompletionListener;
        MediaPlayer mediaPlayer2;
        switch (this.A00) {
            case 0:
                ((View) this.A01).setVisibility(0);
                return;
            case 1:
                MetaAiVoiceSettingViewModel metaAiVoiceSettingViewModel = (MetaAiVoiceSettingViewModel) this.A01;
                metaAiVoiceSettingViewModel.A05.execute(new C21446AkD(metaAiVoiceSettingViewModel, 2));
                return;
            case 2:
                mediaPlayer.getClass();
                AnonymousClass3MZ.A1U((AnonymousClass10I) this.A01, mediaPlayer, 26);
                return;
            case 5:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A01;
                videoSurfaceView.A01 = 5;
                videoSurfaceView.A05 = 5;
                onCompletionListener = videoSurfaceView.A08;
                if (onCompletionListener != null) {
                    mediaPlayer2 = videoSurfaceView.A0B;
                    break;
                } else {
                    return;
                }
            case 6:
                C121986Mi r1 = (C121986Mi) this.A01;
                r1.A00 = 5;
                r1.A03 = 5;
                onCompletionListener = r1.A06;
                if (onCompletionListener != null) {
                    mediaPlayer2 = r1.A09;
                    break;
                } else {
                    return;
                }
            default:
                AnonymousClass70X r12 = (AnonymousClass70X) this.A01;
                AnonymousClass88P r0 = r12.A08;
                if (r0 != null) {
                    r0.BpQ(r12);
                    return;
                }
                return;
        }
        onCompletionListener.onCompletion(mediaPlayer2);
    }
}
