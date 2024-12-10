package X;

import androidx.compose.material3.ButtonElevation$animateElevation$1$1;
import androidx.compose.material3.ButtonElevation$animateElevation$2;
import androidx.compose.material3.ButtonElevation$animateElevation$3;

/* renamed from: X.0NL  reason: invalid class name */
public final class AnonymousClass0NL {
    public final C05780Vr A01(C16110rj r2, C17130tn r3, boolean z) {
        C18070vi.A0d(r2, 1);
        r3.COB(-2045116089);
        C05780Vr A00 = A00(r2, r3, z);
        AnonymousClass0VR.A0T(r3);
        return A00;
    }

    public final C05780Vr A02(C16110rj r2, C17130tn r3, boolean z) {
        C18070vi.A0d(r2, 1);
        r3.COB(-423890235);
        C05780Vr A00 = A00(r2, r3, z);
        AnonymousClass0VR.A0T(r3);
        return A00;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof AnonymousClass0NL) && AnonymousClass000.A1P(Float.compare(0.0f, 0.0f)) && AnonymousClass000.A1P(Float.compare(1.0f, 1.0f)));
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(0.0f);
        return AnonymousClass000.A0B(((((floatToIntBits * 31) + floatToIntBits) * 31) + floatToIntBits) * 31, 1.0f) + floatToIntBits;
    }

    private final C05780Vr A00(C16110rj r12, C17130tn r13, boolean z) {
        float f;
        r13.COB(-1312510462);
        Object A0u = AnonymousClass000.A0u(r13, -492369756);
        Object obj = AnonymousClass0MH.A00;
        if (A0u == obj) {
            A0u = C04950Pq.A03();
            r13.CRH(A0u);
        }
        AnonymousClass0VR r2 = (AnonymousClass0VR) r13;
        AnonymousClass0VR.A0R(r2, false);
        C06820Zu r5 = (C06820Zu) A0u;
        boolean A1Y = AnonymousClass001.A1Y(r13, r12, r5);
        Object CER = r13.CER();
        if (A1Y || CER == obj) {
            CER = new ButtonElevation$animateElevation$1$1(r12, r5, (C30391dr) null);
            r2.A0c(CER);
        }
        AnonymousClass0VR.A0R(r2, false);
        AnonymousClass0QC.A04(r13, r12, (AnonymousClass1OS) CER);
        C15670r0 r7 = (C15670r0) C29431cG.A0e(r5);
        if (!z) {
            f = 0.0f;
        } else if (r7 instanceof AnonymousClass0Uk) {
            f = 0.0f;
        } else if (r7 instanceof C05430Ue) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        Object A0u2 = AnonymousClass000.A0u(r13, -492369756);
        if (A0u2 == obj) {
            A0u2 = new AnonymousClass0Q3(AnonymousClass0MW.A01, DSH.A00(f), (Object) null);
            r2.A0c(A0u2);
        }
        AnonymousClass0VR.A0R(r2, false);
        AnonymousClass0Q3 r6 = (AnonymousClass0Q3) A0u2;
        if (!z) {
            r13.COB(-719930083);
            AnonymousClass0QC.A04(r13, DSH.A00(f), new ButtonElevation$animateElevation$2(r6, (C30391dr) null, f));
        } else {
            r13.COB(-719929940);
            AnonymousClass0QC.A04(r13, DSH.A00(f), new ButtonElevation$animateElevation$3(r6, r7, this, (C30391dr) null, f));
        }
        AnonymousClass0VR.A0R(r2, false);
        C05780Vr r0 = r6.A04;
        AnonymousClass0VR.A0R(r2, false);
        return r0;
    }
}
