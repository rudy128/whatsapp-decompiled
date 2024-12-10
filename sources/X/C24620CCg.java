package X;

/* renamed from: X.CCg  reason: case insensitive filesystem */
public abstract class C24620CCg {
    public static final void A00(C17130tn r15, C17090tj r16, C36001nB r17, int i, int i2) {
        C17090tj r6 = r16;
        C17130tn r5 = r15;
        r15.COC(-480060508);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i;
        int i6 = i | 6;
        if (i4 == 0) {
            if ((i & 6) == 0) {
                i6 = AnonymousClass001.A0Q(r15, r6) | i;
            } else {
                i6 = i5;
            }
        }
        C36001nB r8 = r17;
        if ((i2 & 2) != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= AnonymousClass001.A0b(r15, r8);
        }
        if ((i6 & 19) != 18 || !r15.BZO()) {
            if (i4 != 0) {
                r6 = C17090tj.A00;
            }
            AnonymousClass0WV r7 = ((C25610Ciq) r15.BFh(CG9.A00)).A07;
            AnonymousClass07W r0 = CG7.A00;
            C03530Iq A00 = AnonymousClass0EB.A00(r5, 12, C26257Cw2.A02(r15, r0), C26257Cw2.A01(r15, r0));
            r5.BFh(CG8.A00);
            r5.COB(-574898487);
            AnonymousClass0KM r4 = new AnonymousClass0KM(4.0f);
            AnonymousClass0VR.A0U(r5);
            AnonymousClass0EC.A00((AnonymousClass0JY) null, A00, r4, r5, r6, r7, r8, (i6 & 14) | ((i6 << 12) & 458752), 16);
        } else {
            r15.CNR();
        }
        C05660Vf BKF = r5.BKF();
        if (BKF != null) {
            BKF.A06 = new C27148DWj(r6, i5, r8, i3, 0);
        }
    }
}
