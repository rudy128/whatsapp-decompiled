package X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.B3u  reason: case insensitive filesystem */
public final class C22343B3u extends AnonymousClass1ON {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(C22343B3u.class, Object.class, "_disposer$volatile");
    public AnonymousClass1OI A00;
    public final C31761g5 A01;
    public final /* synthetic */ C199209zc A02;
    public volatile /* synthetic */ Object _disposer$volatile;

    public C22343B3u(C199209zc r1, C31761g5 r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public void Bdq(Throwable th) {
        if (th != null) {
            C31761g5 r3 = this.A01;
            if (C31781g7.A02(new C30681eL(th), (C22821Di) null, (C31781g7) r3) != null) {
                r3.BFP();
                C21555Am2 am2 = (C21555Am2) A03.get(this);
                if (am2 != null) {
                    am2.A00();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C199209zc.A01;
        C199209zc r1 = this.A02;
        if (atomicIntegerFieldUpdater.decrementAndGet(r1) == 0) {
            C31761g5 r5 = this.A01;
            ArrayList A0z = C17880vN.A0z(r3);
            for (EEF BP5 : r1.A00) {
                A0z.add(BP5.BP5());
            }
            r5.resumeWith(A0z);
        }
    }
}
