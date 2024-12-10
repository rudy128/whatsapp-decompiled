package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.11K  reason: invalid class name */
public class AnonymousClass11K implements AnonymousClass11J {
    public final AtomicReference A00 = new AtomicReference("D");

    public AnonymousClass11K(AnonymousClass11E r3) {
        r3.registerObserver(this);
    }

    public void Bps(C59732mn r3) {
        String str = "D";
        if (r3.A02) {
            if (r3.A03) {
                str = "M";
            } else if (r3.A05) {
                str = "W";
            }
        }
        this.A00.set(str);
    }
}
