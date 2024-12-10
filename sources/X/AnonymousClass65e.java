package X;

import android.net.Uri;
import com.whatsapp.media.WamediaManager;

/* renamed from: X.65e  reason: invalid class name */
public class AnonymousClass65e extends AnonymousClass7H8 implements C160878Ah {
    public final boolean A00;

    public final String A04() {
        String str;
        if (this.A06 == null) {
            str = "(mime_type in (?, ?))";
        } else {
            str = "(mime_type in (?, ?)) AND bucket_id = ?";
        }
        StringBuilder sb = new StringBuilder(str);
        if (this.A02 && AnonymousClass112.A07()) {
            sb.append(" AND ");
            sb.append("is_favorite=1");
        }
        return C18070vi.A0H(sb);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap BNm() {
        /*
            r14 = this;
            android.net.Uri r0 = r14.A03
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri r9 = X.C17890vO.A0C(r2, r1, r0)
            X.11B r0 = r14.A05
            android.content.ContentResolver r8 = r0.A00
            java.lang.String[] r10 = X.C17880vN.A1Z()
            r0 = 0
            java.lang.String r6 = "bucket_display_name"
            r10[r0] = r6
            r0 = 1
            java.lang.String r7 = "bucket_id"
            r10[r0] = r7
            java.lang.String r11 = r14.A04()
            java.lang.String r3 = r14.A06
            if (r3 == 0) goto L_0x003a
            java.lang.String[] r2 = X.C124596Yy.A00
            r1 = 2
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r12, r0, r1)
            r12[r1] = r3
        L_0x0034:
            r13 = 0
            android.database.Cursor r5 = android.provider.MediaStore.Images.Media.query(r8, r9, r10, r11, r12, r13)
            goto L_0x003d
        L_0x003a:
            java.lang.String[] r12 = X.C124596Yy.A00
            goto L_0x0034
        L_0x003d:
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ all -> 0x0069 }
            if (r5 == 0) goto L_0x0063
            int r3 = r5.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0069 }
            int r2 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0069 }
        L_0x004b:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = r5.getString(r2)     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = ""
        L_0x0059:
            java.lang.String r0 = r5.getString(r3)     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x004b
            r4.put(r0, r1)     // Catch:{ all -> 0x0069 }
            goto L_0x004b
        L_0x0063:
            if (r5 == 0) goto L_0x0068
            r5.close()
        L_0x0068:
            return r4
        L_0x0069:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65e.BNm():java.util.HashMap");
    }

    public AnonymousClass65e(Uri uri, AnonymousClass11C r2, C18030ve r3, WamediaManager wamediaManager, AnonymousClass1Q5 r5, String str, int i, boolean z, boolean z2) {
        super(uri, r2, r3, wamediaManager, r5, str, i, z);
        this.A00 = z2;
    }
}
