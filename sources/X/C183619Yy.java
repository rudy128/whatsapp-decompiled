package X;

import java.util.regex.Pattern;

/* renamed from: X.9Yy  reason: invalid class name and case insensitive filesystem */
public class C183619Yy {
    public final Pattern A00;

    public C183619Yy(String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("(?:WhatsApp|");
        A10.append(Pattern.quote(str));
        this.A00 = Pattern.compile(AnonymousClass000.A0y(").*?([0-9]{3})-([0-9]{3})", A10));
    }
}
