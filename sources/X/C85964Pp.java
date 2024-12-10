package X;

/* renamed from: X.4Pp  reason: invalid class name and case insensitive filesystem */
public final class C85964Pp {
    public final AnonymousClass18K A00;

    public C85964Pp(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(C41761x1 r10, Integer num, Integer num2, Long l, Long l2, Long l3, Long l4) {
        C18070vi.A0d(r10, 0);
        AnonymousClass18K r3 = this.A00;
        C81683zd r2 = new C81683zd();
        r2.A05 = Long.valueOf(r10.A03);
        r2.A00 = num;
        int i = r10.A02;
        int i2 = 4;
        if (r10.A04 <= 0) {
            if (i != 0) {
                if (i == 1) {
                    i2 = 1;
                } else if (i != 2) {
                    if (i != 3) {
                        i2 = 3;
                        if (i != 4) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 2;
                    }
                }
            }
            i2 = 5;
        }
        r2.A01 = Integer.valueOf(i2);
        r2.A02 = num2;
        r2.A03 = l;
        r2.A04 = l2;
        r2.A06 = l3;
        r2.A07 = l4;
        r3.CC7(r2);
    }
}
