package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.7Sc  reason: invalid class name and case insensitive filesystem */
public final class C147177Sc implements AnonymousClass1OM {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A03 = AtomicIntegerFieldUpdater.newUpdater(C147177Sc.class, "_state$volatile");
    public AnonymousClass1OI A00;
    public final AnonymousClass1OB A01;
    public final Thread A02 = Thread.currentThread();
    public volatile /* synthetic */ int _state$volatile;

    public final void A00() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A03;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    }
                    throw AnonymousClass000.A0n(AnonymousClass001.A1I("Illegal state ", AnonymousClass000.A10(), i));
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                AnonymousClass1OI r0 = this.A00;
                if (r0 != null) {
                    r0.dispose();
                    return;
                }
                return;
            }
        }
    }

    public void Bdq(Throwable th) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A03;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    throw AnonymousClass000.A0n(AnonymousClass001.A1I("Illegal state ", AnonymousClass000.A10(), i));
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.A02.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public C147177Sc(AnonymousClass1OB r2) {
        this.A01 = r2;
    }
}
