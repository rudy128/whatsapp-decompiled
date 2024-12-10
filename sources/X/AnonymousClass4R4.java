package X;

/* renamed from: X.4R4  reason: invalid class name */
public final class AnonymousClass4R4 {
    public Integer A00;
    public String A01;
    public final C18030ve A02;
    public final AnonymousClass18K A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(C104895Px.A00);
    public final AnonymousClass11P A05;

    public final void A00(AnonymousClass1BI r8, int i, int i2) {
        Integer num;
        C18030ve r5 = this.A02;
        C18040vf r4 = C18040vf.A02;
        if (C18020vd.A05(r4, r5, 8627)) {
            if (i == 1) {
                num = AnonymousClass00R.A00;
            } else if (i != 2) {
                num = AnonymousClass00R.A0C;
            } else {
                num = AnonymousClass00R.A01;
            }
            int intValue = num.intValue();
            String str = this.A01;
            if (intValue != 0) {
                if (str == null) {
                    return;
                }
            } else if (str == null) {
                this.A01 = C17890vO.A0Q();
            }
            C81663zb r3 = new C81663zb();
            r3.A05 = AnonymousClass3MW.A0y(this.A04);
            r3.A01 = Integer.valueOf(i);
            r3.A02 = Integer.valueOf(i2);
            r3.A03 = C64002u3.A08(r8);
            r3.A06 = this.A01;
            r3.A04 = Long.valueOf(System.currentTimeMillis());
            if (C18020vd.A05(r4, r5, 11229)) {
                r3.A00 = this.A00;
            }
            this.A03.CC4(r3);
            if (num == AnonymousClass00R.A0C) {
                this.A01 = null;
                this.A00 = 1;
            }
        }
    }

    public AnonymousClass4R4(AnonymousClass11P r2, C18030ve r3, AnonymousClass18K r4) {
        C18070vi.A0o(r3, r4, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r2;
    }
}
