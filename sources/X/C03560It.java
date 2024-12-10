package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0It  reason: invalid class name and case insensitive filesystem */
public final class C03560It {
    public List A00 = AnonymousClass000.A13();
    public boolean A01 = true;
    public List A02 = AnonymousClass000.A13();
    public final Object A03 = new Object();

    public final Object A00(C30391dr r5) {
        boolean z;
        Object obj = this.A03;
        synchronized (obj) {
            z = this.A01;
        }
        if (!z) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
            C31781g7 r1 = new C31781g7(1, C30581eB.A02(r5));
            r1.A0F();
            synchronized (obj) {
                this.A00.add(r1);
            }
            r1.Bdu(new C11010jL(this, r1));
            Object A0C = r1.A0C();
            if (A0C == AnonymousClass3F6.A03()) {
                return A0C;
            }
        }
        return C27621Wu.A00;
    }

    public final void A01() {
        synchronized (this.A03) {
            if (!this.A01) {
                List list = this.A00;
                this.A00 = this.A02;
                this.A02 = list;
                this.A01 = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C30391dr) list.get(i)).resumeWith(C27621Wu.A00);
                }
                list.clear();
            }
        }
    }
}
