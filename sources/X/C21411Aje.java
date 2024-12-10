package X;

/* renamed from: X.Aje  reason: case insensitive filesystem */
public final /* synthetic */ class C21411Aje implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ BAU A02;
    public final /* synthetic */ C198779yt A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ AnonymousClass1D6 A09;

    /* JADX WARNING: Removed duplicated region for block: B:41:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0306  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r37 = this;
            r6 = r37
            X.9yt r4 = r6.A03
            int r2 = r6.A00
            java.lang.String r5 = r6.A04
            java.lang.String r1 = r6.A05
            java.lang.String r0 = r6.A06
            r21 = r0
            java.lang.String r3 = r6.A07
            X.1D6 r0 = r6.A09
            r36 = r0
            int r0 = r6.A01
            r35 = r0
            java.lang.String r0 = r6.A08
            r34 = r0
            X.BAU r0 = r6.A02
            r33 = r0
            r20 = 0
            java.lang.String r19 = ""
            r6 = r21
            if (r21 != 0) goto L_0x002a
            r6 = r19
        L_0x002a:
            if (r2 == 0) goto L_0x02fd
            int r0 = r5.length()
            if (r0 == 0) goto L_0x02fd
            int r0 = r6.length()
            if (r0 == 0) goto L_0x02fd
            java.lang.String r0 = X.C19620yd.A0A
            X.C18070vi.A0Z(r0)
            byte[] r0 = X.AnonymousClass8BX.A1a(r0, r1)
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r0)
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)
            java.security.cert.Certificate r8 = r0.generateCertificate(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            X.C18070vi.A0z(r8, r0)
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            java.security.PublicKey r10 = X.C20059A5i.A03(r5)
            X.C18070vi.A0X(r10)
            org.json.JSONObject r9 = X.C17880vN.A15()
            java.lang.String r0 = "foa_authproof"
            r9.put(r0, r6)
            java.lang.String r6 = X.C20059A5i.A00()
            X.C18070vi.A0X(r6)
            X.11P r0 = r4.A02
            long r0 = X.AnonymousClass11P.A00(r0)
            X.00H r7 = r4.A0B
            r7.get()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r6 = X.A0V.A00(r5, r6, r2, r10)
            java.lang.StringBuilder r5 = X.C108955ca.A15(r6)
            java.lang.String r2 = "#PWD_WA:11:"
            r5.append(r2)
            r5.append(r0)
            r2 = 58
            java.lang.String r2 = X.C17890vO.A0Z(r6, r5, r2)
            java.lang.String r5 = "wa_ac_ent_enc_pw"
            r9.put(r5, r2)
            java.lang.Object r6 = r7.get()
            X.A0V r6 = (X.A0V) r6
            java.lang.String r5 = r9.toString()
            X.6h6 r7 = r6.A01(r5, r8)
            r8 = 0
            r14 = -1
            X.6Oe r6 = new X.6Oe
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r9 = r8
            r15 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            org.json.JSONObject r5 = X.C17880vN.A15()
            X.6h6 r7 = r6.A01
            byte[] r0 = r7.A01
            r6 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "key"
            r5.put(r0, r1)
            byte[] r0 = r7.A00
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "data"
            r5.put(r0, r1)
            byte[] r0 = r7.A03
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "tag"
            r5.put(r0, r1)
            byte[] r0 = r7.A02
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "nonce"
            r5.put(r0, r1)
            java.lang.String r0 = "rsa2048"
            byte[] r0 = X.C108975cc.A1O(r0)
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "algorithm"
            java.lang.String r0 = X.AnonymousClass8BV.A0r(r1, r0, r5)
            X.1D6 r9 = X.AnonymousClass1D6.A01(r0, r2)
        L_0x00fe:
            if (r3 == 0) goto L_0x02f9
            int r0 = r3.length()
            if (r0 == 0) goto L_0x02f9
            X.1P3 r0 = r4.A04
            X.1PJ r0 = r0.A01
            X.2cG r2 = r0.A03()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "1539"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            X.2kN r1 = r2.A00
            byte[] r0 = X.C108975cc.A1O(r0)
            byte[] r0 = X.C63962tz.A09(r1, r0)
            java.lang.String r14 = X.C108955ca.A14(r0)
            X.C18070vi.A0X(r14)
        L_0x0129:
            java.util.Map r1 = r4.A0F
            r0 = 551495536(0x20df2770, float:3.7803767E-19)
            java.lang.Object r8 = X.AnonymousClass000.A0w(r1, r0)
            if (r8 == 0) goto L_0x0322
            X.1dO r8 = (X.C30101dO) r8
            java.lang.String r0 = "WFS_START"
            r8.A04(r0)
            X.00H r0 = r4.A0C
            r32 = r0
            X.A8V r1 = X.AnonymousClass8BR.A0q(r32)
            java.lang.String r0 = "login_wfs"
            java.lang.String r7 = "wfs"
            r1.A0H(r7, r0)
            X.A98 r6 = r4.A07
            r0 = r36
            java.lang.Object r5 = r0.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            r1 = r21
            if (r21 != 0) goto L_0x015c
            r1 = r19
        L_0x015c:
            java.lang.String r0 = "foa_authproof"
            X.1D6 r10 = X.AnonymousClass1D6.A01(r0, r1)
            r1 = r3
            if (r3 != 0) goto L_0x0167
            r1 = r19
        L_0x0167:
            java.lang.String r0 = "wa_ac_ent_id"
            X.1D6 r18 = X.AnonymousClass1D6.A01(r0, r1)
            java.lang.String r0 = "id_ac_sign"
            X.1D6 r15 = X.AnonymousClass1D6.A01(r0, r14)
            java.lang.String r1 = "wfs_enc_blob"
            java.lang.Object r0 = r9.first
            X.1D6 r17 = X.AnonymousClass1D6.A01(r1, r0)
            X.2kw r0 = r4.A09
            r31 = r0
            java.lang.String r1 = r31.A00()
            if (r1 != 0) goto L_0x0187
            r1 = r19
        L_0x0187:
            java.lang.String r0 = "wa_ac_machine_id"
            X.1D6 r16 = X.AnonymousClass1D6.A01(r0, r1)
            boolean r1 = X.C18070vi.A17(r5, r2)
            r11 = 5
            boolean r0 = r6.A0T()
            if (r0 != 0) goto L_0x0271
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.9yS r10 = new X.9yS
            r10.<init>(r0)
        L_0x019f:
            java.lang.String r0 = "WFS_END"
            r8.A04(r0)
            java.lang.String r5 = "successful"
            java.lang.String r6 = "is_2fac"
            if (r10 == 0) goto L_0x0217
            int r0 = r10.A00
            if (r0 != r1) goto L_0x0214
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r20)
            r8.A01(r0, r6)
            X.A8V r0 = X.AnonymousClass8BR.A0q(r32)
            r0.A0H(r7, r5)
            X.0z4 r5 = r4.A03
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r5)
            java.lang.String r1 = "pref_wfs_source"
            r0 = r35
            X.C17880vN.A1C(r2, r1, r0)
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r5)
            java.lang.String r1 = "pref_wfs_name"
            r0 = r34
            X.C17880vN.A1E(r2, r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r5)
            java.lang.String r0 = "pref_wfs_user"
            X.C17880vN.A1E(r1, r0, r3)
            java.lang.Object r2 = r9.second
            java.lang.String r2 = (java.lang.String) r2
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r5)
            java.lang.String r0 = "pref_wfs_pw"
            X.C17880vN.A1E(r1, r0, r2)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r5)
            java.lang.String r0 = "pref_wfs_id_sign"
            X.C17880vN.A1E(r1, r0, r14)
            java.lang.String r0 = r10.A03
            if (r0 == 0) goto L_0x01f9
            r19 = r0
        L_0x01f9:
            r1 = r31
            r0 = r19
            r1.A01(r0)
            X.1KB r4 = r4.A00
            r3 = 9
        L_0x0204:
            X.Ak1 r2 = new X.Ak1
            r1 = r33
            r0 = r36
            r2.<init>(r1, r0, r10, r3)
            r4.CGP(r2)
            r8.A00()
            return
        L_0x0214:
            java.lang.Integer r2 = r10.A01
            goto L_0x0218
        L_0x0217:
            r2 = 0
        L_0x0218:
            java.lang.Integer r0 = X.AnonymousClass00R.A02
            if (r2 != r0) goto L_0x0306
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.A01(r0, r6)
            X.A8V r0 = X.AnonymousClass8BR.A0q(r32)
            r0.A0H(r7, r5)
            X.0z4 r5 = r4.A03
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r5)
            java.lang.String r1 = "pref_wfs_source"
            r0 = r35
            X.C17880vN.A1C(r2, r1, r0)
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r5)
            java.lang.String r1 = "pref_wfs_name"
            r0 = r34
            X.C17880vN.A1E(r2, r1, r0)
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r5)
            java.lang.String r1 = "pref_wfs_blob"
            r0 = r21
            X.C17880vN.A1E(r2, r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r5)
            java.lang.String r0 = "pref_wfs_user"
            X.C17880vN.A1E(r1, r0, r3)
            java.lang.Object r2 = r9.second
            java.lang.String r2 = (java.lang.String) r2
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r5)
            java.lang.String r0 = "pref_wfs_pw"
            X.C17880vN.A1E(r1, r0, r2)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r5)
            java.lang.String r0 = "pref_wfs_id_sign"
            X.C17880vN.A1E(r1, r0, r14)
            X.1KB r4 = r4.A00
            r3 = 10
            goto L_0x0204
        L_0x0271:
            r6.A0S(r1)
            byte[] r29 = r6.A0V(r5, r2)
            java.lang.String r0 = "wfsAuth"
            byte[] r30 = r6.A0U(r0)
            X.1D6[] r13 = new X.AnonymousClass1D6[r11]
            java.lang.Object r0 = r10.first
            r22 = r0
            java.lang.Object r0 = r10.second
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r12 = X.C26571Sq.A05
            byte[] r0 = X.C18070vi.A1A(r0, r12)
            r11 = r20
            r10 = r22
            X.AnonymousClass1D6.A03(r10, r0, r13, r11)
            r0 = r18
            java.lang.Object r10 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            byte[] r0 = X.C18070vi.A1A(r0, r12)
            X.AnonymousClass1D6.A03(r10, r0, r13, r1)
            java.lang.Object r11 = r15.first
            java.lang.Object r0 = r15.second
            java.lang.String r0 = (java.lang.String) r0
            byte[] r10 = X.C18070vi.A1A(r0, r12)
            r0 = 2
            X.AnonymousClass1D6.A03(r11, r10, r13, r0)
            r0 = r17
            java.lang.Object r11 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            byte[] r10 = X.C18070vi.A1A(r0, r12)
            r0 = 3
            X.AnonymousClass1D6.A03(r11, r10, r13, r0)
            r0 = r16
            java.lang.Object r10 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            byte[] r11 = X.C18070vi.A1A(r0, r12)
            r0 = 4
            X.AnonymousClass1D6.A03(r10, r11, r13, r0)
            java.util.LinkedHashMap r28 = X.AnonymousClass1D7.A0C(r13)
            X.9yS r10 = r6.A00
            if (r10 != 0) goto L_0x02f5
            X.A7d r24 = X.A98.A00(r6)
            java.util.List r27 = X.A98.A04(r6)
            X.2bP r0 = r6.A09
            X.9CH r22 = new X.9CH
            r25 = r5
            r26 = r2
            r23 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r10 = X.C19951A0i.A00(r22)
            X.9yS r10 = (X.C198509yS) r10
        L_0x02f5:
            r6.A00 = r10
            goto L_0x019f
        L_0x02f9:
            r14 = r19
            goto L_0x0129
        L_0x02fd:
            X.1D6 r9 = new X.1D6
            r1 = r19
            r9.<init>(r1, r1)
            goto L_0x00fe
        L_0x0306:
            X.A8V r1 = X.AnonymousClass8BR.A0q(r32)
            java.lang.String r0 = "failed"
            r1.A0H(r7, r0)
            java.lang.String r0 = "WFS_ERROR"
            r8.A03(r0)
            X.1KB r3 = r4.A00
            r2 = 6
            X.AkD r1 = new X.AkD
            r0 = r33
            r1.<init>(r0, r2)
            r3.CGP(r1)
            return
        L_0x0322:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21411Aje.run():void");
    }

    public /* synthetic */ C21411Aje(BAU bau, C198779yt r2, String str, String str2, String str3, String str4, String str5, AnonymousClass1D6 r8, int i, int i2) {
        this.A03 = r2;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A09 = r8;
        this.A01 = i2;
        this.A08 = str5;
        this.A02 = bau;
    }
}
