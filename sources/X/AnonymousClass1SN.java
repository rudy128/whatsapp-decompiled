package X;

/* renamed from: X.1SN  reason: invalid class name */
public final class AnonymousClass1SN implements AnonymousClass1SK {
    public final AnonymousClass1SM A00;
    public final C18030ve A01;
    public final AnonymousClass1SL A02;

    public AnonymousClass1SN(C18030ve r2, AnonymousClass1SL r3, AnonymousClass1SM r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }

    public void BBK(C26551So r8, int i, long j, long j2) {
        C26551So r1 = r8;
        int i2 = i;
        long j3 = j;
        long j4 = j2;
        this.A02.BBK(r1, i2, j3, j4);
        if (C50262Tt.A00(this.A01)) {
            this.A00.BBK(r1, i2, j3, j4);
        }
    }

    public Float BNL(int i) {
        C18030ve r2 = this.A01;
        if (!C50262Tt.A00(r2) || !C18020vd.A05(C18040vf.A02, r2, 12166)) {
            return this.A02.BNL(i);
        }
        return this.A00.BNL(i);
    }

    public Float BNM(int i) {
        return this.A00.BNL(i);
    }
}
