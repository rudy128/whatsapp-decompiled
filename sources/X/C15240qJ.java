package X;

/* renamed from: X.0qJ  reason: invalid class name and case insensitive filesystem */
public final class C15240qJ extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C05120Qm $manager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15240qJ(C05120Qm r2) {
        super(3);
        this.$manager = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A04(AnonymousClass000.A0b(obj2, obj3), (C17090tj) obj);
    }

    public static final long A00(C17330uU r1) {
        return ((C26142Ct5) r1.getValue()).A03();
    }

    public static final void A02(C17330uU r1, long j) {
        r1.setValue(C26142Ct5.A00(j));
    }

    public final C17090tj A04(C17130tn r9, C17090tj r10) {
        r9.COB(1980580247);
        C28644ECa eCa = (C28644ECa) r9.BFh(AnonymousClass0OD.A01);
        Object A1A = AnonymousClass001.A1A(r9);
        Object obj = AnonymousClass0MH.A00;
        if (A1A == obj) {
            A1A = AnonymousClass0Q9.A02(C26142Ct5.A00(0));
            AnonymousClass0VR.A0V(r9, A1A);
        }
        AnonymousClass0VR r4 = (AnonymousClass0VR) r9;
        AnonymousClass0VR.A0R(r4, false);
        C17330uU r6 = (C17330uU) A1A;
        C09370gb r2 = new C09370gb(this.$manager, r6);
        boolean A1a = AnonymousClass001.A1a(r9, r6, eCa, -753410549);
        Object CER = r9.CER();
        if (A1a || CER == obj) {
            CER = new C10960jG(r6, eCa);
            r4.A0c(CER);
        }
        AnonymousClass0VR.A0R(r4, false);
        C17090tj A02 = AnonymousClass0PI.A02(r10, r2, (C22821Di) CER);
        AnonymousClass0VR.A0R(r4, false);
        return A02;
    }
}
