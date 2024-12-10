package X;

/* renamed from: X.0pf  reason: invalid class name and case insensitive filesystem */
public final class C14840pf extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C26251Cvq $textStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14840pf(C26251Cvq cvq, int i, int i2) {
        super(3);
        this.$minLines = i;
        this.$maxLines = i2;
        this.$textStyle = cvq;
    }

    public final C17090tj A00(C17130tn r15) {
        Integer valueOf;
        float f;
        float f2;
        C17090tj A0A;
        int i;
        int i2;
        r15.COB(408240218);
        int i3 = this.$minLines;
        int i4 = this.$maxLines;
        C02420Dy.A00(i3, i4);
        if (i3 == 1 && i4 == Integer.MAX_VALUE) {
            A0A = C17090tj.A00;
        } else {
            C28644ECa eCa = (C28644ECa) r15.BFh(AnonymousClass0OD.A01);
            E3V e3v = (E3V) r15.BFh(AnonymousClass0OD.A03);
            C24246By4 by4 = (C24246By4) AnonymousClass000.A0t(r15);
            C26251Cvq cvq = this.$textStyle;
            boolean A1a = AnonymousClass001.A1a(r15, cvq, by4, 511388516);
            Object CER = r15.CER();
            if (A1a || CER == AnonymousClass0MH.A00) {
                CER = C24500C6u.A00(cvq, by4);
                r15.CRH(CER);
            }
            AnonymousClass0VR r3 = (AnonymousClass0VR) r15;
            AnonymousClass0VR.A0R(r3, false);
            C26251Cvq cvq2 = (C26251Cvq) CER;
            boolean A1a2 = AnonymousClass001.A1a(r15, e3v, cvq2, 511388516);
            Object CER2 = r15.CER();
            if (A1a2 || CER2 == AnonymousClass0MH.A00) {
                C24693CGf A0A2 = cvq2.A0A();
                DSF A0D = cvq2.A0D();
                if (A0D == null) {
                    A0D = C70.A00();
                }
                C25823Cma A0B = cvq2.A0B();
                if (A0B != null) {
                    i = A0B.A01();
                } else {
                    i = 0;
                }
                C25824Cmb A0C = cvq2.A0C();
                if (A0C != null) {
                    i2 = A0C.A01();
                } else {
                    i2 = 1;
                }
                CER2 = e3v.CFu(A0A2, A0D, i, i2);
                r15.CRH(CER2);
            }
            AnonymousClass0VR.A0R(r3, false);
            C16300s2 r2 = (C16300s2) CER2;
            int i5 = 0;
            Object[] objArr = {eCa, e3v, this.$textStyle, by4, r2.getValue()};
            r15.COB(-568225417);
            int i6 = 0;
            boolean z = false;
            do {
                z |= r15.BEf(objArr[i6]);
                i6++;
            } while (i6 < 5);
            Object CER3 = r15.CER();
            if (z || CER3 == AnonymousClass0MH.A00) {
                CER3 = AnonymousClass000.A0r(r15, AnonymousClass000.A0H(C04550Nv.A01(cvq2, e3v, eCa, C04550Nv.A00, 1)));
            }
            AnonymousClass0VR.A0R(r3, false);
            int A0M = AnonymousClass000.A0M(CER3);
            Object[] objArr2 = {eCa, e3v, this.$textStyle, by4, r2.getValue()};
            r15.COB(-568225417);
            boolean z2 = false;
            do {
                z2 |= r15.BEf(objArr2[i5]);
                i5++;
            } while (i5 < 5);
            Object CER4 = r15.CER();
            if (z2 || CER4 == AnonymousClass0MH.A00) {
                StringBuilder A10 = AnonymousClass000.A10();
                String str = C04550Nv.A00;
                A10.append(str);
                A10.append(10);
                CER4 = AnonymousClass000.A0r(r15, AnonymousClass000.A0H(C04550Nv.A01(cvq2, e3v, eCa, AnonymousClass000.A0y(str, A10), 2)));
            }
            AnonymousClass0VR.A0R(r3, false);
            int A0M2 = AnonymousClass000.A0M(CER4) - A0M;
            int i7 = this.$minLines;
            Integer num = null;
            if (i7 == 1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(((i7 - 1) * A0M2) + A0M);
            }
            int i8 = this.$maxLines;
            if (i8 != Integer.MAX_VALUE) {
                num = Integer.valueOf(A0M + (A0M2 * (i8 - 1)));
            }
            AnonymousClass0WC r22 = C17090tj.A00;
            if (valueOf != null) {
                f = eCa.CPG(valueOf.intValue());
            } else {
                f = Float.NaN;
            }
            if (num != null) {
                f2 = eCa.CPG(num.intValue());
            } else {
                f2 = Float.NaN;
            }
            A0A = C05130Qo.A0A(r22, f, f2);
        }
        AnonymousClass0VR.A0T(r15);
        return A0A;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00(AnonymousClass000.A0b(obj2, obj3));
    }
}
