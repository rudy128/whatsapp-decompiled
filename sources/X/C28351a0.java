package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.1a0  reason: invalid class name and case insensitive filesystem */
public class C28351a0 {
    public final C18030ve A00;
    public final AnonymousClass19F A01;
    public final Set A02;

    public static boolean A00(String str, String str2) {
        if (str != null) {
            if (str2.equals("all") || str2.equals("none")) {
                throw new IllegalArgumentException("Name 'none' and 'all' are not supported");
            }
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            String lowerCase2 = str2.toLowerCase(locale);
            String trim = lowerCase.trim();
            if (!TextUtils.isEmpty(trim) && !trim.equals("none")) {
                boolean z = false;
                for (String trim2 : trim.split(";")) {
                    String trim3 = trim2.trim();
                    if (!TextUtils.isEmpty(trim3)) {
                        if (trim3.equals("all")) {
                            z = true;
                        }
                        if (trim3.equals(lowerCase2)) {
                            z = true;
                        }
                        if (trim3.startsWith("-") && lowerCase2.equals(trim3.substring(1))) {
                        }
                    }
                }
                return z;
            }
        }
        return false;
    }

    public C28351a0(C18030ve r3, AnonymousClass19F r4) {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet());
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = Collections.unmodifiableSet(new HashSet(unmodifiableSet));
    }
}
