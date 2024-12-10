package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0Z0  reason: invalid class name */
public class AnonymousClass0Z0 implements Runnable {
    public final WeakReference A00;

    public void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass0Bs) weakReference.get()).A16(false);
        }
    }

    public AnonymousClass0Z0(AnonymousClass0Bs r2) {
        this.A00 = new WeakReference(r2);
    }
}
