package X;

/* renamed from: X.0pZ  reason: invalid class name and case insensitive filesystem */
public final class C14780pZ extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C26251Cvq $style;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14780pZ(C26251Cvq cvq) {
        super(3);
        this.$style = cvq;
    }

    public final C17090tj A00(C17130tn r18) {
        int i;
        int i2;
        C17130tn r6 = r18;
        r6.COB(1582736677);
        C28644ECa eCa = (C28644ECa) r6.BFh(AnonymousClass0OD.A01);
        E3V e3v = (E3V) r6.BFh(AnonymousClass0OD.A03);
        C24246By4 by4 = (C24246By4) AnonymousClass000.A0t(r6);
        C26251Cvq cvq = this.$style;
        boolean A1a = AnonymousClass001.A1a(r6, cvq, by4, 511388516);
        Object CER = r6.CER();
        if (A1a || CER == AnonymousClass0MH.A00) {
            CER = C24500C6u.A00(cvq, by4);
            r6.CRH(CER);
        }
        AnonymousClass0VR r3 = (AnonymousClass0VR) r6;
        AnonymousClass0VR.A0R(r3, false);
        C26251Cvq cvq2 = (C26251Cvq) CER;
        boolean A1a2 = AnonymousClass001.A1a(r6, e3v, cvq2, 511388516);
        Object CER2 = r6.CER();
        if (A1a2 || CER2 == AnonymousClass0MH.A00) {
            C24693CGf A0A = cvq2.A0A();
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
            CER2 = e3v.CFu(A0A, A0D, i, i2);
            r6.CRH(CER2);
        }
        AnonymousClass0VR.A0R(r3, false);
        C16300s2 r1 = (C16300s2) CER2;
        C26251Cvq cvq3 = this.$style;
        Object A1A = AnonymousClass001.A1A(r6);
        if (A1A == AnonymousClass0MH.A00) {
            A1A = new C04380Mz(cvq3, e3v, eCa, by4, r1.getValue());
            r3.A0c(A1A);
        }
        AnonymousClass0VR.A0R(r3, false);
        C04380Mz r62 = (C04380Mz) A1A;
        r62.A01(cvq2, e3v, eCa, by4, r1.getValue());
        C17090tj A00 = C02620Es.A00(C17090tj.A00, new C14770pY(r62));
        AnonymousClass0VR.A0R(r3, false);
        return A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00(AnonymousClass000.A0b(obj2, obj3));
    }
}
