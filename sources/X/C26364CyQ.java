package X;

import android.media.MediaRecorder;

/* renamed from: X.CyQ  reason: case insensitive filesystem */
public class C26364CyQ implements MediaRecorder.OnErrorListener {
    public final /* synthetic */ CZ3 A00;

    public C26364CyQ(CZ3 cz3) {
        this.A00 = cz3;
    }

    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        if (((DEO) this.A00.A03).A00 == 0) {
            int i3 = C26175Cts.A00;
            C26175Cts.A01(C17890vO.A0E(Integer.valueOf(i), i2), 28, 0);
        }
    }
}
