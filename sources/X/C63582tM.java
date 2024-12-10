package X;

import android.content.SharedPreferences;

/* renamed from: X.2tM  reason: invalid class name and case insensitive filesystem */
public class C63582tM {
    public SharedPreferences A00;
    public final C18010vc A01;

    public static SharedPreferences A00(C63582tM r2) {
        synchronized (r2) {
            if (r2.A00 == null) {
                r2.A00 = r2.A01.A05("privatestats_props");
            }
        }
        return r2.A00;
    }

    public static void A01(C63582tM r4, String str, long j) {
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

    public void A04(int i) {
        SharedPreferences.Editor A09;
        SharedPreferences A002 = A00(this);
        if (i >= 0) {
            A09 = A002.edit().putInt("redeem_count", i);
        } else {
            A09 = C17890vO.A09(A002, "redeem_count");
        }
        A09.apply();
    }

    public C63582tM(C18010vc r1) {
        this.A01 = r1;
    }

    public static void A02(C63582tM r0, String str, String str2) {
        SharedPreferences.Editor A09;
        SharedPreferences A002 = A00(r0);
        if (str2 != null) {
            A09 = A002.edit().putString(str, str2);
        } else {
            A09 = C17890vO.A09(A002, str);
        }
        A09.apply();
    }

    public void A03(int i) {
        C17880vN.A1C(A00(this).edit(), "first_token_stage", i);
    }

    public void A05(int i) {
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
