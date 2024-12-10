package X;

/* renamed from: X.2hF  reason: invalid class name and case insensitive filesystem */
public final class C56302hF {
    public final String A00(String str, String str2, String str3) {
        int length;
        StringBuilder A11 = AnonymousClass000.A11(str2);
        A11.append(' ');
        if (!(str == null || (length = str.length()) == 0)) {
            if (((long) length) > 1024) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(str.subSequence(0, 1020));
                str = C17890vO.A0c(A10, 8230);
            }
            str3 = str;
        }
        return C17890vO.A0V(str3, A11);
    }
}
