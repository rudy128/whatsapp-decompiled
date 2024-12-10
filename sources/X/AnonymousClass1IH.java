package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1IH  reason: invalid class name */
public final class AnonymousClass1IH extends C18600wl implements C23781Hp {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A05 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass1IH.class, "runningWorkers$volatile");
    public final int A00;
    public final C18600wl A01;
    public final AnonymousClass1I9 A02;
    public final Object A03;
    public final /* synthetic */ C23781Hp A04;
    public volatile /* synthetic */ int runningWorkers$volatile;

    public AnonymousClass1OI Bdz(Runnable runnable, C18560wh r3, long j) {
        return this.A04.Bdz(runnable, r3, j);
    }

    public void CGy(C31761g5 r2, long j) {
        this.A04.CGy(r2, j);
    }

    public static final Runnable A00(AnonymousClass1IH r4) {
        while (true) {
            AnonymousClass1I9 r3 = r4.A02;
            Runnable runnable = (Runnable) r3.A01();
            if (runnable != null) {
                return runnable;
            }
            synchronized (r4.A03) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
                atomicIntegerFieldUpdater.decrementAndGet(r4);
                if (r3.A00() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(r4);
            }
        }
    }

    public static final boolean A01(AnonymousClass1IH r4) {
        synchronized (r4.A03) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
            if (atomicIntegerFieldUpdater.get(r4) >= r4.A00) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(r4);
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1I9, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r5 = (X.C23781Hp) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1IH(X.C18600wl r5, int r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.A01 = r5
            r4.A00 = r6
            boolean r0 = r5 instanceof X.C23781Hp
            if (r0 == 0) goto L_0x000f
            X.1Hp r5 = (X.C23781Hp) r5
            if (r5 != 0) goto L_0x0011
        L_0x000f:
            X.1Hp r5 = X.AnonymousClass1II.A00
        L_0x0011:
            r4.A04 = r5
            r3 = 0
            X.1I9 r2 = new X.1I9
            r2.<init>()
            r1 = 8
            X.1IB r0 = new X.1IB
            r0.<init>(r1, r3)
            r2._cur$volatile = r0
            r4.A02 = r2
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IH.<init>(X.0wl, int):void");
    }
}
