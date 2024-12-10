package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9lt  reason: invalid class name and case insensitive filesystem */
public final class C191019lt {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass00H A03;

    public C191019lt(AnonymousClass11P r1, C18030ve r2, AnonymousClass18K r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void A00(UserJid userJid, Integer num, Integer num2, Long l, String str, int i) {
        boolean z;
        if (C22971Dz.A0Y(userJid)) {
            C18030ve r3 = this.A01;
            C18040vf r2 = C18040vf.A02;
            if (C18020vd.A05(r2, r3, 2249)) {
                if ((num == null || num.intValue() == 200) && (num2 == null || num2.intValue() == 200)) {
                    z = false;
                } else {
                    z = true;
                }
                C171468rl r4 = new C171468rl();
                long j = 1;
                r4.A05 = 1L;
                boolean z2 = true;
                if ((C18020vd.A00(r2, r3, 2250) & 1) != 1) {
                    z2 = false;
                }
                r4.A00 = Boolean.valueOf(z2);
                r4.A09 = "status";
                if (l != null) {
                    long longValue = l.longValue();
                    long A012 = AnonymousClass11P.A01(this.A00);
                    r4.A07 = Long.valueOf(longValue);
                    r4.A02 = Long.valueOf(A012);
                    r4.A01 = C108945cZ.A1B(A012, longValue);
                }
                if (z) {
                    j = 0;
                }
                r4.A06 = Long.valueOf(j);
                if (num != null) {
                    r4.A03 = C17890vO.A0N(num);
                }
                if (num2 != null) {
                    r4.A04 = C17890vO.A0N(num2);
                }
                if (str != null) {
                    r4.A08 = str;
                }
                this.A02.CC7(r4);
                C17900vP.A0j("mexmigrationperftracker/requeststopped ", AnonymousClass000.A10(), i);
            }
        }
    }
}
