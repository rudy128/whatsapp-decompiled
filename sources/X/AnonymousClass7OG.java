package X;

import android.view.View;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.7OG  reason: invalid class name */
public final class AnonymousClass7OG implements AnonymousClass89T {
    public final /* synthetic */ C109635dl A00;

    public AnonymousClass7OG(C109635dl r1) {
        this.A00 = r1;
    }

    public void BIs() {
        C145827Mt r0 = (C145827Mt) this.A00.A09.get();
        if (r0 != null) {
            boolean z = r0.A0A;
            C1608089z r02 = r0.A0H;
            if (z) {
                r02.Bc2();
            } else {
                r02.Bc1();
            }
        }
    }

    public void CMs() {
        C145827Mt r0 = (C145827Mt) this.A00.A09.get();
        if (r0 != null) {
            VoiceRecordingView voiceRecordingView = (VoiceRecordingView) r0.A0H;
            voiceRecordingView.A03.setVisibility(0);
            voiceRecordingView.A0A.setVisibility(4);
            VoiceVisualizer voiceVisualizer = voiceRecordingView.A07;
            if (voiceVisualizer == null) {
                C18070vi.A11("previewVoiceVisualizer");
                throw null;
            }
            voiceVisualizer.setVisibility(4);
            voiceRecordingView.A05.setVisibility(4);
            voiceRecordingView.A01.setVisibility(4);
            if (voiceRecordingView.A02 == null) {
                voiceRecordingView.A02 = new C110005em((AnonymousClass1Y1) null, 0.0f, 0.0f, 7, 0);
            }
            View view = voiceRecordingView.A00;
            view.setVisibility(0);
            view.startAnimation(voiceRecordingView.A02);
        }
    }
}
