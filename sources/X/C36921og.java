package X;

import java.util.Set;

/* renamed from: X.1og  reason: invalid class name and case insensitive filesystem */
public class C36921og {
    public final AnonymousClass00H A00;

    public void A00(int i, int i2) {
        for (AM5 am5 : (Set) this.A00.get()) {
            AM5.A01(am5, i);
            if (i2 == 3 || i2 == 5 || i2 == 7) {
                AM5.A00(am5);
            }
        }
    }

    public void A01(Double d, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        for (AM5 A04 : (Set) this.A00.get()) {
            A04.A04(d, num, str, str2, str3, str4, str5, str6, i, i2);
        }
    }

    public C36921og(AnonymousClass00H r1) {
        this.A00 = r1;
    }
}
