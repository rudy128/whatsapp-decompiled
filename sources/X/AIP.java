package X;

public class AIP implements BA6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AIP(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
    }

    public void Btj(AnonymousClass9LV r5) {
        if (this.A00 != 0) {
            C191579mp r0 = (C191579mp) this.A01;
            C20375AIg.A02(r0.A00, r0.A03, r0.A05, r0.A06, r5);
            return;
        }
        C20375AIg aIg = (C20375AIg) this.A01;
        synchronized (aIg.A07) {
            if (((C20282AEq) this.A02).A01.A0A.equals(aIg.A01)) {
                ((BA6) this.A03).Btj(r5);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: type inference failed for: r0v59, types: [X.9N0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0047 A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:7:0x0026=Splitter:B:7:0x0026, B:62:0x013b=Splitter:B:62:0x013b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r16) {
        /*
            r15 = this;
            r4 = r16
            int r0 = r15.A00
            if (r0 == 0) goto L_0x016c
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r15.A02
            X.A4D r0 = (X.A4D) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = r15.A01
            X.9mp r2 = (X.C191579mp) r2
            X.1CQ r1 = X.AnonymousClass1D7.A0I()
            X.9N0 r0 = new X.9N0
            r0.<init>()
            r0.A00 = r1
            r2.A00(r0)
            return
        L_0x0023:
            if (r4 == 0) goto L_0x0026
            goto L_0x006c
        L_0x0026:
            X.9zw r1 = new X.9zw     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r1.<init>()     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.9Is r0 = X.C179629Is.SCRIPTING_PACKAGE_FETCH_FAILURE     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r1.A00 = r0     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.String r0 = "Scripting package asset download returned a null result"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r1.A03 = r0     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.9LV r0 = r1.A01()     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            goto L_0x006b
        L_0x003c:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r4.<init>(r8)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
        L_0x0041:
            boolean r0 = X.C18070vi.A18(r4, r5)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            if (r0 != 0) goto L_0x0099
            X.9zw r2 = new X.9zw     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r2.<init>()     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.9Is r0 = X.C179629Is.SCRIPTING_PACKAGE_FETCH_FAILURE     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r2.A00 = r0     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r13)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.String r0 = " - Expected Hash: "
            r1.append(r0)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r1.append(r5)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.String r0 = ", Actual Hash: "
            r1.append(r0)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r4, r1)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r2.A03 = r0     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.9LV r0 = r2.A01()     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
        L_0x006b:
            throw r0     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
        L_0x006c:
            boolean r0 = r4.isEmpty()     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            if (r0 != 0) goto L_0x0026
            java.lang.Object r0 = X.C29431cG.A0b(r4)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.9Ze r0 = (X.C183679Ze) r0     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.io.File r0 = r0.A01     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = X.C29431cG.A0b(r4)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.9Ze r0 = (X.C183679Ze) r0     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.io.File r0 = r0.A01     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.String r7 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.Object r6 = r15.A03     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.9yL r6 = (X.C198439yL) r6     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.C18070vi.A0b(r7)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.util.Map r0 = r6.A03     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.util.Iterator r14 = X.AnonymousClass000.A15(r0)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
        L_0x0099:
            boolean r0 = r14.hasNext()     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            if (r0 == 0) goto L_0x0147
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r14)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.String r13 = X.C17880vN.A0x(r0)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.String r5 = X.AnonymousClass8BR.A10(r0)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.io.File r11 = X.AnonymousClass8BR.A0u(r7, r5)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            java.lang.String r10 = "AssetFileUtil"
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r12 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0140 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r0]     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r1 = 1
            r9 = 0
            r4 = 0
            boolean r0 = r11 instanceof X.AnonymousClass9HP     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x0111, all -> 0x010f }
            if (r0 == 0) goto L_0x00cf
            r2 = r11
            X.9HP r2 = (X.AnonymousClass9HP) r2     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x0111, all -> 0x010f }
        L_0x00c5:
            java.io.FileInputStream r0 = X.C108945cZ.A18(r2)     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x0111, all -> 0x010f }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x0111, all -> 0x010f }
            r8.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x0111, all -> 0x010f }
            goto L_0x00d9
        L_0x00cf:
            java.lang.String r0 = r11.getPath()     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x0111, all -> 0x010f }
            X.9HP r2 = new X.9HP     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x0111, all -> 0x010f }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x0111, all -> 0x010f }
            goto L_0x00c5
        L_0x00d9:
            int r0 = r8.read(r3)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            if (r0 <= 0) goto L_0x00e3
            r12.update(r3, r9, r0)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            goto L_0x00d9
        L_0x00e3:
            X.C197099w9.A00(r8)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            byte[] r9 = r12.digest()     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r0 = 40
            char[] r8 = new char[r0]     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r4 = 0
        L_0x00ef:
            int r0 = r9.length     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            if (r4 >= r0) goto L_0x003c
            byte r0 = r9[r4]     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 * 2
            char[] r2 = X.C197099w9.A00     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            int r0 = r3 >>> 4
            char r0 = r2[r0]     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r8[r1] = r0     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            int r1 = r1 + 1
            r0 = r3 & 15
            char r0 = r2[r0]     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r8[r1] = r0     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            int r4 = r4 + 1
            goto L_0x00ef
        L_0x010b:
            r3 = move-exception
            goto L_0x0113
        L_0x010d:
            r3 = move-exception
            goto L_0x0127
        L_0x010f:
            r0 = move-exception
            goto L_0x013b
        L_0x0111:
            r3 = move-exception
            r8 = r4
        L_0x0113:
            java.lang.String r2 = "Couldn't read the file: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = r11.getPath()     // Catch:{ all -> 0x0139 }
            r1[r9] = r0     // Catch:{ all -> 0x0139 }
            X.C26294Cx6.A0D(r10, r2, r3, r1)     // Catch:{ all -> 0x0139 }
            X.C197099w9.A00(r8)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            goto L_0x0041
        L_0x0125:
            r3 = move-exception
            r8 = r4
        L_0x0127:
            java.lang.String r2 = "Couldn't find the file: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = r11.getPath()     // Catch:{ all -> 0x0139 }
            r1[r9] = r0     // Catch:{ all -> 0x0139 }
            X.C26294Cx6.A0D(r10, r2, r3, r1)     // Catch:{ all -> 0x0139 }
            X.C197099w9.A00(r8)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            goto L_0x0041
        L_0x0139:
            r0 = move-exception
            r4 = r8
        L_0x013b:
            X.C197099w9.A00(r4)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            goto L_0x006b
        L_0x0140:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            goto L_0x006b
        L_0x0147:
            java.lang.Object r1 = r15.A01     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.9mp r1 = (X.C191579mp) r1     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.C18070vi.A0b(r7)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            X.9N0 r0 = X.C198439yL.A00(r6, r7)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            r1.A00(r0)     // Catch:{ IOException -> 0x0156, 9LV -> 0x0167 }
            return
        L_0x0156:
            r2 = move-exception
            X.9zw r1 = new X.9zw
            r1.<init>()
            X.9Is r0 = X.C179629Is.SCRIPTING_PACKAGE_FETCH_FAILURE
            r1.A00 = r0
            r1.A03 = r2
            X.9LV r0 = r1.A01()
            goto L_0x0168
        L_0x0167:
            r0 = move-exception
        L_0x0168:
            r15.Btj(r0)
            return
        L_0x016c:
            java.lang.Object r3 = r15.A01
            X.AIg r3 = (X.C20375AIg) r3
            java.util.Set r2 = r3.A07
            monitor-enter(r2)
            java.lang.Object r0 = r15.A02     // Catch:{ all -> 0x018c }
            X.AEq r0 = (X.C20282AEq) r0     // Catch:{ all -> 0x018c }
            X.A6K r0 = r0.A01     // Catch:{ all -> 0x018c }
            java.lang.String r1 = r0.A0A     // Catch:{ all -> 0x018c }
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x018c }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x018a
            java.lang.Object r0 = r15.A03     // Catch:{ all -> 0x018c }
            X.BA6 r0 = (X.BA6) r0     // Catch:{ all -> 0x018c }
            r0.onSuccess(r4)     // Catch:{ all -> 0x018c }
        L_0x018a:
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            return
        L_0x018c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIP.onSuccess(java.lang.Object):void");
    }
}
