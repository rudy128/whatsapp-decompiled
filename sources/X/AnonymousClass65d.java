package X;

/* renamed from: X.65d  reason: invalid class name */
public class AnonymousClass65d extends AnonymousClass7H8 implements C160878Ah {
    public final String A04() {
        String str;
        if (this.A06 == null) {
            str = "(mime_type in (?))";
        } else {
            str = "(mime_type in (?)) AND bucket_id = ?";
        }
        StringBuilder sb = new StringBuilder(str);
        if (this.A02 && AnonymousClass112.A07()) {
            sb.append(" AND ");
            sb.append("is_favorite=1");
        }
        return C18070vi.A0H(sb);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap BNm() {
        /*
            r13 = this;
            android.net.Uri r0 = r13.A03
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri r8 = X.C17890vO.A0C(r2, r1, r0)
            X.11B r0 = r13.A05
            android.content.ContentResolver r7 = r0.A00
            java.lang.String[] r9 = X.C17880vN.A1Z()
            r4 = 0
            java.lang.String r6 = "bucket_display_name"
            r9[r4] = r6
            r3 = 1
            java.lang.String r2 = "bucket_id"
            r9[r3] = r2
            java.lang.String r10 = r13.A04()
            java.lang.String r1 = r13.A06
            if (r1 == 0) goto L_0x0039
            java.lang.String[] r0 = X.C124586Yx.A00
            java.lang.String[] r11 = X.C17880vN.A1Z()
            java.lang.System.arraycopy(r0, r4, r11, r4, r3)
            r11[r3] = r1
        L_0x0033:
            r12 = 0
            android.database.Cursor r5 = android.provider.MediaStore.Images.Media.query(r7, r8, r9, r10, r11, r12)
            goto L_0x003c
        L_0x0039:
            java.lang.String[] r11 = X.C124586Yx.A00
            goto L_0x0033
        L_0x003c:
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ all -> 0x0069 }
            if (r5 == 0) goto L_0x0063
            int r3 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0069 }
            int r2 = r5.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0069 }
        L_0x004a:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = r5.getString(r3)     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = ""
        L_0x0058:
            java.lang.String r0 = r5.getString(r2)     // Catch:{ all -> 0x0069 }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0069 }
            r4.put(r0, r1)     // Catch:{ all -> 0x0069 }
            goto L_0x004a
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65d.BNm():java.util.HashMap");
    }
}
