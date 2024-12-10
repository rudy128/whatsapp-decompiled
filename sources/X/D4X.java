package X;

import android.view.Choreographer;

public class D4X implements Choreographer.FrameCallback {
    public final /* synthetic */ DEC A00;

    public D4X(DEC dec) {
        this.A00 = dec;
    }

    public void doFrame(long j) {
        DEC dec = this.A00;
        if (dec.A07) {
            Choreographer choreographer = dec.A04;
            if (choreographer != null) {
                choreographer.removeFrameCallback(dec.A01);
            }
            dec.A05 = null;
            dec.A07 = false;
            return;
        }
        C28498E4d e4d = dec.A05;
        Long l = dec.A06;
        if (l == null || e4d == null) {
            Choreographer choreographer2 = dec.A04;
            if (choreographer2 != null) {
                choreographer2.removeFrameCallback(dec.A01);
            }
        } else if (dec.A00 <= j) {
            long longValue = l.longValue();
            dec.A00 = longValue * ((j / longValue) + 1);
            e4d.CFB();
        } else {
            DEC.A00(dec);
        }
    }
}
