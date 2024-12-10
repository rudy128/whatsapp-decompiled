package X;

import android.content.ClipData;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1cT  reason: invalid class name and case insensitive filesystem */
public abstract class C29551cT {
    public static Long A00(Uri uri) {
        if (uri != null) {
            try {
                String queryParameter = uri.getQueryParameter("source_surface");
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        return Long.valueOf(queryParameter);
                    } catch (NumberFormatException unused) {
                        return -1L;
                    }
                }
            } catch (NullPointerException | UnsupportedOperationException unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("LinkUtil/getSourceSurfaceFromUri/Unable to parse uri ");
                sb.append(uri);
                Log.i(sb.toString());
                return null;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r2 != 3) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.content.Context r3, java.lang.Integer r4, java.lang.String r5) {
        /*
            if (r4 == 0) goto L_0x002c
            int r2 = r4.intValue()
            r1 = 1
            if (r2 != r1) goto L_0x0011
            r1 = 2131893512(0x7f121d08, float:1.9421803E38)
        L_0x000c:
            java.lang.String r0 = r3.getString(r1)
            return r0
        L_0x0011:
            r0 = 2
            if (r2 == r0) goto L_0x0017
            r0 = 6
            if (r2 != r0) goto L_0x0026
        L_0x0017:
            if (r5 == 0) goto L_0x0026
            r2 = 2131896575(0x7f1228ff, float:1.9428015E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 0
            r1[r0] = r5
            java.lang.String r0 = r3.getString(r2, r1)
            return r0
        L_0x0026:
            r0 = 3
            r1 = 2131889251(0x7f120c63, float:1.941316E38)
            if (r2 == r0) goto L_0x000c
        L_0x002c:
            r1 = 2131891019(0x7f12134b, float:1.9416746E38)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29551cT.A01(android.content.Context, java.lang.Integer, java.lang.String):java.lang.String");
    }

    public static void A02(AnonymousClass1KB r3, AnonymousClass11C r4, String str) {
        try {
            r4.A09().setPrimaryClip(ClipData.newPlainText(str, str));
            r3.A08(2131891618, 0);
        } catch (NullPointerException | SecurityException e) {
            Log.e("sharedeeplink/copy/npe", e);
            r3.A08(2131897878, 0);
        }
    }
}
