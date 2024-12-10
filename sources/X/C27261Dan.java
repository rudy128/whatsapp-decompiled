package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.Dan  reason: case insensitive filesystem */
public final class C27261Dan extends WeakReference {
    public final int A00;

    public C27261Dan(Throwable th) {
        super(th, (ReferenceQueue) null);
        this.A00 = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this != obj) {
                C27261Dan dan = (C27261Dan) obj;
                if (!(this.A00 == dan.A00 && get() == dan.get())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }
}
