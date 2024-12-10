package X;

import java.util.List;

/* renamed from: X.9lZ  reason: invalid class name and case insensitive filesystem */
public final class C190819lZ {
    public boolean A00;
    public final C188339hG A01;
    public final List A02 = AnonymousClass000.A13();

    public C190819lZ(C188339hG r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public final void A00() {
        synchronized (this) {
            if (!this.A00) {
                B3R b3r = B3R.A00;
                C18070vi.A0d(b3r, 0);
                C172148sx r1 = (C172148sx) this.A01.A08.get();
                r1.A00 = C436220g.A01;
                r1.A01();
                b3r.invoke(r1);
                AnonymousClass8BT.A1D(r1);
                this.A02.add(r1);
                this.A00 = true;
            }
        }
    }
}
