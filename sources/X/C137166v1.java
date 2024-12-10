package X;

import android.net.Uri;

/* renamed from: X.6v1  reason: invalid class name and case insensitive filesystem */
public abstract class C137166v1 {
    public static final String A00(String str) {
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host != null && C108955ca.A1Z("www", host)) {
            return host;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("www.");
        A10.append(parse.getScheme());
        return AnonymousClass000.A0y(".com", A10);
    }

    public static final String A01(String str) {
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("fallback_url");
        if (queryParameter == null) {
            return parse.buildUpon().clearQuery().build().toString();
        }
        return queryParameter;
    }
}
