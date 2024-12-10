package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.00N  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass00N {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, AtomicReference atomicReference) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
