package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9zj  reason: invalid class name and case insensitive filesystem */
public final class C199279zj {
    public final C18030ve A00;
    public final A3X A01 = ((A3X) AnonymousClass12Q.A01(49505));
    public final C185099c1 A02;

    public C199279zj(C18030ve r2, C185099c1 r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A02 = r3;
    }

    public static final void A00(UserJid userJid, C180309Ma r6, C199279zj r7, int i, int i2) {
        Integer A012 = A3X.A01(r6, i);
        if (A012 != null) {
            int intValue = A012.intValue();
            if (C18020vd.A05(C18040vf.A02, r7.A00, 11027) || intValue != 897458200) {
                C55062f9 r3 = new C55062f9(userJid, "graphql", false, false);
                C185099c1 r2 = r7.A02;
                Integer num = r2.A00;
                if (i2 == 0) {
                    if (num != null) {
                        r2.A01.A04(r3, intValue, num.intValue());
                    }
                } else if (num != null) {
                    r2.A01.A03(r3, intValue, num.intValue());
                }
            }
        }
    }

    public final void A01(C180309Ma r5, int i) {
        Integer A012 = A3X.A01(r5, i);
        if (A012 != null) {
            int intValue = A012.intValue();
            if (C18020vd.A05(C18040vf.A02, this.A00, 11027) || intValue != 897458200) {
                C185099c1 r1 = this.A02;
                r1.A00 = Integer.valueOf(r1.A01.A02(intValue));
            }
        }
    }
}
