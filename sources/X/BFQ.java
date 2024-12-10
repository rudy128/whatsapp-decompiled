package X;

import android.media.AudioTrack;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;

public class BFQ extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ CYX A00;
    public final /* synthetic */ DefaultAudioSink A01;

    public BFQ(CYX cyx, DefaultAudioSink defaultAudioSink) {
        this.A00 = cyx;
        this.A01 = defaultAudioSink;
    }

    public void onDataRequest(AudioTrack audioTrack, int i) {
        C26056CrS.A03(AnonymousClass000.A1Z(audioTrack, this.A00.A02.A0B));
    }

    public void onTearDown(AudioTrack audioTrack) {
        C26056CrS.A03(AnonymousClass000.A1Z(audioTrack, this.A00.A02.A0B));
    }
}
