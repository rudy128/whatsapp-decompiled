package X;

import android.net.Uri;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.2nw  reason: invalid class name and case insensitive filesystem */
public abstract class C60382nw {
    public static String A00(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (C17890vO.A1T(uri, SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME)) {
            if (!C17890vO.A1U(uri, "chat")) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("code");
            if (queryParameter != null) {
                return queryParameter;
            }
        } else if (!C17890vO.A1T(uri, "http") && !C17890vO.A1T(uri, "https")) {
            return null;
        } else {
            if (!C17890vO.A1U(uri, AnonymousClass000.A0y(".whatsapp.com", AnonymousClass000.A11("chat")))) {
                if (!C17890vO.A1U(uri, "whatsapp.com") || !"chat".equals(uri.getLastPathSegment())) {
                    return null;
                }
                return uri.getQueryParameter("code");
            }
        }
        return uri.getLastPathSegment();
    }

    public static String A01(String str, int i) {
        Charset charset = C19620yd.A0C;
        byte[] array = charset.encode(str).array();
        try {
            String replace = URLEncoder.encode(str, C19620yd.A0A).replace("+", "%20");
            if (replace.getBytes().length <= i) {
                return str;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && i3 < array.length) {
                if (replace.charAt(i2) != '%') {
                    if (i2 + 1 > i) {
                        break;
                    }
                    i2++;
                } else if (i2 + 3 > i) {
                    break;
                } else {
                    i2 += 3;
                }
                i3++;
            }
            while ((array[i3] & 192) == 128 && i3 > 0) {
                i3--;
            }
            return new String(Arrays.copyOfRange(array, 0, i3), charset);
        } catch (UnsupportedEncodingException unused) {
            Log.e("UrlUtils/truncateParameterForPercentEncoding UTF-8 encoding not supported");
            return null;
        }
    }
}
