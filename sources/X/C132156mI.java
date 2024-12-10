package X;

import com.whatsapp.audioRecording.NoiseMetrics;

/* renamed from: X.6mI  reason: invalid class name and case insensitive filesystem */
public final class C132156mI {
    public final AnonymousClass18K A00;
    public final C36331ni A01;

    public C132156mI(AnonymousClass18K r2, C36331ni r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(NoiseMetrics noiseMetrics, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        AnonymousClass64D r2 = new AnonymousClass64D();
        r2.A07 = Integer.valueOf(i);
        r2.A06 = Double.valueOf((double) AnonymousClass6WJ.A00(j));
        r2.A0B = Long.valueOf(AnonymousClass6WJ.A00(j2));
        r2.A00 = Boolean.valueOf(z);
        r2.A08 = 0;
        r2.A09 = Long.valueOf(j3);
        r2.A0A = Long.valueOf(j4);
        r2.A01 = Boolean.valueOf(z2);
        r2.A0C = Long.valueOf(j5);
        if (noiseMetrics != null) {
            r2.A02 = Double.valueOf((double) noiseMetrics.avgLoudnessOutputNoiseFrames);
            r2.A03 = Double.valueOf((double) noiseMetrics.avgLoudnessDiffNoiseFrames);
            r2.A04 = Double.valueOf((double) noiseMetrics.avgLoudnessOutputSpeechFrames);
            r2.A05 = Double.valueOf((double) noiseMetrics.avgLoudnessDiffSpeechFrames);
        }
        this.A00.CC7(r2);
    }
}
