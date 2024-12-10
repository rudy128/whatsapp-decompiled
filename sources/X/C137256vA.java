package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.6vA  reason: invalid class name and case insensitive filesystem */
public abstract class C137256vA {
    public static String A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            return A01(new URL(str));
        } catch (MalformedURLException e) {
            Log.w("redactedversion/not-url", e);
            int length = str.length();
            if (length <= 25) {
                return "***";
            }
            return AnonymousClass001.A1H(str.substring(0, length - 25), "***", AnonymousClass000.A10());
        }
    }

    public static String A01(URL url) {
        String str;
        int length;
        if (url == null) {
            return null;
        }
        String path = url.getPath();
        if (path == null || (length = path.length()) <= 25) {
            str = "";
        } else {
            str = path.substring(0, length - 25);
        }
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder authority = builder.scheme(url.getProtocol()).authority(url.getHost());
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append("***");
        C17960vV.A07(path);
        authority.path(AnonymousClass000.A0y(path.substring(path.length() - 4), A11)).encodedQuery(url.getQuery());
        return builder.build().toString();
    }
}
