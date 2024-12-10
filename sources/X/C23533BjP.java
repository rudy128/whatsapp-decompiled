package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.BjP  reason: case insensitive filesystem */
public class C23533BjP extends C27079DTe {
    public final int A00;
    public final Object A01;

    public C23533BjP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void b() {
        if (this.A00 != 0) {
            C26028Cqm cqm = (C26028Cqm) this.A01;
            synchronized (cqm.A08) {
                AtomicInteger atomicInteger = cqm.A0D;
                if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                    if (cqm.A01 != null) {
                        cqm.A06.A02("Unbind from service.", new Object[0]);
                        cqm.A03.unbindService(cqm.A00);
                        cqm.A02 = false;
                        cqm.A01 = null;
                        cqm.A00 = null;
                    }
                    C26028Cqm.A00(cqm);
                } else {
                    cqm.A06.A02("Leaving the connection open for other ongoing calls.", new Object[0]);
                }
            }
            return;
        }
        C26028Cqm cqm2 = ((C26337Cxu) this.A01).A00;
        cqm2.A06.A02("unlinkToDeath", new Object[0]);
        cqm2.A01.asBinder().unlinkToDeath(cqm2.A05, 0);
        cqm2.A01 = null;
        cqm2.A02 = false;
    }
}
