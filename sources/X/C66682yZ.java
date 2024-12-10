package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.2yZ  reason: invalid class name and case insensitive filesystem */
public final class C66682yZ implements C22438B7u {
    public final C57652jQ A00;
    public final C26711Te A01;
    public final C26691Tc A02;

    public Object CGG(C198589ya r5, C179319Hm r6, BCS bcs, String str, C30391dr r9) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r3 = new C31781g7(1, C30581eB.A02(r9));
        r3.A0F();
        this.A02.registerObserver(new C20565APz(r6, this, bcs, r3));
        C26711Te r2 = this.A01;
        if (!r2.A04()) {
            r2.A01(8);
            r2.A03(true);
        }
        return r3.A0C();
    }

    public C66682yZ(C57652jQ r1, C26711Te r2, C26691Tc r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
