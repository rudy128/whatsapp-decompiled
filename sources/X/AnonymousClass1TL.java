package X;

/* renamed from: X.1TL  reason: invalid class name */
public class AnonymousClass1TL {
    public final AnonymousClass18K A00;

    public static Integer A00(int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            return null;
                        }
                    }
                }
            }
        }
        return Integer.valueOf(i2);
    }

    public void A01(int i, int i2, String str) {
        AnonymousClass2FW r2 = new AnonymousClass2FW();
        r2.A00 = A00(i);
        r2.A01 = Long.valueOf((long) i2);
        r2.A02 = str;
        this.A00.CC7(r2);
    }

    public void A02(Integer num, String str, int i) {
        C46972Gp r1 = new C46972Gp();
        r1.A00 = A00(i);
        r1.A01 = num;
        r1.A08 = str;
        this.A00.CC7(r1);
    }

    public void A03(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        AnonymousClass2GX r2 = new AnonymousClass2GX();
        r2.A00 = A00(i);
        r2.A03 = Long.valueOf((long) i2);
        r2.A05 = Long.valueOf((long) i3);
        r2.A04 = Long.valueOf((long) i4);
        r2.A01 = Long.valueOf((long) i5);
        r2.A02 = Long.valueOf((long) i6);
        r2.A06 = str;
        this.A00.CC7(r2);
    }

    public void A04(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C46972Gp r2 = new C46972Gp();
        r2.A00 = A00(i);
        r2.A05 = Long.valueOf((long) i2);
        r2.A07 = Long.valueOf((long) i3);
        r2.A03 = Long.valueOf((long) i4);
        r2.A06 = Long.valueOf((long) i5);
        r2.A02 = Long.valueOf((long) i6);
        r2.A04 = Long.valueOf((long) i7);
        r2.A08 = str;
        this.A00.CC7(r2);
    }

    public AnonymousClass1TL(AnonymousClass18K r1) {
        this.A00 = r1;
    }
}
