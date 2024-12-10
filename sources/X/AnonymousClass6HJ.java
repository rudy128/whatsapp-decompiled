package X;

import java.io.File;

/* renamed from: X.6HJ  reason: invalid class name */
public final class AnonymousClass6HJ extends C136706uF {
    public final AnonymousClass18K A00;
    public final AnonymousClass72L A01;
    public final File A02;
    public final C138216wi A03;

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x016d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        com.whatsapp.util.Log.e("LottieStickerZipEntrySaver/saveTokenAndAnimationOutputStream too many files to unzip");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.CDX.A00(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0095, code lost:
        if (r16 == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0097, code lost:
        if (r15 == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0099, code lost:
        r0 = r10.toByteArray();
        X.C18070vi.A0X(r0);
        r13 = X.C26571Sq.A05;
        r12 = new java.lang.String(r0, r13);
        r0 = r11.toByteArray();
        X.C18070vi.A0X(r0);
        r1 = new java.lang.String(r0, r13);
        r0 = true;
        r9 = r12;
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        com.whatsapp.util.Log.e("LottieStickerZipEntrySaver/saveTokenAndAnimationOutputStream unable to find either animation or token entry");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.CDX.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00db, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(java.lang.Integer r22) {
        /*
            r21 = this;
            r4 = 0
            r6 = r22
            X.C18070vi.A0d(r6, r4)
            r3 = r21
            X.6wi r2 = r3.A03
            java.io.File r8 = r3.A02
            r9 = 0
            r20 = 0
            java.lang.String r5 = "LottieValidator/validateLottieFile error validating lottie file"
            r19 = 0
            X.0ve r7 = r2.A00     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            r1 = 7886(0x1ece, float:1.105E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            boolean r0 = X.C18020vd.A05(r0, r7, r1)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            r7 = 0
            if (r0 == 0) goto L_0x0172
            java.io.FileInputStream r8 = X.C108945cZ.A18(r8)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            r18 = 0
            java.io.ByteArrayOutputStream r10 = X.C108945cZ.A15()     // Catch:{ IOException -> 0x00dc }
            java.io.ByteArrayOutputStream r11 = X.C108945cZ.A15()     // Catch:{ all -> 0x00d5 }
            X.00H r0 = r2.A01     // Catch:{ all -> 0x00ce }
            java.lang.Object r13 = r0.get()     // Catch:{ all -> 0x00ce }
            X.64b r13 = (X.C1185964b) r13     // Catch:{ all -> 0x00ce }
            java.util.zip.ZipInputStream r12 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x00ce }
            r12.<init>(r8)     // Catch:{ all -> 0x00ce }
            java.util.zip.ZipEntry r17 = r12.getNextEntry()     // Catch:{ all -> 0x00c7 }
            r16 = 0
            r15 = 0
            r1 = 0
        L_0x0043:
            if (r17 == 0) goto L_0x0092
            if (r16 == 0) goto L_0x0049
            if (r15 != 0) goto L_0x0092
        L_0x0049:
            java.lang.String r14 = "animation/animation.json"
            java.lang.String r0 = r17.getName()     // Catch:{ all -> 0x00c7 }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x005d
            X.C1185964b.A00(r13, r10, r12)     // Catch:{ all -> 0x0080 }
            r10.close()     // Catch:{ all -> 0x00c7 }
            r16 = 1
        L_0x005d:
            java.lang.String r14 = "animation/animation.json.trust_token"
            java.lang.String r0 = r17.getName()     // Catch:{ all -> 0x00c7 }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0070
            X.C1185964b.A00(r13, r11, r12)     // Catch:{ all -> 0x0087 }
            r11.close()     // Catch:{ all -> 0x00c7 }
            r15 = 1
        L_0x0070:
            java.util.zip.ZipEntry r17 = r12.getNextEntry()     // Catch:{ all -> 0x00c7 }
            int r1 = r1 + 1
            r0 = 20
            if (r1 <= r0) goto L_0x0043
            java.lang.String r0 = "LottieStickerZipEntrySaver/saveTokenAndAnimationOutputStream too many files to unzip"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00c7 }
            goto L_0x008e
        L_0x0080:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r1 = move-exception
            X.CDX.A00(r10, r0)     // Catch:{ all -> 0x00c7 }
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            X.CDX.A00(r11, r0)     // Catch:{ all -> 0x00c7 }
        L_0x008d:
            throw r1     // Catch:{ all -> 0x00c7 }
        L_0x008e:
            r12.close()     // Catch:{ all -> 0x00ce }
            goto L_0x00bd
        L_0x0092:
            r12.close()     // Catch:{ all -> 0x00ce }
            if (r16 == 0) goto L_0x00b8
            if (r15 == 0) goto L_0x00b8
            byte[] r0 = r10.toByteArray()     // Catch:{ all -> 0x00ce }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00ce }
            java.nio.charset.Charset r13 = X.C26571Sq.A05     // Catch:{ all -> 0x00ce }
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x00ce }
            r12.<init>(r0, r13)     // Catch:{ all -> 0x00ce }
            byte[] r0 = r11.toByteArray()     // Catch:{ all -> 0x00ce }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00ce }
            r1.<init>(r0, r13)     // Catch:{ all -> 0x00ce }
            r0 = 1
            r9 = r12
            r20 = r1
            goto L_0x00be
        L_0x00b8:
            java.lang.String r0 = "LottieStickerZipEntrySaver/saveTokenAndAnimationOutputStream unable to find either animation or token entry"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00ce }
        L_0x00bd:
            r0 = 0
        L_0x00be:
            r11.close()     // Catch:{ all -> 0x00d5 }
            r10.close()     // Catch:{ IOException -> 0x00dc }
            r18 = r0
            goto L_0x00e2
        L_0x00c7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            X.CDX.A00(r12, r1)     // Catch:{ all -> 0x00ce }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ IOException -> 0x00dc }
            throw r0     // Catch:{ IOException -> 0x00dc }
        L_0x00dc:
            r1 = move-exception
            java.lang.String r0 = "LottieValidator/getUnzipResult failed to create lottie json"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01b3 }
        L_0x00e2:
            r8.close()     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            if (r18 == 0) goto L_0x01be
            if (r20 == 0) goto L_0x01be
            java.lang.String r0 = X.AnonymousClass1Y7.A01(r20)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            X.A4E r1 = new X.A4E     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            r1.<init>(r0)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            X.00H r0 = r2.A02     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            r0.get()     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            java.util.Map r0 = X.C138216wi.A03     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            X.9ME r2 = X.C196649vP.A00(r1, r0)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            X.8oO r0 = X.AnonymousClass8oO.A00     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            boolean r0 = X.C18070vi.A18(r2, r0)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            if (r0 != 0) goto L_0x011b
            boolean r0 = r2 instanceof X.AnonymousClass8oN     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            if (r0 == 0) goto L_0x011b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            java.lang.String r0 = "LottieValidator/validateLottieFile failed to verify jwt token, "
            r1.append(r0)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            X.8oN r2 = (X.AnonymousClass8oN) r2     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            java.lang.String r0 = r2.A00     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            X.C17890vO.A1B(r1, r0)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            goto L_0x01be
        L_0x011b:
            org.json.JSONObject r8 = r1.A03     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            if (r8 == 0) goto L_0x01be
            java.lang.String r0 = "sticker_file_type"
            java.lang.String r2 = X.C20064A5n.A01(r0, r7, r8)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            java.lang.String r0 = "sticker_file_trusted_origin"
            java.lang.String r1 = X.C20064A5n.A01(r0, r7, r8)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            java.lang.String r0 = "lottie_json"
            boolean r0 = r0.equals(r2)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r1)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            if (r0 == 0) goto L_0x01be
            byte[] r0 = X.C108975cc.A1O(r9)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            r2.<init>(r0)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            java.security.MessageDigest r0 = X.C108945cZ.A1I()     // Catch:{ all -> 0x016b }
            X.C1402370n.A02(r2, r0)     // Catch:{ all -> 0x016b }
            byte[] r1 = r0.digest()     // Catch:{ all -> 0x016b }
            r0 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "sticker_file_sha256"
            java.lang.String r0 = X.C20064A5n.A01(r0, r7, r8)     // Catch:{ all -> 0x016b }
            boolean r0 = X.AnonymousClass1YE.A08(r1, r0)     // Catch:{ all -> 0x016b }
            r2.close()     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            if (r0 == 0) goto L_0x01be
            X.1yu r0 = X.C39771tc.A05(r9)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            java.lang.Object r0 = r0.A00     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            goto L_0x01a7
        L_0x016b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x016d }
        L_0x016d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            goto L_0x01b9
        L_0x0172:
            java.io.FileInputStream r8 = X.C108945cZ.A18(r8)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            java.io.ByteArrayOutputStream r7 = X.C108945cZ.A15()     // Catch:{ all -> 0x01b3 }
            X.00H r0 = r2.A01     // Catch:{ all -> 0x01ac }
            java.lang.Object r2 = X.C18070vi.A0E(r0)     // Catch:{ all -> 0x01ac }
            X.64b r2 = (X.C1185964b) r2     // Catch:{ all -> 0x01ac }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x01ac }
            r0.<init>(r8)     // Catch:{ all -> 0x01ac }
            r1 = 0
            boolean r0 = r2.A01(r7, r9, r0)     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x0199
            byte[] r0 = r7.toByteArray()     // Catch:{ all -> 0x01ac }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x01ac }
            java.lang.String r1 = X.C108955ca.A13(r0)     // Catch:{ all -> 0x01ac }
        L_0x0199:
            r7.close()     // Catch:{ all -> 0x01b3 }
            r8.close()     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            if (r1 == 0) goto L_0x01be
            X.1yu r0 = X.C39771tc.A05(r1)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
            java.lang.Object r0 = r0.A00     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
        L_0x01a7:
            if (r0 == 0) goto L_0x01be
            r19 = 1
            return r19
        L_0x01ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ae }
        L_0x01ae:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x01b3 }
            throw r0     // Catch:{ all -> 0x01b3 }
        L_0x01b3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01b5 }
        L_0x01b5:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
        L_0x01b9:
            throw r0     // Catch:{ 9Ks | IOException | JSONException -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x01be:
            int r1 = r6.intValue()
            r0 = 3
            if (r1 == r4) goto L_0x01c6
            r0 = 4
        L_0x01c6:
            X.628 r1 = new X.628
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.18K r0 = r3.A00
            r0.CC7(r1)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6HJ.A02(java.lang.Integer):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6HJ(AnonymousClass18K r1, AnonymousClass72L r2, C138216wi r3, File file) {
        super(file);
        C72473Md.A1I(r1, r2);
        this.A00 = r1;
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = file;
    }
}
