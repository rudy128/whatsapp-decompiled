package X;

import android.media.audiofx.Visualizer;

/* renamed from: X.75X  reason: invalid class name */
public class AnonymousClass75X implements Visualizer.OnDataCaptureListener {
    public final /* synthetic */ C145777Mo A00;

    public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
    }

    public AnonymousClass75X(C145777Mo r1) {
        this.A00 = r1;
    }

    public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        C145777Mo r1 = this.A00;
        int i2 = C145777Mo.A15;
        C1600486x r0 = r1.A0I;
        if (r0 != null) {
            r0.CAT(bArr);
        }
    }
}
