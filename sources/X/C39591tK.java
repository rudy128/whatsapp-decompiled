package X;

import android.util.Pair;

/* renamed from: X.1tK  reason: invalid class name and case insensitive filesystem */
public abstract class C39591tK {
    public static final Pair A00(String str) {
        int A0B;
        if (!(str == null || (A0B = AnonymousClass1YF.A0B(str, '_', str.length() - 1)) == -1)) {
            try {
                String substring = str.substring(A0B + 1);
                C18070vi.A0X(substring);
                int parseInt = Integer.parseInt(substring);
                String substring2 = str.substring(0, A0B);
                C18070vi.A0X(substring2);
                if (substring2.length() != 0) {
                    return new Pair(substring2, Integer.valueOf(parseInt));
                }
            } catch (Exception e) {
                C60662oP.A00(new AnonymousClass20F(e.getClass()).A00);
            }
        }
        return null;
    }

    public static final String A01(String str) {
        C18070vi.A0d(str, 0);
        Pair A00 = A00(str);
        if (A00 != null) {
            return (String) A00.first;
        }
        return null;
    }
}
