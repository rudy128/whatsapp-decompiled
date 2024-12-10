package X;

/* renamed from: X.9ky  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C190459ky {
    public final /* synthetic */ DOZ A00;
    public final /* synthetic */ DFL A01;
    public final /* synthetic */ C166458cv A02;

    public final void A00(String str, int i, int i2, int i3, long j) {
        C166458cv r2 = this.A02;
        DOZ doz = this.A00;
        DFL dfl = this.A01;
        C26962DNk A012 = C26272CwJ.A01(doz);
        A012.A0A(new C26964DNm((long) dfl.A04), new C166528d2(r2, str, j));
        A012.A07();
        E8A A0A = dfl.A0A(44);
        if (A0A != null) {
            C20046A4p a4p = new C20046A4p();
            a4p.A03(str, 0);
            a4p.A03(Integer.valueOf(i3), 1);
            a4p.A03(Integer.valueOf(i2), 2);
            a4p.A03(Integer.valueOf(i), 3);
            C20046A4p.A01(doz, dfl, a4p, A0A);
        }
        E8A A0A2 = dfl.A0A(49);
        if (A0A2 != null) {
            C20046A4p a4p2 = new C20046A4p();
            a4p2.A03(str, 0);
            a4p2.A03(Integer.valueOf(i3), 1);
            a4p2.A03(Integer.valueOf(i2), 2);
            a4p2.A03(Integer.valueOf(i), 3);
            a4p2.A03(Long.valueOf(j), 4);
            C20046A4p.A01(doz, dfl, a4p2, A0A2);
        }
    }

    public /* synthetic */ C190459ky(DOZ doz, DFL dfl, C166458cv r3) {
        this.A02 = r3;
        this.A00 = doz;
        this.A01 = dfl;
    }
}
