package X;

import java.util.List;

/* renamed from: X.2kr  reason: invalid class name and case insensitive filesystem */
public abstract class C58542kr {
    public boolean A00;
    public final List A01 = AnonymousClass000.A13();
    public final C435720b A02;

    public void A00() {
        A01(C71953Iz.A00);
    }

    public final void A01(C22821Di r3) {
        AnonymousClass2I3 r1 = (AnonymousClass2I3) this.A02.A07.get();
        r1.A00 = C436220g.A01;
        r1.A01();
        r3.invoke(r1);
        r1.A00();
        r1.A00 = true;
        synchronized (this) {
            this.A01.add(r1);
        }
    }

    public C58542kr(C435720b r2) {
        this.A02 = r2;
    }
}
