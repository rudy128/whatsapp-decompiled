package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.25k  reason: invalid class name and case insensitive filesystem */
public class C449525k implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C449525k(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void run() {
        switch (this.A00) {
            case 0:
                C43451zp r2 = (C43451zp) this.A02;
                Object obj = this.A03;
                if (!((C42601yR) this.A01).A00.A03()) {
                    r2.BpK(obj);
                    return;
                }
                return;
            case 1:
                C37471pb r0 = (C37471pb) this.A01;
                C42601yR r5 = (C42601yR) this.A02;
                Object obj2 = this.A03;
                try {
                    r0.A00.post(new C449525k(r5, obj2, r5.call(), 0));
                    return;
                } catch (AnonymousClass1QC unused) {
                    return;
                }
            default:
                AnonymousClass19R r7 = (AnonymousClass19R) this.A01;
                AnonymousClass1Bh r6 = (AnonymousClass1Bh) this.A02;
                C223419n r52 = (C223419n) this.A03;
                AnonymousClass19T r4 = (AnonymousClass19T) r7.A04.get();
                int andIncrement = AnonymousClass19R.A09.getAndIncrement();
                r4.markerStart(916783105, andIncrement);
                r4.markerAnnotate(916783105, andIncrement, "job", r6.BU9());
                r4.markerAnnotate(916783105, andIncrement, "marker_id", r52.A00);
                try {
                    r6.BJ9(r52);
                    r4.markerEnd(916783105, andIncrement, 2);
                } catch (Exception unused2) {
                    r4.markerEnd(916783105, andIncrement, 3);
                } catch (Throwable th) {
                    AtomicInteger atomicInteger = (AtomicInteger) r7.A05.get(Integer.valueOf(r52.A01));
                    if (atomicInteger != null) {
                        atomicInteger.decrementAndGet();
                    }
                    throw th;
                }
                AtomicInteger atomicInteger2 = (AtomicInteger) r7.A05.get(Integer.valueOf(r52.A01));
                if (atomicInteger2 != null) {
                    atomicInteger2.decrementAndGet();
                    return;
                }
                return;
        }
    }
}
