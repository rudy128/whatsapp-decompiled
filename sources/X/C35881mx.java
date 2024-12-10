package X;

/* renamed from: X.1mx  reason: invalid class name and case insensitive filesystem */
public class C35881mx extends C31911gK {
    public final C35871mw A00;
    public final C26721Tf A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass1VK A05;

    public C35881mx(AnonymousClass190 r9, AnonymousClass1VK r10, C35871mw r11, C26721Tf r12, AnonymousClass1OZ r13, AnonymousClass1N7 r14, AnonymousClass10I r15, AnonymousClass00H r16, AnonymousClass00H r17) {
        super(r9, r13, r14, r15, new int[]{252}, true);
        this.A02 = r15;
        this.A05 = r10;
        this.A01 = r12;
        this.A00 = r11;
        this.A03 = r16;
        this.A04 = r17;
    }

    /* JADX WARNING: type inference failed for: r0v186, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0341, code lost:
        if (r0 != 12) goto L_0x0343;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C29621ca r29, int r30) {
        /*
            r28 = this;
            r6 = r28
            X.00H r0 = r6.A03
            r27 = r0
            java.lang.Object r0 = r27.get()
            X.2kc r0 = (X.C58392kc) r0
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0020
            X.1VK r0 = r6.A05
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.2km r0 = (X.C58492km) r0
            r0.A00()
        L_0x001f:
            return
        L_0x0020:
            r0 = 252(0xfc, float:3.53E-43)
            r1 = r30
            if (r1 != r0) goto L_0x001f
            X.1ca r1 = r29.A0I()
            java.lang.String r18 = "stage"
            r0 = r18
            java.lang.String r2 = r1.A0P(r0)
            java.lang.String r0 = "companion_hello"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r0 = r27.get()
            X.2kc r0 = (X.C58392kc) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "link_code_pairing_wrapped_companion_ephemeral_pub"
            X.1ca r0 = r1.A0L(r0)
            byte[] r12 = r0.A01
            java.lang.String r0 = "companion_server_auth_key_pub"
            X.1ca r0 = r1.A0L(r0)
            byte[] r10 = r0.A01
            java.lang.String r0 = "link_code_pairing_ref"
            X.1ca r0 = r1.A0L(r0)
            java.lang.String r7 = r0.A0M()
            java.lang.String r14 = "companion_platform_id"
            X.1ca r0 = r1.A0K(r14)
            r13 = 0
            if (r0 == 0) goto L_0x00f9
            X.1ca r0 = r1.A0K(r14)
            java.lang.String r5 = r0.A0M()
        L_0x0072:
            java.lang.String r9 = "companion_platform_display"
            X.1ca r0 = r1.A0K(r9)
            if (r0 == 0) goto L_0x0082
            X.1ca r0 = r1.A0K(r9)
            java.lang.String r13 = r0.A0M()
        L_0x0082:
            java.lang.String r2 = "should_show_push_notification"
            r0 = 0
            java.lang.String r0 = r1.A0Q(r2, r0)
            java.lang.String r15 = "true"
            boolean r18 = r15.equals(r0)
            if (r12 == 0) goto L_0x0605
            if (r10 == 0) goto L_0x0605
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0605
            X.1mw r8 = r6.A00
            X.00H r0 = r8.A06
            r26 = r0
            java.lang.Object r4 = r26.get()
            X.9sz r4 = (X.C195219sz) r4
            long r2 = r4.A00
            r0 = 0
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x00c5
            r16 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 + r16
            X.11P r11 = r4.A03
            long r16 = X.AnonymousClass11P.A01(r11)
            int r11 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x00c5
            r2 = 17
            r4.A00(r2)
            r4.A00 = r0
        L_0x00c5:
            X.1mv r4 = r8.A01
            X.2rA r11 = r4.A00()
            X.0ve r2 = r4.A04
            r1 = 3816(0xee8, float:5.347E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r0 = 360000(0x57e40, double:1.778636E-318)
            long r1 = java.lang.Math.min(r0, r2)
            X.11P r0 = r4.A02
            long r24 = X.AnonymousClass11P.A01(r0)
            long r24 = r24 + r1
            X.2rA r0 = new X.2rA
            r19 = r0
            r20 = r7
            r21 = r5
            r22 = r12
            r23 = r10
            r19.<init>(r20, r21, r22, r23, r24)
            monitor-enter(r4)
            goto L_0x00fc
        L_0x00f9:
            r5 = r13
            goto L_0x0072
        L_0x00fc:
            X.0z4 r3 = r4.A03     // Catch:{ all -> 0x031d }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x031d }
            r10.<init>()     // Catch:{ all -> 0x031d }
            java.lang.String r2 = "wrappedCompanionEphemeralPubBase64"
            byte[] r1 = r0.A04     // Catch:{ JSONException -> 0x0131 }
            r12 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r12)     // Catch:{ JSONException -> 0x0131 }
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x0131 }
            java.lang.String r2 = "companionServerAuthKeyPubBase64"
            byte[] r1 = r0.A03     // Catch:{ JSONException -> 0x0131 }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r12)     // Catch:{ JSONException -> 0x0131 }
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x0131 }
            java.lang.String r2 = "linkCodePairingRef"
            java.lang.String r1 = r0.A02     // Catch:{ JSONException -> 0x0131 }
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x0131 }
            java.lang.String r2 = "companionPlatformId"
            java.lang.String r1 = r0.A01     // Catch:{ JSONException -> 0x0131 }
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x0131 }
            java.lang.String r2 = "expirationTsMs"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x0131 }
            r10.put(r2, r0)     // Catch:{ JSONException -> 0x0131 }
            goto L_0x0139
        L_0x0131:
            r1 = move-exception
            java.lang.String r0 = "CompanionHelloInfoManager/toJsonString error: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x031d }
            r2 = 0
            goto L_0x013d
        L_0x0139:
            java.lang.String r2 = r10.toString()     // Catch:{ all -> 0x031d }
        L_0x013d:
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)     // Catch:{ all -> 0x031d }
            java.lang.String r0 = "companion_reg_with_link_code_companion_hello_info_json"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)     // Catch:{ all -> 0x031d }
            r0.apply()     // Catch:{ all -> 0x031d }
            monitor-exit(r4)     // Catch:{ all -> 0x031d }
            X.0z4 r0 = r8.A03
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "companion_reg_with_link_code_retry_count"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            if (r11 == 0) goto L_0x0195
            java.lang.String r2 = r11.A02
            boolean r0 = r2.equals(r7)
            if (r0 != 0) goto L_0x0195
            X.00H r0 = r8.A07
            java.lang.Object r1 = r0.get()
            X.1OZ r1 = (X.AnonymousClass1OZ) r1
            X.37C r0 = new X.37C
            r0.<init>(r1)
            r0.A00(r2, r15)
            if (r18 != 0) goto L_0x0180
            if (r5 == 0) goto L_0x018e
            java.lang.String r0 = r11.A01
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x018e
        L_0x0180:
            X.11P r0 = r8.A02
            long r0 = X.AnonymousClass11P.A01(r0)
            monitor-enter(r4)
            r4.A01 = r0     // Catch:{ all -> 0x05cc }
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x05cc }
            goto L_0x0194
        L_0x018e:
            long r0 = r11.A00
            r4.A01(r0)
            goto L_0x0195
        L_0x0194:
            monitor-exit(r4)
        L_0x0195:
            java.lang.Object r1 = r26.get()
            X.9sz r1 = (X.C195219sz) r1
            r0 = 1
            r1.A01(r0, r7, r5)
            java.lang.Object r0 = r27.get()
            X.2kc r0 = (X.C58392kc) r0
            X.0z4 r0 = r0.A00
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "did_receive_companion_hello"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            if (r18 == 0) goto L_0x001f
            X.00H r0 = r6.A04
            java.lang.Object r3 = r0.get()
            X.2ed r3 = (X.C54742ed) r3
            r11 = 0
            X.C18070vi.A0d(r7, r11)
            java.lang.String r0 = "CompanionRegWithLinkCodeNotificationManager/onReceiveCompanionHelloNotificationFromServer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Vn r2 = r3.A02
            r0 = r2
            X.1Vo r0 = (X.AnonymousClass1Vo) r0
            X.1Vp r0 = r0.A00
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x01db
            java.lang.String r0 = "CompanionRegWithLinkCodeNotificationManager/onReceiveCompanionHelloNotificationFromServer notification disabled"
        L_0x01d7:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01db:
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x029c
            java.lang.String r0 = "CompanionRegWithLinkCodeNotificationManager/onReceiveCompanionHelloNotificationFromServer user is already on enter code screen"
            goto L_0x01d7
        L_0x01e2:
            java.lang.String r17 = "companion_finish"
            r0 = r17
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0233
            java.lang.String r0 = "link_code_pairing_wrapped_key_bundle"
            X.1ca r0 = r1.A0L(r0)
            byte[] r5 = r0.A01
            java.lang.String r0 = "companion_identity_public"
            X.1ca r0 = r1.A0L(r0)
            byte[] r4 = r0.A01
            java.lang.String r0 = "link_code_pairing_ref"
            X.1ca r0 = r1.A0L(r0)
            java.lang.String r3 = r0.A0M()
            if (r5 == 0) goto L_0x05ed
            if (r4 == 0) goto L_0x05ed
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x05ed
            X.10I r2 = r6.A02
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LinkCodeCompanionRegNotificationHandler/handleCompanionFinishNotification/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r12 = 13
            X.AkN r0 = new X.AkN
            r7 = r0
            r8 = r6
            r9 = r5
            r10 = r4
            r11 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            r2.CGO(r0, r1)
            return
        L_0x0233:
            java.lang.String r0 = "primary_hello"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x026a
            java.lang.String r0 = "link_code_pairing_wrapped_primary_ephemeral_pub"
            X.1ca r0 = r1.A0L(r0)
            byte[] r8 = r0.A01
            java.lang.String r0 = "primary_identity_pub"
            X.1ca r0 = r1.A0L(r0)
            byte[] r11 = r0.A01
            java.lang.String r16 = "link_code_pairing_ref"
            r0 = r16
            X.1ca r0 = r1.A0L(r0)
            java.lang.String r10 = r0.A0M()
            if (r8 == 0) goto L_0x05cf
            if (r11 == 0) goto L_0x05cf
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x05cf
            X.1Tf r0 = r6.A01
            X.11w r4 = X.C26721Tf.A00(r0)
            monitor-enter(r4)
            goto L_0x0320
        L_0x026a:
            java.lang.String r0 = "refresh_code"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "link_code_pairing_ref"
            X.1ca r0 = r1.A0L(r0)
            java.lang.String r3 = r0.A0M()
            java.lang.String r2 = "force_manual_refresh"
            java.lang.String r0 = "false"
            java.lang.String r1 = r1.A0Q(r2, r0)
            java.lang.String r0 = "true"
            boolean r4 = r0.equals(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x062d
            X.190 r5 = r6.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "refresh_code:"
            goto L_0x05fe
        L_0x029c:
            X.118 r8 = r3.A01
            r0 = 2131888640(0x7f120a00, float:1.9411921E38)
            java.lang.String r6 = r8.A01(r0)
            X.C18070vi.A0X(r6)
            android.content.Context r10 = r8.A00
            X.73t r4 = X.C217217d.A03(r10)
            java.lang.String r0 = "critical_app_alerts@1"
            r4.A0M = r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r12 = r10.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.CompanionHelloConfirmationActivity"
            r1.setClassName(r12, r0)
            java.lang.String r0 = "pairing_ref"
            r1.putExtra(r0, r7)
            if (r5 == 0) goto L_0x02ca
            r1.putExtra(r14, r5)
        L_0x02ca:
            if (r13 == 0) goto L_0x02cf
            r1.putExtra(r9, r13)
        L_0x02cf:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C1408573i.A00(r10, r11, r1, r0)
            r4.A0A = r0
            r1 = 1
            r4.A03 = r1
            r0 = 2131899103(0x7f1232df, float:1.9433143E38)
            java.lang.String r0 = r8.A01(r0)
            r4.A0E(r0)
            r4.A0F(r6)
            r4.A0D(r6)
            r0 = 3
            r4.A06(r0)
            r4.A0G(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A07(r6)
            r4.A0B(r0)
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r4.A08
            r0.icon = r1
            android.app.Notification r1 = r4.A05()
            X.C18070vi.A0X(r1)
            r0 = 54
            r2.BkR(r0, r1)
            X.00H r0 = r3.A03
            java.lang.Object r1 = r0.get()
            X.9sz r1 = (X.C195219sz) r1
            r0 = 10
            r1.A01(r0, r7, r5)
            return
        L_0x031d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x031d }
            throw r0
        L_0x0320:
            java.lang.String r0 = "companion/registration/primary-hello/received"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05cc }
            X.1Dn r13 = r4.A0P     // Catch:{ all -> 0x05cc }
            int r0 = r13.A00()     // Catch:{ all -> 0x05cc }
            r2 = 12
            r1 = 13
            r3 = 0
            if (r0 != r1) goto L_0x0341
            java.util.concurrent.atomic.AtomicReference r0 = r4.A0t     // Catch:{ all -> 0x05cc }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05cc }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x05cc }
            if (r0 == 0) goto L_0x0343
            r4.A0H = r3     // Catch:{ all -> 0x05cc }
            goto L_0x034a
        L_0x0341:
            if (r0 == r2) goto L_0x034a
        L_0x0343:
            java.lang.String r0 = "companion/registration/primary-hello/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05cc }
            goto L_0x05ca
        L_0x034a:
            int r9 = r8.length     // Catch:{ IllegalArgumentException -> 0x05a9 }
            r0 = 48
            if (r9 < r0) goto L_0x05a1
            r5 = 32
            r0 = 0
            byte[] r7 = java.util.Arrays.copyOfRange(r8, r0, r5)     // Catch:{ IllegalArgumentException -> 0x05a9 }
            r0 = 48
            byte[] r6 = java.util.Arrays.copyOfRange(r8, r5, r0)     // Catch:{ IllegalArgumentException -> 0x05a9 }
            byte[] r5 = java.util.Arrays.copyOfRange(r8, r0, r9)     // Catch:{ IllegalArgumentException -> 0x05a9 }
            com.whatsapp.jid.UserJid r0 = r4.A08     // Catch:{ all -> 0x05cc }
            r12 = 2
            r9 = 3
            r8 = 1
            r24 = 0
            if (r0 == 0) goto L_0x0569
            X.2cF r0 = r4.A04     // Catch:{ all -> 0x05cc }
            if (r0 == 0) goto L_0x0569
            X.2cG r0 = r4.A05     // Catch:{ all -> 0x05cc }
            if (r0 == 0) goto L_0x0569
            java.util.concurrent.atomic.AtomicReference r0 = r4.A0t     // Catch:{ all -> 0x05cc }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05cc }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x05cc }
            if (r0 != 0) goto L_0x0384
            java.lang.String r0 = "companion/registration/primary-hello/ignoring as pairing ref does not match"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05cc }
            goto L_0x05ca
        L_0x0384:
            r13.A01(r1)     // Catch:{ all -> 0x05cc }
            java.lang.Runnable r1 = r4.A0A     // Catch:{ all -> 0x05cc }
            if (r1 == 0) goto L_0x0390
            X.10I r0 = r4.A0i     // Catch:{ all -> 0x05cc }
            r0.CEz(r1)     // Catch:{ all -> 0x05cc }
        L_0x0390:
            X.10I r14 = r4.A0i     // Catch:{ all -> 0x05cc }
            X.7Pc r13 = new X.7Pc     // Catch:{ all -> 0x05cc }
            r13.<init>(r4, r2)     // Catch:{ all -> 0x05cc }
            r0 = 60000(0xea60, double:2.9644E-319)
            X.25d r0 = r14.CGv(r13, r0)     // Catch:{ all -> 0x05cc }
            r4.A0A = r0     // Catch:{ all -> 0x05cc }
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x05cc }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x05cc }
            char[] r13 = r0.toCharArray()     // Catch:{ all -> 0x05cc }
            java.util.List r0 = X.C60732oW.A00     // Catch:{ all -> 0x05cc }
            r14 = 131072(0x20000, float:1.83671E-40)
            r1 = 256(0x100, float:3.59E-43)
            java.lang.String r0 = "PBKDF2WithHmacSHA256"
            javax.crypto.SecretKey r7 = X.C17970vW.A08(r0, r7, r13, r14, r1)     // Catch:{ all -> 0x05cc }
            java.lang.String r0 = "AES/CTR/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0557 }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0557 }
            r0.<init>(r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0557 }
            r1.init(r12, r7, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0557 }
            byte[] r6 = r1.doFinal(r5)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0557 }
            if (r6 == 0) goto L_0x05bb
            int r5 = r6.length     // Catch:{ all -> 0x05cc }
            r1 = 0
        L_0x03cb:
            if (r1 >= r5) goto L_0x05bb
            byte r0 = r6[r1]     // Catch:{ all -> 0x05cc }
            if (r0 == 0) goto L_0x0426
            r15 = 5
            X.1jP r1 = new X.1jP     // Catch:{ all -> 0x05cc }
            r1.<init>(r6)     // Catch:{ all -> 0x05cc }
            X.2cF r0 = r4.A04     // Catch:{ all -> 0x05cc }
            X.2kN r0 = r0.A00     // Catch:{ all -> 0x05cc }
            byte[] r14 = X.C63962tz.A08(r0, r1)     // Catch:{ all -> 0x05cc }
            r1 = 32
            java.security.SecureRandom r0 = X.C22691Cv.A00()     // Catch:{ all -> 0x05cc }
            byte[] r13 = new byte[r1]     // Catch:{ all -> 0x05cc }
            r0.nextBytes(r13)     // Catch:{ all -> 0x05cc }
            java.security.SecureRandom r0 = X.C22691Cv.A00()     // Catch:{ all -> 0x05cc }
            byte[] r7 = new byte[r1]     // Catch:{ all -> 0x05cc }
            r0.nextBytes(r7)     // Catch:{ all -> 0x05cc }
            java.security.SecureRandom r0 = X.C22691Cv.A00()     // Catch:{ all -> 0x05cc }
            byte[] r6 = new byte[r2]     // Catch:{ all -> 0x05cc }
            r0.nextBytes(r6)     // Catch:{ all -> 0x05cc }
            java.lang.String r1 = "link_code_pairing_key_bundle_encryption_key"
            java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ all -> 0x05cc }
            byte[] r1 = r1.getBytes(r0)     // Catch:{ all -> 0x05cc }
            r0 = 32
            byte[] r1 = X.C20058A5h.A02(r14, r7, r1, r0)     // Catch:{ all -> 0x05cc }
            java.lang.String r0 = "AES-GCM"
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec     // Catch:{ all -> 0x05cc }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x05cc }
            X.2cG r0 = r4.A05     // Catch:{ all -> 0x05cc }
            X.2kO r0 = r0.A01     // Catch:{ all -> 0x05cc }
            X.1jP r0 = r0.A00     // Catch:{ all -> 0x05cc }
            byte[] r3 = r0.A00     // Catch:{ all -> 0x05cc }
            byte[][] r0 = new byte[r9][]     // Catch:{ all -> 0x05cc }
            r0[r24] = r3     // Catch:{ all -> 0x05cc }
            r0[r8] = r11     // Catch:{ all -> 0x05cc }
            r0[r12] = r13     // Catch:{ all -> 0x05cc }
            byte[] r2 = X.A8G.A05(r0)     // Catch:{ all -> 0x05cc }
            goto L_0x0429
        L_0x0426:
            int r1 = r1 + 1
            goto L_0x03cb
        L_0x0429:
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0545 }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0545 }
            r0.<init>(r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0545 }
            r1.init(r8, r5, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0545 }
            byte[] r1 = r1.doFinal(r2)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0545 }
            byte[][] r0 = new byte[r9][]     // Catch:{ all -> 0x05cc }
            r0[r24] = r7     // Catch:{ all -> 0x05cc }
            r0[r8] = r6     // Catch:{ all -> 0x05cc }
            r0[r12] = r1     // Catch:{ all -> 0x05cc }
            byte[] r2 = X.A8G.A05(r0)     // Catch:{ all -> 0x05cc }
            X.1jP r1 = new X.1jP     // Catch:{ all -> 0x05cc }
            r1.<init>(r11)     // Catch:{ all -> 0x05cc }
            X.2cG r0 = r4.A05     // Catch:{ all -> 0x05cc }
            X.2kN r0 = r0.A00     // Catch:{ all -> 0x05cc }
            byte[] r1 = X.C63962tz.A08(r0, r1)     // Catch:{ all -> 0x05cc }
            byte[][] r0 = new byte[r9][]     // Catch:{ all -> 0x05cc }
            r0[r24] = r14     // Catch:{ all -> 0x05cc }
            r0[r8] = r1     // Catch:{ all -> 0x05cc }
            r0[r12] = r13     // Catch:{ all -> 0x05cc }
            byte[] r5 = X.A8G.A05(r0)     // Catch:{ all -> 0x05cc }
            java.lang.String r0 = "adv_secret"
            byte[] r1 = r0.getBytes()     // Catch:{ all -> 0x05cc }
            r0 = 32
            byte[] r0 = X.C20058A5h.A00(r5, r1, r0)     // Catch:{ all -> 0x05cc }
            r4.A0H = r0     // Catch:{ all -> 0x05cc }
            X.2i1 r1 = r4.A0Q     // Catch:{ all -> 0x05cc }
            com.whatsapp.jid.UserJid r6 = r4.A08     // Catch:{ all -> 0x05cc }
            java.lang.String r0 = "companion/registration/send-link-code-companion-reg-companion-finish"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05cc }
            X.1OZ r8 = r1.A00     // Catch:{ all -> 0x05cc }
            java.lang.String r5 = r8.A0B()     // Catch:{ all -> 0x05cc }
            byte[] r7 = r10.getBytes()     // Catch:{ all -> 0x05cc }
            java.lang.String r10 = "id"
            X.C18070vi.A0d(r6, r12)     // Catch:{ all -> 0x05cc }
            X.C18070vi.A0d(r2, r9)     // Catch:{ all -> 0x05cc }
            r0 = 4
            X.C18070vi.A0d(r3, r0)     // Catch:{ all -> 0x05cc }
            X.C18070vi.A0d(r7, r15)     // Catch:{ all -> 0x05cc }
            java.lang.String r0 = "iq"
            X.1cX r9 = new X.1cX     // Catch:{ all -> 0x05cc }
            r9.<init>((java.lang.String) r0)     // Catch:{ all -> 0x05cc }
            java.lang.String r11 = "xmlns"
            java.lang.String r1 = "md"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x05cc }
            r0.<init>((java.lang.String) r11, (java.lang.String) r1)     // Catch:{ all -> 0x05cc }
            r9.A04(r0)     // Catch:{ all -> 0x05cc }
            X.8v4 r11 = X.C173438v4.A00     // Catch:{ all -> 0x05cc }
            java.lang.String r1 = "to"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x05cc }
            r0.<init>((com.whatsapp.jid.Jid) r11, (java.lang.String) r1)     // Catch:{ all -> 0x05cc }
            r9.A04(r0)     // Catch:{ all -> 0x05cc }
            java.lang.String r11 = "type"
            java.lang.String r1 = "set"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x05cc }
            r0.<init>((java.lang.String) r11, (java.lang.String) r1)     // Catch:{ all -> 0x05cc }
            r9.A04(r0)     // Catch:{ all -> 0x05cc }
            r20 = 0
            r0 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r19 = r5
            r22 = r0
            boolean r11 = X.C29601cY.A04(r19, r20, r22, r24)     // Catch:{ all -> 0x05cc }
            if (r11 == 0) goto L_0x04d8
            X.1MD r11 = new X.1MD     // Catch:{ all -> 0x05cc }
            r11.<init>((java.lang.String) r10, (java.lang.String) r5)     // Catch:{ all -> 0x05cc }
            r9.A04(r11)     // Catch:{ all -> 0x05cc }
        L_0x04d8:
            java.lang.String r5 = "link_code_companion_reg"
            X.1cX r11 = new X.1cX     // Catch:{ all -> 0x05cc }
            r11.<init>((java.lang.String) r5)     // Catch:{ all -> 0x05cc }
            X.1MD r12 = new X.1MD     // Catch:{ all -> 0x05cc }
            r10 = r18
            r5 = r17
            r12.<init>((java.lang.String) r10, (java.lang.String) r5)     // Catch:{ all -> 0x05cc }
            r11.A04(r12)     // Catch:{ all -> 0x05cc }
            java.lang.String r10 = "jid"
            X.1MD r5 = new X.1MD     // Catch:{ all -> 0x05cc }
            r5.<init>((com.whatsapp.jid.Jid) r6, (java.lang.String) r10)     // Catch:{ all -> 0x05cc }
            r11.A04(r5)     // Catch:{ all -> 0x05cc }
            java.lang.String r5 = "link_code_pairing_wrapped_key_bundle"
            X.1cX r10 = new X.1cX     // Catch:{ all -> 0x05cc }
            r10.<init>((java.lang.String) r5)     // Catch:{ all -> 0x05cc }
            r5 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            X.C29601cY.A02(r2, r5, r0)     // Catch:{ all -> 0x05cc }
            r10.A01 = r2     // Catch:{ all -> 0x05cc }
            X.1ca r2 = r10.A03()     // Catch:{ all -> 0x05cc }
            r11.A05(r2)     // Catch:{ all -> 0x05cc }
            java.lang.String r10 = "companion_identity_public"
            X.1cX r2 = new X.1cX     // Catch:{ all -> 0x05cc }
            r2.<init>((java.lang.String) r10)     // Catch:{ all -> 0x05cc }
            X.C29601cY.A02(r3, r5, r0)     // Catch:{ all -> 0x05cc }
            r2.A01 = r3     // Catch:{ all -> 0x05cc }
            X.1ca r2 = r2.A03()     // Catch:{ all -> 0x05cc }
            r11.A05(r2)     // Catch:{ all -> 0x05cc }
            X.1cX r3 = new X.1cX     // Catch:{ all -> 0x05cc }
            r2 = r16
            r3.<init>((java.lang.String) r2)     // Catch:{ all -> 0x05cc }
            X.C29601cY.A02(r7, r5, r0)     // Catch:{ all -> 0x05cc }
            r3.A01 = r7     // Catch:{ all -> 0x05cc }
            X.1ca r0 = r3.A03()     // Catch:{ all -> 0x05cc }
            r11.A05(r0)     // Catch:{ all -> 0x05cc }
            X.1ca r0 = r11.A03()     // Catch:{ all -> 0x05cc }
            r9.A05(r0)     // Catch:{ all -> 0x05cc }
            X.1ca r1 = r9.A03()     // Catch:{ all -> 0x05cc }
            r0 = 365(0x16d, float:5.11E-43)
            r8.A0O(r1, r0)     // Catch:{ all -> 0x05cc }
            goto L_0x05ca
        L_0x0545:
            r3 = move-exception
            java.lang.String r0 = "companion/registration/companion-finish/failed to encrypt key bundle"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05cc }
            X.A15 r2 = r4.A0h     // Catch:{ all -> 0x05cc }
            java.lang.String r1 = "companion_finish_failed_encryption"
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x05cc }
            r2.A02(r1, r0)     // Catch:{ all -> 0x05cc }
            goto L_0x05c7
        L_0x0557:
            r3 = move-exception
            java.lang.String r0 = "companion/registration/companion-finish/failed to decrypt primary ADV public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05cc }
            X.A15 r2 = r4.A0h     // Catch:{ all -> 0x05cc }
            java.lang.String r1 = "companion_finish_failed_decryption"
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x05cc }
            r2.A02(r1, r0)     // Catch:{ all -> 0x05cc }
            goto L_0x05c7
        L_0x0569:
            java.lang.String r0 = "companion/registration/companion-finish/some required registration data is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05cc }
            java.lang.String r3 = "Absent: PJid=%s, ADVPair=%s, IdentPair=%s, "
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x05cc }
            com.whatsapp.jid.UserJid r1 = r4.A08     // Catch:{ all -> 0x05cc }
            r0 = 0
            if (r1 != 0) goto L_0x0578
            r0 = 1
        L_0x0578:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x05cc }
            r2[r24] = r0     // Catch:{ all -> 0x05cc }
            X.2cF r1 = r4.A04     // Catch:{ all -> 0x05cc }
            r0 = 0
            if (r1 != 0) goto L_0x0584
            r0 = 1
        L_0x0584:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x05cc }
            r2[r8] = r0     // Catch:{ all -> 0x05cc }
            X.2cG r0 = r4.A05     // Catch:{ all -> 0x05cc }
            if (r0 == 0) goto L_0x058f
            r8 = 0
        L_0x058f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x05cc }
            r2[r12] = r0     // Catch:{ all -> 0x05cc }
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x05cc }
            X.A15 r1 = r4.A0h     // Catch:{ all -> 0x05cc }
            java.lang.String r0 = "companion_finish_required_data_null"
            r1.A02(r0, r2)     // Catch:{ all -> 0x05cc }
            goto L_0x05c7
        L_0x05a1:
            java.lang.String r1 = "WrappedPrimaryEphemeralPubData/input byte array length too small"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x05a9 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x05a9 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x05a9 }
        L_0x05a9:
            r3 = move-exception
            java.lang.String r0 = "companion/registration/primary-hello/received invalid primary hello data"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x05cc }
            X.A15 r2 = r4.A0h     // Catch:{ all -> 0x05cc }
            java.lang.String r1 = "companion_hello_invalid_primary_data"
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x05cc }
            r2.A02(r1, r0)     // Catch:{ all -> 0x05cc }
            goto L_0x05c7
        L_0x05bb:
            java.lang.String r0 = "companion/registration/companion-finish/aborting as primary ADV public key is 0"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05cc }
            X.A15 r1 = r4.A0h     // Catch:{ all -> 0x05cc }
            java.lang.String r0 = "companion_finish_adv_public_key_zero"
            r1.A02(r0, r3)     // Catch:{ all -> 0x05cc }
        L_0x05c7:
            r4.A05()     // Catch:{ all -> 0x05cc }
        L_0x05ca:
            monitor-exit(r4)
            return
        L_0x05cc:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x05cf:
            X.190 r5 = r6.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "primary_hello:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r11)
            r1.append(r0)
            r1.append(r10)
            goto L_0x0622
        L_0x05ed:
            X.190 r5 = r6.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "companion_finish:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ","
        L_0x05fe:
            r1.append(r0)
            r1.append(r3)
            goto L_0x0622
        L_0x0605:
            X.190 r5 = r6.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "companion_hello:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r10)
            r1.append(r0)
            r1.append(r7)
        L_0x0622:
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "invalid_link_code_reg_notification"
            r5.A0G(r0, r2, r1)
            return
        L_0x062d:
            X.1Tf r0 = r6.A01
            X.11w r2 = X.C26721Tf.A00(r0)
            monitor-enter(r2)
            java.lang.String r0 = "companion/registration/refresh-code/received"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0677 }
            X.1Dn r0 = r2.A0P     // Catch:{ all -> 0x0677 }
            int r1 = r0.A00()     // Catch:{ all -> 0x0677 }
            r0 = 10
            if (r1 < r0) goto L_0x0670
            r0 = 14
            if (r1 > r0) goto L_0x0670
            java.util.concurrent.atomic.AtomicReference r0 = r2.A0t     // Catch:{ all -> 0x0677 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0677 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0677 }
            if (r0 != 0) goto L_0x0659
            java.lang.String r0 = "companion/registration/refresh-code/different session"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0677 }
            goto L_0x0675
        L_0x0659:
            r2.A04()     // Catch:{ all -> 0x0677 }
            if (r4 == 0) goto L_0x0669
            r1 = 12
            X.7KX r0 = new X.7KX     // Catch:{ all -> 0x0677 }
            r0.<init>(r1)     // Catch:{ all -> 0x0677 }
            r2.notifyAllObservers(r0)     // Catch:{ all -> 0x0677 }
            goto L_0x0675
        L_0x0669:
            com.whatsapp.jid.UserJid r1 = r2.A08     // Catch:{ all -> 0x0677 }
            r0 = 1
            r2.A09(r1, r0)     // Catch:{ all -> 0x0677 }
            goto L_0x0675
        L_0x0670:
            java.lang.String r0 = "companion/registration/refresh-code/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0677 }
        L_0x0675:
            monitor-exit(r2)
            return
        L_0x0677:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35881mx.A05(X.1ca, int):void");
    }
}
