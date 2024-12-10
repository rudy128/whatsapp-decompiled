package X;

/* renamed from: X.4Rg  reason: invalid class name and case insensitive filesystem */
public class C86344Rg {
    public final AnonymousClass18K A00;

    public void A00(Boolean bool, Integer num, Long l, String str, int i, int i2) {
        C81593zU r3 = new C81593zU();
        r3.A00 = bool;
        r3.A02 = Integer.valueOf(i);
        r3.A03 = num;
        r3.A01 = Integer.valueOf(i2);
        r3.A05 = str;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue < 0 || longValue >= 100) {
                r3.A04 = -1L;
            } else {
                r3.A04 = l;
            }
        }
        this.A00.CC7(r3);
    }

    public void A01(String str, boolean z, boolean z2) {
        C81373z8 r1 = new C81373z8();
        r1.A01 = Boolean.valueOf(z);
        r1.A00 = Boolean.valueOf(z2);
        r1.A02 = str;
        this.A00.CC7(r1);
    }

    public C86344Rg(AnonymousClass18K r1) {
        this.A00 = r1;
    }
}
