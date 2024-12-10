package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.72e  reason: invalid class name and case insensitive filesystem */
public final class C1406072e {
    public final AnonymousClass18K A00;
    public final AnonymousClass1MZ A01;

    public static final void A00(C1183863g r2, AnonymousClass1BI r3, C1406072e r4) {
        boolean z = r3 instanceof AnonymousClass1EC;
        r2.A00 = Boolean.valueOf(z);
        if (z) {
            AnonymousClass1MZ r1 = r4.A01;
            r2.A01 = Boolean.valueOf(r1.A0K((GroupJid) r3));
            r2.A03 = Integer.valueOf(C64002u3.A03(r1.A08.A09((AnonymousClass1E9) r3)));
        }
    }

    public static final void A01(C1183863g r3, AnonymousClass1BI r4, AnonymousClass22H r5) {
        int i;
        int i2;
        AnonymousClass205 r0;
        if (r4 == null) {
            if (r5 == null || (r0 = r5.A0v) == null) {
                r4 = null;
            } else {
                r4 = r0.A00;
            }
        }
        boolean A19 = C18070vi.A19(r3.A00, true);
        if (C22971Dz.A0V(r4)) {
            i = 5;
        } else if (C22971Dz.A0d(r4)) {
            i2 = 1;
            r3.A02 = i2;
        } else if (C22971Dz.A0a(r4)) {
            i = 3;
        } else if (C22971Dz.A0N(r4)) {
            i = 4;
        } else {
            i = 0;
            if (A19) {
                i = 2;
            }
        }
        i2 = Integer.valueOf(i);
        r3.A02 = i2;
    }

    public static final void A02(C1183863g r4, AnonymousClass22H r5) {
        long j = r5.A0I;
        r4.A05 = Long.valueOf(C17880vN.A04(j - (j % 86400000)));
        r4.A06 = C108975cc.A0Y(r5.A07);
    }

    public C1406072e(AnonymousClass1MZ r1, AnonymousClass18K r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
