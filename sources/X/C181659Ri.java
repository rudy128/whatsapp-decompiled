package X;

import java.util.regex.Matcher;

/* renamed from: X.9Ri  reason: invalid class name and case insensitive filesystem */
public abstract class C181659Ri {
    public static final String A00(String str) {
        C18070vi.A0d(str, 0);
        Matcher A0z = AnonymousClass8BU.A0z(str, "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$");
        if (A0z.find()) {
            return C17900vP.A0A(A0z.group(1), A0z.group(2));
        }
        return str;
    }
}
