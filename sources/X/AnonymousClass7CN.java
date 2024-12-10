package X;

import com.whatsapp.audioRecording.NoiseMetrics;
import com.whatsapp.audioRecording.NoiseMetricsCallback;

/* renamed from: X.7CN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7CN implements NoiseMetricsCallback {
    public final /* synthetic */ C136446tp A00;

    public final void onNoiseMetricsReceived(NoiseMetrics noiseMetrics) {
        C136446tp r1 = this.A00;
        C18070vi.A0d(noiseMetrics, 0);
        r1.A03 = noiseMetrics;
    }

    public /* synthetic */ AnonymousClass7CN(C136446tp r1) {
        this.A00 = r1;
    }
}
