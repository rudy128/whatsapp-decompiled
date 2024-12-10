package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1n6  reason: invalid class name and case insensitive filesystem */
public abstract class C35951n6 extends C35931n4 implements C35941n5 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C35951n6.class, "cleanedAndPointers$volatile");
    public final long A00;
    public volatile /* synthetic */ int cleanedAndPointers$volatile;

    public void A06(int i) {
        C35961n7 r2 = (C35961n7) this;
        r2.A00.set(i, C35971n8.A03);
        r2.A05();
    }

    public final void A05() {
        if (A01.incrementAndGet(this) == A04()) {
            A02();
        }
    }

    public final boolean A07() {
        if (A01.addAndGet(this, -65536) != A04() || A00() == null) {
            return false;
        }
        return true;
    }

    public final boolean A08() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == A04() && A00() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public C35951n6(C35951n6 r2, int i, long j) {
        this._prev$volatile = r2;
        this.A00 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public int A04() {
        return C35971n8.A01;
    }
}
