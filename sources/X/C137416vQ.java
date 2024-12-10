package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: X.6vQ  reason: invalid class name and case insensitive filesystem */
public abstract class C137416vQ {
    public static final Pair A00(String str) {
        int A0F = AnonymousClass1YF.A0F(str, " ", 0, false);
        if (A0F < 0) {
            return null;
        }
        try {
            return C108945cZ.A0N(URLDecoder.decode(C108955ca.A0q(0, A0F, str), C19620yd.A0A), C108955ca.A0z(str, A0F + 1));
        } catch (UnsupportedEncodingException e) {
            Log.e("StickerContentProviderFetcher/decomposeId/e", e);
            return null;
        }
    }

    public static final String A01(String str, String str2) {
        try {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(URLEncoder.encode(str, C19620yd.A0A));
            return C17890vO.A0Z(str2, A10, ' ');
        } catch (UnsupportedEncodingException e) {
            Log.e("StickerContentProviderFetcher/constructId/e", e);
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(' ');
            A11.append(str2);
            return AnonymousClass000.A0y(str2, A11);
        }
    }
}
