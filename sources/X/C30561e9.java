package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1e9  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C30561e9 {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, Object obj3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
