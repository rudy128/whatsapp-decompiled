package X;

/* renamed from: X.9mU  reason: invalid class name and case insensitive filesystem */
public class C191369mU {
    public final AnonymousClass118 A00;
    public final C187349ff A01;
    public final C184739bR A02;
    public final AnonymousClass00H A03;
    public final A5H A04;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:22|23|24|25|26|(1:28)) */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03f3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03f4, code lost:
        com.whatsapp.util.Log.w("PAY: DefaultTrustTokenBuilder/addSignature", r1);
        r0 = new X.AnonymousClass9LF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03ff, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        com.whatsapp.util.Log.w("PAY: DefaultTrustTokenBuilder/signWith", r1);
        r0 = new X.AnonymousClass9LF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x041e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x041f, code lost:
        com.whatsapp.util.Log.e("PAY: MFAFactors/registerTD/", r1);
        r2.Bst(new X.C199169zY(6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x042d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.whatsapp.util.Log.e("PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x03da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03ec A[Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03ff A[ExcHandler: 9Kv | NoSuchAlgorithmException (r1v14 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:90:0x0239] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x041e A[ExcHandler: 9LF | NoSuchAlgorithmException | JSONException (r1v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:73:0x013f] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060 A[Catch:{ KeyStoreException -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c6 A[Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }, LOOP:0: B:75:0x01c0->B:77:0x01c6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01dc A[Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0210 A[Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0233 A[Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x024c A[Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:142:0x03c4=Splitter:B:142:0x03c4, B:148:0x03da=Splitter:B:148:0x03da} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.BBH r23, boolean r24) {
        /*
            r22 = this;
            r4 = r22
            X.9bR r3 = r4.A02
            r5 = 0
            r2 = r23
            X.1QD r0 = r3.A00     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x0030 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0030 }
            if (r0 != 0) goto L_0x0036
            org.json.JSONObject r1 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r0 = "td"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x0030 }
            if (r1 == 0) goto L_0x0036
            java.lang.String r0 = "td_is_committed"
            boolean r0 = r1.optBoolean(r0, r5)     // Catch:{ JSONException -> 0x0030 }
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.C3u()
            return
        L_0x0030:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore isCommitted failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0036:
            if (r24 == 0) goto L_0x00d9
            X.17F r0 = r3.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            java.lang.String r7 = "alias-payments-br-trusted-device-key"
            X.3DR r0 = r0.A00     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            java.lang.Object r0 = r0.get()     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            X.9kW r0 = (X.C190189kW) r0     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            if (r0 == 0) goto L_0x0080
            r6 = 0
            java.security.KeyStore r5 = r0.A00     // Catch:{ Exception -> 0x007b }
            java.security.cert.Certificate r1 = r5.getCertificate(r7)     // Catch:{ Exception -> 0x007b }
            if (r1 == 0) goto L_0x0080
            boolean r0 = r1 instanceof java.security.cert.X509Certificate     // Catch:{ Exception -> 0x007b }
            if (r0 == 0) goto L_0x006a
            r0 = r1
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ Exception -> 0x007b }
            r0.checkValidity()     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x005a }
            goto L_0x006a
        L_0x005a:
            boolean r0 = r5.containsAlias(r7)     // Catch:{ KeyStoreException -> 0x0064 }
            if (r0 == 0) goto L_0x0080
            r5.deleteEntry(r7)     // Catch:{ KeyStoreException -> 0x0064 }
            goto L_0x0080
        L_0x0064:
            java.lang.String r0 = "PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x007b }
            goto L_0x0080
        L_0x006a:
            java.security.PublicKey r1 = r1.getPublicKey()     // Catch:{ Exception -> 0x007b }
            java.security.Key r0 = r5.getKey(r7, r6)     // Catch:{ Exception -> 0x007b }
            java.security.PrivateKey r0 = (java.security.PrivateKey) r0     // Catch:{ Exception -> 0x007b }
            java.security.KeyPair r6 = new java.security.KeyPair     // Catch:{ Exception -> 0x007b }
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x007b }
            goto L_0x013f
        L_0x007b:
            java.lang.String r0 = "PAY: Secp256r1KeyStoreHelper/retrieveKeyPair failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
        L_0x0080:
            X.1QD r0 = r3.A00     // Catch:{ JSONException -> 0x00d3 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x00d3 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00d3 }
            if (r0 != 0) goto L_0x00d9
            org.json.JSONObject r1 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x00d3 }
            java.lang.String r0 = "td"
            org.json.JSONObject r6 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x00d3 }
            if (r6 == 0) goto L_0x00d9
            java.lang.String r0 = "td_public_key_bytes"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x00d3 }
            r1 = 11
            byte[] r5 = android.util.Base64.decode(r0, r1)     // Catch:{ JSONException -> 0x00d3 }
            java.lang.String r0 = "td_private_key_bytes"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x00d3 }
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch:{ JSONException -> 0x00d3 }
            java.lang.String r7 = "PAY: TrustedDeviceKeyStore recreateKeyPair failed"
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch:{ JSONException -> 0x00d3 }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x00d3 }
            java.security.spec.PKCS8EncodedKeySpec r5 = new java.security.spec.PKCS8EncodedKeySpec     // Catch:{ JSONException -> 0x00d3 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x00d3 }
            java.lang.String r0 = "EC"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00ce }
            java.security.PublicKey r1 = r0.generatePublic(r1)     // Catch:{  }
            java.security.PrivateKey r0 = r0.generatePrivate(r5)     // Catch:{  }
            java.security.KeyPair r6 = new java.security.KeyPair     // Catch:{  }
            r6.<init>(r1, r0)     // Catch:{  }
            goto L_0x013f
        L_0x00ce:
            r0 = move-exception
            com.whatsapp.util.Log.w(r7, r0)     // Catch:{ JSONException -> 0x00d3 }
            goto L_0x00d9
        L_0x00d3:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore retrieveKeyPair failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
        L_0x00d9:
            X.17F r0 = r3.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            X.0yx r0 = r0.A00()     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            java.lang.Object r6 = r0.A00     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            if (r6 == 0) goto L_0x0413
            java.lang.Object r0 = r0.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            X.C17960vV.A07(r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            if (r0 != 0) goto L_0x0139
            r10 = r6
            java.security.KeyPair r10 = (java.security.KeyPair) r10     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            java.lang.String r9 = "td"
            X.1QD r8 = r3.A00     // Catch:{ JSONException -> 0x0132 }
            java.lang.String r1 = r8.A06()     // Catch:{ JSONException -> 0x0132 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0132 }
            if (r0 != 0) goto L_0x0139
            org.json.JSONObject r7 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x0132 }
            org.json.JSONObject r5 = X.AnonymousClass8BW.A0w(r9, r7)     // Catch:{ JSONException -> 0x0132 }
            java.lang.String r1 = "td_public_key_bytes"
            java.security.PublicKey r0 = r10.getPublic()     // Catch:{ JSONException -> 0x0132 }
            byte[] r0 = r0.getEncoded()     // Catch:{ JSONException -> 0x0132 }
            r3 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ JSONException -> 0x0132 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0132 }
            java.lang.String r1 = "td_private_key_bytes"
            java.security.PrivateKey r0 = r10.getPrivate()     // Catch:{ JSONException -> 0x0132 }
            byte[] r0 = r0.getEncoded()     // Catch:{ JSONException -> 0x0132 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ JSONException -> 0x0132 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0132 }
            r7.put(r9, r5)     // Catch:{ JSONException -> 0x0132 }
            X.AnonymousClass8BT.A1G(r8, r7)     // Catch:{ JSONException -> 0x0132 }
            goto L_0x0139
        L_0x0132:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore store failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            throw r1     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
        L_0x0139:
            java.security.KeyPair r6 = (java.security.KeyPair) r6     // Catch:{ InvalidAlgorithmParameterException -> 0x040b }
            if (r6 != 0) goto L_0x013f
            goto L_0x0413
        L_0x013f:
            X.00H r0 = r4.A03     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.Object r7 = r0.get()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.9ev r7 = (X.C186889ev) r7     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.118 r0 = r4.A00     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            android.content.Context r11 = r0.A00     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.security.PublicKey r0 = r6.getPublic()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            byte[] r0 = r0.getEncoded()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r5 = X.C108955ca.A14(r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.C18070vi.A0h(r11, r5)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r3 = "auth_ticket_type"
            java.lang.String r1 = "TRUSTED_DEVICE"
            X.9bQ r0 = new X.9bQ     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r0.<init>(r3, r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r10.add(r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r1 = "public_key"
            X.9bQ r0 = new X.9bQ     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r0.<init>(r1, r5)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r10.add(r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.1KB r8 = r7.A00     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.11E r5 = r7.A01     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.00H r0 = r7.A03     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.Object r1 = X.C18070vi.A0E(r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.1jG r1 = (X.C33711jG) r1     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.1ex r0 = r7.A02     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.0wS r19 = X.C18460wS.A00     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r3 = "CREATE_AUTH_TICKET_BASED_FACTOR"
            java.lang.String r9 = "mfa-create-auth-ticket-based-factor"
            X.9gm r7 = new X.9gm     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r12 = r7
            r13 = r11
            r14 = r8
            r15 = r5
            r16 = r1
            r17 = r0
            r18 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.9ff r8 = r4.A01     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r1 = "ver"
            r0 = 1
            r5.put(r1, r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r0 = "op"
            r5.put(r0, r3)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r3 = "nonce"
            X.11P r1 = r8.A01     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.11S r0 = r8.A00     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r0 = X.AnonymousClass8BS.A0e(r0, r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            org.json.JSONObject r10 = X.C108965cb.A0x(r0, r3, r5)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.util.List r0 = r7.A05     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
        L_0x01c0:
            boolean r0 = r11.hasNext()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r0 = r11.next()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.9bQ r0 = (X.C184729bQ) r0     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r1 = r0.A00     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r0 = r0.A01     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r10.put(r1, r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            goto L_0x01c0
        L_0x01d4:
            java.util.List r1 = r7.A06     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            boolean r0 = r1.isEmpty()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            if (r0 != 0) goto L_0x01f3
            org.json.JSONArray r11 = X.AnonymousClass8BR.A1A()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
        L_0x01e4:
            boolean r0 = r1.hasNext()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            if (r0 == 0) goto L_0x01ee
            X.AnonymousClass8BS.A1J(r1, r11)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            goto L_0x01e4
        L_0x01ee:
            java.lang.String r0 = "caps"
            r10.put(r0, r11)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
        L_0x01f3:
            java.lang.String r1 = "app_id"
            java.lang.String r0 = "com.whatsapp"
            r10.put(r1, r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.1ek r0 = r8.A02     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r1 = r0.A01()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r0 = "device_id"
            r10.put(r0, r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r0 = "data"
            r5.put(r0, r10)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            int r0 = r3.length()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            if (r0 <= 0) goto L_0x0233
            r1 = 0
            java.lang.String r0 = "server key was never set, its null"
            X.C17960vV.A08(r1, r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            com.whatsapp.wamsys.JniBridge r1 = r8.A03     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.00H r0 = r8.A04     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.Object r0 = r0.get()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.17F r0 = (X.AnonymousClass17F) r0     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.8zh r8 = new X.8zh     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r8.<init>(r0, r1, r5, r3)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
        L_0x0225:
            r0 = 1
            java.security.PublicKey[] r1 = new java.security.PublicKey[r0]     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.security.PublicKey r0 = r6.getPublic()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r13 = 0
            r1[r13] = r0     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r8.A01(r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            goto L_0x0239
        L_0x0233:
            X.8zg r8 = new X.8zg     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r8.<init>(r5)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            goto L_0x0225
        L_0x0239:
            java.util.List r1 = r8.A00     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            X.C17960vV.A07(r1)     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.security.PublicKey r0 = r6.getPublic()     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r0 = X.AnonymousClass9R7.A00(r0)     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            boolean r0 = r1.contains(r0)     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            if (r0 == 0) goto L_0x03ec
            java.security.PublicKey r0 = r6.getPublic()     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r12 = r8.A00()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            X.C17960vV.A07(r12)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            org.json.JSONObject r1 = X.C17880vN.A15()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r11 = "alg"
            java.lang.String r10 = "ES256"
            r1.put(r11, r10)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r0 = X.AnonymousClass9R7.A00(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r5 = "kid"
            java.lang.String r0 = X.AnonymousClass8BS.A0k(r0, r5, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            byte[] r0 = X.AnonymousClass8BR.A1Z(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r3 = X.AnonymousClass8BT.A0x(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r1 = "."
            java.lang.String[] r0 = X.C17880vN.A1Z()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            X.AnonymousClass8BS.A1B(r3, r12, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            byte[] r3 = X.AnonymousClass8BR.A1Z(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03e0, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r0 = "SHA256withECDSA"
            java.security.Signature r1 = java.security.Signature.getInstance(r0)     // Catch:{ Exception -> 0x03da, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.security.PrivateKey r0 = r6.getPrivate()     // Catch:{ Exception -> 0x03da, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r1.initSign(r0)     // Catch:{ Exception -> 0x03da, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r1.update(r3)     // Catch:{ Exception -> 0x03da, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            byte[] r14 = r1.sign()     // Catch:{ Exception -> 0x03da, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            if (r14 == 0) goto L_0x03da
            java.security.PublicKey r21 = r6.getPublic()     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.util.List r1 = r8.A00     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            X.C17960vV.A07(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r0 = X.AnonymousClass9R7.A00(r21)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            boolean r0 = r1.contains(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            if (r0 == 0) goto L_0x03ce
            int r0 = r14.length     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r1 = 8
            java.lang.String r20 = "Invalid ECDSA signature format"
            if (r0 < r1) goto L_0x03c9
            byte r3 = r14[r13]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r1 = 48
            if (r3 != r1) goto L_0x03c9
            r1 = 1
            byte r6 = r14[r1]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r1 = 2
            if (r6 <= 0) goto L_0x02c4
            r19 = 2
            goto L_0x02ca
        L_0x02c4:
            r3 = -127(0xffffffffffffff81, float:NaN)
            if (r6 != r3) goto L_0x03d5
            r19 = 3
        L_0x02ca:
            int r3 = r19 + 1
            byte r18 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r15 = r18
        L_0x02d0:
            if (r15 <= 0) goto L_0x02de
            int r3 = r19 + 2
            int r3 = r3 + r18
            int r3 = r3 - r15
            byte r3 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            if (r3 != 0) goto L_0x02de
            int r15 = r15 + -1
            goto L_0x02d0
        L_0x02de:
            int r17 = r19 + 2
            int r13 = r17 + r18
            int r3 = r13 + 1
            byte r16 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r12 = r16
        L_0x02e8:
            if (r12 <= 0) goto L_0x02f6
            int r3 = r13 + 2
            int r3 = r3 + r16
            int r3 = r3 - r12
            byte r3 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            if (r3 != 0) goto L_0x02f6
            int r12 = r12 + -1
            goto L_0x02e8
        L_0x02f6:
            int r6 = java.lang.Math.max(r15, r12)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r3 = 32
            int r6 = java.lang.Math.max(r6, r3)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            int r3 = r19 + -1
            byte r3 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r0 = r0 - r19
            if (r3 != r0) goto L_0x03c4
            int r0 = r18 + 2
            int r0 = r0 + 2
            int r0 = r0 + r16
            if (r3 != r0) goto L_0x03c4
            byte r0 = r14[r19]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            if (r0 != r1) goto L_0x03c4
            byte r0 = r14[r13]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            if (r0 != r1) goto L_0x03c4
            int r3 = r6 * 2
            byte[] r1 = new byte[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            int r13 = r13 - r15
            int r6 = r6 - r15
            java.lang.System.arraycopy(r14, r13, r1, r6, r15)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            int r17 = r17 + r18
            int r0 = r17 + 2
            int r0 = r0 + r16
            int r0 = r0 - r12
            int r3 = r3 - r12
            java.lang.System.arraycopy(r14, r0, r1, r3, r12)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r1 = X.AnonymousClass8BT.A0x(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            org.json.JSONObject r6 = X.C17880vN.A15()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r0 = "signature"
            r6.put(r0, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r3 = "protected"
            org.json.JSONObject r1 = X.AnonymousClass8BU.A12(r11, r10)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r0 = X.AnonymousClass9R7.A00(r21)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r0 = X.AnonymousClass8BS.A0k(r0, r5, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            byte[] r0 = X.AnonymousClass8BR.A1Z(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r0 = X.AnonymousClass8BT.A0x(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r6.put(r3, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            org.json.JSONArray r5 = r8.A01     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r5.put(r6)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            java.lang.String r3 = r8.A00()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03b8 }
            X.C17960vV.A07(r3)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03b8 }
            org.json.JSONObject r1 = X.C17880vN.A15()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03b8 }
            java.lang.String r0 = "payload"
            r1.put(r0, r3)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03b8 }
            java.lang.String r0 = "signatures"
            java.lang.String r0 = X.AnonymousClass8BS.A0k(r5, r0, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03b8 }
            byte[] r0 = X.AnonymousClass8BR.A1Z(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03b8 }
            java.lang.String r3 = X.AnonymousClass8BT.A0x(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03b8 }
            java.lang.String r1 = "trust-token"
            r0 = 0
            X.1ca r5 = new X.1ca     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r5.<init>((java.lang.String) r1, (java.lang.String) r3, (X.AnonymousClass1MD[]) r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.9bP r8 = new X.9bP     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r8.<init>(r2, r4)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.1ex r6 = r7.A04     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r4 = 0
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r0 = "action"
            X.C17890vO.A11(r0, r9, r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.1MD[] r3 = X.AnonymousClass8BT.A1b(r1, r4)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r0 = 1
            X.1ca[] r1 = new X.C29621ca[r0]     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r1[r4] = r5     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r0 = "account"
            X.1ca r5 = X.AnonymousClass8BR.A0l(r0, r3, r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            android.content.Context r4 = r7.A00     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.1KB r3 = r7.A01     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.1jG r0 = r7.A03     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r15 = 11
            X.8yh r1 = new X.8yh     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r9 = r1
            r10 = r4
            r11 = r0
            r12 = r3
            r13 = r7
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            java.lang.String r0 = "set"
            r6.A0G(r1, r5, r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            return
        L_0x03b8:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/build"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.9LF r0 = new X.9LF     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r0.<init>(r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            goto L_0x040a
        L_0x03c4:
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r20)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            goto L_0x03d9
        L_0x03c9:
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r20)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            goto L_0x03d9
        L_0x03ce:
            java.lang.String r0 = "cannot sign with public key that has not been declared"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
            goto L_0x03d9
        L_0x03d5:
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r20)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
        L_0x03d9:
            throw r0     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f3, 9Kv | NoSuchAlgorithmException -> 0x03ff }
        L_0x03da:
            X.9Kv r0 = new X.9Kv     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r0.<init>()     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            goto L_0x03fe
        L_0x03e0:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/constructInputForSigning"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            X.9LF r0 = new X.9LF     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r0.<init>(r1)     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            goto L_0x03fe
        L_0x03ec:
            java.lang.String r0 = "cannot sign with public key that has not been declared"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            goto L_0x03fe
        L_0x03f3:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/addSignature"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            X.9LF r0 = new X.9LF     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
            r0.<init>(r1)     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
        L_0x03fe:
            throw r0     // Catch:{ 9Kv | NoSuchAlgorithmException -> 0x03ff }
        L_0x03ff:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/signWith"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            X.9LF r0 = new X.9LF     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r0.<init>(r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
        L_0x040a:
            throw r0     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
        L_0x040b:
            r0 = 8
            X.9zY r1 = new X.9zY     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r1.<init>((int) r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            goto L_0x041a
        L_0x0413:
            r0 = 8
            X.9zY r1 = new X.9zY     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            r1.<init>((int) r0)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
        L_0x041a:
            r2.Bst(r1)     // Catch:{ 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e, 9LF | NoSuchAlgorithmException | JSONException -> 0x041e }
            return
        L_0x041e:
            r1 = move-exception
            java.lang.String r0 = "PAY: MFAFactors/registerTD/"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 6
            X.9zY r0 = new X.9zY
            r0.<init>((int) r1)
            r2.Bst(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191369mU.A00(X.BBH, boolean):void");
    }

    public C191369mU(AnonymousClass118 r1, C187349ff r2, C184739bR r3, A5H a5h, AnonymousClass00H r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r5;
        this.A02 = r3;
        this.A04 = a5h;
    }
}
