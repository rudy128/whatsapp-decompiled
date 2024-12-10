package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0Yz  reason: invalid class name and case insensitive filesystem */
public class C06610Yz implements Runnable {
    public final WeakReference A00;

    public void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass0Bs) weakReference.get()).A13(false);
        }
    }

    public C06610Yz(AnonymousClass0Bs r2) {
        this.A00 = new WeakReference(r2);
    }
}
