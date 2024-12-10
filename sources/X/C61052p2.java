package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2p2  reason: invalid class name and case insensitive filesystem */
public abstract class C61052p2 {
    public static final AnonymousClass1I8 A00 = new AnonymousClass1I8("CLOSED");

    public static final Object A00(AnonymousClass1OS r5, C35951n6 r6, long j) {
        while (true) {
            if (r6.A00 >= j && !r6.A03()) {
                return r6;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C35931n4.A00;
            Object obj = atomicReferenceFieldUpdater.get(r6);
            AnonymousClass1I8 r0 = A00;
            if (obj == r0) {
                return r0;
            }
            C35951n6 r1 = (C35951n6) ((C35931n4) obj);
            if (r1 == null) {
                r1 = (C35951n6) r5.invoke(C17880vN.A0o(r6.A00, 1), r6);
                if (C30561e9.A00(r6, (Object) null, r1, atomicReferenceFieldUpdater)) {
                    if (r6.A03()) {
                        r6.A02();
                    }
                }
            }
            r6 = r1;
        }
    }
}
