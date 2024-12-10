package X;

import java.security.SecureRandom;

/* renamed from: X.A3z  reason: case insensitive filesystem */
public final class C20030A3z {
    public static final C20030A3z A01 = new C20030A3z();
    public final SecureRandom A00 = new SecureRandom();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C22404B6h r11, X.C20030A3z r12) {
        /*
            X.B4U r0 = X.C182249Tq.A00
            if (r0 == 0) goto L_0x001e
            X.AI5 r0 = (X.AI5) r0
            int r0 = r0.A00
            if (r0 == 0) goto L_0x001e
            java.lang.Integer r1 = X.AnonymousClass00R.A01
        L_0x000c:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r2 = 0
            if (r1 == r0) goto L_0x00d0
            java.lang.String r1 = r11.BYd()
            java.lang.String r0 = "file"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00d0
            goto L_0x0021
        L_0x001e:
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            goto L_0x000c
        L_0x0021:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = "bkfileurl:"
            r7.append(r0)     // Catch:{ Exception -> 0x00c0 }
            r0 = 12
            byte[] r3 = new byte[r0]     // Catch:{ Exception -> 0x00c0 }
            java.security.SecureRandom r0 = r12.A00     // Catch:{ Exception -> 0x00c0 }
            r0.nextBytes(r3)     // Catch:{ Exception -> 0x00c0 }
            javax.crypto.spec.IvParameterSpec r2 = X.AnonymousClass8BR.A19(r3)     // Catch:{ Exception -> 0x00c0 }
            javax.crypto.Cipher r1 = X.AnonymousClass8BR.A18()     // Catch:{ Exception -> 0x00c0 }
            r12 = 1
            X.B4U r0 = X.C182249Tq.A00     // Catch:{ Exception -> 0x00c0 }
            if (r0 == 0) goto L_0x0067
            javax.crypto.SecretKey r0 = X.C20049A4s.A02     // Catch:{ Exception -> 0x00c0 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x00c0 }
        L_0x0045:
            r1.init(r12, r0, r2)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x00c0 }
            java.nio.charset.Charset r9 = X.C26571Sq.A05     // Catch:{ Exception -> 0x00c0 }
            byte[] r0 = X.C18070vi.A1A(r0, r9)     // Catch:{ Exception -> 0x00c0 }
            byte[] r1 = r1.doFinal(r0)     // Catch:{ Exception -> 0x00c0 }
            r0 = 2
            java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00c0 }
            byte[] r10 = new byte[r0]     // Catch:{ Exception -> 0x00c0 }
            r8 = 0
            r11[r8] = r3     // Catch:{ Exception -> 0x00c0 }
            X.C18070vi.A0b(r1)     // Catch:{ Exception -> 0x00c0 }
            X.C18070vi.A0d(r1, r8)     // Catch:{ Exception -> 0x00c0 }
            r11[r12] = r1     // Catch:{ Exception -> 0x00c0 }
            goto L_0x006d
        L_0x0067:
            javax.crypto.SecretKey r0 = X.C182249Tq.A01     // Catch:{ Exception -> 0x00c0 }
            X.C18070vi.A0Z(r0)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x0045
        L_0x006d:
            r2 = 0
            r1 = 0
        L_0x006f:
            r0 = r11[r1]     // Catch:{ Exception -> 0x00c0 }
            if (r0 == 0) goto L_0x007a
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x00c0 }
            X.C18070vi.A0d(r0, r8)     // Catch:{ Exception -> 0x00c0 }
            int r0 = r0.length     // Catch:{ Exception -> 0x00c0 }
            goto L_0x007b
        L_0x007a:
            r0 = 1
        L_0x007b:
            int r2 = r2 + r0
            if (r1 == r12) goto L_0x0080
            r1 = 1
            goto L_0x006f
        L_0x0080:
            byte[] r6 = new byte[r2]     // Catch:{ Exception -> 0x00c0 }
            r5 = 2
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x0086:
            r1 = r11[r4]     // Catch:{ Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x009f
            if (r3 >= r4) goto L_0x0092
            int r0 = r4 - r3
            java.lang.System.arraycopy(r10, r3, r6, r2, r0)     // Catch:{ Exception -> 0x00c0 }
            int r2 = r2 + r0
        L_0x0092:
            r0 = r1
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x00c0 }
            X.C18070vi.A0d(r0, r8)     // Catch:{ Exception -> 0x00c0 }
            int r0 = r0.length     // Catch:{ Exception -> 0x00c0 }
            java.lang.System.arraycopy(r1, r8, r6, r2, r0)     // Catch:{ Exception -> 0x00c0 }
            int r2 = r2 + r0
            int r3 = r4 + 1
        L_0x009f:
            if (r4 == r12) goto L_0x00a3
            r4 = 1
            goto L_0x0086
        L_0x00a3:
            if (r3 >= r5) goto L_0x00a9
            int r5 = r5 - r3
            java.lang.System.arraycopy(r10, r3, r6, r2, r5)     // Catch:{ Exception -> 0x00c0 }
        L_0x00a9:
            r0 = 11
            byte[] r1 = android.util.Base64.encode(r6, r0)     // Catch:{ Exception -> 0x00c0 }
            X.C18070vi.A0X(r1)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00c0 }
            r0.<init>(r1, r9)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r7)     // Catch:{ Exception -> 0x00c0 }
            return r0
        L_0x00c0:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to encrypt file path URL: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x00d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20030A3z.A00(X.B6h, X.A3z):java.lang.String");
    }
}
