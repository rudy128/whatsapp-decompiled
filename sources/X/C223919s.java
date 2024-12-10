package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.19s  reason: invalid class name and case insensitive filesystem */
public abstract class C223919s {
    public static final String A00;

    static {
        String format = String.format(Locale.US, "%07d", Arrays.copyOf(new Object[]{Long.valueOf((System.currentTimeMillis() / 1000) % 10000000)}, 1));
        C18070vi.A0X(format);
        A00 = format;
    }
}
