package X;

import android.content.SharedPreferences;

/* renamed from: X.1i6  reason: invalid class name and case insensitive filesystem */
public class C33001i6 {
    public SharedPreferences A00;
    public SharedPreferences A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass00H A03;
    public final C18010vc A04;

    public static synchronized SharedPreferences A00(C33001i6 r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A04.A05("msg_attribute_pref_file");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static synchronized SharedPreferences A01(C33001i6 r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A01;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A04.A05("in_app_msg_source_pref_file");
                r2.A01 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static String A02(AnonymousClass1BI r2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(r2.getRawString());
        sb.append(",");
        sb.append(str);
        return sb.toString();
    }

    public void A03(AnonymousClass205 r4, int i) {
        AnonymousClass1BI r2 = r4.A00;
        if (r2 != null) {
            A01(this).edit().putInt(A02(r2, r4.A01), i).apply();
        }
    }

    public C33001i6(AnonymousClass11P r1, C18010vc r2, AnonymousClass00H r3) {
        this.A02 = r1;
        this.A03 = r3;
        this.A04 = r2;
    }
}
