package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1n4  reason: invalid class name and case insensitive filesystem */
public abstract class C35931n4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01;
    public volatile /* synthetic */ Object _next$volatile;
    public volatile /* synthetic */ Object _prev$volatile;

    static {
        Class<Object> cls = Object.class;
        Class<C35931n4> cls2 = C35931n4.class;
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next$volatile");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev$volatile");
    }

    public boolean A03() {
        C35951n6 r2 = (C35951n6) this;
        if (C35951n6.A01.get(r2) != r2.A04() || r2.A00() == null) {
            return false;
        }
        return true;
    }

    public final C35931n4 A00() {
        Object obj = A00.get(this);
        if (obj == C61052p2.A00) {
            return null;
        }
        return (C35931n4) obj;
    }

    public final void A01() {
        A01.set(this, (Object) null);
    }

    public final void A02() {
        C35931n4 r3;
        Object obj;
        C35931n4 r0;
        C35931n4 A002;
        if (A00() != null) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    r3 = (C35931n4) obj2;
                    if (r3 == null || !r3.A03()) {
                        C35931n4 A003 = A00();
                        C18070vi.A0b(A003);
                    } else {
                        obj2 = atomicReferenceFieldUpdater.get(r3);
                    }
                }
                C35931n4 A0032 = A00();
                C18070vi.A0b(A0032);
                while (A0032.A03() && (A002 = A0032.A00()) != null) {
                    A0032 = A002;
                }
                do {
                    obj = atomicReferenceFieldUpdater.get(A0032);
                    r0 = r3;
                    if (obj == null) {
                        r0 = null;
                    }
                } while (!C30561e9.A00(A0032, obj, r0, atomicReferenceFieldUpdater));
                if (r3 != null) {
                    A00.set(r3, A0032);
                }
                if ((!A0032.A03() || A0032.A00() == null) && (r3 == null || !r3.A03())) {
                    return;
                }
            }
        }
    }
}
