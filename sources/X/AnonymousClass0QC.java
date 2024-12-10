package X;

/* renamed from: X.0QC  reason: invalid class name */
public abstract class AnonymousClass0QC {
    public static final AnonymousClass0EI A00 = new Object();

    public static /* synthetic */ AnonymousClass1OD A01() {
        return new AnonymousClass1OD((AnonymousClass1OB) null);
    }

    public static final AnonymousClass1OX A00(C17130tn r3, C18560wh r4) {
        AnonymousClass1OD r1;
        AnonymousClass1OU r2 = AnonymousClass1OB.A00;
        if (r4.get(r2) != null) {
            AnonymousClass1OD A01 = A01();
            A01.A11(AnonymousClass000.A0k("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            r1 = A01;
        } else {
            C18560wh BN8 = r3.BN8();
            r1 = BN8.plus(C62892sA.A01((AnonymousClass1OB) BN8.get(r2))).plus(r4);
        }
        return AnonymousClass1OW.A02(r1);
    }

    public static final void A02(C17130tn r3, Object obj, Object obj2, AnonymousClass1OS r6) {
        r3.COB(590241125);
        C18560wh BN8 = r3.BN8();
        boolean A1Y = AnonymousClass001.A1Y(r3, obj, obj2);
        Object CER = r3.CER();
        if (A1Y || CER == AnonymousClass0MH.A00) {
            r3.CRH(new C05700Vj(BN8, r6));
        }
        AnonymousClass0VR.A0L((AnonymousClass0VR) r3);
    }

    public static final void A03(C17130tn r2, Object obj, C22821Di r4) {
        r2.COB(-1371986847);
        boolean A1X = AnonymousClass001.A1X(r2, obj);
        Object CER = r2.CER();
        if (A1X || CER == AnonymousClass0MH.A00) {
            r2.CRH(new C05690Vi(r4));
        }
        AnonymousClass0VR.A0L((AnonymousClass0VR) r2);
    }

    public static final void A04(C17130tn r3, Object obj, AnonymousClass1OS r5) {
        r3.COB(1179185413);
        C18560wh BN8 = r3.BN8();
        boolean A1X = AnonymousClass001.A1X(r3, obj);
        Object CER = r3.CER();
        if (A1X || CER == AnonymousClass0MH.A00) {
            r3.CRH(new C05700Vj(BN8, r5));
        }
        AnonymousClass0VR.A0L((AnonymousClass0VR) r3);
    }

    public static final void A05(C17130tn r0, C18090vk r1) {
        r0.CDj(r1);
    }
}
