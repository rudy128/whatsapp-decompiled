package X;

/* renamed from: X.4oY  reason: invalid class name and case insensitive filesystem */
public final class C96874oY implements C22515BAy {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C107535aB A02;
    public final /* synthetic */ C36341nj A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Long A05;

    public void BzD(C29681ch r18) {
        C29681ch r4 = r18;
        C18070vi.A0d(r4, 0);
        C36341nj r3 = this.A03;
        long j = this.A01;
        int i = this.A00;
        Long l = this.A05;
        C107535aB r5 = this.A02;
        if (j != -1) {
            if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r3.A02), 4682)) {
                AnonymousClass00H r1 = r3.A08;
                ((AW1) r1.get()).A03(r4);
                AW1 aw1 = (AW1) r1.get();
                C104675Pb r32 = new C104675Pb(r4, r5, l, i, j);
                AnonymousClass1CJ r12 = (AnonymousClass1CJ) aw1.A02.get();
                C18070vi.A0X(r12);
                if (AnonymousClass4aS.A08(r12, r4, (AnonymousClass1c4) C18070vi.A0E(aw1.A05))) {
                    AW1.A02(aw1, new AnonymousClass3C8(aw1, r4, r32, 10, j));
                    return;
                }
                return;
            }
        }
        ((AW1) r3.A08.get()).A03(r4);
        r5.C7g(r4, l, i, j);
    }

    public void onError(Throwable th) {
        int i;
        String A0R;
        C18070vi.A0d(th, 0);
        A6Q.A02((A6Q) this.A03.A0D.get(), this.A04, 3);
        C96884oZ r2 = (C96884oZ) this.A02;
        AnonymousClass1FU r3 = (AnonymousClass1FU) r2.A03.get();
        if (r3 != null) {
            r2.A00.A06(r3);
            r3.CEx();
            if (th instanceof C175048xu) {
                i = 2131896262;
            } else if ((th instanceof C175058xv) || !(th instanceof C175068xw)) {
                i = 2131892810;
            } else {
                int i2 = ((C21598Amm) th).code;
                if (i2 != 405) {
                    if (i2 == 451) {
                        AnonymousClass00H r22 = r2.A01;
                        String A012 = ((C133836pa) r22.get()).A01(((C133836pa) r22.get()).A00());
                        if (A012 != null) {
                            A0R = C17890vO.A0R(r3, A012, 1, 0, 2131892640);
                            C18070vi.A0b(A0R);
                            r3.BhS((String) null, A0R);
                        }
                    } else {
                        Integer num = r2.A02;
                        i = 2131892713;
                        if (num == AnonymousClass00R.A0C) {
                            i = 2131892714;
                        }
                    }
                }
                i = 2131892820;
            }
            A0R = r3.getString(i);
            C18070vi.A0b(A0R);
            r3.BhS((String) null, A0R);
        }
    }

    public C96874oY(C107535aB r1, C36341nj r2, Integer num, Long l, int i, long j) {
        this.A03 = r2;
        this.A01 = j;
        this.A00 = i;
        this.A05 = l;
        this.A02 = r1;
        this.A04 = num;
    }
}
