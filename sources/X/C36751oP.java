package X;

import android.content.SharedPreferences;

/* renamed from: X.1oP  reason: invalid class name and case insensitive filesystem */
public class C36751oP {
    public final C19830z4 A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final C30921ej A03;

    public void A00(int i) {
        C19830z4 r3 = this.A00;
        long A012 = AnonymousClass11P.A01(this.A01);
        SharedPreferences.Editor edit = ((SharedPreferences) r3.A00.get()).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("smb_merchant_payment_account_nag_last_seen_");
        sb.append(i);
        edit.putLong(sb.toString(), A012).apply();
    }

    public C36751oP(AnonymousClass11P r1, C19830z4 r2, C18030ve r3, C30921ej r4) {
        this.A01 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r2;
    }
}
