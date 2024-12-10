package X;

/* renamed from: X.CCf  reason: case insensitive filesystem */
public abstract class C24619CCf {
    public static final void A00(C17130tn r15, C17090tj r16, String str, C18090vk r18, int i, int i2, boolean z, boolean z2) {
        boolean z3 = z2;
        C17090tj r11 = r16;
        String str2 = str;
        C18070vi.A0d(str2, 0);
        C18090vk r13 = r18;
        C18070vi.A0d(r13, 2);
        C17130tn r10 = r15;
        r15.COC(998025949);
        int i3 = i2;
        int i4 = i;
        int i5 = i | 6;
        if ((i2 & 1) == 0) {
            if ((i & 6) == 0) {
                i5 = AnonymousClass001.A0Q(r15, str2) | i;
            } else {
                i5 = i4;
            }
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            i5 |= AnonymousClass000.A0A(r15.BEg(z4) ? 1 : 0);
        }
        if ((i2 & 4) != 0) {
            i5 |= 384;
        } else if ((i4 & 384) == 0) {
            i5 |= AnonymousClass001.A0c(r15, r13);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i5 |= AnonymousClass001.A0T(r15, r11);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i5 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i5 |= AnonymousClass000.A08(r15.BEg(z3) ? 1 : 0);
        }
        if ((i5 & 9363) != 9362 || !r15.BZO()) {
            if (i6 != 0) {
                r11 = C17090tj.A00;
            }
            if (i7 != 0) {
                z3 = true;
            }
            int i8 = i5 >> 6;
            C04440Nk.A00((AnonymousClass0JY) null, (C17210uI) null, (AnonymousClass0tB) null, C25347Ce6.A00(r15), (AnonymousClass0NL) null, r10, r11, (C16370s9) null, r13, AnonymousClass0LC.A00(r15, new DXY(z4, str2), -934805811), (i8 & 14) | 805306368 | (i8 & 112) | (i8 & 896), 488, z3);
        } else {
            r15.CNR();
        }
        C05660Vf BKF = r10.BKF();
        if (BKF != null) {
            BKF.A06 = new DX7(r11, str2, r13, i4, i3, z4, z3);
        }
    }
}
