package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.4Pr  reason: invalid class name and case insensitive filesystem */
public final class C85984Pr {
    public final AnonymousClass00H A00;

    public C85984Pr(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final Object A00(AnonymousClass5WY r5, C30391dr r6) {
        AnonymousClass00H r1 = this.A00;
        if (((AnonymousClass1PY) r1.get()).A02()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C71053Dp.A01;
            C71053Dp r3 = new C71053Dp(C30581eB.A02(r6));
            ((AnonymousClass1PY) r1.get()).A01(r5).A04(new C99254sW((Object) r3, 8));
            return r3.A00();
        }
        throw new AnonymousClass441();
    }
}
