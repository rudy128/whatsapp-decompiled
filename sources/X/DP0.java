package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.conversation.conversationrow.WaveformVisualizerView;

public class DP0 implements C1600486x {
    public final int A00;
    public final Object A01;

    public DP0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CAT(byte[] bArr) {
        ConversationRowAudioPreview conversationRowAudioPreview;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            conversationRowAudioPreview = ((C24133Bvz) obj).A00;
        } else {
            conversationRowAudioPreview = ((C23820BqX) obj).A02;
            if (conversationRowAudioPreview == null) {
                return;
            }
        }
        WaveformVisualizerView waveformVisualizerView = conversationRowAudioPreview.A01;
        waveformVisualizerView.A02 = bArr;
        waveformVisualizerView.invalidate();
    }
}
