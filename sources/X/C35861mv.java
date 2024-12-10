package X;

import android.content.SharedPreferences;

/* renamed from: X.1mv  reason: invalid class name and case insensitive filesystem */
public class C35861mv {
    public long A00 = 0;
    public long A01 = 0;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;
    public final C18030ve A04;

    public synchronized void A01(long j) {
        this.A00 = j;
        this.A01 = 0;
    }

    public synchronized void A02(String str) {
        C19830z4 r3 = this.A03;
        C62292rA A002 = C62292rA.A00(((SharedPreferences) r3.A00.get()).getString("companion_reg_with_link_code_companion_hello_info_json", (String) null));
        if (A002 != null && A002.A02.equals(str)) {
            C19830z4.A00(r3).remove("companion_reg_with_link_code_companion_hello_info_json").apply();
        }
    }

    public C62292rA A00() {
        C62292rA A002 = C62292rA.A00(((SharedPreferences) this.A03.A00.get()).getString("companion_reg_with_link_code_companion_hello_info_json", (String) null));
        if (A002 != null) {
            long j = A002.A00;
            if (j >= AnonymousClass11P.A01(this.A02)) {
                return A002;
            }
            A01(j);
        }
        return null;
    }

    public C35861mv(AnonymousClass11P r3, C19830z4 r4, C18030ve r5) {
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
