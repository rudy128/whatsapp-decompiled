package X;

/* renamed from: X.AIz  reason: case insensitive filesystem */
public class C20386AIz implements C22410B6p {
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0269, code lost:
        r1 = X.AnonymousClass8BW.A0o("Permission '", r5);
        r1.append("' is contained in the set of permissions, but is not specifically granted to '");
        r1.append(r4);
        X.C17890vO.A10("' by '", r6, "'", r1);
        r2 = new X.C21585AmZ(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017c, code lost:
        r10.write(1);
        r10.write(r14.size() & 255);
        r15 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018f, code lost:
        if (r15.hasNext() == false) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0191, code lost:
        r14 = (byte[]) r15.next();
        r9 = r14.length;
        r10.write(r9 & 255);
        r10.write(r14, 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a1, code lost:
        r14 = X.AnonymousClass9TE.A00;
        r15 = r4.getBytes(r14);
        r9 = r15.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a9, code lost:
        if (r9 > 255) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ab, code lost:
        r10.write(2);
        r10.write(r9 & 255);
        r10.write(r15, 0, r9);
        r9 = r1.getBytes(r14);
        r1 = r9.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01bc, code lost:
        if (r1 > 255) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01be, code lost:
        r10.write(3);
        r10.write(r1 & 255);
        r10.write(r9, 0, r1);
        r2 = r2.getBytes(r14);
        r1 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cf, code lost:
        if (r1 > 255) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d1, code lost:
        r10.write(4);
        r10.write(r1 & 255);
        r10.write(r2, 0, r1);
        r2 = r6.getBytes(r14);
        r1 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e2, code lost:
        if (r1 > 255) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e4, code lost:
        r10.write(5);
        r10.write(r1 & 255);
        r10.write(r2, 0, r1);
        r10 = r10.toByteArray();
        r10[1] = 5;
        r9 = r17.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fd, code lost:
        if (r9.hasNext() == false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ff, code lost:
        r2 = (X.C192159nu) r9.next();
        r1 = android.util.Base64.decode(r2.A01, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r0 = java.security.Signature.getInstance(r2.A00);
        r0.initVerify(r8);
        r0.update(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021d, code lost:
        if (r0.verify(r1) == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r1 = new X.C179989Kr("String size (UTF-8 encoded) cannot exceed 255");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0228, code lost:
        r1 = new X.C179989Kr("String size (UTF-8 encoded) cannot exceed 255");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0230, code lost:
        r1 = new X.C179989Kr("String size (UTF-8 encoded) cannot exceed 255");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0240, code lost:
        r1 = new X.C179989Kr("String size (UTF-8 encoded) cannot exceed 255");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BCd(android.content.Context r19, java.lang.String r20, java.lang.String r21) {
        /*
            r18 = this;
            java.lang.String r3 = "'"
            java.lang.String r6 = "' while verifying '"
            r11 = r19
            java.lang.String r10 = r11.getPackageName()
            r0 = 0
            r4 = r20
            android.content.Context r0 = r11.createPackageContext(r4, r0)     // Catch:{ NameNotFoundException -> 0x0354 }
            android.content.res.AssetManager r1 = r0.getAssets()     // Catch:{ NameNotFoundException -> 0x0354 }
            java.lang.String r0 = "fbpermissions.json"
            java.io.InputStream r12 = r1.open(r0)     // Catch:{ IOException -> 0x0340, JSONException -> 0x032c }
            java.io.BufferedReader r2 = X.AnonymousClass8BW.A0W(r12)     // Catch:{ all -> 0x0320 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0320 }
        L_0x0023:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0320 }
            if (r0 == 0) goto L_0x002d
            r1.append(r0)     // Catch:{ all -> 0x0320 }
            goto L_0x0023
        L_0x002d:
            r2.close()     // Catch:{ all -> 0x0320 }
            int r0 = r1.length()     // Catch:{ all -> 0x0320 }
            java.lang.String r2 = "Consumer app '"
            if (r0 == 0) goto L_0x0309
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0320 }
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ all -> 0x0320 }
            boolean r0 = r1.has(r10)     // Catch:{ all -> 0x0320 }
            if (r0 == 0) goto L_0x02f7
            org.json.JSONObject r8 = r1.getJSONObject(r10)     // Catch:{ all -> 0x0320 }
            java.util.HashSet r9 = X.C17880vN.A12()     // Catch:{ all -> 0x0320 }
            java.lang.String r0 = "permissions"
            org.json.JSONArray r2 = r8.getJSONArray(r0)     // Catch:{ all -> 0x0320 }
            int r0 = r2.length()     // Catch:{ all -> 0x0320 }
            if (r0 == 0) goto L_0x0318
            r7 = 0
            r1 = 0
        L_0x005c:
            int r0 = r2.length()     // Catch:{ all -> 0x0320 }
            if (r1 >= r0) goto L_0x0067
            int r1 = X.AnonymousClass8BU.A05(r9, r2, r1)     // Catch:{ all -> 0x0320 }
            goto L_0x005c
        L_0x0067:
            java.lang.String r1 = "signatures"
            boolean r0 = r8.has(r1)     // Catch:{ all -> 0x0320 }
            if (r0 == 0) goto L_0x009a
            org.json.JSONArray r5 = r8.getJSONArray(r1)     // Catch:{ all -> 0x0320 }
        L_0x0073:
            java.util.HashSet r17 = X.C17880vN.A12()     // Catch:{ all -> 0x0320 }
        L_0x0077:
            int r0 = r5.length()     // Catch:{ all -> 0x0320 }
            if (r7 >= r0) goto L_0x00a8
            org.json.JSONObject r1 = r5.getJSONObject(r7)     // Catch:{ all -> 0x0320 }
            java.lang.String r0 = "algorithm"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ all -> 0x0320 }
            java.lang.String r0 = "value"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0320 }
            X.9nu r1 = new X.9nu     // Catch:{ all -> 0x0320 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0320 }
            r0 = r17
            r0.add(r1)     // Catch:{ all -> 0x0320 }
            int r7 = r7 + 1
            goto L_0x0077
        L_0x009a:
            org.json.JSONArray r5 = X.AnonymousClass8BR.A1A()     // Catch:{ all -> 0x0320 }
            java.lang.String r0 = "signature"
            org.json.JSONObject r0 = r8.getJSONObject(r0)     // Catch:{ all -> 0x0320 }
            r5.put(r0)     // Catch:{ all -> 0x0320 }
            goto L_0x0073
        L_0x00a8:
            if (r12 == 0) goto L_0x00ad
            r12.close()     // Catch:{ IOException -> 0x0340, JSONException -> 0x032c }
        L_0x00ad:
            r5 = r21
            X.AiQ r0 = X.C20084A6l.A02(r11, r4)     // Catch:{ SecurityException -> 0x02e3 }
            java.lang.String r2 = r0.sha256Hash     // Catch:{ SecurityException -> 0x02e3 }
            if (r2 == 0) goto L_0x02d0
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x02d0
            r0 = 0
            X.9oY r0 = X.C180919Ol.A00(r11, r4, r0)     // Catch:{ NameNotFoundException | RuntimeException -> 0x02bc }
            long r0 = r0.A00()     // Catch:{ NameNotFoundException | RuntimeException -> 0x02bc }
            r12 = 0
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x02a9
            boolean r7 = r17.isEmpty()
            r13 = 0
            if (r7 != 0) goto L_0x0296
            boolean r7 = r9.isEmpty()
            if (r7 != 0) goto L_0x0296
            java.util.Iterator r12 = r17.iterator()
        L_0x00dd:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x00fd
            java.lang.Object r8 = r12.next()
            X.9nu r8 = (X.C192159nu) r8
            java.lang.String r7 = r8.A00
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00fa
            java.lang.String r7 = r8.A01
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            r7 = 1
            if (r8 == 0) goto L_0x00fb
        L_0x00fa:
            r7 = 0
        L_0x00fb:
            r13 = r13 | r7
            goto L_0x00dd
        L_0x00fd:
            if (r13 == 0) goto L_0x0296
            java.lang.String r6 = r11.getPackageName()     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            X.9oY r7 = X.C20084A6l.A01(r11, r10)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            android.content.pm.Signature r8 = X.C20084A6l.A00(r7)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            java.lang.String r7 = "X.509"
            java.security.cert.CertificateFactory r10 = java.security.cert.CertificateFactory.getInstance(r7)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            byte[] r8 = r8.toByteArray()     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            r7.<init>(r8)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            java.security.cert.Certificate r7 = r10.generateCertificate(r7)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            java.security.PublicKey r8 = r7.getPublicKey()     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            boolean r10 = r9.contains(r5)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            java.lang.String r7 = "Permission '"
            if (r10 == 0) goto L_0x0259
            boolean r10 = r17.isEmpty()     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            if (r10 != 0) goto L_0x0251
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ 9Kr -> 0x0248 }
            java.lang.String r10 = ""
            java.lang.String r1 = X.C17890vO.A0a(r10, r11, r0)     // Catch:{ 9Kr -> 0x0248 }
            r12 = 0
            java.io.ByteArrayOutputStream r10 = X.C108945cZ.A15()     // Catch:{ 9Kr -> 0x0248 }
            r0 = -5
            r10.write(r0)     // Catch:{ 9Kr -> 0x0248 }
            r10.write(r12)     // Catch:{ 9Kr -> 0x0248 }
            r11 = 1
            r13 = 255(0xff, float:3.57E-43)
            java.util.TreeSet r14 = new java.util.TreeSet     // Catch:{ 9Kr -> 0x0248 }
            r14.<init>(r9)     // Catch:{ 9Kr -> 0x0248 }
            int r0 = r14.size()     // Catch:{ 9Kr -> 0x0248 }
            if (r0 > r13) goto L_0x0238
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ 9Kr -> 0x0248 }
            java.util.Iterator r16 = r14.iterator()     // Catch:{ 9Kr -> 0x0248 }
        L_0x015c:
            boolean r0 = r16.hasNext()     // Catch:{ 9Kr -> 0x0248 }
            if (r0 == 0) goto L_0x017c
            java.lang.String r15 = X.C17880vN.A0v(r16)     // Catch:{ 9Kr -> 0x0248 }
            java.nio.charset.Charset r0 = X.AnonymousClass9TE.A00     // Catch:{ 9Kr -> 0x0248 }
            byte[] r15 = r15.getBytes(r0)     // Catch:{ 9Kr -> 0x0248 }
            int r0 = r15.length     // Catch:{ 9Kr -> 0x0248 }
            if (r0 > r13) goto L_0x0173
            r9.add(r15)     // Catch:{ 9Kr -> 0x0248 }
            goto L_0x015c
        L_0x0173:
            java.lang.String r0 = "String size (UTF-8 encoded) cannot exceed 255"
            X.9Kr r1 = new X.9Kr     // Catch:{ 9Kr -> 0x0248 }
            r1.<init>(r0)     // Catch:{ 9Kr -> 0x0248 }
            goto L_0x0247
        L_0x017c:
            r10.write(r11)     // Catch:{ 9Kr -> 0x0248 }
            int r0 = r14.size()     // Catch:{ 9Kr -> 0x0248 }
            r0 = r0 & r13
            r10.write(r0)     // Catch:{ 9Kr -> 0x0248 }
            java.util.Iterator r15 = r9.iterator()     // Catch:{ 9Kr -> 0x0248 }
        L_0x018b:
            boolean r0 = r15.hasNext()     // Catch:{ 9Kr -> 0x0248 }
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r14 = r15.next()     // Catch:{ 9Kr -> 0x0248 }
            byte[] r14 = (byte[]) r14     // Catch:{ 9Kr -> 0x0248 }
            int r9 = r14.length     // Catch:{ 9Kr -> 0x0248 }
            r0 = r9 & 255(0xff, float:3.57E-43)
            r10.write(r0)     // Catch:{ 9Kr -> 0x0248 }
            r10.write(r14, r12, r9)     // Catch:{ 9Kr -> 0x0248 }
            goto L_0x018b
        L_0x01a1:
            r0 = 2
            java.nio.charset.Charset r14 = X.AnonymousClass9TE.A00     // Catch:{ 9Kr -> 0x0248 }
            byte[] r15 = r4.getBytes(r14)     // Catch:{ 9Kr -> 0x0248 }
            int r9 = r15.length     // Catch:{ 9Kr -> 0x0248 }
            if (r9 > r13) goto L_0x0230
            r10.write(r0)     // Catch:{ 9Kr -> 0x0248 }
            r0 = r9 & 255(0xff, float:3.57E-43)
            r10.write(r0)     // Catch:{ 9Kr -> 0x0248 }
            r10.write(r15, r12, r9)     // Catch:{ 9Kr -> 0x0248 }
            r0 = 3
            byte[] r9 = r1.getBytes(r14)     // Catch:{ 9Kr -> 0x0248 }
            int r1 = r9.length     // Catch:{ 9Kr -> 0x0248 }
            if (r1 > r13) goto L_0x0228
            r10.write(r0)     // Catch:{ 9Kr -> 0x0248 }
            r0 = r1 & 255(0xff, float:3.57E-43)
            r10.write(r0)     // Catch:{ 9Kr -> 0x0248 }
            r10.write(r9, r12, r1)     // Catch:{ 9Kr -> 0x0248 }
            r0 = 4
            byte[] r2 = r2.getBytes(r14)     // Catch:{ 9Kr -> 0x0248 }
            int r1 = r2.length     // Catch:{ 9Kr -> 0x0248 }
            if (r1 > r13) goto L_0x0220
            r10.write(r0)     // Catch:{ 9Kr -> 0x0248 }
            r0 = r1 & 255(0xff, float:3.57E-43)
            r10.write(r0)     // Catch:{ 9Kr -> 0x0248 }
            r10.write(r2, r12, r1)     // Catch:{ 9Kr -> 0x0248 }
            r9 = 5
            byte[] r2 = r6.getBytes(r14)     // Catch:{ 9Kr -> 0x0248 }
            int r1 = r2.length     // Catch:{ 9Kr -> 0x0248 }
            if (r1 > r13) goto L_0x0240
            r10.write(r9)     // Catch:{ 9Kr -> 0x0248 }
            r0 = r1 & 255(0xff, float:3.57E-43)
            r10.write(r0)     // Catch:{ 9Kr -> 0x0248 }
            r10.write(r2, r12, r1)     // Catch:{ 9Kr -> 0x0248 }
            byte[] r10 = r10.toByteArray()     // Catch:{ 9Kr -> 0x0248 }
            r10[r11] = r9     // Catch:{ 9Kr -> 0x0248 }
            java.util.Iterator r9 = r17.iterator()     // Catch:{ 9Kr -> 0x0248 }
        L_0x01f9:
            boolean r0 = r9.hasNext()     // Catch:{ 9Kr -> 0x0248 }
            if (r0 == 0) goto L_0x0269
            java.lang.Object r2 = r9.next()     // Catch:{ 9Kr -> 0x0248 }
            X.9nu r2 = (X.C192159nu) r2     // Catch:{ 9Kr -> 0x0248 }
            java.lang.String r1 = r2.A01     // Catch:{ 9Kr -> 0x0248 }
            r0 = 10
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ 9Kr -> 0x0248 }
            java.lang.String r0 = r2.A00     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x01f9 }
            java.security.Signature r0 = java.security.Signature.getInstance(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x01f9 }
            r0.initVerify(r8)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x01f9 }
            r0.update(r10)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x01f9 }
            boolean r0 = r0.verify(r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x01f9 }
            if (r0 == 0) goto L_0x01f9
            return
        L_0x0220:
            java.lang.String r0 = "String size (UTF-8 encoded) cannot exceed 255"
            X.9Kr r1 = new X.9Kr     // Catch:{ 9Kr -> 0x0248 }
            r1.<init>(r0)     // Catch:{ 9Kr -> 0x0248 }
            goto L_0x0247
        L_0x0228:
            java.lang.String r0 = "String size (UTF-8 encoded) cannot exceed 255"
            X.9Kr r1 = new X.9Kr     // Catch:{ 9Kr -> 0x0248 }
            r1.<init>(r0)     // Catch:{ 9Kr -> 0x0248 }
            goto L_0x0247
        L_0x0230:
            java.lang.String r0 = "String size (UTF-8 encoded) cannot exceed 255"
            X.9Kr r1 = new X.9Kr     // Catch:{ 9Kr -> 0x0248 }
            r1.<init>(r0)     // Catch:{ 9Kr -> 0x0248 }
            goto L_0x0247
        L_0x0238:
            java.lang.String r0 = "Collection size (duplicates removed) cannot exceed 255"
            X.9Kr r1 = new X.9Kr     // Catch:{ 9Kr -> 0x0248 }
            r1.<init>(r0)     // Catch:{ 9Kr -> 0x0248 }
            goto L_0x0247
        L_0x0240:
            java.lang.String r0 = "String size (UTF-8 encoded) cannot exceed 255"
            X.9Kr r1 = new X.9Kr     // Catch:{ 9Kr -> 0x0248 }
            r1.<init>(r0)     // Catch:{ 9Kr -> 0x0248 }
        L_0x0247:
            throw r1     // Catch:{ 9Kr -> 0x0248 }
        L_0x0248:
            r1 = move-exception
            java.lang.String r0 = "Unable to encode data for signature validation"
            X.AmZ r2 = new X.AmZ     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            r2.<init>(r0, r1)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            goto L_0x0283
        L_0x0251:
            java.lang.String r0 = "Empty signature list in the grants"
            X.AmZ r2 = new X.AmZ     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            r2.<init>(r0)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            goto L_0x0283
        L_0x0259:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r7, r5)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            java.lang.String r0 = "' is not contained in the set of permissions granted"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            X.AmZ r2 = new X.AmZ     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            r2.<init>(r0)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            goto L_0x0283
        L_0x0269:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r7, r5)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            java.lang.String r0 = "' is contained in the set of permissions, but is not specifically granted to '"
            r1.append(r0)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            r1.append(r4)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            java.lang.String r0 = "' by '"
            X.C17890vO.A10(r0, r6, r3, r1)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            java.lang.String r0 = r1.toString()     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            X.AmZ r2 = new X.AmZ     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
            r2.<init>(r0)     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
        L_0x0283:
            throw r2     // Catch:{ SecurityException -> 0x028d, CertificateException -> 0x0284 }
        L_0x0284:
            r2 = move-exception
            java.lang.String r1 = "Unable to parse consumer package certificate"
            X.AmZ r0 = new X.AmZ
            r0.<init>(r1, r2)
            throw r0
        L_0x028d:
            r2 = move-exception
            java.lang.String r1 = "Failed to get provider package signature"
            X.AmZ r0 = new X.AmZ
            r0.<init>(r1, r2)
            throw r0
        L_0x0296:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid signature or algorithm for package '"
            X.C17900vP.A0c(r0, r4, r6, r5, r1)
            java.lang.String r1 = X.AnonymousClass000.A0y(r3, r1)
            X.AmZ r0 = new X.AmZ
            r0.<init>(r1)
            throw r0
        L_0x02a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid version code for package '"
            X.C17900vP.A0c(r0, r4, r6, r5, r1)
            java.lang.String r1 = X.AnonymousClass000.A0y(r3, r1)
            X.AmZ r0 = new X.AmZ
            r0.<init>(r1)
            throw r0
        L_0x02bc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Exception in getting version code for package '"
            X.C17900vP.A0c(r0, r4, r6, r5, r1)
            java.lang.String r1 = X.AnonymousClass000.A0y(r3, r1)
            X.AmZ r0 = new X.AmZ
            r0.<init>(r1, r2)
            throw r0
        L_0x02d0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Empty developer key for package '"
            X.C17900vP.A0c(r0, r4, r6, r5, r1)
            java.lang.String r1 = X.AnonymousClass000.A0y(r3, r1)
            X.AmZ r0 = new X.AmZ
            r0.<init>(r1)
            throw r0
        L_0x02e3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid developer key for package '"
            X.C17900vP.A0c(r0, r4, r6, r5, r1)
            java.lang.String r1 = X.AnonymousClass000.A0y(r3, r1)
            X.AmZ r0 = new X.AmZ
            r0.<init>(r1, r2)
            throw r0
        L_0x02f7:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r2, r4)     // Catch:{ all -> 0x0320 }
            java.lang.String r0 = "' is missing an entry for provider '"
            X.C17890vO.A10(r0, r10, r3, r1)     // Catch:{ all -> 0x0320 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0320 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0320 }
            goto L_0x031f
        L_0x0309:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r2, r4)     // Catch:{ all -> 0x0320 }
            java.lang.String r0 = "' has an empty FbPermissions asset file"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0320 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0320 }
            goto L_0x031f
        L_0x0318:
            java.lang.String r1 = "Empty permissions list"
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ all -> 0x0320 }
            r0.<init>(r1)     // Catch:{ all -> 0x0320 }
        L_0x031f:
            throw r0     // Catch:{ all -> 0x0320 }
        L_0x0320:
            r1 = move-exception
            if (r12 == 0) goto L_0x032b
            r12.close()     // Catch:{ all -> 0x0327 }
            goto L_0x032b
        L_0x0327:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0340, JSONException -> 0x032c }
        L_0x032b:
            throw r1     // Catch:{ IOException -> 0x0340, JSONException -> 0x032c }
        L_0x032c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NameNotFoundException -> 0x0354 }
            java.lang.String r0 = "Failed to decode FBPermission asset file from package '"
            X.C17890vO.A10(r0, r4, r3, r1)     // Catch:{ NameNotFoundException -> 0x0354 }
            java.lang.String r0 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0354 }
            X.AmZ r1 = new X.AmZ     // Catch:{ NameNotFoundException -> 0x0354 }
            r1.<init>(r0, r2)     // Catch:{ NameNotFoundException -> 0x0354 }
            goto L_0x0353
        L_0x0340:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NameNotFoundException -> 0x0354 }
            java.lang.String r0 = "Failed to read FBPermission asset file from package '"
            X.C17890vO.A10(r0, r4, r3, r1)     // Catch:{ NameNotFoundException -> 0x0354 }
            java.lang.String r0 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0354 }
            X.AmZ r1 = new X.AmZ     // Catch:{ NameNotFoundException -> 0x0354 }
            r1.<init>(r0, r2)     // Catch:{ NameNotFoundException -> 0x0354 }
        L_0x0353:
            throw r1     // Catch:{ NameNotFoundException -> 0x0354 }
        L_0x0354:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot create package context for '"
            X.C17890vO.A10(r0, r4, r3, r1)
            java.lang.String r1 = r1.toString()
            X.AmZ r0 = new X.AmZ
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20386AIz.BCd(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
