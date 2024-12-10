package X;

/* renamed from: X.0Wn  reason: invalid class name and case insensitive filesystem */
public final class C05990Wn implements C17440uf {
    public final long A00;

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

    public C16820tH Bja(C17500ul r7, C17530uo r8, long j) {
        C18070vi.A0d(r8, 0);
        C18070vi.A0d(r7, 1);
        AnonymousClass0XJ Bjb = r7.Bjb(j);
        int i = Bjb.A01;
        long j2 = this.A00;
        int max = Math.max(i, r8.CG9(C26200CuV.A01(j2)));
        int max2 = Math.max(Bjb.A00, r8.CG9(C26200CuV.A00(j2)));
        return r8.BhL(AnonymousClass1D7.A0I(), new C11240ji(Bjb, max, max2), max, max2);
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

    public boolean equals(Object obj) {
        C05990Wn r7;
        if ((obj instanceof C05990Wn) && (r7 = (C05990Wn) obj) != null) {
            long j = this.A00;
            long j2 = r7.A00;
            long j3 = C26200CuV.A02;
            if (j != j2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = C26200CuV.A02;
        return AnonymousClass000.A0I(j);
    }

    public C05990Wn(long j) {
        this.A00 = j;
    }
}
