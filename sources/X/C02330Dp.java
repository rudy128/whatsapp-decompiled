package X;

/* renamed from: X.0Dp  reason: invalid class name and case insensitive filesystem */
public abstract class C02330Dp {
    public static final void A00(AnonymousClass0H3 r9, C17130tn r10, C17090tj r11, C18090vk r12, AnonymousClass1OS r13, int i, int i2) {
        AnonymousClass0H3 r4 = r9;
        C17090tj r5 = r11;
        r10.COC(2002163445);
        int i3 = i2;
        int i4 = i;
        int i5 = i | 6;
        C18090vk r6 = r12;
        if ((i2 & 1) == 0) {
            if ((i & 14) == 0) {
                i5 = AnonymousClass001.A0a(r10, r12) | i;
            } else {
                i5 = i;
            }
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 112) == 0) {
            i5 |= AnonymousClass001.A0R(r10, r11);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i & 896) == 0) {
            i5 |= AnonymousClass001.A0S(r10, r4);
        }
        AnonymousClass1OS r7 = r13;
        if ((i2 & 8) != 0) {
            i5 |= 3072;
        } else if ((i & 7168) == 0) {
            i5 |= AnonymousClass001.A0d(r10, r13);
        }
        if ((i5 & 5851) != 1170 || !r10.BZO()) {
            if (i6 != 0) {
                r5 = C17090tj.A00;
            }
            if (i7 != 0) {
                r4 = null;
            }
            C02380Du.A00(r10, AnonymousClass0LC.A00(r10, new C14880pj(r4, AnonymousClass0Ou.A01(r10, r12), r5, r13), -1488997347), 6);
        } else {
            r10.CNR();
        }
        C05660Vf BKF = r10.BKF();
        if (BKF != null) {
            BKF.A03(new C13540nZ(r4, r5, r6, r7, i4, i3));
        }
    }
}
