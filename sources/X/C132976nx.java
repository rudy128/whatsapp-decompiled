package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.6nx  reason: invalid class name and case insensitive filesystem */
public final class C132976nx {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass18K A06;

    public final void A00(Integer num, String str, int i, int i2, int i3) {
        AnonymousClass64K r4 = new AnonymousClass64K();
        r4.A06 = this.A01;
        r4.A00 = Integer.valueOf(i);
        r4.A09 = this.A02;
        r4.A0B = this.A00;
        r4.A0A = this.A03;
        r4.A0C = this.A04;
        r4.A0D = String.valueOf(i2);
        r4.A07 = String.valueOf(i3);
        r4.A03 = str;
        r4.A01 = C197569wu.A0D;
        r4.A04 = "mobile";
        r4.A05 = "Android";
        r4.A08 = String.valueOf(System.currentTimeMillis());
        if (num != null) {
            int intValue = num.intValue();
            r4.A0E = String.valueOf(intValue);
            r4.A02 = String.valueOf(C22339B3q.A00((double) TimeUnit.MILLISECONDS.toSeconds((long) intValue)));
        }
        this.A06.CC4(r4);
    }

    public C132976nx(AnonymousClass11P r1, AnonymousClass18K r2) {
        C18070vi.A0j(r2, r1);
        this.A06 = r2;
        this.A05 = r1;
    }
}
