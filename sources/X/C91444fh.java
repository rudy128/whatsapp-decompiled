package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.4fh  reason: invalid class name and case insensitive filesystem */
public abstract class C91444fh implements C218317o {
    public abstract void A04();

    public abstract boolean A05();

    @OnLifecycleEvent(C27581Wq.ON_CREATE)
    public final void onCreate() {
        if (A05()) {
            A04();
        }
    }
}
