package X;

/* renamed from: X.9mo  reason: invalid class name and case insensitive filesystem */
public final class C191569mo {
    public String A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(C22085AxP.A00);
    public final AnonymousClass11S A02;
    public final C18030ve A03;
    public final AnonymousClass18K A04;
    public final C62242r5 A05;

    public final void A00(AnonymousClass206 r7, Integer num, int i) {
        int i2;
        C18070vi.A0d(r7, 0);
        if (C18020vd.A05(C18040vf.A02, this.A03, 10438)) {
            int intValue = num.intValue();
            if ((intValue == 0 || intValue == 8 || intValue == 2 || intValue == 3) && this.A00 == null) {
                this.A00 = C17890vO.A0Q();
            }
            if (!(intValue == 1 || intValue == 4 || intValue == 6 || intValue == 5 || intValue == 2 || intValue == 3)) {
                switch (intValue) {
                    case 7:
                    case 9:
                    case 10:
                        break;
                }
            }
            if (this.A00 == null) {
                return;
            }
            AnonymousClass1BI r5 = r7.A0v.A00;
            AnonymousClass18K r4 = this.A04;
            C171488rn r3 = new C171488rn();
            r3.A08 = AnonymousClass3MW.A0y(this.A01);
            r3.A00 = Boolean.valueOf(AnonymousClass000.A1W(C63892tr.A04(this.A02, r7)));
            AnonymousClass8BG r0 = (AnonymousClass8BG) C18070vi.A09(r7, AnonymousClass8BG.class).A02;
            boolean z = false;
            if (r0 != null && r0.BXt() > 0) {
                z = true;
            }
            r3.A01 = Boolean.valueOf(z);
            r3.A03 = Integer.valueOf(C64002u3.A05(r7));
            r3.A02 = Integer.valueOf(this.A05.A01(r7));
            switch (intValue) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 11;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 7;
                    break;
                case 8:
                    i2 = 8;
                    break;
                case 9:
                    i2 = 9;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            r3.A04 = Integer.valueOf(i2);
            r3.A05 = Integer.valueOf(i);
            int i3 = 4;
            if (C22971Dz.A0V(r5)) {
                i3 = 26;
            }
            r3.A06 = Integer.valueOf(i3);
            r3.A07 = C64002u3.A08(r5);
            r3.A09 = this.A00;
            r4.CC4(r3);
            if (!(intValue == 2 || intValue == 3)) {
                switch (intValue) {
                    case 7:
                    case 9:
                    case 10:
                        break;
                    default:
                        return;
                }
            }
            this.A00 = null;
        }
    }

    public C191569mo(AnonymousClass11S r2, C18030ve r3, AnonymousClass18K r4, C62242r5 r5) {
        C18070vi.A0s(r3, r2, r4, r5);
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
    }
}
