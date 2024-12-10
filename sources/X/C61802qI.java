package X;

/* renamed from: X.2qI  reason: invalid class name and case insensitive filesystem */
public final class C61802qI {
    public static final void A00(byte[] bArr) {
        int length;
        if (bArr != null && (length = bArr.length) != 0) {
            StringBuilder sb = new StringBuilder(length * 2);
            int i = 0;
            do {
                byte b = bArr[i];
                char c = (char) ((b >>> 4) & 15);
                char c2 = (char) (b & 15);
                char c3 = 'W';
                char c4 = '0';
                if (c >= 10) {
                    c4 = 'W';
                }
                char c5 = (char) (c + c4);
                if (c2 < 10) {
                    c3 = '0';
                }
                sb.append(c5);
                sb.append((char) (c2 + c3));
                i++;
            } while (i < length);
            C18070vi.A0X(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01(android.content.Context r12, java.lang.String r13) {
        /*
            r11 = this;
            boolean r6 = X.C18070vi.A15(r12, r13)
            java.lang.Boolean r0 = X.C17970vW.A03
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp"
            if (r1 == 0) goto L_0x018b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018b
            java.lang.String r4 = X.C19620yd.A0A
            X.C18070vi.A0Z(r4)
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r4)
            X.C18070vi.A0X(r0)
            byte[] r0 = X.C18070vi.A1A(r1, r0)
            r3.write(r0)
            java.lang.Class<X.9Td> r1 = X.C182119Td.class
            java.lang.String r0 = "/res/drawable-hdpi/about_logo.png"
            java.io.InputStream r7 = r1.getResourceAsStream(r0)
            if (r7 != 0) goto L_0x003c
            java.lang.String r0 = "/res/drawable-hdpi-v4/about_logo.png"
            java.io.InputStream r7 = r1.getResourceAsStream(r0)
        L_0x003c:
            if (r7 != 0) goto L_0x0044
            java.lang.String r0 = "/res/drawable-xxhdpi-v4/about_logo.png"
            java.io.InputStream r7 = r1.getResourceAsStream(r0)
        L_0x0044:
            if (r7 != 0) goto L_0x0078
            android.content.res.Resources r7 = r12.getResources()
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics
            r5.<init>()
            r5.setToDefaults()
            r0 = 1069547520(0x3fc00000, float:1.5)
            r5.density = r0
            r1 = 1069547520(0x3fc00000, float:1.5)
            r0 = 240(0xf0, float:3.36E-43)
            r5.densityDpi = r0
            r5.scaledDensity = r1
            r0 = 1131413504(0x43700000, float:240.0)
            r5.xdpi = r0
            r5.ydpi = r0
            android.content.res.AssetManager r2 = r7.getAssets()
            android.content.res.Configuration r0 = r7.getConfiguration()
            android.content.res.Resources r1 = new android.content.res.Resources
            r1.<init>(r2, r5, r0)
            r0 = 2131230979(0x7f080103, float:1.8078026E38)
            java.io.InputStream r7 = r1.openRawResource(r0)
        L_0x0078:
            if (r7 == 0) goto L_0x0185
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]
            int r1 = r7.read(r2)     // Catch:{ all -> 0x0178 }
        L_0x0082:
            r0 = -1
            r5 = 0
            if (r1 == r0) goto L_0x008e
            r3.write(r2, r6, r1)     // Catch:{ all -> 0x0178 }
            int r1 = r7.read(r2)     // Catch:{ all -> 0x0178 }
            goto L_0x0082
        L_0x008e:
            r7.close()     // Catch:{ IOException -> 0x017f }
            byte[] r10 = r3.toByteArray()
            byte[] r9 = X.AnonymousClass2W2.A00
            r8 = 128(0x80, float:1.794E-43)
            r7 = 512(0x200, float:7.175E-43)
            java.lang.String r6 = "PBKDF2WithHmacSHA1And8BIT"
            int r3 = r10.length
            char[] r2 = new char[r3]
            r1 = 0
        L_0x00a1:
            if (r1 >= r3) goto L_0x00ab
            byte r0 = r10[r1]
            char r0 = (char) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00ab:
            javax.crypto.SecretKey r1 = X.C17970vW.A08(r6, r9, r2, r8, r7)
            byte[] r0 = r1.getEncoded()
            A00(r0)
            java.lang.String r0 = "HMACSHA1"
            javax.crypto.Mac r3 = javax.crypto.Mac.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0171, InvalidKeyException -> 0x016a }
            X.C18070vi.A0X(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0171, InvalidKeyException -> 0x016a }
            r3.init(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0171, InvalidKeyException -> 0x016a }
            android.content.pm.Signature[] r2 = X.C24211Jh.A04(r12)
            X.C18070vi.A0b(r2)
            int r1 = r2.length
        L_0x00ca:
            if (r5 >= r1) goto L_0x00db
            r0 = r2[r5]
            byte[] r0 = r0.toByteArray()
            A00(r0)
            r3.update(r0)
            int r5 = r5 + 1
            goto L_0x00ca
        L_0x00db:
            java.lang.String r0 = r12.getPackageCodePath()     // Catch:{ Exception -> 0x0124 }
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x0124 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r0 = "classes.dex"
            java.util.zip.ZipEntry r0 = r7.getEntry(r0)     // Catch:{ all -> 0x011a }
            java.io.InputStream r6 = r7.getInputStream(r0)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x010e }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x010e }
        L_0x00f8:
            int r1 = r6.read(r2)     // Catch:{ all -> 0x010e }
            if (r1 <= 0) goto L_0x0103
            r0 = 0
            r5.update(r2, r0, r1)     // Catch:{ all -> 0x010e }
            goto L_0x00f8
        L_0x0103:
            byte[] r0 = r5.digest()     // Catch:{ all -> 0x010e }
            r6.close()     // Catch:{ all -> 0x011a }
            r7.close()     // Catch:{ Exception -> 0x0124 }
            goto L_0x0130
        L_0x010e:
            r1 = move-exception
            if (r6 == 0) goto L_0x0119
            r6.close()     // Catch:{ all -> 0x0115 }
            goto L_0x0119
        L_0x0115:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x011a }
        L_0x0119:
            throw r1     // Catch:{ all -> 0x011a }
        L_0x011a:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x011f }
            goto L_0x0123
        L_0x011f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0124 }
        L_0x0123:
            throw r1     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            r1 = move-exception
            java.lang.String r0 = "app/md5/bytes/error "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "null"
            byte[] r0 = r0.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x0163 }
        L_0x0130:
            X.C18070vi.A0b(r0)
            A00(r0)
            r3.update(r0)
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r4)     // Catch:{ UnsupportedEncodingException -> 0x015c }
            X.C18070vi.A0X(r0)     // Catch:{ UnsupportedEncodingException -> 0x015c }
            byte[] r0 = X.C18070vi.A1A(r13, r0)     // Catch:{ UnsupportedEncodingException -> 0x015c }
            A00(r0)
            r3.update(r0)
            byte[] r1 = r3.doFinal()
            X.C18070vi.A0X(r1)
            java.lang.Boolean r0 = X.C17960vV.A01
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            X.C18070vi.A0X(r0)
            return r0
        L_0x015c:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0163:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        L_0x016a:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0171:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0178:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x017a }
        L_0x017a:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ IOException -> 0x017f }
            throw r0     // Catch:{ IOException -> 0x017f }
        L_0x017f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0185:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x018b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61802qI.A01(android.content.Context, java.lang.String):java.lang.String");
    }
}
