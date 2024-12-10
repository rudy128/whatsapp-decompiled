package X;

/* renamed from: X.9vP  reason: invalid class name and case insensitive filesystem */
public final class C196649vP {
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("JWT: ");
        X.C17890vO.A13(": Can't verify signature ", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0148, code lost:
        return new X.AnonymousClass8oN(r0.getMessage());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013e A[ExcHandler: Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException (r0v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass9ME A00(X.A4E r12, java.util.Map r13) {
        /*
            java.lang.String r2 = "kid"
            r5 = 0
            r11 = 1
            org.json.JSONObject r1 = r12.A02     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            if (r1 == 0) goto L_0x0136
            boolean r0 = r1.has(r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = r1.getString(r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r1 = X.C17880vN.A0s(r0, r13)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            if (r1 == 0) goto L_0x0136
            java.lang.String r0 = "-----BEGIN PUBLIC KEY-----\n"
            java.lang.String r3 = ""
            r6 = 0
            java.lang.String r1 = X.AnonymousClass1YE.A07(r1, r0, r3, r5)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r0 = "-----END PUBLIC KEY-----"
            java.lang.String r2 = X.AnonymousClass1YE.A07(r1, r0, r3, r5)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r1 = "\n"
            X.1wr r0 = new X.1wr     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r4 = r0.A00(r2, r3)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            int r3 = r4.length()     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            int r3 = r3 - r11
            r2 = 0
        L_0x0038:
            if (r6 > r3) goto L_0x005a
            r0 = r3
            if (r2 != 0) goto L_0x003e
            r0 = r6
        L_0x003e:
            char r1 = r4.charAt(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r0 = 32
            int r0 = X.C18070vi.A00(r1, r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            boolean r0 = X.C108975cc.A1A(r0)
            if (r2 != 0) goto L_0x0055
            if (r0 != 0) goto L_0x0052
            r2 = 1
            goto L_0x0038
        L_0x0052:
            int r6 = r6 + 1
            goto L_0x0038
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            int r3 = r3 + -1
            goto L_0x0038
        L_0x005a:
            java.lang.String r0 = X.C108985cd.A0g(r3, r6, r4)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            byte[] r2 = android.util.Base64.decode(r0, r5)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r0 = "EC"
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.security.spec.X509EncodedKeySpec r0 = new java.security.spec.X509EncodedKeySpec     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r0.<init>(r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.security.PublicKey r1 = r1.generatePublic(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r0 = "SHA256withECDSA"
            java.security.Signature r6 = java.security.Signature.getInstance(r0)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r6.initVerify(r1)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r2 = "."
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ UnsupportedEncodingException -> 0x0104 }
            java.lang.String r0 = r12.A04     // Catch:{ UnsupportedEncodingException -> 0x0104 }
            r1[r5] = r0     // Catch:{ UnsupportedEncodingException -> 0x0104 }
            java.lang.String r0 = r12.A05     // Catch:{ UnsupportedEncodingException -> 0x0104 }
            r1[r11] = r0     // Catch:{ UnsupportedEncodingException -> 0x0104 }
            java.lang.String r0 = android.text.TextUtils.join(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x0104 }
            byte[] r0 = X.AnonymousClass8BR.A1Z(r0)     // Catch:{ UnsupportedEncodingException -> 0x0104 }
            r6.update(r0)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r1 = r12.A01     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r0 = 8
            byte[] r2 = android.util.Base64.decode(r1, r0)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            int r1 = r2.length     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r10 = 2
            int r0 = r1 % r10
            java.lang.String r3 = "Invalid JWT Signature"
            if (r0 != 0) goto L_0x00fe
            int r1 = r1 / r10
            byte[][] r1 = X.A8G.A06(r2, r1, r1)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r0 = r1[r5]     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            byte[] r9 = X.A4E.A00(r0)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r0 = r1[r11]     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            byte[] r7 = X.A4E.A00(r0)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            int r8 = r9.length     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            int r2 = r8 + 4
            int r4 = r7.length     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            int r2 = r2 + r4
            r0 = 255(0xff, float:3.57E-43)
            if (r2 > r0) goto L_0x0119
            r0 = 127(0x7f, float:1.78E-43)
            r1 = 48
            if (r2 <= r0) goto L_0x00d2
            int r0 = r2 + 3
            byte[] r3 = new byte[r0]     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r3[r5] = r1     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r0 = -127(0xffffffffffffff81, float:NaN)
            r3[r11] = r0     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r1 = 3
            byte r0 = (byte) r2     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r3[r10] = r0     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            goto L_0x00dc
        L_0x00d2:
            int r0 = r2 + 2
            byte[] r3 = new byte[r0]     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r3[r5] = r1     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r1 = 2
            byte r0 = (byte) r2     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r3[r11] = r0     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
        L_0x00dc:
            int r2 = r1 + 1
            r3[r1] = r10     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            int r1 = r2 + 1
            byte r0 = (byte) r8     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r3[r2] = r0     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.System.arraycopy(r9, r5, r3, r1, r8)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            int r1 = r1 + r8
            int r2 = r1 + 1
            r3[r1] = r10     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            int r1 = r2 + 1
            byte r0 = (byte) r4     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r3[r2] = r0     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.System.arraycopy(r7, r5, r3, r1, r4)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            boolean r0 = r6.verify(r3)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            if (r0 == 0) goto L_0x012e
            X.8oO r1 = X.AnonymousClass8oO.A00     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            return r1
        L_0x00fe:
            X.9Ks r0 = new X.9Ks     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r0.<init>(r3)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            goto L_0x011e
        L_0x0104:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r0 = "JWT: "
            r1.append(r0)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r0 = ": getSigningPayload threw "
            X.C17900vP.A0Z(r2, r0, r1)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.Error r0 = new java.lang.Error     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r0.<init>(r2)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            goto L_0x011e
        L_0x0119:
            X.9Ks r0 = new X.9Ks     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r0.<init>(r3)     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
        L_0x011e:
            throw r0     // Catch:{ Exception -> 0x011f, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
        L_0x011f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r0 = "JWT: "
            r1.append(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            java.lang.String r0 = ": Can't verify signature "
            X.C17890vO.A13(r0, r1, r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
        L_0x012e:
            java.lang.String r0 = "Token did not verify"
            X.8oN r1 = new X.8oN
            r1.<init>(r0)
            return r1
        L_0x0136:
            java.lang.String r0 = "Public key doesn't exist"
            X.8oN r1 = new X.8oN     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            r1.<init>(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x013e }
            return r1
        L_0x013e:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            X.8oN r0 = new X.8oN
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196649vP.A00(X.A4E, java.util.Map):X.9ME");
    }
}
