package X;

import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: X.A3c  reason: case insensitive filesystem */
public abstract class C20012A3c {
    public static final Uri A00 = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r2.startsWith("video/") == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.ContentResolver r10, android.net.Uri r11) {
        /*
            r6 = r10
            r7 = r11
            java.lang.String r2 = r10.getType(r11)
            if (r11 != 0) goto L_0x0068
            r1 = 0
        L_0x0009:
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            r11 = 0
            if (r0 == 0) goto L_0x008a
            r5 = 0
            r3 = 1
            if (r2 == 0) goto L_0x001f
            java.lang.String r0 = "video/"
            boolean r0 = r2.startsWith(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            java.lang.String r1 = "com.android.providers.media.documents"
            java.lang.String r0 = r7.getAuthority()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0065
            java.lang.String r2 = android.provider.DocumentsContract.getDocumentId(r7)
            X.C26208Cuj.A01(r2)
            if (r4 == 0) goto L_0x0062
            android.net.Uri r7 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
        L_0x0037:
            X.C26208Cuj.A01(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "_id"
            r1.append(r0)
            java.lang.String r0 = "=?"
            java.lang.String r9 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String[] r10 = new java.lang.String[r3]
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r2.split(r0)
            r0 = r0[r3]
            r10[r5] = r0
        L_0x0055:
            java.lang.String[] r8 = new java.lang.String[r3]
            java.lang.String r1 = "_data"
            r8[r5] = r1
            android.database.Cursor r2 = r6.query(r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x0084
            goto L_0x006d
        L_0x0062:
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x0037
        L_0x0065:
            r9 = r11
            r10 = r11
            goto L_0x0055
        L_0x0068:
            java.lang.String r1 = r11.getScheme()
            goto L_0x0009
        L_0x006d:
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0084
            int r1 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x007f }
            r0 = -1
            if (r1 == r0) goto L_0x0084
            java.lang.String r11 = r2.getString(r1)     // Catch:{ all -> 0x007f }
            goto L_0x0084
        L_0x007f:
            r0 = move-exception
            r2.close()
            throw r0
        L_0x0084:
            if (r2 == 0) goto L_0x0099
            r2.close()
            return r11
        L_0x008a:
            if (r7 != 0) goto L_0x009a
            r1 = 0
        L_0x008d:
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0099
            java.lang.String r11 = r7.getPath()
        L_0x0099:
            return r11
        L_0x009a:
            java.lang.String r1 = r7.getScheme()
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20012A3c.A00(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    public static boolean A01(Uri uri) {
        String scheme;
        if (uri == null) {
            scheme = null;
        } else {
            scheme = uri.getScheme();
        }
        if ("https".equals(scheme) || "http".equals(scheme)) {
            return true;
        }
        return false;
    }
}
