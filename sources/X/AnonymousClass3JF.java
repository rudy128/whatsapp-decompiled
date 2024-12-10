package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.3JF  reason: invalid class name */
public final class AnonymousClass3JF extends C30681eL {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass3JF.class, "_resumed$volatile");
    public volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3JF(java.lang.Throwable r3, X.C30391dr r4, boolean r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0019
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Continuation "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " was cancelled normally"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            r3.<init>(r0)
        L_0x0019:
            r2.<init>(r3, r5)
            r0 = 0
            r2._resumed$volatile = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3JF.<init>(java.lang.Throwable, X.1dr, boolean):void");
    }

    public final boolean A03() {
        return A00.compareAndSet(this, 0, 1);
    }
}
