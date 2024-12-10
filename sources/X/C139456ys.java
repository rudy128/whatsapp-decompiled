package X;

import android.net.Uri;
import android.util.LruCache;
import java.math.BigInteger;
import java.net.URI;
import java.security.SecureRandom;

/* renamed from: X.6ys  reason: invalid class name and case insensitive filesystem */
public class C139456ys {
    public final String A00;
    public final String A01 = new BigInteger(130, new SecureRandom()).toString(32);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C139456ys)) {
            return false;
        }
        C139456ys r4 = (C139456ys) obj;
        return r4.A00.equals(this.A00) && r4.A01.equals(this.A01);
    }

    public static String A00(String str) {
        try {
            LruCache lruCache = C26215Cuu.A00;
            URI create = URI.create(str);
            Uri A0J = BEB.A0J(create);
            C26215Cuu.A02(A0J, create, false);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(A0J.getScheme());
            A10.append("://");
            A10.append(A0J.getAuthority());
            return A10.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C139456ys(String str) {
        this.A00 = A00(str);
    }
}
