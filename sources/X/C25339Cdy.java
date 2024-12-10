package X;

import java.util.List;

/* renamed from: X.Cdy  reason: case insensitive filesystem */
public abstract class C25339Cdy {
    public static String A00(Integer num, List list) {
        char c = '|';
        if (num == AnonymousClass00R.A00) {
            c = '/';
        }
        StringBuilder A10 = AnonymousClass000.A10();
        for (Object next : list) {
            A10.append(c);
            A10.append(next);
        }
        return A10.toString();
    }

    public static String A01(String str, String str2) {
        if (str2 == null || str2.equals("")) {
            return str;
        }
        return AnonymousClass001.A1H("#", str2, AnonymousClass000.A11(str));
    }
}
