package X;

import java.util.regex.Pattern;

/* renamed from: X.4ZA  reason: invalid class name */
public abstract class AnonymousClass4ZA {
    public static final String A00;

    public static final boolean A00(String str) {
        Pattern pattern = AnonymousClass4IW.A04;
        C18070vi.A0Z(pattern);
        if (str == null || str.length() == 0 || !pattern.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    public static final boolean A01(String str) {
        Pattern compile = Pattern.compile(A00);
        C18070vi.A0X(compile);
        if (str == null || str.length() == 0 || !compile.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("^(");
        A10.append(AnonymousClass4IW.A02.pattern());
        A00 = AnonymousClass000.A0y(")(\\:\\d{1,5})?$", A10);
    }
}
