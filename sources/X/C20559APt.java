package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.APt  reason: case insensitive filesystem */
public final class C20559APt implements C22438B7u {
    public final AnonymousClass1RK A00;
    public final AnonymousClass00H A01;

    public Object CGG(C198589ya r5, C179319Hm r6, BCS bcs, String str, C30391dr r9) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C31781g7.A04;
        C31781g7 r2 = new C31781g7(1, C30581eB.A02(r9));
        r2.A0F();
        AnonymousClass1RK r1 = this.A00;
        if (C17880vN.A1X(r1.A06())) {
            r1.registerObserver(new ARQ(r5, r6, this, r2));
            r1.A0A(str, true, true);
        } else {
            this.A01.get();
            r2.resumeWith(new C184379ar(AnonymousClass9I9.UNKNOWN, true));
        }
        return r2.A0C();
    }

    public C20559APt(AnonymousClass1RK r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
