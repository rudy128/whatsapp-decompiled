package X;

import android.view.Choreographer;

/* renamed from: X.1tU  reason: invalid class name and case insensitive filesystem */
public class C39691tU {
    public long A00 = -1;
    public long A01 = -1;
    public C39681tT A02;
    public boolean A03 = false;
    public final Choreographer.FrameCallback A04;
    public final Choreographer A05;

    public C39691tU(Choreographer choreographer, C39681tT r4) {
        this.A05 = choreographer;
        this.A02 = r4;
        this.A04 = new C64652v7(this, 0);
    }
}
