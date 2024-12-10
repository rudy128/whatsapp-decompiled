package X;

/* renamed from: X.9OR  reason: invalid class name */
public abstract class AnonymousClass9OR {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.net.Uri A00(android.net.Uri r6, boolean r7) {
        /*
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.A3z r0 = X.C20030A3z.A01
            X.AI4 r4 = new X.AI4
            r4.<init>(r6)
            X.B4U r0 = X.C182249Tq.A00
            if (r0 == 0) goto L_0x0036
            X.AI5 r0 = (X.AI5) r0
            int r0 = r0.A00
            if (r0 == 0) goto L_0x0036
            java.lang.Integer r3 = X.AnonymousClass00R.A01
        L_0x0017:
            java.lang.String r2 = r4.A00
            java.lang.String r0 = "file"
            boolean r0 = X.C18070vi.A18(r2, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0039
            if (r7 == 0) goto L_0x00a3
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r3 == r0) goto L_0x0039
            java.lang.String r1 = "BloksFilePathSecurityFailure"
            java.lang.String r0 = "[BKFileURLObfuscation] Unexpected file URI encountered, expected bkfileurl or other scheme. "
            X.C25913CoX.A01(r1, r0)
            java.lang.String r0 = "Unexpected file URI encountered, expected bkfileurl or other scheme. "
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0036:
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            goto L_0x0017
        L_0x0039:
            java.lang.String r0 = "bkfileurl"
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = r4.A01     // Catch:{ Exception -> 0x0093 }
            java.nio.charset.Charset r5 = X.C26571Sq.A05     // Catch:{ Exception -> 0x0093 }
            byte[] r1 = X.C18070vi.A1A(r0, r5)     // Catch:{ Exception -> 0x0093 }
            r0 = 9
            byte[] r3 = android.util.Base64.decode(r1, r0)     // Catch:{ Exception -> 0x0093 }
            X.C18070vi.A0b(r3)     // Catch:{ Exception -> 0x0093 }
            r2 = 12
            r0 = 0
            X.1Oc r0 = X.C28851b7.A08(r0, r2)     // Catch:{ Exception -> 0x0093 }
            java.util.List r0 = X.C200410p.A0K(r0, r3)     // Catch:{ Exception -> 0x0093 }
            byte[] r1 = X.C29431cG.A1A(r0)     // Catch:{ Exception -> 0x0093 }
            int r0 = r3.length     // Catch:{ Exception -> 0x0093 }
            X.1Oc r0 = X.C28851b7.A08(r2, r0)     // Catch:{ Exception -> 0x0093 }
            java.util.List r0 = X.C200410p.A0K(r0, r3)     // Catch:{ Exception -> 0x0093 }
            byte[] r4 = X.C29431cG.A1A(r0)     // Catch:{ Exception -> 0x0093 }
            javax.crypto.spec.IvParameterSpec r3 = X.AnonymousClass8BR.A19(r1)     // Catch:{ Exception -> 0x0093 }
            javax.crypto.Cipher r2 = X.AnonymousClass8BR.A18()     // Catch:{ Exception -> 0x0093 }
            r1 = 2
            X.B4U r0 = X.C182249Tq.A00     // Catch:{ Exception -> 0x0093 }
            if (r0 == 0) goto L_0x008d
            javax.crypto.SecretKey r0 = X.C20049A4s.A02     // Catch:{ Exception -> 0x0093 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x0093 }
        L_0x0080:
            byte[] r0 = X.AnonymousClass8BS.A1Q(r0, r3, r2, r4, r1)     // Catch:{ Exception -> 0x0093 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x0093 }
            r1.<init>(r0, r5)     // Catch:{ Exception -> 0x0093 }
            goto L_0x00a3
        L_0x008d:
            javax.crypto.SecretKey r0 = X.C182249Tq.A01     // Catch:{ Exception -> 0x0093 }
            X.C18070vi.A0Z(r0)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0080
        L_0x0093:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to decrypt encrypted file path URL: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x00a3:
            if (r1 == 0) goto L_0x00ac
            android.net.Uri r6 = X.C26215Cuu.A01(r1)
            X.C18070vi.A0X(r6)
        L_0x00ac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9OR.A00(android.net.Uri, boolean):android.net.Uri");
    }
}
