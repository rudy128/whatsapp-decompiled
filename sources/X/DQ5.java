package X;

import java.util.regex.Pattern;

public final class DQ5 implements EBR {
    public static final DQU A02 = new Object();
    public final String A00;
    public final String A01;

    public boolean BKb(C5x c5x) {
        C18070vi.A0d(c5x, 0);
        String str = this.A01;
        boolean A0A = AnonymousClass1YE.A0A(str, "$.", false);
        Object obj = str;
        if (A0A) {
            obj = c5x.A00(str);
        }
        if (obj instanceof String) {
            return Pattern.compile(this.A00).matcher((CharSequence) obj).find();
        }
        throw BE6.A0v("Input string is null");
    }

    public DQ5(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
