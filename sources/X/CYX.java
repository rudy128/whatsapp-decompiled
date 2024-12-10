package X;

import android.media.AudioTrack;
import android.os.Handler;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;

public final class CYX {
    public final AudioTrack.StreamEventCallback A00;
    public final Handler A01 = new Handler();
    public final /* synthetic */ DefaultAudioSink A02;

    public CYX(DefaultAudioSink defaultAudioSink) {
        this.A02 = defaultAudioSink;
        this.A00 = new BFQ(this, defaultAudioSink);
    }

    public void A00(AudioTrack audioTrack) {
        Handler handler = this.A01;
        handler.getClass();
        audioTrack.registerStreamEventCallback(new AnonymousClass3DL(handler, 0), this.A00);
    }

    public void A01(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.A00);
        this.A01.removeCallbacksAndMessages((Object) null);
    }
}
