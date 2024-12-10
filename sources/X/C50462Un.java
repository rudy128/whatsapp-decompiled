package X;

import android.net.Uri;
import java.util.Iterator;

/* renamed from: X.2Un  reason: invalid class name and case insensitive filesystem */
public abstract class C50462Un {
    public static final Uri.Builder A00(Uri.Builder builder, String str, String str2) {
        C18070vi.A0d(builder, 0);
        Uri build = builder.build();
        if (build.getQueryParameter(str) == null) {
            Uri.Builder appendQueryParameter = builder.appendQueryParameter(str, str2);
            C18070vi.A0X(appendQueryParameter);
            return appendQueryParameter;
        }
        builder.clearQuery();
        Iterator<String> it = build.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (str.equals(A0v)) {
                builder.appendQueryParameter(A0v, str2);
            } else {
                builder.appendQueryParameter(A0v, build.getQueryParameter(A0v));
            }
        }
        return builder;
    }
}
