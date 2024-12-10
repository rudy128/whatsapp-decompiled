package X;

import java.util.ArrayDeque;

/* renamed from: X.CYb  reason: case insensitive filesystem */
public final class C25107CYb {
    public boolean A00;
    public final BNB A01;
    public final ArrayDeque A02 = new ArrayDeque();

    public final void A00(C6B c6b) {
        BNB bnb = this.A01;
        C6B c6b2 = (C6B) this.A02.peek();
        BG4 bg4 = bnb.A00;
        if (c6b2 == null) {
            c6b2 = null;
        }
        BG4.A00(c6b, c6b2, bg4);
    }

    public final void A01(C6B c6b, C22821Di r6) {
        BNB bnb = this.A01;
        ArrayDeque arrayDeque = this.A02;
        C6B c6b2 = (C6B) arrayDeque.peek();
        if (c6b2 == null) {
            BG4.A00(c6b, (C6B) null, bnb.A00);
        } else {
            BG4.A00(c6b, c6b2, bnb.A00);
        }
        arrayDeque.push(c6b);
        try {
            r6.invoke(this);
            if (!C18070vi.A18(arrayDeque.pop(), c6b)) {
                throw AnonymousClass000.A0n("Check failed.");
            }
        } catch (Throwable th) {
            if (!C18070vi.A18(arrayDeque.pop(), c6b)) {
                throw AnonymousClass000.A0n("Check failed.");
            }
            throw th;
        }
    }

    public C25107CYb(BNB bnb) {
        this.A01 = bnb;
    }
}
