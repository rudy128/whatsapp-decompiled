package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9oX  reason: invalid class name and case insensitive filesystem */
public abstract class C192519oX {
    public C192519oX A00;
    public C189819ju A01;
    public boolean A02;
    public AtomicInteger A03 = new AtomicInteger(0);

    public void A04() {
        C192519oX r2 = this.A00;
        if (r2 != null) {
            throw AnonymousClass000.A0n(AnonymousClass001.A1E(r2, "Already added to ", AnonymousClass000.A10()));
        }
    }

    public void A05(C189819ju r4) {
        int incrementAndGet = this.A03.incrementAndGet();
        if (incrementAndGet == 1) {
            this.A01 = r4;
            if (!this.A02) {
                this.A02 = true;
                return;
            }
            throw AnonymousClass000.A0n("Internal bug, expected object to be immutable");
        }
        throw AnonymousClass8BX.A0W("Acquired object with non-zero initial refCount current = ", AnonymousClass000.A10(), incrementAndGet);
    }
}
