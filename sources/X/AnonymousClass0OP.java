package X;

/* renamed from: X.0OP  reason: invalid class name */
public final class AnonymousClass0OP {
    public static final C16680sp A05 = AnonymousClass0ET.A00(C12550lw.A00, C14560pD.A00);
    public long A00;
    public AnonymousClass0NU A01;
    public final C17270uO A02;
    public final C17270uO A03;
    public final C17330uU A04;

    public final void A01(AnonymousClass0CI r9, AnonymousClass0NU r10, int i, int i2) {
        float f;
        float f2;
        float f3 = (float) (i2 - i);
        this.A02.CIw(f3);
        float f4 = r10.A01;
        AnonymousClass0NU r2 = this.A01;
        if (!(f4 == r2.A01 && r10.A03 == r2.A03)) {
            if (r9 == AnonymousClass0CI.Vertical) {
                f4 = r10.A03;
                f = r10.A00;
            } else {
                f = r10.A02;
            }
            C17270uO r4 = this.A03;
            float BRr = r4.BRr();
            float f5 = (float) i;
            float f6 = f5 + BRr;
            if (f > f6 || (f4 < BRr && f - f4 > f5)) {
                f2 = f - f6;
            } else if (f4 >= BRr || f - f4 > f5) {
                f2 = 0.0f;
            } else {
                f2 = f4 - BRr;
            }
            r4.CIw(r4.BRr() + f2);
            this.A01 = r10;
        }
        C17270uO r22 = this.A03;
        r22.CIw(C28851b7.A02(r22.BRr(), 0.0f, f3));
    }

    public final int A00(long j) {
        int i = (int) (j >> 32);
        long j2 = this.A00;
        if (i != ((int) (j2 >> 32))) {
            return i;
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 == ((int) (j2 & 4294967295L))) {
            return C26260Cw5.A02(j);
        }
        return i2;
    }

    public AnonymousClass0OP(AnonymousClass0CI r3, float f) {
        C18100vl r0 = AnonymousClass0GU.A01;
        this.A03 = new AnonymousClass08X(f);
        this.A02 = new AnonymousClass08X(0.0f);
        this.A01 = AnonymousClass0NU.A04;
        this.A00 = C24498C6s.A00();
        this.A04 = AnonymousClass0Q9.A01(r3);
    }

    public AnonymousClass0OP() {
        this(AnonymousClass0CI.Vertical, 0.0f);
    }
}
