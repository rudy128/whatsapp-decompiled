package X;

import android.content.SharedPreferences;

public final class A6F {
    public final SharedPreferences A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11P A02;
    public final String A03;

    public int A03(C179549Ik r4, String str) {
        String str2;
        C18070vi.A0d(str, 1);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            str2 = "impressionCount";
        } else if (ordinal == 1) {
            str2 = "primaryActionCount";
        } else if (ordinal != 2) {
            str2 = "dismissActionCount";
        } else {
            str2 = "secondaryActionCount";
        }
        return C17890vO.A00(this.A00, A01(str, str2));
    }

    public long A04(C179549Ik r4, String str) {
        String str2;
        C18070vi.A0d(str, 1);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            str2 = "lastImpressionTime";
        } else if (ordinal == 1) {
            str2 = "primaryActionTime";
        } else if (ordinal != 2) {
            str2 = "dismissActionTime";
        } else {
            str2 = "secondaryActionTime";
        }
        return C17890vO.A05(this.A00, A01(str, str2));
    }

    public A6F(SharedPreferences sharedPreferences, AnonymousClass11P r3, AnonymousClass00H r4, String str) {
        C18070vi.A0s(r3, r4, str, sharedPreferences);
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = sharedPreferences;
        if (str.length() == 0) {
            throw AnonymousClass000.A0n("surfaceId cannot be empty");
        }
        this.A03 = str;
    }

    public static final String A00(A6F a6f, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(a6f.A03);
        return C17890vO.A0Z(str, A10, '/');
    }

    public static final String A01(String str, String str2) {
        if (str.length() != 0) {
            return C17890vO.A0Z(str2, AnonymousClass000.A11(str), '/');
        }
        throw AnonymousClass000.A0n("promotionId cannot be empty");
    }

    public static final void A02(A6F a6f, String str, String str2, String str3, String str4) {
        String A012 = A01(str, str2);
        String A013 = A01(str, str3);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = a6f.A00;
        SharedPreferences.Editor putLong = sharedPreferences.edit().putInt(A012, C17890vO.A00(sharedPreferences, A012) + 1).putLong(A013, currentTimeMillis);
        if (str4 != null) {
            putLong.putLong(A00(a6f, str4), currentTimeMillis);
        }
        putLong.apply();
    }
}
