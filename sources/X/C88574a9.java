package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4a9  reason: invalid class name and case insensitive filesystem */
public abstract class C88574a9 {
    public static Uri.Builder A00(C18030ve r3, C24481Km r4, String str) {
        Uri.Builder buildUpon;
        if (C18020vd.A05(C18040vf.A02, r3, 2713)) {
            Uri.Builder scheme = new Uri.Builder().scheme("https");
            C24481Km.A00(r4);
            buildUpon = scheme.encodedAuthority(r4.A00);
        } else {
            buildUpon = Uri.parse("https://static.whatsapp.net").buildUpon();
        }
        return buildUpon.path(str);
    }

    public static FileInputStream A01(A1I a1i, C0L c0l) {
        File A01 = a1i.A01(c0l);
        if (A01 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("DownloadableUtils/getInputStream/file-missing/id: ");
            C17890vO.A19(A10, c0l.id);
            return null;
        }
        try {
            return new FileInputStream(A01);
        } catch (FileNotFoundException e) {
            Log.e("DownloadableUtils/unexpected/getInputStream/file-missing/", e);
            return null;
        }
    }

    public static String A02(Uri.Builder builder, Map map) {
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            builder.appendQueryParameter((String) A16.getKey(), (String) A16.getValue());
        }
        return builder.build().toString();
    }

    public static void A03(String str) {
        C17900vP.A0e("DownloadableUtils/reportCriticalEventIfBeta", str, AnonymousClass000.A10());
    }

    public static boolean A04(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_') {
                return false;
            }
        }
        return true;
    }
}
