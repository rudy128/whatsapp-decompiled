package X;

import android.os.SystemClock;
import com.whatsapp.areffects.button.ArEffectsAccessoryButton;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.whatsapp.textstatuscomposer.voice.VoiceStatusRecordingVisualizer;

/* renamed from: X.7Pg  reason: invalid class name and case insensitive filesystem */
public class C146477Pg implements Runnable {
    public final float A00;
    public final int A01;
    public final Object A02;

    public C146477Pg(Object obj, float f, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }

    public final void run() {
        switch (this.A01) {
            case 0:
                float f = this.A00;
                D3R d3r = ((BVr) ((C28607E9y) this.A02)).A00;
                if (d3r != null) {
                    C8N.A00(d3r, f);
                    return;
                }
                return;
            case 1:
                C28931bI r2 = (C28931bI) this.A02;
                float f2 = this.A00;
                C18070vi.A0d(r2, 0);
                ((ArEffectsAccessoryButton) r2.A02()).getButton().setRotation(f2);
                return;
            default:
                float f3 = this.A00;
                C145827Mt r0 = (C145827Mt) ((C109635dl) this.A02).A09.get();
                if (r0 != null) {
                    VoiceStatusRecordingVisualizer voiceStatusRecordingVisualizer = ((VoiceRecordingView) r0.A0H).A0A;
                    Boolean bool = C17970vW.A03;
                    voiceStatusRecordingVisualizer.getTime();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = voiceStatusRecordingVisualizer.A00;
                    if (j != 0) {
                        voiceStatusRecordingVisualizer.A01 = Math.max(elapsedRealtime - j, 0);
                    }
                    voiceStatusRecordingVisualizer.A00 = elapsedRealtime;
                    voiceStatusRecordingVisualizer.A0B.add(Float.valueOf(f3));
                    if (!voiceStatusRecordingVisualizer.A05) {
                        voiceStatusRecordingVisualizer.A05 = true;
                        voiceStatusRecordingVisualizer.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
