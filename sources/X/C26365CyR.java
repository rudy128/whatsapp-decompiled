package X;

import android.media.MediaRecorder;

/* renamed from: X.CyR  reason: case insensitive filesystem */
public class C26365CyR implements MediaRecorder.OnInfoListener {
    public final /* synthetic */ CZ3 A00;

    public C26365CyR(CZ3 cz3) {
        this.A00 = cz3;
    }

    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (((DEO) this.A00.A03).A00 == 0) {
            int i3 = C26175Cts.A00;
            C26175Cts.A01(C17890vO.A0E(Integer.valueOf(i), i2), 29, 0);
        }
    }
}
