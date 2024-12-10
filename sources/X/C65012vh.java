package X;

import android.os.Handler;

/* renamed from: X.2vh  reason: invalid class name and case insensitive filesystem */
public class C65012vh implements AnonymousClass1GC, C218317o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C65012vh(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void C6U(C27581Wq r6, AnonymousClass1F9 r7) {
        C27581Wq r0;
        if (this.A00 == 0) {
            AnonymousClass1G8 r4 = (AnonymousClass1G8) this.A01;
            C23401Fx r3 = (C23401Fx) this.A02;
            AnonymousClass1GW r2 = (AnonymousClass1GW) this.A03;
            int ordinal = r3.ordinal();
            if (ordinal == 2) {
                r0 = C27581Wq.ON_CREATE;
            } else if (ordinal == 3) {
                r0 = C27581Wq.ON_START;
            } else if (ordinal != 4) {
                r0 = null;
            } else {
                r0 = C27581Wq.ON_RESUME;
            }
            if (r6 == r0) {
                r4.A03(r2);
            } else if (r6 == C27581Wq.ON_DESTROY) {
                r4.A04(r2);
            } else if (r6 == C27591Wr.A00(r3)) {
                r4.A01.remove(r2);
                r4.A00.run();
            }
        } else if (r6 == C27581Wq.ON_DESTROY) {
            ((Handler) this.A02).removeCallbacks((Runnable) this.A03);
            r7.getLifecycle().A06(this);
        }
    }
}
