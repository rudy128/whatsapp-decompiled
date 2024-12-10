package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2oR  reason: invalid class name and case insensitive filesystem */
public abstract class C60682oR {
    public static final C31781g7 A00(C30391dr r4) {
        int i;
        if (!(r4 instanceof C30611eE)) {
            i = 1;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C30611eE.A04;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(r4);
                if (obj == null) {
                    atomicReferenceFieldUpdater.set(r4, C30621eF.A00);
                    break;
                }
                boolean z = obj instanceof C31781g7;
                AnonymousClass1I8 r0 = C30621eF.A00;
                if (z) {
                    if (C30561e9.A00(r4, obj, r0, atomicReferenceFieldUpdater)) {
                        C31781g7 r3 = (C31781g7) obj;
                        if (r3 != null) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C31781g7.A04;
                            Object obj2 = atomicReferenceFieldUpdater2.get(r3);
                            if (!(obj2 instanceof C59682mi) || ((C59682mi) obj2).A00 == null) {
                                C31781g7.A02.set(r3, 536870911);
                                atomicReferenceFieldUpdater2.set(r3, AnonymousClass3E9.A00);
                                return r3;
                            }
                            r3.A0G();
                        }
                    }
                } else if (obj != r0 && !(obj instanceof Throwable)) {
                    throw AnonymousClass000.A0n(AnonymousClass001.A1E(obj, "Inconsistent state ", AnonymousClass000.A10()));
                }
            }
            i = 2;
        }
        return new C31781g7(i, r4);
    }

    public static final void A01(AnonymousClass3MV r1, C31761g5 r2) {
        if (r2 instanceof C31781g7) {
            C31781g7.A04(r1, (C31781g7) r2);
            return;
        }
        throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
    }
}
