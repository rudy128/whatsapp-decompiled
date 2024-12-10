package X;

import android.view.View;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.7Mu  reason: invalid class name and case insensitive filesystem */
public final class C145837Mu implements AnonymousClass88F {
    public final /* synthetic */ VoiceRecordingView A00;

    public C145837Mu(VoiceRecordingView voiceRecordingView) {
        this.A00 = voiceRecordingView;
    }

    public void C4u(int i) {
        long j;
        AnonymousClass861 r5 = this.A00.A09;
        if (r5 != null) {
            C145827Mt r52 = (C145827Mt) r5;
            if (i != 0) {
                j = C145827Mt.A00(r52) / ((long) i);
            } else {
                j = -1;
            }
            r52.A01 = j;
            if (r52.A0A && r52.A06 == null) {
                C109635dl A002 = r52.A0D.A00(r52, j);
                r52.A06 = A002;
                A002.A01();
                AnonymousClass6Y1.A00(AnonymousClass3Ma.A05((View) r52.A0H));
            }
        }
    }
}
