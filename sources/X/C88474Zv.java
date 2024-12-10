package X;

/* renamed from: X.4Zv  reason: invalid class name and case insensitive filesystem */
public final class C88474Zv {
    public static final C18180vt A05 = new C18180vt(1, 1);
    public boolean A00;
    public final AnonymousClass18K A01;
    public final C189339iv A02;
    public final C18030ve A03;
    public final C52202aX A04;

    public static final void A00(C81673zc r3, C88474Zv r4, int i, int i2, boolean z) {
        String str;
        r3.A06 = r4.A02.A00();
        r3.A01 = Integer.valueOf(i);
        r3.A00 = Integer.valueOf(i2);
        C52202aX r2 = r4.A04;
        synchronized (r2) {
            if (z) {
                Boolean bool = C17960vV.A01;
                str = C17890vO.A0Q();
                r2.A00 = str;
                C18070vi.A0z(str, "null cannot be cast to non-null type kotlin.String");
            } else {
                str = r2.A00;
                if (str == null) {
                    Boolean bool2 = C17960vV.A01;
                    str = C17890vO.A0Q();
                    r2.A00 = str;
                    C18070vi.A0z(str, "null cannot be cast to non-null type kotlin.String");
                }
            }
        }
        r3.A07 = str;
    }

    public static final void A01(C88474Zv r3, int i) {
        if (C18020vd.A05(C18040vf.A02, r3.A03, 9766)) {
            C72463Mc.A1E(new C81673zc(), r3, 92, i, false);
        }
    }

    public final void A02(int i, Integer num) {
        Long l;
        if (!this.A00) {
            this.A00 = true;
            C81673zc r2 = new C81673zc();
            A00(r2, this, i, 1, false);
            if (num != null) {
                l = C17890vO.A0N(num);
            } else {
                l = null;
            }
            r2.A04 = l;
            this.A01.CC6(r2, A05);
        }
    }

    public C88474Zv(C189339iv r1, C18030ve r2, AnonymousClass18K r3, C52202aX r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A03 = r2;
        this.A02 = r1;
        this.A01 = r3;
        this.A04 = r4;
    }
}
