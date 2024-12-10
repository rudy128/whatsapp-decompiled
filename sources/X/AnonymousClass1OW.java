package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1OW  reason: invalid class name */
public abstract class AnonymousClass1OW {
    public static final AnonymousClass1OY A01() {
        AnonymousClass1OE r1 = new AnonymousClass1OE((AnonymousClass1OB) null);
        C18600wl r0 = C23871Hy.A00;
        return new AnonymousClass1OY(r1.plus(AnonymousClass1IN.A00));
    }

    public static final Object A00(C30391dr r2, AnonymousClass1OS r3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass1OC.A00;
        C41581wh r0 = new C41581wh(r2, r2.getContext());
        return C41671ws.A00(r0, r3, r0);
    }

    public static final AnonymousClass1OY A02(C18560wh r2) {
        if (r2.get(AnonymousClass1OB.A00) == null) {
            r2 = r2.plus(new AnonymousClass1OD((AnonymousClass1OB) null));
        }
        return new AnonymousClass1OY(r2);
    }

    public static final AnonymousClass1OY A03(C18560wh r1, AnonymousClass1OX r2) {
        return new AnonymousClass1OY(r2.getCoroutineContext().plus(r1));
    }

    public static final void A04(CancellationException cancellationException, AnonymousClass1OX r3) {
        AnonymousClass1OB r0 = (AnonymousClass1OB) r3.getCoroutineContext().get(AnonymousClass1OB.A00);
        if (r0 != null) {
            r0.BEM(cancellationException);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scope cannot be cancelled because it does not have a job: ");
        sb.append(r3);
        throw new IllegalStateException(sb.toString());
    }

    public static final boolean A05(AnonymousClass1OX r1) {
        AnonymousClass1OB r0 = (AnonymousClass1OB) r1.getCoroutineContext().get(AnonymousClass1OB.A00);
        if (r0 != null) {
            return r0.Be2();
        }
        return true;
    }
}
