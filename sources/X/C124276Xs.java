package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6Xs  reason: invalid class name and case insensitive filesystem */
public abstract class C124276Xs {
    public static String A00(Uri uri, C128006fI r4) {
        Set<String> set;
        if (TextUtils.isEmpty(uri.getQuery())) {
            return null;
        }
        try {
            set = uri.getQueryParameterNames();
        } catch (UnsupportedOperationException unused) {
            set = null;
        }
        if (set == null || set.isEmpty()) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        Collections.unmodifiableList(r4.A00);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (A10.length() > 0) {
                A10.append('&');
            }
            A10.append(A0v);
            A10.append("=--sanitized--");
        }
        return A10.toString();
    }
}
