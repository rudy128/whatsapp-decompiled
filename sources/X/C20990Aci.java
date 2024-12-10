package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.Aci  reason: case insensitive filesystem */
public final class C20990Aci implements AnonymousClass1O5 {
    public C186459eE A00;
    public final UserJid A01;
    public final AnonymousClass1OZ A02;

    public C20990Aci(UserJid userJid, AnonymousClass1OZ r3) {
        C18070vi.A0d(r3, 2);
        this.A01 = userJid;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        if (r2.A2c(r0.getRawString(), r28.getRawString()) == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0233, code lost:
        r1 = r4.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        com.whatsapp.util.Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/Null certificate");
        r4.A04.A0G("direct-connection-failed-to-load-certificate-from-preferences", "", false);
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0289 A[EDGE_INSN: B:99:0x0289->B:94:0x0289 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r30, java.lang.String r31) {
        /*
            r29 = this;
            r0 = 1
            r1 = r30
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = "signed_user_info"
            X.1ca r5 = r1.A0K(r0)
            r2 = r29
            if (r5 == 0) goto L_0x0296
            java.lang.String r25 = "phone_number"
            r0 = r25
            X.1ca r4 = r5.A0K(r0)
            java.lang.String r24 = "ttl_timestamp"
            r0 = r24
            X.1ca r3 = r5.A0K(r0)
            java.lang.String r23 = "phone_number_signature"
            r0 = r23
            X.1ca r1 = r5.A0K(r0)
            java.lang.String r0 = "business_domain"
            X.1ca r0 = r5.A0K(r0)
            if (r4 == 0) goto L_0x0296
            if (r3 == 0) goto L_0x0296
            if (r1 == 0) goto L_0x0296
            if (r0 == 0) goto L_0x0296
            java.lang.String r10 = r4.A0M()
            java.lang.String r9 = r3.A0M()
            java.lang.String r8 = r1.A0M()
            java.lang.String r7 = r0.A0M()
            if (r10 == 0) goto L_0x0296
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0296
            if (r9 == 0) goto L_0x0296
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0296
            if (r8 == 0) goto L_0x0296
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0296
            if (r7 == 0) goto L_0x0296
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0296
            X.9eE r1 = r2.A00
            if (r1 == 0) goto L_0x0299
            com.whatsapp.jid.UserJid r6 = r2.A01
            r5 = 0
            java.lang.String r0 = "DirectConnectionManager/loadPhoneNumberSignature/onGetPhoneNumberSignatureSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.A2z r4 = r1.A00
            X.AEW r3 = r1.A01
            com.whatsapp.jid.UserJid r0 = r1.A03
            r28 = r0
            X.00H r0 = r4.A08
            java.lang.Object r2 = r0.get()
            X.A1i r2 = (X.C19973A1i) r2
            java.lang.String r22 = "postcode"
            r1 = 1
            r0 = r22
            boolean r0 = X.C19973A1i.A00(r2, r3, r0, r1)
            if (r0 != 0) goto L_0x0229
            r3 = 0
        L_0x008e:
            r21 = 0
        L_0x0090:
            X.11S r0 = r4.A05
            r27 = r0
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r27)
            if (r0 == 0) goto L_0x00ac
            X.0z4 r2 = r4.A06
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = r28.getRawString()
            boolean r0 = r2.A2c(r1, r0)
            r20 = 1
            if (r0 != 0) goto L_0x0222
        L_0x00ac:
            r20 = 0
            X.0z4 r2 = r4.A06
            java.lang.String r0 = r28.getRawString()
            java.lang.String r0 = r2.A0q(r0)
            if (r0 != 0) goto L_0x0222
            r0 = 0
            X.9sK r13 = new X.9sK
            r13.<init>(r0, r9, r0, r3)
        L_0x00c0:
            X.0ve r0 = r4.A07
            r26 = r0
            r11 = 1867(0x74b, float:2.616E-42)
            X.0vf r19 = X.C18040vf.A02
            r1 = r0
            r0 = r19
            boolean r0 = X.C18020vd.A05(r0, r1, r11)
            if (r0 == 0) goto L_0x00ff
            X.00H r0 = r4.A0C
            java.lang.Object r0 = r0.get()
            X.9WZ r0 = (X.AnonymousClass9WZ) r0
            X.0z4 r14 = r0.A00
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r14)
            java.lang.String r12 = "latest_biz_backend_request_id"
            java.lang.String r11 = X.C17880vN.A0r(r0, r12)
            r1 = 0
            if (r11 == 0) goto L_0x00ff
            java.lang.String r0 = "252"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00f5
            X.9sK r1 = new X.9sK
            r1.<init>(r10, r9, r8, r3)
        L_0x00f5:
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r14)
            X.C17880vN.A1B(r0, r12)
            if (r1 == 0) goto L_0x00ff
            r13 = r1
        L_0x00ff:
            java.lang.String r0 = "yyyyMMdd'T'HHmmss'Z'"
            java.text.SimpleDateFormat r0 = X.AnonymousClass8BS.A0q(r0)     // Catch:{ ParseException -> 0x0283 }
            java.lang.String r14 = r13.A03     // Catch:{ ParseException -> 0x0283 }
            java.util.Date r18 = r0.parse(r14)     // Catch:{ ParseException -> 0x0283 }
            if (r18 == 0) goto L_0x0289
            java.lang.String r17 = "direct-connection-fail-to-generate-encryption-string"
            java.lang.String r16 = "DirectConnectionManager/generateEncryptionStringFromSignedInfo/"
            r1 = 2
            r0 = r28
            java.lang.String r15 = r4.A01(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r11 = ""
            if (r15 != 0) goto L_0x011e
            goto L_0x025d
        L_0x011e:
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r12 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            byte[] r1 = android.util.Base64.decode(r15, r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.security.cert.Certificate r12 = r12.generateCertificate(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            X.C18070vi.A0z(r12, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            javax.security.auth.x500.X500Principal r0 = r12.getSubjectX500Principal()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r0 = r0.getName()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            X.C18070vi.A0X(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r0 = X.AnonymousClass9PH.A00(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            boolean r0 = r7.equals(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            if (r0 != 0) goto L_0x0162
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSignedInfo/Incorrect CN in certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            X.190 r1 = r4.A04     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r0 = "direct-connection-certificate-common-name-mismatch"
            r1.A0G(r0, r11, r5)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r0 = r28.getRawString()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            r2.A1U(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            goto L_0x027f
        L_0x0162:
            X.00H r0 = r4.A0A     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.Object r11 = r0.get()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            X.A4Q r11 = (X.A4Q) r11     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            org.json.JSONObject r1 = X.C17880vN.A15()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r0 = r13.A00     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            r15 = r25
            r1.put(r15, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            r0 = r24
            r1.put(r0, r14)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r14 = r13.A01     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            r0 = r23
            r1.put(r0, r14)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r13 = r13.A02     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            r0 = r22
            java.lang.String r0 = X.AnonymousClass8BV.A0r(r13, r0, r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.security.PublicKey r1 = r12.getPublicKey()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            X.C18070vi.A0X(r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            X.9cd r13 = X.A4Q.A00(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            javax.crypto.SecretKey r0 = r13.A00     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            byte[] r12 = X.A4Q.A01(r1, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            byte[] r0 = r0.getEncoded()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            r11.A00 = r0     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            byte[] r1 = r13.A02     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            r11.A01 = r1     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            byte[] r0 = r13.A01     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r13 = X.AnonymousClass9PI.A00(r0, r12, r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            if (r13 == 0) goto L_0x027f
            java.lang.String r12 = r28.getRawString()
            android.content.SharedPreferences$Editor r11 = X.C19830z4.A00(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "dc_business_domain_"
            X.AnonymousClass8BX.A0z(r11, r0, r12, r7, r1)
            java.lang.String r0 = r4.A02
            if (r0 != 0) goto L_0x0219
            java.lang.String r12 = r28.getRawString()
            android.content.SharedPreferences$Editor r11 = X.C19830z4.A00(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "smb_business_direct_connection_enc_string_"
            X.AnonymousClass8BX.A0z(r11, r0, r12, r13, r1)
            java.lang.String r14 = r28.getRawString()
            long r0 = r18.getTime()
            android.content.SharedPreferences$Editor r13 = X.C19830z4.A00(r2)
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r11 = "smb_business_direct_connection_enc_string_expired_timestamp_"
            java.lang.String r11 = X.AnonymousClass001.A1H(r11, r14, r12)
            X.C17880vN.A1D(r13, r11, r0)
        L_0x01eb:
            r11 = 3760(0xeb0, float:5.269E-42)
            r1 = r26
            r0 = r19
            boolean r0 = X.C18020vd.A05(r0, r1, r11)
            if (r0 == 0) goto L_0x026a
            if (r20 != 0) goto L_0x026a
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r27)
            if (r0 == 0) goto L_0x026a
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = r28.getRawString()
            boolean r0 = r2.A2c(r1, r0)
            if (r0 == 0) goto L_0x026a
            int r0 = r21 + 1
            byte r2 = (byte) r0
            r1 = 1
            r0 = r21
            if (r0 >= r1) goto L_0x026a
            r21 = r2
            goto L_0x0090
        L_0x0219:
            r4.A01 = r13
            long r0 = r18.getTime()
            r4.A00 = r0
            goto L_0x01eb
        L_0x0222:
            X.9sK r13 = new X.9sK
            r13.<init>(r10, r9, r8, r3)
            goto L_0x00c0
        L_0x0229:
            java.lang.String r3 = r4.A02
            if (r3 == 0) goto L_0x0233
            int r0 = r3.length()
            if (r0 != 0) goto L_0x008e
        L_0x0233:
            X.0z4 r1 = r4.A06
            java.lang.String r0 = r28.getRawString()
            java.lang.String r3 = r1.A0q(r0)
            if (r3 == 0) goto L_0x0245
            int r0 = r3.length()
            if (r0 != 0) goto L_0x008e
        L_0x0245:
            java.lang.String r3 = r28.getRawString()
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "dc_default_postcode_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            java.lang.String r3 = X.C17880vN.A0r(r2, r0)
            goto L_0x008e
        L_0x025d:
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSignedInfo/Null certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            X.190 r1 = r4.A04     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            java.lang.String r0 = "direct-connection-failed-to-load-certificate-from-preferences"
            r1.A0G(r0, r11, r5)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x026e }
            goto L_0x027f
        L_0x026a:
            r4.A07(r6)
            return
        L_0x026e:
            r1 = move-exception
            r0 = r16
            com.whatsapp.util.Log.e(r0, r1)
            X.190 r2 = r4.A04
            java.lang.String r1 = r1.toString()
            r0 = r17
            r2.A0G(r0, r1, r5)
        L_0x027f:
            r4.A06(r6)
            return
        L_0x0283:
            r1 = move-exception
            java.lang.String r0 = "DirectConnectionManager/getExpirationDateFromSignedUserInfo/Invalid timestamp"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0289:
            r4.A06(r6)
            X.190 r2 = r4.A04
            java.lang.String r1 = "direct-connection-invalid-expiration-date"
            java.lang.String r0 = ""
            r2.A0G(r1, r0, r5)
            return
        L_0x0296:
            r2.A00()
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20990Aci.C7Z(X.1ca, java.lang.String):void");
    }

    private final void A00() {
        C186459eE r2 = this.A00;
        if (r2 != null) {
            UserJid userJid = this.A01;
            Log.e("DirectConnectionManager/loadPhoneNumberSignature/onGetPhoneNumberSignatureError");
            C20009A2z a2z = r2.A00;
            a2z.A06(userJid);
            a2z.A04.A0G("direct-connection-get-phone-signature-error-response", "", false);
        }
    }

    public void BrD(String str) {
        A00();
    }

    public void Bt9(C29621ca r3, String str) {
        C17900vP.A0g("GetPhoneNumberSignature/delivery-error with iqId ", str, C18070vi.A0K(str));
        A00();
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
