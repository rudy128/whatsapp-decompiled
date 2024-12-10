package X;

import android.content.SharedPreferences;

/* renamed from: X.1Oh  reason: invalid class name and case insensitive filesystem */
public class C25461Oh {
    public SharedPreferences A00;
    public final C18010vc A01;

    public static synchronized SharedPreferences A00(C25461Oh r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A05("network_resources_pref");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public C25461Oh(C18010vc r1) {
        this.A01 = r1;
    }

    public int A01(String str) {
        SharedPreferences A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("downloadstate/");
        sb.append(str);
        return A002.getInt(sb.toString(), 5);
    }

    public void A02(String str, int i) {
        SharedPreferences.Editor edit = A00(this).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("downloadstate/");
        sb.append(str);
        edit.putInt(sb.toString(), i).apply();
    }
}
