package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1I9  reason: invalid class name */
public class AnonymousClass1I9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass1I9.class, Object.class, "_cur$volatile");
    public volatile /* synthetic */ Object _cur$volatile;

    public final int A00() {
        long j = AnonymousClass1IB.A05.get(A00.get(this));
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    public final Object A01() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            AnonymousClass1IB r2 = (AnonymousClass1IB) atomicReferenceFieldUpdater.get(this);
            Object A03 = r2.A03();
            if (A03 != AnonymousClass1IB.A04) {
                return A03;
            }
            C30561e9.A00(this, r2, AnonymousClass1IB.A01(r2, AnonymousClass1IB.A00(r2)), atomicReferenceFieldUpdater);
        }
    }

    public final boolean A02(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            AnonymousClass1IB r2 = (AnonymousClass1IB) atomicReferenceFieldUpdater.get(this);
            int A02 = r2.A02(obj);
            if (A02 == 0) {
                return true;
            }
            if (A02 != 1) {
                return false;
            }
            C30561e9.A00(this, r2, AnonymousClass1IB.A01(r2, AnonymousClass1IB.A00(r2)), atomicReferenceFieldUpdater);
        }
    }
}
