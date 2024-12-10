package X;

import android.os.SystemClock;

/* renamed from: X.4qY  reason: invalid class name and case insensitive filesystem */
public class C98084qY implements C72313Ll {
    public final int A00;
    public final Object A01;

    public C98084qY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Byx() {
        if (this.A00 != 0) {
            ((C108165bE) this.A01).Byx();
        } else {
            AnonymousClass4Yv.A00(((C75403hR) this.A01).A02, 0);
        }
    }

    public void C12(boolean z, boolean z2) {
        boolean z3 = z2;
        if (this.A00 != 0) {
            ((C108165bE) this.A01).C11(z2);
            return;
        }
        C75403hR r3 = (C75403hR) this.A01;
        AnonymousClass4Yv.A00(r3.A02, 0);
        r3.A03.CNB(0, 2131895077);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C95704mf r1 = (C95704mf) r3.A0A;
        if (r1.A00 != 0) {
            AnonymousClass3VQ r0 = ((AnonymousClass4aY) r1.A01).A2b;
            AnonymousClass3VQ.A07(r0);
            AnonymousClass3VQ.A06(r0);
        }
        C49082Pc r12 = r3.A00;
        if (r12 != null) {
            r12.A01 = null;
            r12.A00 = null;
            r12.A0B(true);
        }
        C49082Pc r4 = new C49082Pc(r3.A05, r3.A0C, r3.A0F, r3.A01, elapsedRealtime, z, z3);
        r3.A00 = r4;
        r3.A0D.CGD(r4, new Object[0]);
    }
}
