package X;

/* renamed from: X.0Q8  reason: invalid class name */
public abstract class AnonymousClass0Q8 {
    public static final C17090tj A00(C17090tj r1, C18090vk r2, boolean z) {
        return C04470Nn.A01(r1, AnonymousClass0O1.A01(), new C14820pd(r2, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r4 > r3.getHeight()) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C16980tX A01(X.C06320Xv r24, float r25) {
        /*
            r14 = r25
            double r0 = (double) r14
            double r1 = java.lang.Math.ceil(r0)
            float r0 = (float) r1
            int r0 = (int) r0
            int r4 = r0 * 2
            X.0tX r1 = X.AnonymousClass0MO.A01
            X.0tV r2 = X.AnonymousClass0MO.A00
            X.0Wa r12 = X.AnonymousClass0MO.A00()
            if (r1 == 0) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            r0 = r1
            X.0WQ r0 = (X.AnonymousClass0WQ) r0
            android.graphics.Bitmap r3 = r0.A00
            int r0 = r3.getWidth()
            if (r4 > r0) goto L_0x0028
            int r0 = r3.getHeight()
            if (r4 <= r0) goto L_0x0043
        L_0x0028:
            r1 = 1
            X.09i r0 = X.C03090Go.A0G
            X.0WQ r1 = X.C02500Eg.A00(r0, r4, r4, r1)
            X.AnonymousClass0MO.A01 = r1
            android.graphics.Canvas r0 = X.AnonymousClass0M0.A00
            X.0WO r2 = new X.0WO
            r2.<init>()
            android.graphics.Bitmap r3 = r1.A00
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r3)
            r2.A00 = r0
            X.AnonymousClass0MO.A00 = r2
        L_0x0043:
            if (r12 != 0) goto L_0x004d
            X.0Wa r12 = new X.0Wa
            r12.<init>()
            X.AnonymousClass0MO.A01(r12)
        L_0x004d:
            r11 = r24
            X.By4 r10 = r11.A03()
            r0 = r1
            X.0WQ r0 = (X.AnonymousClass0WQ) r0
            android.graphics.Bitmap r4 = r0.A00
            int r0 = r4.getWidth()
            float r3 = (float) r0
            int r0 = r4.getHeight()
            float r0 = (float) r0
            long r3 = X.AnonymousClass001.A0p(r3, r0)
            long r5 = X.AnonymousClass0QG.A02
            X.0Ol r0 = r12.A04()
            X.ECa r9 = r0.A00()
            X.By4 r8 = r0.A02()
            X.0tV r7 = r0.A01
            long r5 = r0.A00
            r0.A04(r11)
            r0.A05(r10)
            r0.A01 = r2
            r0.A00 = r3
            r2.CGe()
            long r17 = X.C05100Qk.A01
            long r21 = r12.BZL()
            r16 = 58
            r13 = 0
            r19 = 0
            r15 = r12
            X.C04820Pb.A03(r15, r16, r17, r19, r21)
            r16 = 4278190080(0xff000000, double:2.113706745E-314)
            r3 = 32
            long r16 = r16 << r3
            long r22 = X.AnonymousClass0QY.A03
            long r24 = X.AnonymousClass001.A0p(r14, r14)
            r15 = 120(0x78, float:1.68E-43)
            r18 = r12
            r19 = r15
            r20 = r16
            X.C04820Pb.A03(r18, r19, r20, r22, r24)
            long r18 = X.AnonymousClass001.A0p(r14, r14)
            X.C04820Pb.A04(r12, r13, r14, r15, r16, r18)
            r2.CFz()
            r0.A04(r9)
            r0.A05(r8)
            r0.A01 = r7
            r0.A00 = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q8.A01(X.0Xv, float):X.0tX");
    }

    public static final boolean A05(C24245By3 by3, boolean z) {
        if (by3 == C24245By3.Ltr && !z) {
            return true;
        }
        if (by3 != C24245By3.Rtl || !z) {
            return false;
        }
        return true;
    }

    public static final void A02(AnonymousClass0CO r12, C16250rx r13, C17130tn r14, AnonymousClass1OS r15, int i) {
        int i2;
        C17130tn r6 = r14;
        r14.COC(345017889);
        int i3 = i;
        C16250rx r4 = r13;
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0Z(r14, r13) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass0CO r5 = r12;
        if ((i & 112) == 0) {
            i2 |= AnonymousClass001.A0R(r14, r12);
        }
        AnonymousClass1OS r3 = r15;
        if ((i3 & 896) == 0) {
            i2 |= AnonymousClass001.A0c(r14, r15);
        }
        if ((i2 & 731) != 146 || !r14.BZO()) {
            boolean A1Y = AnonymousClass001.A1Y(r14, r12, r13);
            Object CER = r14.CER();
            if (A1Y || CER == AnonymousClass0MH.A00) {
                CER = new C06330Xx(r12, r13);
                AnonymousClass0VR.A0V(r14, CER);
            }
            AnonymousClass0VR.A0R((AnonymousClass0VR) r6, false);
            C25365CeQ.A00(r6, (C06330Xx) CER, new C25999CqG((C24247By5) null, (AnonymousClass1Y1) null, 15, false, false, false, true, false), (C18090vk) null, r3, ((i2 << 3) & 7168) | 384, 2);
        } else {
            r14.CNR();
        }
        C05660Vf BKF = r6.BKF();
        if (BKF != null) {
            BKF.A03(new C13380nJ(r5, r4, r3, i3));
        }
    }

    public static final void A03(C16250rx r10, C17130tn r11, C17090tj r12, C24245By3 by3, int i, boolean z, boolean z2) {
        int i2;
        AnonymousClass0CO r2;
        C17130tn r3 = r11;
        r11.COC(-626955031);
        int i3 = i;
        C16250rx r5 = r10;
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0Z(r11, r10) | i;
        } else {
            i2 = i;
        }
        boolean z3 = z;
        if ((i & 112) == 0) {
            i2 |= AnonymousClass000.A0A(r11.BEg(z) ? 1 : 0);
        }
        C24245By3 by32 = by3;
        if ((i & 896) == 0) {
            i2 |= AnonymousClass001.A0S(r11, by3);
        }
        boolean z4 = z2;
        if ((i & 7168) == 0) {
            i2 |= AnonymousClass001.A0j(r11, z4);
        }
        C17090tj r6 = r12;
        if ((57344 & i) == 0) {
            i2 |= AnonymousClass001.A0U(r11, r12);
        }
        if ((46811 & i2) != 9362 || !r11.BZO()) {
            boolean A06 = A06(by3, z, z4);
            if (A06) {
                r2 = AnonymousClass0CO.TopRight;
            } else {
                r2 = AnonymousClass0CO.TopLeft;
            }
            A02(r2, r5, r3, AnonymousClass0LC.A00(r3, new C13480nT(r5, r6, (C16880tN) r11.BFh(AnonymousClass0OD.A0B), A06, z3), 1868300064), (i2 & 14) | 384);
        } else {
            r11.CNR();
        }
        C05660Vf BKF = r3.BKF();
        if (BKF != null) {
            BKF.A03(new C13550na(r5, r6, by32, i3, z3, z4));
        }
    }

    public static final void A04(C17130tn r2, C17090tj r3, C18090vk r4, int i, boolean z) {
        int i2;
        r2.COC(2111672474);
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0Z(r2, r3) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AnonymousClass001.A0b(r2, r4);
        }
        if ((i & 896) == 0) {
            i2 |= AnonymousClass001.A0i(r2, z);
        }
        if ((i2 & 731) != 146 || !r2.BZO()) {
            C02280Dk.A00(r2, A00(C05130Qo.A0B(r3, 25.0f, 25.0f), r4, z));
        } else {
            r2.CNR();
        }
        C05660Vf BKF = r2.BKF();
        if (BKF != null) {
            BKF.A03(new C13400nL(r3, r4, i, z));
        }
    }

    public static final boolean A06(C24245By3 by3, boolean z, boolean z2) {
        boolean A05 = A05(by3, z2);
        if (!z) {
            return AnonymousClass000.A1P(A05 ? 1 : 0);
        }
        return A05;
    }
}
