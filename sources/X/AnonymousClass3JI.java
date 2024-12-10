package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3JI  reason: invalid class name */
public final class AnonymousClass3JI extends AnonymousClass1OO {
    public final C31781g7 A00;

    public void Bdq(Throwable th) {
        C31781g7 r6 = this.A00;
        Throwable A0E = r6.A0E(A03());
        if (C31781g7.A08(r6)) {
            C30391dr r4 = r6.A00;
            C18070vi.A0z(r4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C30611eE.A04;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(r4);
                AnonymousClass1I8 r1 = C30621eF.A00;
                if (C18070vi.A18(obj, r1)) {
                    if (C30561e9.A00(r4, r1, A0E, atomicReferenceFieldUpdater)) {
                        return;
                    }
                } else if (obj instanceof Throwable) {
                    return;
                } else {
                    if (C30561e9.A00(r4, obj, (Object) null, atomicReferenceFieldUpdater)) {
                        break;
                    }
                }
            }
        }
        r6.BEN(A0E);
        if (!C31781g7.A08(r6)) {
            r6.A0G();
        }
    }

    public AnonymousClass3JI(C31781g7 r1) {
        this.A00 = r1;
    }
}
