package X;

import android.net.Uri;
import android.webkit.URLUtil;

/* renamed from: X.4Vh  reason: invalid class name and case insensitive filesystem */
public abstract class C87364Vh {
    public static final String A01(String str) {
        C18070vi.A0d(str, 0);
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return str;
        }
        return AnonymousClass001.A1H("https://", str, AnonymousClass000.A10());
    }

    public static final Uri A00(String str) {
        StringBuilder A0K = C18070vi.A0K(str);
        A0K.append("https://l.wl.co/l?u=");
        Uri parse = Uri.parse(AnonymousClass000.A0y(Uri.encode(str), A0K));
        C18070vi.A0X(parse);
        return parse;
    }
}
