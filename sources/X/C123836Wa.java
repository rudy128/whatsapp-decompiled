package X;

/* renamed from: X.6Wa  reason: invalid class name and case insensitive filesystem */
public abstract class C123836Wa {
    public static final String A00(String str) {
        int i;
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length > 4) {
            i = length - 4;
            str = C108955ca.A0z(str, i);
        } else {
            i = 0;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        for (int i2 = 0; i2 < i; i2++) {
            A10.append('*');
        }
        String A0y = AnonymousClass000.A0y(str, A10);
        C18070vi.A0X(A0y);
        return A0y;
    }
}
