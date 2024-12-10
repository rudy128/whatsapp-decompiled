package X;

/* renamed from: X.2jf  reason: invalid class name and case insensitive filesystem */
public final class C57802jf {
    public long A00 = -1;
    public long A01 = -1;
    public final AnonymousClass00H A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass10I A04;

    public final void A00(AnonymousClass206 r13, int i) {
        if (i == 0) {
            if (this.A01 == -1 && this.A00 == -1) {
                this.A01 = System.currentTimeMillis();
            }
        } else if (i == 8) {
            long j = this.A01;
            if (j != -1 && this.A00 == -1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.A00 = currentTimeMillis;
                this.A04.CGF(new AnonymousClass3C3(this, r13, 5, currentTimeMillis - j));
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public C57802jf(AnonymousClass11P r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        C18070vi.A0o(r3, r4, r5);
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }
}
