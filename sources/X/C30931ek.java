package X;

import android.text.TextUtils;

/* renamed from: X.1ek  reason: invalid class name and case insensitive filesystem */
public class C30931ek {
    public C191109m2 A00 = null;
    public final AnonymousClass118 A01;
    public final AnonymousClass1QD A02;
    public final AnonymousClass1QJ A03;
    public final AnonymousClass1QS A04;

    public static C191109m2 A00(C30931ek r4) {
        C57312is r1;
        String str;
        BD1 A002;
        AnonymousClass1QJ r2 = r4.A03;
        if (r2.A02() != null) {
            r1 = r4.A04.A04(r2.A02().A03);
        } else {
            r1 = null;
        }
        AnonymousClass1KJ A012 = r2.A01();
        if (A012 != null) {
            str = ((AnonymousClass1KL) A012).A06;
            C18070vi.A0W(str);
        } else {
            str = null;
        }
        if (r1 == null || (A002 = r1.A00(str)) == null) {
            return null;
        }
        return A002.BWZ(r4.A01, r4.A02);
    }

    public String A01() {
        AnonymousClass1QE r2;
        StringBuilder sb;
        String str;
        C191109m2 r5 = this.A00;
        if (r5 == null) {
            r5 = A00(this);
            this.A00 = r5;
            if (r5 == null) {
                return null;
            }
        }
        AnonymousClass1QD r4 = r5.A01;
        String string = r4.A03().getString("payments_device_id", (String) null);
        if (!TextUtils.isEmpty(string)) {
            r2 = r5.A02;
            sb = new StringBuilder();
            str = "PaymentDeviceId: from cache: ";
        } else {
            string = r5.A00();
            r4.A03().edit().putString("payments_device_id", string).apply();
            r2 = r5.A02;
            sb = new StringBuilder();
            str = "PaymentDeviceId: generated: ";
        }
        sb.append(str);
        sb.append(string);
        AnonymousClass1QE.A02(r2, (String) null, sb.toString());
        return string;
    }

    public C30931ek(AnonymousClass118 r2, AnonymousClass1QD r3, AnonymousClass1QJ r4, AnonymousClass1QS r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }
}
