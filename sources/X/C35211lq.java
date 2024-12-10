package X;

import java.util.Set;

/* renamed from: X.1lq  reason: invalid class name and case insensitive filesystem */
public final class C35211lq {
    public final AnonymousClass00H A00;
    public final C35201lp A01;

    public C35211lq(C35201lp r2, AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final void A00(C166278cd r3, AnonymousClass206 r4, C63362sw r5) {
        for (C25471Oi Bvr : (Set) this.A00.get()) {
            Bvr.Bvr(r3, r4, r5);
        }
    }

    public final void A01(C63362sw r4) {
        for (C25471Oi Bvt : (Set) this.A00.get()) {
            Bvt.Bvt(r4);
        }
        this.A01.notifyAllObservers(new C97014om(r4, 30));
    }
}
