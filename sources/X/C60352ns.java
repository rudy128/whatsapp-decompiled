package X;

import android.content.ContentValues;

/* renamed from: X.2ns  reason: invalid class name and case insensitive filesystem */
public abstract class C60352ns {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C23141Ev r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            java.lang.String[] r2 = X.C17880vN.A1a(r4, r0)
            java.lang.String r1 = "BACKUP_DB_SELECT_PROPS_VALUE_BY_NAME"
            java.lang.String r0 = "SELECT prop_value FROM backup_props WHERE prop_name = ?"
            android.database.Cursor r2 = r3.A0A(r0, r1, r2)
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "prop_value"
            java.lang.String r0 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x0021 }
            r2.close()
            return r0
        L_0x001d:
            r2.close()
            return r5
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60352ns.A00(X.1Ev, java.lang.String, java.lang.String):java.lang.String");
    }

    public static final void A01(C23141Ev r3, String str, String str2, String str3) {
        ContentValues A08 = C17890vO.A08();
        A08.put("prop_name", str);
        A08.put("prop_value", str2);
        r3.A08("backup_props", AnonymousClass2TU.A00(str3, "setProp", "BACKUP_DB_REPLACE_PROPS_STRING"), A08);
    }
}
