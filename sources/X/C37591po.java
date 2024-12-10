package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1po  reason: invalid class name and case insensitive filesystem */
public abstract class C37591po {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static final AnonymousClass1IJ A00() {
        ThreadLocal threadLocal = A00;
        AnonymousClass1IJ r1 = (AnonymousClass1IJ) threadLocal.get();
        if (r1 != null) {
            return r1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass1IL.A01;
        C37601pp r12 = new C37601pp(Thread.currentThread());
        threadLocal.set(r12);
        return r12;
    }
}
