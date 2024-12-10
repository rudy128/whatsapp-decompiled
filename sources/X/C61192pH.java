package X;

import android.net.Uri;
import java.util.Locale;

/* renamed from: X.2pH  reason: invalid class name and case insensitive filesystem */
public class C61192pH {
    public final Uri A00;

    public static C61192pH A00(String str) {
        boolean z;
        String lowerCase;
        String str2;
        Locale locale = Locale.US;
        String lowerCase2 = str.toLowerCase(locale);
        if (!lowerCase2.startsWith("https://wa.me/") && !lowerCase2.startsWith("http://wa.me/") && !lowerCase2.startsWith("wa.me/")) {
            boolean startsWith = str.startsWith("/");
            StringBuilder A10 = AnonymousClass000.A10();
            if (startsWith) {
                str2 = "https://wa.me";
            } else {
                str2 = "https://wa.me/";
            }
            str = AnonymousClass001.A1H(str2, str, A10);
        }
        String lowerCase3 = str.toLowerCase(locale);
        if (lowerCase3.startsWith("https://wa.me/") || lowerCase3.startsWith("http://wa.me/")) {
            z = true;
        } else {
            z = lowerCase3.startsWith("wa.me/");
        }
        if (!z) {
            return null;
        }
        if (str.startsWith("wa.me")) {
            str = str.replace("wa.me", "https://wa.me");
        }
        Uri parse = Uri.parse(str);
        if (parse.getHost() == null) {
            lowerCase = null;
        } else {
            lowerCase = parse.getHost().toLowerCase(locale);
        }
        if ("wa.me".equals(lowerCase)) {
            return new C61192pH(new Uri.Builder().scheme("https").encodedAuthority(lowerCase).encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery()).encodedFragment(parse.getEncodedFragment()).build());
        }
        return null;
    }

    public C61192pH(Uri uri) {
        this.A00 = uri;
    }
}
