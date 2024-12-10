package X;

/* renamed from: X.6q2  reason: invalid class name */
public final class AnonymousClass6q2 {
    public final C19830z4 A00;
    public final C120656Et A01;
    public final C120666Eu A02;
    public final C53952dM A03;
    public final C19880zA A04;
    public final AnonymousClass11E A05;
    public final AnonymousClass11P A06;
    public final C18030ve A07;
    public final C132086mB A08;
    public final C120676Ev A09;

    public final void A00(Integer num) {
        C143877Fd r0;
        if (this.A05.A09()) {
            int intValue = num.intValue();
            if (intValue == 1) {
                r0 = this.A01;
            } else if (intValue != 2) {
                r0 = this.A09;
            } else {
                r0 = this.A02;
            }
            r0.A0C();
            if (num != AnonymousClass00R.A0N) {
                this.A08.A00(new AnonymousClass7LX(this, num, 0), num);
            }
        }
    }

    public final boolean A01(long j) {
        int A002 = C18020vd.A00(C18040vf.A02, this.A07, 7233);
        if (A002 < 30) {
            A002 = 2592000;
        }
        return AnonymousClass000.A1Q(((AnonymousClass11P.A00(this.A06) - j) > ((long) A002) ? 1 : ((AnonymousClass11P.A00(this.A06) - j) == ((long) A002) ? 0 : -1)));
    }

    public AnonymousClass6q2(C19880zA r1, AnonymousClass11E r2, AnonymousClass11P r3, C19830z4 r4, C18030ve r5, C120656Et r6, C132086mB r7, C120666Eu r8, C120676Ev r9, C53952dM r10) {
        C18070vi.A0s(r3, r5, r6, r9);
        C18070vi.A0x(r10, r4, r8, r1, r2);
        this.A06 = r3;
        this.A07 = r5;
        this.A01 = r6;
        this.A09 = r9;
        this.A08 = r7;
        this.A03 = r10;
        this.A00 = r4;
        this.A02 = r8;
        this.A04 = r1;
        this.A05 = r2;
    }
}
