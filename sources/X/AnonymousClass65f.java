package X;

import android.net.Uri;
import com.whatsapp.media.WamediaManager;

/* renamed from: X.65f  reason: invalid class name */
public final class AnonymousClass65f extends AnonymousClass7H8 implements C160878Ah {
    public final boolean A00;

    public static final String A00(AnonymousClass65f r3) {
        StringBuilder sb = new StringBuilder("media_type in (1, 3)");
        if (r3.A06 != null) {
            sb.append(" AND ");
            sb.append("bucket_id=?");
        }
        if (r3.A02 && AnonymousClass112.A07()) {
            sb.append(" AND ");
            sb.append("is_favorite=1");
        }
        return C18070vi.A0H(sb);
    }

    public AnonymousClass65f(Uri uri, AnonymousClass11C r2, C18030ve r3, WamediaManager wamediaManager, AnonymousClass1Q5 r5, String str, int i, boolean z, boolean z2) {
        super(uri, r2, r3, wamediaManager, r5, str, i, z);
        this.A00 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap BNm() {
        /*
            r12 = this;
            java.util.HashMap r5 = X.C17880vN.A11()
            android.net.Uri r0 = r12.A03
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri r7 = X.C17890vO.A0C(r2, r1, r0)
            X.11B r6 = r12.A05
            java.lang.String[] r8 = X.C17880vN.A1Z()
            r0 = 0
            java.lang.String r3 = "bucket_display_name"
            r8[r0] = r3
            r0 = 1
            java.lang.String r2 = "bucket_id"
            r8[r0] = r2
            java.lang.String r9 = A00(r12)
            java.lang.String r1 = r12.A06
            if (r1 != 0) goto L_0x0033
            r10 = 0
        L_0x002b:
            r11 = 0
            android.database.Cursor r4 = r6.A03(r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x006a
            goto L_0x0039
        L_0x0033:
            java.lang.String[] r10 = new java.lang.String[r0]
            r0 = 0
            r10[r0] = r1
            goto L_0x002b
        L_0x0039:
            int r3 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0063 }
            int r2 = r4.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0063 }
        L_0x0041:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = r4.getString(r2)     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0041
            int r0 = r1.length()     // Catch:{ all -> 0x0063 }
            if (r0 <= 0) goto L_0x0041
            java.lang.String r0 = r4.getString(r3)     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = ""
        L_0x005b:
            r5.put(r1, r0)     // Catch:{ all -> 0x0063 }
            goto L_0x0041
        L_0x005f:
            r4.close()
            return r5
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x006a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65f.BNm():java.util.HashMap");
    }
}
