package X;

import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.2VB  reason: invalid class name */
public abstract class AnonymousClass2VB {
    public static final String A00(C32011gU r3, String str) {
        C18070vi.A0d(r3, 0);
        try {
            String host = new URL(str).getHost();
            Uri parse = Uri.parse(C32011gU.A00(str));
            C18070vi.A0b(parse);
            boolean z = true;
            if (!C63712tZ.A03(parse, C63712tZ.A01)) {
                if (!C63712tZ.A03(parse, C63712tZ.A00) || !"1".equalsIgnoreCase(parse.getQueryParameter("fw"))) {
                    z = false;
                }
            }
            if (z) {
                return AnonymousClass000.A0y("/watch", AnonymousClass000.A11(host));
            }
            return host;
        } catch (MalformedURLException unused) {
            return null;
        }
    }
}
