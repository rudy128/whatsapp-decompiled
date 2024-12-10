package X;

import android.content.SharedPreferences;

/* renamed from: X.2tb  reason: invalid class name and case insensitive filesystem */
public class C63732tb {
    public SharedPreferences A00;
    public final C18010vc A01;
    public final String A02;

    public static SharedPreferences A00(C63732tb r2) {
        synchronized (r2) {
            if (r2.A00 == null) {
                r2.A00 = r2.A01.A05(r2.A02);
            }
        }
        return r2.A00;
    }

    public static void A02(C63732tb r4, String str, long j) {
        SharedPreferences.Editor A09;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        SharedPreferences A002 = A00(r4);
        if (i > 0) {
            A09 = A002.edit().putLong(str, j);
        } else {
            A09 = C17890vO.A09(A002, str);
        }
        A09.apply();
    }

    public C63732tb(C18010vc r3, String str) {
        this.A01 = r3;
        this.A02 = AnonymousClass001.A1H("acs_token_", str, AnonymousClass000.A10());
    }

    public static void A01(C63732tb r0, String str, int i) {
        SharedPreferences.Editor A09;
        SharedPreferences A002 = A00(r0);
        if (i >= 0) {
            A09 = A002.edit().putInt(str, i);
        } else {
            A09 = C17890vO.A09(A002, str);
        }
        A09.apply();
    }

    public static void A03(C63732tb r0, String str, String str2) {
        SharedPreferences.Editor A09;
        SharedPreferences A002 = A00(r0);
        if (str2 != null) {
            A09 = A002.edit().putString(str, str2);
        } else {
            A09 = C17890vO.A09(A002, str);
        }
        A09.apply();
    }

    public void A04(int i) {
        SharedPreferences.Editor A09;
        SharedPreferences A002 = A00(this);
        if (i > 0) {
            A09 = A002.edit().putInt("token_not_ready_reason", i);
        } else {
            A09 = C17890vO.A09(A002, "token_not_ready_reason");
        }
        A09.apply();
    }
}
