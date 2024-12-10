package X;

/* renamed from: X.1lY  reason: invalid class name and case insensitive filesystem */
public class C35041lY {
    public final AnonymousClass11P A00;
    public final C35031lX A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C35021lW r12, X.C72383Ls r13, X.C35041lY r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            X.00H r5 = r14.A03     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            java.lang.Object r2 = r5.get()     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            X.CUj r2 = (X.C25032CUj) r2     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            java.lang.String r1 = "CN=WhatsApp WWW Channel"
            r4 = 0
            r3 = 1
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            r0[r4] = r1     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            r1 = r16
            java.security.cert.X509Certificate r7 = r2.A00(r1, r0)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            java.lang.Object r2 = r5.get()     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            X.CUj r2 = (X.C25032CUj) r2     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            java.lang.String r1 = "CN=WhatsApp WWW Channel Signature"
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            r0[r4] = r1     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            r1 = r17
            java.security.cert.X509Certificate r8 = r2.A00(r1, r0)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            r5 = 0
            r6 = r18
            if (r18 == 0) goto L_0x0032
            java.security.PublicKey r2 = X.C20059A5i.A03(r6)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            goto L_0x0033
        L_0x0032:
            r2 = r5
        L_0x0033:
            if (r19 == 0) goto L_0x003d
            int r0 = java.lang.Integer.parseInt(r19)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
        L_0x003d:
            X.1lX r1 = r14.A01     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            java.util.Set r0 = r1.A00     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            boolean r0 = r0.contains(r12)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            if (r0 == 0) goto L_0x0078
            if (r15 == 0) goto L_0x006f
            int r9 = r15.intValue()     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            X.11P r0 = r14.A00     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            long r10 = X.AnonymousClass11P.A01(r0)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r3
            monitor-enter(r1)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            java.util.HashMap r0 = X.C35031lX.A00(r1)     // Catch:{  }
            X.2q4 r4 = new X.2q4     // Catch:{ all -> 0x006c }
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x006c }
            r0.put(r12, r4)     // Catch:{ all -> 0x006c }
            X.C35031lX.A01(r1, r0)     // Catch:{ CertificateException | JSONException -> 0x0067 }
            goto L_0x0077
        L_0x0067:
            r0 = move-exception
            X.C17960vV.A0B(r0)     // Catch:{ all -> 0x006c }
            goto L_0x0077
        L_0x006c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            goto L_0x0076
        L_0x006f:
            java.lang.String r1 = "cacheable certs should have ttl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            r0.<init>(r1)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
        L_0x0076:
            throw r0     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
        L_0x0077:
            monitor-exit(r1)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
        L_0x0078:
            r13.C7m(r5, r2, r7, r8)     // Catch:{ CertificateExpiredException -> 0x0081, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x007c }
            return
        L_0x007c:
            r0 = move-exception
            r13.Bsw(r0)
            return
        L_0x0081:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35041lY.A00(X.1lW, X.3Ls, X.1lY, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.2q4} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.security.PublicKey] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C35021lW r12, X.C72383Ls r13) {
        /*
            r11 = this;
            X.1lX r9 = r11.A01
            java.util.Set r0 = r9.A00
            boolean r0 = r0.contains(r12)
            r6 = 0
            if (r0 == 0) goto L_0x0063
            java.util.HashMap r0 = X.C35031lX.A00(r9)     // Catch:{ CertificateException | JSONException -> 0x0059 }
            java.lang.Object r7 = r0.get(r12)     // Catch:{ CertificateException | JSONException -> 0x0059 }
            X.2q4 r7 = (X.C61672q4) r7     // Catch:{ CertificateException | JSONException -> 0x0059 }
            if (r7 == 0) goto L_0x005e
            java.security.cert.X509Certificate r8 = r7.A04
            int r10 = r7.A00
            long r4 = r7.A01
            X.11P r0 = r11.A00
            long r2 = X.AnonymousClass11P.A01(r0)
            java.util.Date r0 = new java.util.Date     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0060 }
            r0.<init>(r2)     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0060 }
            r8.checkValidity(r0)     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0060 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            X.C17960vV.A07(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            X.C17960vV.A07(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            int r0 = r10 / 2
            long r0 = (long) r0
            long r4 = r4 + r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0060
            java.security.cert.X509Certificate r1 = r7.A05     // Catch:{ GeneralSecurityException -> 0x0054 }
            java.lang.String r0 = r7.A03     // Catch:{ GeneralSecurityException -> 0x0054 }
            if (r0 == 0) goto L_0x004e
            java.security.PublicKey r6 = X.C20059A5i.A03(r0)     // Catch:{ GeneralSecurityException -> 0x0054 }
        L_0x004e:
            java.lang.Integer r0 = r7.A02     // Catch:{ GeneralSecurityException -> 0x0054 }
            r13.C7m(r0, r6, r8, r1)     // Catch:{ GeneralSecurityException -> 0x0054 }
            return
        L_0x0054:
            r0 = move-exception
            X.C17960vV.A0B(r0)
            goto L_0x005e
        L_0x0059:
            r0 = move-exception
            X.C17960vV.A0B(r0)
            r7 = 0
        L_0x005e:
            r6 = r7
            goto L_0x0063
        L_0x0060:
            r9.A03(r12)
        L_0x0063:
            X.00H r0 = r11.A02
            java.lang.Object r0 = r0.get()
            X.2aU r0 = (X.C52172aU) r0
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r12)
            X.C17960vV.A07(r0)
            X.0vp r0 = (X.C18140vp) r0
            java.lang.Object r1 = r0.get()
            X.3Ky r1 = (X.C72183Ky) r1
            X.31l r0 = new X.31l
            r0.<init>(r6, r12, r13, r11)
            r1.BKz(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35041lY.A01(X.1lW, X.3Ls):void");
    }

    public C35041lY(AnonymousClass11P r1, C35031lX r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        this.A00 = r1;
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = r4;
    }
}
