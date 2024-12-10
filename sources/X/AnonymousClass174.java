package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.174  reason: invalid class name */
public final class AnonymousClass174 {
    public static final SimpleDateFormat A00;
    public static final SimpleDateFormat A01;

    static {
        Locale locale = Locale.US;
        A00 = new SimpleDateFormat("MMM dd", locale);
        A01 = new SimpleDateFormat("hh:mm a", locale);
    }
}
