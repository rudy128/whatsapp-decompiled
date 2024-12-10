package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.1e8  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C30551e8 {
    public static final Object A00(C30391dr r1, AnonymousClass1OB r2) {
        r2.BEM((CancellationException) null);
        Object BhB = r2.BhB(r1);
        if (BhB != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return BhB;
    }

    public static final void A04(C18560wh r3) {
        AnonymousClass1OB r0 = (AnonymousClass1OB) r3.get(AnonymousClass1OB.A00);
        if (r0 != null) {
            for (AnonymousClass1OB BEM : r0.BOj()) {
                BEM.BEM((CancellationException) null);
            }
        }
    }

    public static final AnonymousClass1OI A01(AnonymousClass1OM r2, AnonymousClass1OB r3, boolean z, boolean z2) {
        if (r3 instanceof AnonymousClass1OC) {
            return ((AnonymousClass1OC) r3).A0i(r2, z, z2);
        }
        return r3.Bdx(new C147977gh(r2, 39), z, z2);
    }

    public static final AnonymousClass1OB A02(C18560wh r2) {
        AnonymousClass1OB r0 = (AnonymousClass1OB) r2.get(AnonymousClass1OB.A00);
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Current context doesn't contain Job in it: ");
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }

    public static final void A03(CancellationException cancellationException, C18560wh r2) {
        AnonymousClass1OB r0 = (AnonymousClass1OB) r2.get(AnonymousClass1OB.A00);
        if (r0 != null) {
            r0.BEM(cancellationException);
        }
    }

    public static final void A05(C18560wh r1) {
        AnonymousClass1OB r12 = (AnonymousClass1OB) r1.get(AnonymousClass1OB.A00);
        if (r12 != null && !r12.Be2()) {
            throw r12.BOI();
        }
    }
}
