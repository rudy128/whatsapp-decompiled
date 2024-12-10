package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.2ya  reason: invalid class name and case insensitive filesystem */
public class C66692ya implements AnonymousClass1TY {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C66692ya(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void C8H(Exception exc) {
        C21132Af0 af0;
        Object obj;
        switch (this.A00) {
            case 0:
                af0 = (C21132Af0) this.A02;
                obj = new C116825yg(exc);
                break;
            case 1:
                ((C26811To) this.A01).A09.unregisterObserver(this);
                return;
            case 2:
                Log.i("sync-manager/doPreCompanionLogoutTask onSyncdFailed");
                af0 = (C21132Af0) this.A02;
                obj = AnonymousClass000.A0h();
                break;
            default:
                return;
        }
        af0.A0B(obj);
    }

    public void C8I() {
        C21132Af0 af0;
        boolean A0i;
        switch (this.A00) {
            case 0:
                C55572g1 r1 = (C55572g1) this.A01;
                AnonymousClass1TS r8 = r1.A04;
                long A012 = C17900vP.A01(r8.A01("critical_block"));
                r8.A01("critical_unblock_low");
                if (r8.A06("critical_block") && A012 >= 1) {
                    C17880vN.A1C(AnonymousClass11Q.A00(r1.A03), "companion_syncd_critical_bootstrap_state", 2);
                }
                if (r8.A06("critical_block") && A012 >= 1 && r8.A06("critical_unblock_low")) {
                    af0 = (C21132Af0) this.A02;
                    A0i = new C46192Dn(AnonymousClass000.A0i());
                    break;
                } else {
                    return;
                }
            case 1:
                C26811To r2 = (C26811To) this.A01;
                r2.A09.unregisterObserver(this);
                HashMap A022 = r2.A0R.A02();
                C26371Rw r22 = r2.A0G;
                boolean equals = A022.equals(this.A02);
                C46402Ek r12 = new C46402Ek();
                r12.A00 = Boolean.valueOf(equals);
                r22.A08.CC7(r12);
                return;
            case 2:
                Log.i("sync-manager/doPreCompanionLogoutTask onSyncdSuccess");
                af0 = (C21132Af0) this.A02;
                A0i = AnonymousClass000.A0i();
                break;
            default:
                if (C26331Rs.A03(((C203711w) this.A01).A0b, "sentinel", true).isEmpty()) {
                    af0 = (C21132Af0) this.A02;
                    A0i = true;
                    break;
                } else {
                    return;
                }
        }
        af0.A0B(A0i);
    }
}
