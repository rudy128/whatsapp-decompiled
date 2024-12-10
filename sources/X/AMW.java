package X;

import java.util.concurrent.atomic.AtomicLong;

public class AMW implements B74 {
    public final int A00;
    public final Object A01;

    public AMW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bqr(long j) {
        if (this.A00 != 0) {
            ((C191969nU) this.A01).A0R.addAndGet(j);
            return;
        }
        C20463AMa aMa = (C20463AMa) this.A01;
        AtomicLong atomicLong = aMa.A0g;
        atomicLong.addAndGet(j);
        if (j >= 10240) {
            aMa.A0I.notifyAllObservers(new AnonymousClass35L(atomicLong.get(), 2, aMa.A0e.get()));
        }
    }
}
