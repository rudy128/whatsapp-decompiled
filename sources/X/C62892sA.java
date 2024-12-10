package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.2sA  reason: invalid class name and case insensitive filesystem */
public abstract class C62892sA {
    public static /* synthetic */ void A02(String str, AnonymousClass1OB r3) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause((Throwable) null);
        r3.BEM(cancellationException);
    }

    public static final AnonymousClass1OD A01(AnonymousClass1OB r1) {
        return new AnonymousClass1OD(r1);
    }

    public static final AnonymousClass1OB A00(C18560wh r0) {
        return C30551e8.A02(r0);
    }
}
