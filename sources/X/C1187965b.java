package X;

import android.net.Uri;
import com.whatsapp.media.WamediaManager;

/* renamed from: X.65b  reason: invalid class name and case insensitive filesystem */
public class C1187965b extends AnonymousClass7H8 {
    public final boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap BNm() {
        /*
            r9 = this;
            android.net.Uri r0 = r9.A03
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri r4 = X.C17890vO.A0C(r2, r1, r0)
            X.11B r0 = r9.A05
            android.content.ContentResolver r3 = r0.A00
            java.lang.String[] r5 = X.C17880vN.A1Z()
            r0 = 0
            java.lang.String r2 = "bucket_display_name"
            r5[r0] = r2
            r1 = 1
            java.lang.String r0 = "bucket_id"
            r5[r1] = r0
            java.lang.String r6 = r9.A04()
            r7 = 0
            java.lang.String r8 = r9.A03()
            android.database.Cursor r5 = android.provider.MediaStore.Images.Media.query(r3, r4, r5, r6, r7, r8)
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0054
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005a }
            int r2 = r5.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x005a }
        L_0x003b:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r5.getString(r3)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r5.getString(r2)     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = ""
        L_0x004d:
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x005a }
            r4.put(r1, r0)     // Catch:{ all -> 0x005a }
            goto L_0x003b
        L_0x0054:
            if (r5 == 0) goto L_0x0059
            r5.close()
        L_0x0059:
            return r4
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1187965b.BNm():java.util.HashMap");
    }

    public C1187965b(Uri uri, AnonymousClass11C r2, C18030ve r3, WamediaManager wamediaManager, AnonymousClass1Q5 r5, String str, int i, boolean z, boolean z2) {
        super(uri, r2, r3, wamediaManager, r5, str, i, z);
        this.A00 = z2;
    }

    public final String A04() {
        StringBuilder A10 = AnonymousClass000.A10();
        String str = this.A06;
        if (str != null) {
            A10.append("bucket_id = '");
            A10.append(str);
            A10.append("'");
        }
        if (this.A02 && AnonymousClass112.A07()) {
            if (A10.length() > 0) {
                A10.append(" AND ");
            }
            A10.append("is_favorite=1");
        }
        return C18070vi.A0H(A10);
    }
}
