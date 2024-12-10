package X;

import java.util.Locale;

/* renamed from: X.9kH  reason: invalid class name and case insensitive filesystem */
public abstract class C190039kH {
    public final C184419av A00;
    public final String A01;

    public C190039kH(C184419av r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final String A00() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        C184419av r3 = this.A00;
        switch (r3.A00.intValue()) {
            case 0:
                str = "ice";
                break;
            case 1:
                str = "newsletter";
                break;
            case 2:
                str = "smbCore";
                break;
            default:
                str = "smbApp";
                break;
        }
        Locale locale = Locale.ROOT;
        A10.append(AnonymousClass8BS.A0p(locale, str));
        A10.append('/');
        A10.append(AnonymousClass8BS.A0p(locale, r3.A01));
        A10.append('/');
        return AnonymousClass000.A0y(this.A01, A10);
    }
}
