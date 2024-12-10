package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.4fg  reason: invalid class name and case insensitive filesystem */
public class C91434fg implements AnonymousClass1GC, C218317o {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C91434fg(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void C6U(C27581Wq r5, AnonymousClass1F9 r6) {
        switch (this.A00) {
            case 0:
                AnonymousClass1G8 r2 = (AnonymousClass1G8) this.A01;
                AnonymousClass1GW r1 = (AnonymousClass1GW) this.A02;
                if (r5 == C27581Wq.ON_DESTROY) {
                    r2.A04(r1);
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(r5, 1);
                if (r5 == C27581Wq.ON_START) {
                    ((C23381Fv) this.A01).A06(this);
                    ((AnonymousClass1GB) this.A02).A02();
                    return;
                }
                return;
            case 2:
                C86074Qb r3 = (C86074Qb) this.A01;
                AnonymousClass1OB r22 = (AnonymousClass1OB) this.A02;
                C18070vi.A0i(r3, r6);
                if (((C23391Fw) r6.getLifecycle()).A02 == C23401Fx.DESTROYED) {
                    r22.BEM((CancellationException) null);
                    r3.A00();
                    return;
                }
                int compareTo = ((C23391Fw) r6.getLifecycle()).A02.compareTo(r3.A01);
                C190859ld r12 = r3.A00;
                if (compareTo < 0) {
                    r12.A01 = true;
                    return;
                } else if (!r12.A01) {
                    return;
                } else {
                    if (!r12.A00) {
                        r12.A01 = false;
                        r12.A00();
                        return;
                    }
                    throw AnonymousClass000.A0n("Cannot resume a finished dispatcher");
                }
            default:
                BLs bLs = (BLs) this.A01;
                if (!bLs.A06.A0z()) {
                    r6.getLifecycle().A06(this);
                    C73713Xa r13 = (C73713Xa) this.A02;
                    if (r13.A0H.isAttachedToWindow()) {
                        bLs.A0W(r13);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
