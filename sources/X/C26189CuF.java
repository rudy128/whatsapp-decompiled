package X;

/* renamed from: X.CuF  reason: case insensitive filesystem */
public abstract class C26189CuF {
    public static byte[] A03(C25097CXp cXp, byte[] bArr) {
        return cXp.A01(bArr, C26287Cwn.A0B("iv", new byte[0], 12), 12);
    }

    public static byte[] A04(C25097CXp cXp, byte[] bArr) {
        return cXp.A01(bArr, C26287Cwn.A0B("key", new byte[0], 16), 16);
    }

    public static C24069Buu A00(C28476E2r e2r, C24829CLx cLx, C24978CSd cSd, Throwable th, int i) {
        return new C24069Buu(e2r, cLx, cSd, "Unexpected event type", th, i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Bux, X.Cai] */
    public static void A01(C28474E2p e2p, C27006DPc dPc) {
        ? cai = new C25191Cai(dPc.A08, dPc.A0M);
        cai.A01 = e2p;
        cai.A00 = 0;
        dPc.A0A = cai;
    }

    public static void A02(C27006DPc dPc) {
        dPc.A0C.A00 = System.currentTimeMillis();
    }

    /* JADX WARNING: type inference failed for: r3v75, types: [X.E2p, java.lang.Object, X.DPb] */
    /* JADX WARNING: type inference failed for: r4v59, types: [X.E2p, java.lang.Object, X.DPb] */
    /* JADX WARNING: type inference failed for: r6v22, types: [X.E2p, java.lang.Object, X.DPb] */
    /* JADX WARNING: type inference failed for: r6v23, types: [X.E2p, java.lang.Object, X.DPb] */
    /* JADX WARNING: type inference failed for: r3v247, types: [X.C61, java.lang.Object] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A05(X.C28476E2r r18, X.C24829CLx r19, X.C24978CSd r20, int r21) {
        /*
            r17 = this;
            r0 = r18
            r4 = r17
            boolean r3 = r4 instanceof X.C24047BuY
            r1 = r19
            r16 = r20
            r2 = r21
            if (r3 == 0) goto L_0x002b
            X.DPc r0 = (X.C27006DPc) r0
            A02(r0)
            java.lang.Object r4 = r1.A00
            byte[] r4 = (byte[]) r4
            X.C6a r3 = r0.A0D     // Catch:{ 18c -> 0x001d }
            r3.A00(r4)     // Catch:{ 18c -> 0x001d }
            return
        L_0x001d:
            r8 = move-exception
            java.lang.String r7 = "Failed to update transcripts."
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x002b:
            boolean r3 = r4 instanceof X.C24046BuX
            if (r3 == 0) goto L_0x0076
            X.DPc r0 = (X.C27006DPc) r0
            boolean r3 = r1 instanceof X.C24068But
            if (r3 == 0) goto L_0x0069
            A02(r0)     // Catch:{ 18c -> 0x0056, RuntimeException -> 0x0048 }
            r3 = r1
            X.But r3 = (X.C24068But) r3     // Catch:{ 18c -> 0x0056, RuntimeException -> 0x0048 }
            java.lang.Object r3 = r3.A00     // Catch:{ 18c -> 0x0056, RuntimeException -> 0x0048 }
            byte[] r3 = (byte[]) r3     // Catch:{ 18c -> 0x0056, RuntimeException -> 0x0048 }
            byte[] r4 = X.C25352CeB.A00(r3)     // Catch:{ 18c -> 0x0056, RuntimeException -> 0x0048 }
            r3 = 0
            X.CDD.A00(r0, r4, r3)     // Catch:{ 18c -> 0x0056, RuntimeException -> 0x0048 }
            return
        L_0x0048:
            r8 = move-exception
            java.lang.String r7 = "Server Hello parse error."
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0056:
            r4 = move-exception
            javax.net.ssl.SSLException r3 = r4.ex
            java.lang.String r7 = r3.getMessage()
            X.Buu r3 = new X.Buu
            r8 = r4
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0069:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BEA.A0X(r3)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x0076:
            boolean r3 = r4 instanceof X.C24045BuW
            if (r3 == 0) goto L_0x00d4
            X.DPc r0 = (X.C27006DPc) r0
            boolean r3 = r1 instanceof X.C24067Bus
            r7 = 80
            if (r3 == 0) goto L_0x00c7
            A02(r0)     // Catch:{ 18c -> 0x00b9 }
            java.lang.Object r3 = r1.A00     // Catch:{ 18c -> 0x00b9 }
            byte[] r3 = (byte[]) r3     // Catch:{ 18c -> 0x00b9 }
            byte[] r6 = X.C25352CeB.A00(r3)     // Catch:{ 18c -> 0x00b9 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x00b9 }
            java.lang.String r3 = "server_finished"
            byte[] r5 = X.BE6.A1W(r3, r4)     // Catch:{ 18c -> 0x00b9 }
            X.C6a r3 = r0.A0D     // Catch:{ 18c -> 0x00b9 }
            byte[] r4 = r3.A02()     // Catch:{ 18c -> 0x00b9 }
            java.lang.String r3 = r0.A0P     // Catch:{ 18c -> 0x00b9 }
            byte[] r3 = X.C26287Cwn.A0C(r3, r5, r4)     // Catch:{ 18c -> 0x00b9 }
            boolean r3 = X.C26287Cwn.A06(r3, r6)     // Catch:{ 18c -> 0x00b9 }
            if (r3 != 0) goto L_0x05c5
            java.lang.String r3 = "Failed to verify server fin."
            X.18c r9 = X.BE9.A0b(r3, r7)     // Catch:{ 18c -> 0x00b9 }
            X.Buu r4 = new X.Buu     // Catch:{ 18c -> 0x00b9 }
            r8 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 18c -> 0x00b9 }
            throw r4     // Catch:{ 18c -> 0x00b9 }
        L_0x00b9:
            r8 = move-exception
            java.lang.String r7 = "Failed to process finished message."
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x00c7:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BE9.A0b(r3, r7)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x00d4:
            boolean r3 = r4 instanceof X.C24044BuV
            if (r3 == 0) goto L_0x0249
            X.DPc r0 = (X.C27006DPc) r0
            java.lang.String r10 = " got "
            java.lang.String r9 = "Expected signature scheme "
            A02(r0)
            boolean r3 = r1 instanceof X.C24066Bur
            r8 = 80
            if (r3 == 0) goto L_0x023c
            java.lang.String r4 = "TLS 1.3, server CertificateVerify"
            java.lang.String r3 = "UTF-8"
            byte[] r7 = r4.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x022a }
            r3 = 64
            byte[] r6 = new byte[r3]
            r3 = 32
            java.util.Arrays.fill(r6, r3)
            java.lang.Object r3 = r1.A00     // Catch:{ 18c -> 0x021c }
            byte[] r3 = (byte[]) r3     // Catch:{ 18c -> 0x021c }
            byte[] r3 = X.C25352CeB.A00(r3)     // Catch:{ 18c -> 0x021c }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 18c -> 0x021c }
            short r5 = r3.getShort()     // Catch:{ 18c -> 0x021c }
            byte[] r15 = X.C26287Cwn.A0D(r3)     // Catch:{ 18c -> 0x021c }
            r4 = 1027(0x403, float:1.439E-42)
            if (r5 != r4) goto L_0x01f7
            X.C6a r3 = r0.A0D     // Catch:{ 18c -> 0x021c }
            byte[] r5 = r3.A02()     // Catch:{ 18c -> 0x021c }
            int r3 = r7.length
            int r3 = r3 + 64
            r8 = 1
            int r4 = r3 + 1
            int r3 = r5.length
            int r4 = r4 + r3
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r4)
            r3.put(r6)
            r3.put(r7)
            r10 = 0
            r3.put(r10)
            r3.put(r5)
            byte[] r14 = r3.array()
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.List r3 = r0.A0T
            java.util.Iterator r6 = r3.iterator()
        L_0x013d:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0171
            java.lang.Object r5 = r6.next()
            X.C61 r5 = (X.C61) r5
            java.lang.String r3 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch:{ CertificateException -> 0x015d }
            byte[] r3 = r5.A01     // Catch:{ CertificateException -> 0x015d }
            java.io.ByteArrayInputStream r3 = X.BE6.A0h(r3)     // Catch:{ CertificateException -> 0x015d }
            java.security.cert.Certificate r3 = r4.generateCertificate(r3)     // Catch:{ CertificateException -> 0x015d }
            r9.add(r3)     // Catch:{ CertificateException -> 0x015d }
            goto L_0x013d
        L_0x015d:
            r4 = move-exception
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException
            r3.<init>(r4)
            java.lang.String r8 = "Bad certificate"
            X.Buu r4 = new X.Buu
            r9 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            throw r4
        L_0x0171:
            X.COj r5 = r0.A0J     // Catch:{ 18c -> 0x01e9 }
            java.security.cert.X509Certificate[] r3 = new java.security.cert.X509Certificate[r10]     // Catch:{ 18c -> 0x01e9 }
            java.lang.Object[] r13 = r9.toArray(r3)     // Catch:{ 18c -> 0x01e9 }
            java.security.cert.X509Certificate[] r13 = (java.security.cert.X509Certificate[]) r13     // Catch:{ 18c -> 0x01e9 }
            java.lang.String r12 = r0.A0Q     // Catch:{ 18c -> 0x01e9 }
            java.lang.String r11 = ""
            r6 = 42
            r7 = 80
            javax.net.ssl.X509TrustManager r3 = r5.A00     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            if (r3 == 0) goto L_0x01c6
            if (r13 == 0) goto L_0x01cd
            int r3 = r13.length     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            if (r3 == 0) goto L_0x01cd
            java.lang.String r3 = "SHA256withECDSA"
            java.security.Signature r4 = java.security.Signature.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            r3 = r13[r10]     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            r4.initVerify(r3)     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            r4.update(r14)     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            boolean r14 = r4.verify(r15)     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            if (r14 == 0) goto L_0x01b0
            javax.net.ssl.X509TrustManager r4 = r5.A00     // Catch:{ CertificateException -> 0x01a8 }
            java.lang.String r3 = "EC"
            r4.checkServerTrusted(r13, r3)     // Catch:{ CertificateException -> 0x01a8 }
            goto L_0x01b0
        L_0x01a8:
            r4 = move-exception
            java.lang.String r3 = "Certificate could not be verified"
            X.18c r3 = X.BE9.A0c(r3, r4, r6)     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            goto L_0x01d3
        L_0x01b0:
            r5 = 0
            r3 = -1
            X.DWS r4 = new X.DWS     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            r4.<init>(r5, r11, r11, r3)     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            r4.A02(r13)     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            javax.net.ssl.HostnameVerifier r3 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            boolean r3 = r3.verify(r12, r4)     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            if (r14 == 0) goto L_0x05c6
            goto L_0x05b4
        L_0x01c6:
            java.lang.String r3 = "Trust Manager cannot be null."
            X.18c r3 = X.BE9.A0b(r3, r7)     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
            goto L_0x01d3
        L_0x01cd:
            java.lang.String r3 = "Null or empty certificates certificates"
            X.18c r3 = X.BE9.A0b(r3, r7)     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
        L_0x01d3:
            throw r3     // Catch:{ NoSuchAlgorithmException -> 0x01db, InvalidKeyException -> 0x01d4, SignatureException -> 0x01e2 }
        L_0x01d4:
            java.lang.String r3 = "Certificate key is invalid."
            X.18c r3 = X.BE9.A0b(r3, r6)     // Catch:{ 18c -> 0x01e9 }
            goto L_0x01e8
        L_0x01db:
            java.lang.String r3 = "SHA256withECDSA not found."
            X.18c r3 = X.BE9.A0b(r3, r7)     // Catch:{ 18c -> 0x01e9 }
            goto L_0x01e8
        L_0x01e2:
            java.lang.String r3 = "Signature is invalid"
            X.18c r3 = X.BE9.A0b(r3, r6)     // Catch:{ 18c -> 0x01e9 }
        L_0x01e8:
            throw r3     // Catch:{ 18c -> 0x01e9 }
        L_0x01e9:
            r8 = move-exception
            java.lang.String r7 = "Certificates verify failed."
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x01f7:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 18c -> 0x021c }
            X.BEA.A1P(r9, r10, r3, r4, r5)     // Catch:{ 18c -> 0x021c }
            java.lang.String r7 = r3.toString()     // Catch:{ 18c -> 0x021c }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 18c -> 0x021c }
            X.BEA.A1P(r9, r10, r3, r4, r5)     // Catch:{ 18c -> 0x021c }
            java.lang.String r3 = r3.toString()     // Catch:{ 18c -> 0x021c }
            X.18c r8 = X.BE9.A0b(r3, r8)     // Catch:{ 18c -> 0x021c }
            X.Buu r3 = new X.Buu     // Catch:{ 18c -> 0x021c }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 18c -> 0x021c }
            throw r3     // Catch:{ 18c -> 0x021c }
        L_0x021c:
            r8 = move-exception
            java.lang.String r7 = ""
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x022a:
            r3 = move-exception
            X.18c r8 = X.BE9.A0d(r3)
            java.lang.String r7 = "Could not encode context string in UTF-8"
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x023c:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BE9.A0b(r3, r8)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x0249:
            boolean r3 = r4 instanceof X.C24043BuU
            if (r3 == 0) goto L_0x02f6
            X.DPc r0 = (X.C27006DPc) r0
            boolean r3 = r1 instanceof X.C24065Buq
            r5 = 80
            if (r3 == 0) goto L_0x02e9
            A02(r0)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r3 = r1
            X.Buq r3 = (X.C24065Buq) r3     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            java.lang.Object r3 = r3.A00     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            byte[] r3 = (byte[]) r3     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            byte[] r3 = X.C25352CeB.A00(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            byte r3 = r4.get()     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            if (r3 != 0) goto L_0x02ba
            r3 = 3
            byte[] r3 = new byte[r3]     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r4.get(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            int r11 = X.C26287Cwn.A01(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            byte[] r3 = new byte[r11]     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r4.get(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r8 = 0
        L_0x0285:
            if (r8 >= r11) goto L_0x02b7
            r3 = 3
            byte[] r3 = new byte[r3]     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r9.get(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            int r7 = X.C26287Cwn.A01(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            byte[] r6 = new byte[r7]     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r9.get(r6)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            int r5 = X.C26287Cwn.A00(r9)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            byte[] r3 = new byte[r5]     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r9.get(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            X.Cky r4 = new X.Cky     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r4.<init>(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            int r3 = r7 + 3
            int r3 = r3 + 2
            int r3 = r3 + r5
            int r8 = r8 + r3
            X.C61 r3 = new X.C61     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r3.<init>()     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r3.A01 = r6     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r3.A00 = r4     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r10.add(r3)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            goto L_0x0285
        L_0x02b7:
            r0.A0T = r10     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            return
        L_0x02ba:
            java.lang.String r7 = "Unexpected certificate size"
            java.lang.String r3 = "Unexpected Message"
            X.18c r8 = X.BE9.A0b(r3, r5)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            X.Buu r3 = new X.Buu     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
            throw r3     // Catch:{ 18c -> 0x02db, RuntimeException -> 0x02cd }
        L_0x02cd:
            r8 = move-exception
            java.lang.String r7 = "Failed to parse certificate."
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x02db:
            r8 = move-exception
            java.lang.String r7 = "Failed to process certificate"
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x02e9:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BE9.A0b(r3, r5)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x02f6:
            boolean r3 = r4 instanceof X.C24042BuT
            if (r3 == 0) goto L_0x030c
            X.DPc r0 = (X.C27006DPc) r0
            A02(r0)
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BEA.A0X(r3)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x030c:
            boolean r3 = r4 instanceof X.C24041BuS
            if (r3 == 0) goto L_0x0446
            X.DPc r0 = (X.C27006DPc) r0
            A02(r0)
            boolean r3 = r1 instanceof X.C24061Bum
            r4 = 80
            if (r3 == 0) goto L_0x0439
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            byte[] r3 = X.C25352CeB.A00(r3)     // Catch:{ 18c -> 0x042b }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 18c -> 0x042b }
            r8 = 4
            byte[] r10 = new byte[r8]     // Catch:{ 18c -> 0x042b }
            r5.get(r10)     // Catch:{ 18c -> 0x042b }
            long r6 = X.C26287Cwn.A03(r10)     // Catch:{ 18c -> 0x042b }
            r13 = 0
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x05c5
            byte[] r9 = new byte[r8]     // Catch:{ 18c -> 0x042b }
            r5.get(r9)     // Catch:{ 18c -> 0x042b }
            int r3 = X.BE6.A0G(r5)     // Catch:{ 18c -> 0x042b }
            short r3 = (short) r3     // Catch:{ 18c -> 0x042b }
            short r3 = (short) r3     // Catch:{ 18c -> 0x042b }
            byte[] r8 = new byte[r3]     // Catch:{ 18c -> 0x042b }
            r5.get(r8)     // Catch:{ 18c -> 0x042b }
            byte[] r11 = X.C26287Cwn.A0D(r5)     // Catch:{ 18c -> 0x042b }
            byte[] r3 = X.C26287Cwn.A0D(r5)     // Catch:{ 18c -> 0x042b }
            X.Cky r6 = new X.Cky     // Catch:{ 18c -> 0x042b }
            r6.<init>(r3)     // Catch:{ 18c -> 0x042b }
            r3 = 42
            X.C62 r3 = r6.A00(r3)     // Catch:{ 18c -> 0x042b }
            if (r3 == 0) goto L_0x0362
            byte[] r3 = r3.A01     // Catch:{ 18c -> 0x042b }
            long r13 = X.C26287Cwn.A03(r3)     // Catch:{ 18c -> 0x042b }
        L_0x0362:
            X.CXp r7 = r0.A09     // Catch:{ 18c -> 0x042b }
            java.util.Map r6 = r0.A0U     // Catch:{ 18c -> 0x042b }
            java.lang.String r3 = "resumption_master_secret"
            byte[] r6 = X.BE6.A1W(r3, r6)     // Catch:{ 18c -> 0x042b }
            java.lang.String r3 = "resumption"
            byte[] r8 = X.C26287Cwn.A09(r7, r0, r3, r8, r6)     // Catch:{ 18c -> 0x042b }
            java.lang.String r7 = r0.A0Q     // Catch:{ 18c -> 0x042b }
            X.DWS r3 = r0.A0C     // Catch:{ 18c -> 0x042b }
            java.lang.Byte r3 = r3.A01()     // Catch:{ 18c -> 0x042b }
            byte r12 = r3.byteValue()     // Catch:{ 18c -> 0x042b }
            com.whatsapp.net.tls13.WtCachedPsk r6 = new com.whatsapp.net.tls13.WtCachedPsk     // Catch:{ 18c -> 0x042b }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ 18c -> 0x042b }
            X.DWS r3 = r0.A0C     // Catch:{ 18c -> 0x042b }
            java.util.LinkedHashSet r3 = r3.A02     // Catch:{ 18c -> 0x042b }
            r3.add(r6)     // Catch:{ 18c -> 0x042b }
            boolean r3 = r5.hasRemaining()     // Catch:{ 18c -> 0x042b }
            if (r3 != 0) goto L_0x0418
            X.18b r3 = r0.A0L
            X.DWS r7 = r0.A0C
            monitor-enter(r3)
            byte[] r0 = r7.getId()     // Catch:{ all -> 0x0415 }
            X.2kx r6 = new X.2kx     // Catch:{ all -> 0x0415 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0415 }
            java.util.Map r4 = r3.A01     // Catch:{ 18c -> 0x0405 }
            monitor-enter(r4)     // Catch:{ 18c -> 0x0405 }
            java.lang.Object r5 = r4.get(r6)     // Catch:{ all -> 0x0402 }
            X.DWS r5 = (X.DWS) r5     // Catch:{ all -> 0x0402 }
            if (r5 != 0) goto L_0x03bd
            java.lang.String r2 = r7.getPeerHost()     // Catch:{ all -> 0x0402 }
            int r1 = r7.getPeerPort()     // Catch:{ all -> 0x0402 }
            java.lang.String r0 = r7.getCipherSuite()     // Catch:{ all -> 0x0402 }
            X.DWS r5 = new X.DWS     // Catch:{ all -> 0x0402 }
            r5.<init>(r3, r2, r0, r1)     // Catch:{ all -> 0x0402 }
            r4.put(r6, r5)     // Catch:{ all -> 0x0402 }
        L_0x03bd:
            java.util.Map r2 = r5.A03     // Catch:{ all -> 0x0402 }
            java.lang.Byte r1 = r7.A01()     // Catch:{ all -> 0x0402 }
            java.security.cert.Certificate[] r0 = r7.getPeerCertificates()     // Catch:{ all -> 0x0402 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0402 }
            java.util.LinkedHashSet r0 = r7.A02     // Catch:{ all -> 0x0402 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0402 }
        L_0x03d0:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0402 }
            if (r0 == 0) goto L_0x03e2
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0402 }
            com.whatsapp.net.tls13.WtCachedPsk r1 = (com.whatsapp.net.tls13.WtCachedPsk) r1     // Catch:{ all -> 0x0402 }
            java.util.LinkedHashSet r0 = r5.A02     // Catch:{ all -> 0x0402 }
            r0.add(r1)     // Catch:{ all -> 0x0402 }
            goto L_0x03d0
        L_0x03e2:
            X.18a r1 = r3.A00     // Catch:{ all -> 0x0402 }
            if (r1 == 0) goto L_0x0400
            byte[] r0 = r6.A01     // Catch:{ all -> 0x0402 }
            java.lang.String r6 = r5.getPeerHost()     // Catch:{ all -> 0x0402 }
            int r10 = r5.getPeerPort()     // Catch:{ all -> 0x0402 }
            java.lang.String r7 = r5.getCipherSuite()     // Catch:{ all -> 0x0402 }
            java.util.LinkedHashSet r8 = r5.A02     // Catch:{ all -> 0x0402 }
            java.util.Map r9 = r5.A03     // Catch:{ all -> 0x0402 }
            com.whatsapp.watls13.WtPersistentSession r5 = new com.whatsapp.watls13.WtPersistentSession     // Catch:{ all -> 0x0402 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0402 }
            r1.A02(r5, r0)     // Catch:{ all -> 0x0402 }
        L_0x0400:
            monitor-exit(r4)     // Catch:{ all -> 0x0402 }
            goto L_0x0413
        L_0x0402:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0402 }
            throw r0     // Catch:{ 18c -> 0x0405 }
        L_0x0405:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0415 }
            java.lang.String r0 = "Encountered Exception "
            java.lang.String r0 = X.BEA.A0j(r2, r0, r1)     // Catch:{ all -> 0x0415 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0415 }
        L_0x0413:
            monitor-exit(r3)
            return
        L_0x0415:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0418:
            java.lang.String r7 = "New session ticket has excess bytes than expected"
            java.lang.String r3 = "New session ticket has more bytes than expected."
            X.18c r8 = X.BE9.A0b(r3, r4)     // Catch:{ 18c -> 0x042b }
            X.Buu r3 = new X.Buu     // Catch:{ 18c -> 0x042b }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 18c -> 0x042b }
            throw r3     // Catch:{ 18c -> 0x042b }
        L_0x042b:
            r8 = move-exception
            java.lang.String r7 = "Failed to process new session ticket"
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0439:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BE9.A0b(r3, r4)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x0446:
            boolean r3 = r4 instanceof X.C24040BuR
            if (r3 == 0) goto L_0x04b5
            X.DPc r0 = (X.C27006DPc) r0
            boolean r3 = r1 instanceof X.C24060Bul
            if (r3 == 0) goto L_0x04a8
            A02(r0)     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            r3 = r1
            X.Bul r3 = (X.C24060Bul) r3     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            java.lang.Object r6 = r3.A00     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            byte[] r6 = (byte[]) r6     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            byte[] r4 = X.C25352CeB.A00(r6)     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            r3 = 1
            X.CDD.A00(r0, r4, r3)     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            r0.A0c = r3     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            r3 = 0
            r0.A0f = r3     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            X.C6a r3 = r0.A0D     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            byte[] r5 = r3.A02()     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            X.C6a r4 = r0.A0D     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            java.security.MessageDigest r3 = r4.A00     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            r3.reset()     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            r3 = 0
            r4.A01 = r3     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            X.C6a r4 = r0.A0D     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            r3 = -2
            byte[] r3 = X.C25352CeB.A01(r5, r3)     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            r4.A00(r3)     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            X.C6a r3 = r0.A0D     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            r3.A00(r6)     // Catch:{ 18c -> 0x0495, RuntimeException -> 0x0487 }
            return
        L_0x0487:
            r8 = move-exception
            java.lang.String r7 = "Hello retry parse error."
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0495:
            r4 = move-exception
            javax.net.ssl.SSLException r3 = r4.ex
            java.lang.String r7 = r3.getMessage()
            X.Buu r3 = new X.Buu
            r8 = r4
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x04a8:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BEA.A0X(r3)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x04b5:
            boolean r3 = r4 instanceof X.C24039BuQ
            if (r3 == 0) goto L_0x063b
            X.DPc r0 = (X.C27006DPc) r0
            A02(r0)
            boolean r3 = r1 instanceof X.C24059Buk
            r5 = 80
            if (r3 == 0) goto L_0x062e
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            byte[] r3 = X.C25352CeB.A00(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r4 = 2
            byte[] r3 = X.C26287Cwn.A0D(r14)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            X.Cky r6 = new X.Cky     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r6.<init>(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r3 = 16
            X.C62 r9 = r6.A00(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            if (r9 == 0) goto L_0x0556
            java.lang.String r3 = r0.A0O     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            if (r3 == 0) goto L_0x0556
            boolean r3 = r3.isEmpty()     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            if (r3 != 0) goto L_0x0556
            byte[] r3 = r9.A01     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            byte[] r3 = new byte[r4]     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r13.get(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            int r12 = X.C26287Cwn.A02(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.util.HashSet r11 = X.C17880vN.A12()     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r10 = 0
        L_0x0500:
            if (r10 >= r12) goto L_0x051c
            byte r8 = r13.get()     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            byte[] r7 = new byte[r8]     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r13.get(r7)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0519 }
            r3.<init>(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x0519 }
            r11.add(r3)     // Catch:{ UnsupportedEncodingException -> 0x0519 }
            int r3 = r8 + 1
            int r10 = r10 + r3
            goto L_0x0500
        L_0x0519:
            r3 = move-exception
            goto L_0x05f5
        L_0x051c:
            java.lang.String r3 = r0.A0O     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            boolean r3 = r11.contains(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            if (r3 != 0) goto L_0x0556
            java.lang.String r10 = "Server sent unsupported protocol version."
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.lang.String r3 = "Server selected wrong supported version "
            r4.append(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            X.AnonymousClass8BS.A1D(r9, r4)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.lang.String r3 = " expected: "
            r4.append(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.lang.String r3 = r0.A0O     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.lang.String r3 = X.AnonymousClass000.A0y(r3, r4)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            javax.net.ssl.SSLException r6 = new javax.net.ssl.SSLException     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r6.<init>(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r4 = 110(0x6e, float:1.54E-43)
            X.18c r3 = new X.18c     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r3.<init>(r6, r4)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            X.Buu r6 = new X.Buu     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r11 = r3
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            goto L_0x0605
        L_0x0556:
            r3 = 42
            X.C62 r3 = r6.A00(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            if (r3 == 0) goto L_0x056b
            boolean r3 = r0.A0Z     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            if (r3 == 0) goto L_0x05d9
            X.DWS r3 = r0.A0C     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            com.whatsapp.net.tls13.WtCachedPsk r3 = r3.A01     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            if (r3 == 0) goto L_0x056b
            r3 = 1
            r0.A0f = r3     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
        L_0x056b:
            java.util.Set r4 = X.CID.A02     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.util.Map r3 = r6.A03     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.util.Set r3 = r3.keySet()     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            java.util.HashSet r3 = X.AnonymousClass8BR.A12(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r3.removeAll(r4)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            int r3 = r3.size()     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            if (r3 == 0) goto L_0x059b
            java.lang.String r7 = "Unexpected extension provided by the server"
            javax.net.ssl.SSLException r6 = new javax.net.ssl.SSLException     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r6.<init>(r7)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r4 = 47
            X.18c r3 = new X.18c     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r3.<init>(r6, r4)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            X.Buu r6 = new X.Buu     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r10 = r7
            r11 = r3
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            goto L_0x0605
        L_0x059b:
            boolean r3 = r14.hasRemaining()     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            if (r3 == 0) goto L_0x05c5
            java.lang.String r10 = "Encrypted extensions has excess bytes than expected"
            java.lang.String r3 = "Encrypted extensions has more bytes than expected."
            X.18c r11 = X.BE9.A0b(r3, r5)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            X.Buu r6 = new X.Buu     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            goto L_0x0605
        L_0x05b4:
            if (r3 == 0) goto L_0x05c6
            X.DWS r2 = r0.A0C
            java.security.cert.Certificate[] r1 = new java.security.cert.Certificate[r10]
            java.lang.Object[] r1 = r9.toArray(r1)
            java.security.cert.Certificate[] r1 = (java.security.cert.Certificate[]) r1
            r2.A02(r1)
            r0.A0b = r8
        L_0x05c5:
            return
        L_0x05c6:
            java.lang.String r3 = "ServerCertificate verify failed."
            X.18c r8 = X.BE9.A0b(r3, r6)
            java.lang.String r7 = "Certificates could not be verified."
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x05d9:
            java.lang.String r10 = "Received server early data indication without sending early data."
            java.lang.String r3 = "Should not have received early data indication without sending early data."
            javax.net.ssl.SSLException r6 = new javax.net.ssl.SSLException     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r6.<init>(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r4 = 10
            X.18c r3 = new X.18c     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r3.<init>(r6, r4)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            X.Buu r6 = new X.Buu     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r11 = r3
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            goto L_0x0605
        L_0x05f5:
            java.lang.String r10 = "Server protocol is not encoded using UTF-8"
            X.18c r11 = X.BE9.A0d(r3)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            X.Buu r6 = new X.Buu     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
        L_0x0605:
            throw r6     // Catch:{ 18c -> 0x0620, RuntimeException -> 0x0606 }
        L_0x0606:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            java.lang.Throwable r3 = X.BE9.A0u(r3)
            X.18c r8 = X.BE9.A0c(r4, r3, r5)
            java.lang.String r7 = "Failed to parse encrypted extensions"
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0620:
            r8 = move-exception
            java.lang.String r7 = "Failed to process encrypted extensions"
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x062e:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BE9.A0b(r3, r5)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x063b:
            boolean r3 = r4 instanceof X.C24038BuP
            if (r3 == 0) goto L_0x0698
            X.DPc r0 = (X.C27006DPc) r0
            X.DWS r5 = r0.A0C
            long r3 = java.lang.System.currentTimeMillis()
            r5.A00 = r3
            boolean r3 = r1 instanceof X.C24057Bui
            r10 = 80
            if (r3 == 0) goto L_0x068b
            java.lang.Object r9 = r1.A00
            X.CWK r9 = (X.CWK) r9
            com.whatsapp.net.tls13.WtCachedPsk r3 = r5.A01
            int r8 = r9.A00     // Catch:{ 18c -> 0x067d }
            long r6 = (long) r8     // Catch:{ 18c -> 0x067d }
            long r4 = r3.maxEarlyDataSize     // Catch:{ 18c -> 0x067d }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x066a
            X.C6K r6 = r0.A0B     // Catch:{ 18c -> 0x067d }
            byte[] r5 = r9.A02     // Catch:{ 18c -> 0x067d }
            int r4 = r9.A01     // Catch:{ 18c -> 0x067d }
            r3 = 23
            r6.A01(r5, r4, r8, r3)     // Catch:{ 18c -> 0x067d }
            return
        L_0x066a:
            java.lang.String r7 = "Data size exceeds early data"
            java.lang.String r3 = "Data to be written more than early data size"
            X.18c r8 = X.BE9.A0b(r3, r10)     // Catch:{ 18c -> 0x067d }
            X.Buu r3 = new X.Buu     // Catch:{ 18c -> 0x067d }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 18c -> 0x067d }
            throw r3     // Catch:{ 18c -> 0x067d }
        L_0x067d:
            r8 = move-exception
            java.lang.String r7 = "App write for early data failed."
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x068b:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BE9.A0b(r3, r10)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x0698:
            boolean r3 = r4 instanceof X.C24037BuO
            if (r3 == 0) goto L_0x073b
            X.DPc r0 = (X.C27006DPc) r0
            X.C6a r3 = r0.A0D     // Catch:{ 18c -> 0x072d }
            byte[] r6 = r3.A01()     // Catch:{ 18c -> 0x072d }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x072d }
            java.lang.String r3 = "master_secret"
            byte[] r5 = X.BE6.A1W(r3, r4)     // Catch:{ 18c -> 0x072d }
            if (r5 == 0) goto L_0x0700
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x072d }
            java.lang.String r3 = "res master"
            byte[] r5 = X.C26287Cwn.A09(r4, r0, r3, r6, r5)     // Catch:{ 18c -> 0x072d }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x072d }
            java.lang.String r3 = "resumption_master_secret"
            r4.put(r3, r5)     // Catch:{ 18c -> 0x072d }
            X.DPb r6 = new X.DPb     // Catch:{ 18c -> 0x072d }
            r6.<init>()     // Catch:{ 18c -> 0x072d }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x072d }
            java.lang.String r3 = "client_app_key"
            byte[] r5 = X.BE6.A1W(r3, r4)     // Catch:{ 18c -> 0x072d }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x072d }
            java.lang.String r3 = "client_app_iv"
            byte[] r3 = X.BE6.A1W(r3, r4)     // Catch:{ 18c -> 0x072d }
            r6.A00(r5, r3)     // Catch:{ 18c -> 0x072d }
            X.C27006DPc.A00(r6, r0)     // Catch:{ 18c -> 0x072d }
            X.Cai r3 = r0.A0A     // Catch:{ 18c -> 0x072d }
            if (r3 == 0) goto L_0x0711
            X.Bxb r3 = r3.A00     // Catch:{ 18c -> 0x072d }
            int r3 = r3.available()     // Catch:{ 18c -> 0x072d }
            if (r3 <= 0) goto L_0x0711
            java.lang.String r8 = "Unexpected Messages: Found pending handshake messages"
            java.lang.String r3 = "Found unprocessed messages in handshake buffer."
            javax.net.ssl.SSLException r5 = new javax.net.ssl.SSLException     // Catch:{ 18c -> 0x072d }
            r5.<init>(r3)     // Catch:{ 18c -> 0x072d }
            r4 = 10
            X.18c r3 = new X.18c     // Catch:{ 18c -> 0x072d }
            r3.<init>(r5, r4)     // Catch:{ 18c -> 0x072d }
            X.Buu r4 = new X.Buu     // Catch:{ 18c -> 0x072d }
            r9 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 18c -> 0x072d }
        L_0x06ff:
            throw r4     // Catch:{ 18c -> 0x072d }
        L_0x0700:
            java.lang.String r8 = "Master Secret is null"
            X.18c r9 = X.BEA.A0X(r8)     // Catch:{ 18c -> 0x072d }
            X.Buu r4 = new X.Buu     // Catch:{ 18c -> 0x072d }
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 18c -> 0x072d }
            goto L_0x06ff
        L_0x0711:
            X.DPb r6 = new X.DPb     // Catch:{ 18c -> 0x072d }
            r6.<init>()     // Catch:{ 18c -> 0x072d }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x072d }
            java.lang.String r3 = "server_app_key"
            byte[] r5 = X.BE6.A1W(r3, r4)     // Catch:{ 18c -> 0x072d }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x072d }
            java.lang.String r3 = "server_app_iv"
            byte[] r3 = X.BE6.A1W(r3, r4)     // Catch:{ 18c -> 0x072d }
            r6.A00(r5, r3)     // Catch:{ 18c -> 0x072d }
            A01(r6, r0)     // Catch:{ 18c -> 0x072d }
            return
        L_0x072d:
            r8 = move-exception
            java.lang.String r7 = "Failed to derive resumption keys"
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x073b:
            boolean r3 = r4 instanceof X.C24036BuN
            if (r3 == 0) goto L_0x087e
            X.DPc r0 = (X.C27006DPc) r0
            java.lang.String r9 = "finished"
            java.lang.String r6 = "derived_secret"
            java.lang.String r10 = "derived"
            A02(r0)
            X.C6a r3 = r0.A0D     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r8 = r3.A01()     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CWN r3 = r0.A0G     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r5 = r0.A0m     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r4 = r0.A0h     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.A0c r3 = r3.A00     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r5 = r3.A02(r5, r4)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            int r11 = r0.A02     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r7 = new byte[r11]     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.DWS r3 = r0.A0C     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            com.whatsapp.net.tls13.WtCachedPsk r4 = r3.A01     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            if (r4 == 0) goto L_0x076c
            boolean r3 = r0.A0g     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            if (r3 == 0) goto L_0x076c
            byte[] r7 = r4.pskVal     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
        L_0x076c:
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r3 = new byte[r11]     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r7 = r4.A00(r3, r7)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "early_secret"
            r4.put(r3, r7)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = r0.A0P     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r3)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r3 = r11.digest()     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r4 = X.C26287Cwn.A09(r4, r0, r10, r3, r7)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r3 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            r3.put(r6, r4)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r7 = r3.A00(r4, r5)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "handshake_secret"
            r4.put(r3, r7)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "c hs traffic"
            byte[] r5 = X.C26287Cwn.A09(r4, r0, r3, r8, r7)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "client_hs_traffic_secret"
            r4.put(r3, r5)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "s hs traffic"
            byte[] r8 = X.C26287Cwn.A09(r4, r0, r3, r8, r7)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "server_hs_traffic_secret"
            r4.put(r3, r8)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r3 = r11.digest()     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r4 = X.C26287Cwn.A09(r4, r0, r10, r3, r7)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r3 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            r3.put(r6, r4)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            r10 = 0
            byte[] r6 = A04(r3, r5)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "client_hs_key"
            r4.put(r3, r6)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r6 = A03(r3, r5)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "client_hs_iv"
            r4.put(r3, r6)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r7 = A04(r3, r8)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "server_hs_key"
            r4.put(r3, r7)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r6 = A03(r3, r8)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "server_hs_iv"
            r4.put(r3, r6)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r3 = new byte[r10]     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r5 = X.C26287Cwn.A09(r4, r0, r9, r3, r5)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "client_finished"
            r4.put(r3, r5)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r3 = new byte[r10]     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            byte[] r5 = X.C26287Cwn.A09(r4, r0, r9, r3, r8)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            java.lang.String r3 = "server_finished"
            r4.put(r3, r5)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.DPb r4 = new X.DPb     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            r4.<init>()     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            r4.A00(r7, r6)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.Cai r3 = r0.A0A     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            if (r3 == 0) goto L_0x084d
            X.Bxb r3 = r3.A00     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            int r3 = r3.available()     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            if (r3 <= 0) goto L_0x084d
            java.lang.String r8 = "Unexpected Messages: Found pending handshake messages"
            java.lang.String r3 = "Found unprocessed messages in handshake buffer."
            javax.net.ssl.SSLException r5 = new javax.net.ssl.SSLException     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            r5.<init>(r3)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            r4 = 10
            X.18c r3 = new X.18c     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            r3.<init>(r5, r4)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            X.Buu r4 = new X.Buu     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            r9 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            throw r4     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
        L_0x084d:
            A01(r4, r0)     // Catch:{ 18c -> 0x0870, NoSuchAlgorithmException -> 0x0851 }
            return
        L_0x0851:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = r0.A0P
            r4.append(r3)
            java.lang.String r3 = " algorithm not found"
            java.lang.String r7 = X.AnonymousClass000.A0y(r3, r4)
            X.18c r8 = X.BEA.A0Y(r5)
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0870:
            r8 = move-exception
            java.lang.String r7 = "Failed in action handshake traffic keys"
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x087e:
            boolean r3 = r4 instanceof X.C24035BuM
            if (r3 == 0) goto L_0x08dc
            X.DPc r0 = (X.C27006DPc) r0
            X.DWS r5 = r0.A0C
            long r3 = java.lang.System.currentTimeMillis()
            r5.A00 = r3
            com.whatsapp.net.tls13.WtCachedPsk r3 = r5.A01     // Catch:{ 18c -> 0x08ce }
            byte[] r5 = r3.pskVal     // Catch:{ 18c -> 0x08ce }
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x08ce }
            int r3 = r0.A02     // Catch:{ 18c -> 0x08ce }
            byte[] r3 = new byte[r3]     // Catch:{ 18c -> 0x08ce }
            byte[] r6 = r4.A00(r3, r5)     // Catch:{ 18c -> 0x08ce }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x08ce }
            java.lang.String r3 = "early_secret"
            r4.put(r3, r6)     // Catch:{ 18c -> 0x08ce }
            X.CXp r5 = r0.A09     // Catch:{ 18c -> 0x08ce }
            java.lang.String r4 = "c e traffic"
            X.C6a r3 = r0.A0D     // Catch:{ 18c -> 0x08ce }
            byte[] r3 = r3.A01()     // Catch:{ 18c -> 0x08ce }
            byte[] r6 = X.C26287Cwn.A09(r5, r0, r4, r3, r6)     // Catch:{ 18c -> 0x08ce }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x08ce }
            java.lang.String r3 = "client_early_traffic_secret"
            r4.put(r3, r6)     // Catch:{ 18c -> 0x08ce }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x08ce }
            byte[] r5 = A04(r3, r6)     // Catch:{ 18c -> 0x08ce }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x08ce }
            byte[] r4 = A03(r3, r6)     // Catch:{ 18c -> 0x08ce }
            X.DPb r3 = new X.DPb     // Catch:{ 18c -> 0x08ce }
            r3.<init>()     // Catch:{ 18c -> 0x08ce }
            r3.A00(r5, r4)     // Catch:{ 18c -> 0x08ce }
            X.C27006DPc.A00(r3, r0)     // Catch:{ 18c -> 0x08ce }
            return
        L_0x08ce:
            r8 = move-exception
            java.lang.String r7 = "Failed in action early data keys"
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x08dc:
            boolean r3 = r4 instanceof X.C24034BuL
            if (r3 == 0) goto L_0x0987
            X.DPc r0 = (X.C27006DPc) r0
            A02(r0)
            X.C6a r3 = r0.A0D     // Catch:{ 18c -> 0x0979 }
            byte[] r7 = r3.A01()     // Catch:{ 18c -> 0x0979 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "derived_secret"
            byte[] r5 = X.BE6.A1W(r3, r4)     // Catch:{ 18c -> 0x0979 }
            if (r5 == 0) goto L_0x0968
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0979 }
            int r3 = r0.A02     // Catch:{ 18c -> 0x0979 }
            byte[] r3 = new byte[r3]     // Catch:{ 18c -> 0x0979 }
            byte[] r6 = r4.A00(r5, r3)     // Catch:{ 18c -> 0x0979 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "master_secret"
            r4.put(r3, r6)     // Catch:{ 18c -> 0x0979 }
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "c ap traffic"
            byte[] r8 = X.C26287Cwn.A09(r4, r0, r3, r7, r6)     // Catch:{ 18c -> 0x0979 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "client_app_traffic_secret"
            r4.put(r3, r8)     // Catch:{ 18c -> 0x0979 }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x0979 }
            byte[] r5 = A04(r3, r8)     // Catch:{ 18c -> 0x0979 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "client_app_key"
            r4.put(r3, r5)     // Catch:{ 18c -> 0x0979 }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x0979 }
            byte[] r5 = A03(r3, r8)     // Catch:{ 18c -> 0x0979 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "client_app_iv"
            r4.put(r3, r5)     // Catch:{ 18c -> 0x0979 }
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "s ap traffic"
            byte[] r8 = X.C26287Cwn.A09(r4, r0, r3, r7, r6)     // Catch:{ 18c -> 0x0979 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "server_app_traffic_secret"
            r4.put(r3, r8)     // Catch:{ 18c -> 0x0979 }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x0979 }
            byte[] r5 = A04(r3, r8)     // Catch:{ 18c -> 0x0979 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "server_app_key"
            r4.put(r3, r5)     // Catch:{ 18c -> 0x0979 }
            X.CXp r3 = r0.A09     // Catch:{ 18c -> 0x0979 }
            byte[] r5 = A03(r3, r8)     // Catch:{ 18c -> 0x0979 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "server_app_iv"
            r4.put(r3, r5)     // Catch:{ 18c -> 0x0979 }
            X.CXp r4 = r0.A09     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "exp master"
            byte[] r5 = X.C26287Cwn.A09(r4, r0, r3, r7, r6)     // Catch:{ 18c -> 0x0979 }
            java.util.Map r4 = r0.A0U     // Catch:{ 18c -> 0x0979 }
            java.lang.String r3 = "exporter_master_secret"
            r4.put(r3, r5)     // Catch:{ 18c -> 0x0979 }
            return
        L_0x0968:
            java.lang.String r7 = "Derived secret not found."
            X.18c r8 = X.BEA.A0X(r7)     // Catch:{ 18c -> 0x0979 }
            X.Buu r3 = new X.Buu     // Catch:{ 18c -> 0x0979 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 18c -> 0x0979 }
            throw r3     // Catch:{ 18c -> 0x0979 }
        L_0x0979:
            r8 = move-exception
            java.lang.String r7 = "Failed to derive app traffic keys"
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0987:
            boolean r3 = r4 instanceof X.C24033BuK
            if (r3 == 0) goto L_0x09e9
            X.DPc r0 = (X.C27006DPc) r0
            boolean r3 = r1 instanceof X.C24052Bud
            if (r3 == 0) goto L_0x09dc
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            byte[] r3 = X.C25352CeB.A00(r3)     // Catch:{ 18c -> 0x09ce }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 18c -> 0x09ce }
            int r3 = X.BE6.A0G(r4)     // Catch:{ 18c -> 0x09ce }
            short r3 = (short) r3     // Catch:{ 18c -> 0x09ce }
            short r3 = (short) r3     // Catch:{ 18c -> 0x09ce }
            if (r3 != 0) goto L_0x09b2
            byte[] r4 = X.C26287Cwn.A0D(r4)     // Catch:{ 18c -> 0x09ce }
            X.Cky r3 = new X.Cky     // Catch:{ 18c -> 0x09ce }
            r3.<init>(r4)     // Catch:{ 18c -> 0x09ce }
            r1 = 1
            r0.A0X = r1
            return
        L_0x09b2:
            java.lang.String r8 = "Certificate context is not expected"
            java.lang.String r3 = "Certificate context is not expected."
            javax.net.ssl.SSLException r5 = new javax.net.ssl.SSLException     // Catch:{ 18c -> 0x09ce }
            r5.<init>(r3)     // Catch:{ 18c -> 0x09ce }
            r4 = 10
            X.18c r3 = new X.18c     // Catch:{ 18c -> 0x09ce }
            r3.<init>(r5, r4)     // Catch:{ 18c -> 0x09ce }
            X.Buu r4 = new X.Buu     // Catch:{ 18c -> 0x09ce }
            r9 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 18c -> 0x09ce }
            throw r4     // Catch:{ 18c -> 0x09ce }
        L_0x09ce:
            r8 = move-exception
            java.lang.String r7 = "Failed to process certificate request "
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x09dc:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BEA.A0X(r3)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x09e9:
            boolean r3 = r4 instanceof X.C24032BuJ
            if (r3 == 0) goto L_0x0a23
            X.DPc r0 = (X.C27006DPc) r0
            A02(r0)
            boolean r3 = r1 instanceof X.C24051Buc
            if (r3 == 0) goto L_0x0a16
            java.lang.Object r3 = r1.A00
            X.CWK r3 = (X.CWK) r3
            X.C6K r7 = r0.A0B     // Catch:{ 18c -> 0x0a08 }
            byte[] r6 = r3.A02     // Catch:{ 18c -> 0x0a08 }
            int r5 = r3.A01     // Catch:{ 18c -> 0x0a08 }
            int r4 = r3.A00     // Catch:{ 18c -> 0x0a08 }
            r3 = 23
            r7.A01(r6, r5, r4, r3)     // Catch:{ 18c -> 0x0a08 }
            return
        L_0x0a08:
            r8 = move-exception
            java.lang.String r7 = "App write failed."
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0a16:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BEA.A0X(r3)
            r3 = r16
            X.Buu r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x0a23:
            boolean r3 = r4 instanceof X.C24031BuI
            X.DPc r0 = (X.C27006DPc) r0
            if (r3 == 0) goto L_0x0a6c
            A02(r0)
            boolean r3 = r1 instanceof X.C24050Bub
            if (r3 == 0) goto L_0x0a5f
            java.lang.Object r5 = r1.A00
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L_0x0a4b
            X.E6i r4 = r0.A07     // Catch:{ IOException -> 0x0a3d }
            int r3 = r5.length     // Catch:{ IOException -> 0x0a3d }
            r4.BCC(r5, r3)     // Catch:{ IOException -> 0x0a3d }
            return
        L_0x0a3d:
            r8 = move-exception
            java.lang.String r7 = "App read failed."
            X.Buu r3 = new X.Buu
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0a4b:
            java.lang.String r4 = "App read failed."
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException
            r3.<init>(r4)
            X.Buu r5 = new X.Buu
            r9 = r4
            r10 = r3
            r11 = r2
            r7 = r1
            r8 = r16
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            throw r5
        L_0x0a5f:
            java.lang.String r3 = "Unexpected event"
            X.18c r4 = X.BEA.A0X(r3)
            r3 = r16
            X.Buu r5 = A00(r0, r1, r3, r4, r2)
            throw r5
        L_0x0a6c:
            A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26189CuF.A05(X.E2r, X.CLx, X.CSd, int):void");
    }
}
