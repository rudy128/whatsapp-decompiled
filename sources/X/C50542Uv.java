package X;

import android.content.res.Resources;
import java.util.Locale;

/* renamed from: X.2Uv  reason: invalid class name and case insensitive filesystem */
public abstract class C50542Uv {
    public static final String A00() {
        try {
            Locale locale = Resources.getSystem().getConfiguration().locale;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(locale.getLanguage());
            A10.append('-');
            A10.append(locale.getCountry());
            return A10.toString();
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
