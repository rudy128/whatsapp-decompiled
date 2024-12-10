package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.3JJ  reason: invalid class name */
public final class AnonymousClass3JJ extends AnonymousClass1OO {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass3JJ.class, "_invoked$volatile");
    public final AnonymousClass1OM A00;
    public volatile /* synthetic */ int _invoked$volatile;

    public void Bdq(Throwable th) {
        if (A01.compareAndSet(this, 0, 1)) {
            this.A00.Bdq(th);
        }
    }

    public AnonymousClass3JJ(AnonymousClass1OM r1) {
        this.A00 = r1;
    }
}
