package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Bi7  reason: case insensitive filesystem */
public final class C23500Bi7 extends Bi9 {
    public final WeakReference A00;

    public final void CSf(C23074Bap bap) {
        C26905DIm dIm = (C26905DIm) this.A00.get();
        if (dIm != null) {
            C26909DIq dIq = dIm.A0D;
            C108955ca.A1F(dIq.A06, new BZX(dIm, dIm, bap), 1);
        }
    }

    public C23500Bi7(C26905DIm dIm) {
        this.A00 = AnonymousClass3MW.A0z(dIm);
    }
}
