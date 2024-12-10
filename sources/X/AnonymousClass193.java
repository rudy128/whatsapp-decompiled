package X;

import android.os.Debug;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.193  reason: invalid class name */
public class AnonymousClass193 {
    public final Set A00 = new HashSet();

    public void A00() {
        Runtime runtime = Runtime.getRuntime();
        synchronized (this) {
            for (WeakReference weakReference : this.A00) {
                C24721Lk r1 = (C24721Lk) weakReference.get();
                if (!(r1 == null || r1.BZc() == null)) {
                    r1.BZc();
                }
            }
        }
        runtime.freeMemory();
        runtime.totalMemory();
        runtime.maxMemory();
        Debug.getNativeHeapFreeSize();
        Debug.getNativeHeapAllocatedSize();
    }
}
