package X;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* renamed from: X.72V  reason: invalid class name */
public abstract class AnonymousClass72V {
    /* JADX WARNING: type inference failed for: r0v7, types: [X.6Uc, java.lang.Object] */
    public static final C123356Uc A01(String str) {
        C18070vi.A0d(str, 0);
        String[] A1b = C108955ca.A1b(C108985cd.A0s(str, 1));
        Long A05 = C63782tg.A05(A1b, 0);
        Boolean A02 = C63782tg.A02(A1b, 1);
        Long A052 = C63782tg.A05(A1b, 2);
        Long A053 = C63782tg.A05(A1b, 3);
        Boolean A022 = C63782tg.A02(A1b, 4);
        Boolean A023 = C63782tg.A02(A1b, 5);
        Boolean A024 = C63782tg.A02(A1b, 6);
        Boolean A025 = C63782tg.A02(A1b, 7);
        ? obj = new Object();
        obj.A07 = A05;
        obj.A01 = A02;
        obj.A05 = A052;
        obj.A06 = A053;
        obj.A00 = A022;
        obj.A04 = A023;
        obj.A02 = A024;
        obj.A03 = A025;
        return obj;
    }

    public static final String A02() {
        C19810z2<AnonymousClass6RW> r0 = AnonymousClass6RW.A00;
        ArrayList A0D = C29351c6.A0D(r0);
        for (AnonymousClass6RW r02 : r0) {
            A0D.add(r02.defaultValue);
        }
        return C108995ce.A0X(",", A0D);
    }

    public static C123356Uc A00(SharedPreferences sharedPreferences, String str) {
        return A01(sharedPreferences.getString(str, A02()));
    }

    public static final String A03(String str) {
        StringBuilder A0K = C18070vi.A0K(str);
        A0K.append(str);
        return AnonymousClass000.A0y("_actions", A0K);
    }
}
