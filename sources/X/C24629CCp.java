package X;

/* renamed from: X.CCp  reason: case insensitive filesystem */
public abstract class C24629CCp {
    public static final void A00(C17130tn r19, C17090tj r20, String str, String str2, C22821Di r23, int i, int i2, boolean z) {
        C22821Di r8 = r23;
        boolean z2 = z;
        C17090tj r16 = r20;
        String str3 = str;
        C18070vi.A0d(str3, 0);
        String str4 = str2;
        C18070vi.A0d(str4, 1);
        C17130tn r10 = r19;
        r10.COC(1129463510);
        int i3 = i;
        int i4 = i | 6;
        if ((i2 & 1) == 0) {
            if ((i & 6) == 0) {
                i4 = AnonymousClass001.A0Q(r10, str3) | i;
            } else {
                i4 = i3;
            }
        }
        if ((i2 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= AnonymousClass001.A0R(r10, str4);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i3 & 384) == 0) {
            i4 |= AnonymousClass001.A0S(r10, r16);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i4 |= AnonymousClass001.A0j(r10, z2);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i4 |= AnonymousClass000.A08(r10.BEh(r8) ? 1 : 0);
        }
        if ((i4 & 9363) != 9362 || !r10.BZO()) {
            if (i5 != 0) {
                r16 = C17090tj.A00;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (i7 != 0) {
                r8 = new C27139DWa(2);
            }
            C17090tj CP5 = r16.CP5(C05130Qo.A01);
            r10.COB(-1250871621);
            int i8 = i4 & 57344;
            int i9 = i4 & 14;
            boolean A1T = AnonymousClass000.A1T(i8, 16384) | AnonymousClass000.A1T(i9, 4);
            Object CER = r10.CER();
            if (A1T || CER == AnonymousClass0MH.A00) {
                CER = new DWV(str3, r8, 0);
                r10.CRH(CER);
            }
            AnonymousClass0VR r2 = (AnonymousClass0VR) r10;
            AnonymousClass0VR.A0R(r2, false);
            C17090tj A01 = C04470Nn.A01(CP5, AnonymousClass0O1.A00, new C14890pk((C18090vk) CER, z2));
            C16870tM A0N = BEB.A0N(r10, AnonymousClass0MX.A03);
            int i10 = r2.A01;
            C17350uW BPs = r10.BPs();
            C18090vk r0 = C05030Qc.A00;
            AnonymousClass04D A012 = AnonymousClass0LO.A01(A01);
            BEA.A19(r10, r2, r0);
            BE9.A18(r10, A0N, BPs);
            AnonymousClass1OS r1 = C05030Qc.A01;
            if (r2.A0K || !BE9.A1R(r10, i10)) {
                BE9.A19(r10, r1, i10);
            }
            BEB.A0r(r10, A012);
            AnonymousClass0WC r13 = C17090tj.A00;
            r10.BFh(CG8.A00);
            C17090tj A05 = AnonymousClass0Q7.A05(r13, 8.0f, 0.0f);
            r10.COB(-520185158);
            boolean A1T2 = AnonymousClass000.A1T(i8, 16384) | AnonymousClass000.A1T(i9, 4);
            Object CER2 = r10.CER();
            if (A1T2 || CER2 == AnonymousClass0MH.A00) {
                CER2 = new DWV(str3, r8, 1);
                r10.CRH(CER2);
            }
            AnonymousClass0VR.A0R(r2, false);
            C24632CCs.A00((C03550Is) null, r10, A05, (C18090vk) CER2, (i4 >> 9) & 14, 24, z2, false);
            C24628CCo.A00(r10, (C17090tj) null, str3, str4, i9 | (i4 & 112), 4);
            BEA.A18(r10, r2);
        } else {
            r10.CNR();
        }
        C05660Vf BKF = r10.BKF();
        if (BKF != null) {
            BKF.A06 = new DX9(r16, str3, str4, r8, i3, i2, z2);
        }
    }
}
