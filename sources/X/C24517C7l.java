package X;

import java.util.List;

/* renamed from: X.C7l  reason: case insensitive filesystem */
public abstract class C24517C7l {
    public static final String A00(DFL dfl) {
        C18070vi.A0d(dfl, 0);
        String str = "";
        String A0f = BE7.A0f(dfl);
        if (A0f != null) {
            str = A0f;
        }
        List list = dfl.A0A;
        if (!dfl.A0I(51, true) || list == null || list.isEmpty()) {
            return str;
        }
        String A00 = C25339Cdy.A00(AnonymousClass00R.A01, list);
        C18070vi.A0X(A00);
        String A01 = C25339Cdy.A01(str, A00);
        C18070vi.A0b(A01);
        return A01;
    }
}
