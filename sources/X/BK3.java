package X;

public final class BK3 extends C24898COr {
    public final String A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BK3(java.lang.String r9) {
        /*
            r8 = this;
            r7 = 0
            r0 = 1
            X.C18070vi.A0d(r9, r0)
            java.lang.String r3 = "displayName"
            org.json.JSONObject r1 = X.C17880vN.A16(r9)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r0 = "user"
            org.json.JSONObject r2 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r0 = "name"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ Exception -> 0x0065 }
            boolean r0 = r2.isNull(r3)     // Catch:{ Exception -> 0x0065 }
            if (r0 == 0) goto L_0x001f
            r0 = r7
            goto L_0x0023
        L_0x001f:
            java.lang.String r0 = r2.getString(r3)     // Catch:{ Exception -> 0x0065 }
        L_0x0023:
            X.C18070vi.A0X(r1)     // Catch:{ Exception -> 0x0065 }
            X.CMO r6 = new X.CMO     // Catch:{ Exception -> 0x0065 }
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x0065 }
            android.os.Bundle r5 = X.C17880vN.A0D()
            java.lang.String r4 = "androidx.credentials.BUNDLE_KEY_SUBTYPE"
            java.lang.String r3 = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST"
            r5.putString(r4, r3)
            java.lang.String r2 = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON"
            r5.putString(r2, r9)
            java.lang.String r1 = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH"
            r5.putByteArray(r1, r7)
            android.os.Bundle r0 = X.C17880vN.A0D()
            r0.putString(r4, r3)
            r0.putString(r2, r9)
            r0.putByteArray(r1, r7)
            r8.<init>(r5, r0, r6)
            r8.A00 = r9
            int r0 = r9.length()
            if (r0 == 0) goto L_0x005e
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x005e }
            r0.<init>(r9)     // Catch:{ Exception -> 0x005e }
            return
        L_0x005e:
            java.lang.String r0 = "requestJson must not be empty, and must be a valid JSON"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0065:
            java.lang.String r0 = "user.name must be defined in requestJson"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BK3.<init>(java.lang.String):void");
    }
}
