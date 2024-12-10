package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.C9m  reason: case insensitive filesystem */
public abstract /* synthetic */ class C24565C9m {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, AtomicReferenceArray atomicReferenceArray, int i) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
