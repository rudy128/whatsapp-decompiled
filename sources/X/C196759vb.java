package X;

import android.util.Base64;

/* renamed from: X.9vb  reason: invalid class name and case insensitive filesystem */
public abstract class C196759vb {
    public static final C193149pc A00(String str) {
        C18070vi.A0d(str, 0);
        byte[] decode = Base64.decode(str, 11);
        C18070vi.A0X(decode);
        return new C193149pc(decode);
    }

    public static final String A01(C193149pc r1) {
        C18070vi.A0d(r1, 0);
        String A0x = AnonymousClass8BT.A0x(r1.A00);
        C18070vi.A0X(A0x);
        return A0x;
    }
}
