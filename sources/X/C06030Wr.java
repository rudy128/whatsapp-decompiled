package X;

/* renamed from: X.0Wr  reason: invalid class name and case insensitive filesystem */
public final class C06030Wr implements C17440uf, C17430ue, C17410uc {
    public final C17330uU A00;
    public final C17330uU A01;
    public final C17100tk A02;

    public /* synthetic */ boolean BC2(C22821Di r2) {
        return AnonymousClass0LD.A01(this, r2);
    }

    public /* synthetic */ Object BLT(Object obj, AnonymousClass1OS r3) {
        return AnonymousClass0LD.A00(this, obj, r3);
    }

    public /* synthetic */ int BjB(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P0.A00(r2, r3, this, i);
    }

    public /* synthetic */ int BjE(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P0.A01(r2, r3, this, i);
    }

    public /* synthetic */ int Bjx(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P0.A02(r2, r3, this, i);
    }

    public /* synthetic */ int Bk0(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P0.A03(r2, r3, this, i);
    }

    public /* synthetic */ C17090tj CP5(C17090tj r2) {
        return AnonymousClass0EW.A00(this, r2);
    }

    public C16820tH Bja(C17500ul r8, C17530uo r9, long j) {
        C17330uU r3 = this.A01;
        int BTy = ((C17100tk) r3.getValue()).BTy(r9, r9.getLayoutDirection());
        int Bab = ((C17100tk) r3.getValue()).Bab(r9);
        int BYN = ((C17100tk) r3.getValue()).BYN(r9, r9.getLayoutDirection()) + BTy;
        int BNd = ((C17100tk) r3.getValue()).BNd(r9) + Bab;
        AnonymousClass0XJ Bjb = r8.Bjb(C26229CvL.A05(-BYN, -BNd, j));
        return r9.BhL(AnonymousClass1D7.A0I(), new C10410iI(Bjb, BTy, Bab), C26229CvL.A01(j, Bjb.A01 + BYN), C26229CvL.A00(j, Bjb.A00 + BNd));
    }

    public void Byh(C16460sI r5) {
        C17100tk r3 = (C17100tk) r5.BPr(C03960Lh.A00);
        C17100tk r2 = this.A02;
        this.A01.setValue(new C05580Uu(r2, r3));
        this.A00.setValue(new C05590Uv(r3, r2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06030Wr)) {
            return false;
        }
        return C18070vi.A18(((C06030Wr) obj).A02, this.A02);
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return this.A00.getValue();
    }

    public int hashCode() {
        return this.A02.hashCode();
    }

    public C06030Wr(C17100tk r2) {
        this.A02 = r2;
        this.A01 = AnonymousClass0Q9.A02(r2);
        this.A00 = AnonymousClass0Q9.A01(r2);
    }

    public AnonymousClass0OJ BTf() {
        return C03960Lh.A00;
    }
}
