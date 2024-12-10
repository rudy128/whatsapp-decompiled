package X;

/* renamed from: X.68W  reason: invalid class name */
public final class AnonymousClass68W extends C27086DTl {
    public final AnonymousClass11C A00;
    public final C18030ve A01;
    public final AnonymousClass68S A02;
    public final AnonymousClass1NL A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68W(AnonymousClass11C r2, C18030ve r3, AnonymousClass68S r4, AnonymousClass1NL r5) {
        super(r4);
        C18070vi.A0d(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:8|9|(2:11|(2:13|14))|15|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C55362fe A07() {
        /*
            r13 = this;
            X.68S r1 = r13.A02
            java.lang.String r0 = r1.A00
            android.net.Uri r5 = android.net.Uri.parse(r0)
            r6 = 0
            if (r5 != 0) goto L_0x0015
            r10 = 0
            X.68V r5 = new X.68V
            r8 = r6
            r9 = r6
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x0015:
            java.io.File r8 = r1.A06
            X.11C r0 = r13.A00
            X.11B r0 = X.C108955ca.A0d(r0)
            X.C18070vi.A0X(r0)
            java.io.InputStream r4 = r0.A07(r5)     // Catch:{ IOException -> 0x006b }
            if (r4 == 0) goto L_0x0055
            boolean r0 = r4 instanceof java.io.FileInputStream     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0044
            X.0ve r2 = r13.A01     // Catch:{ all -> 0x0064 }
            r1 = 11097(0x2b59, float:1.555E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0064 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0044
            X.1NL r3 = r13.A03     // Catch:{ IOException -> 0x0044 }
            r2 = r4
            java.io.FileInputStream r2 = (java.io.FileInputStream) r2     // Catch:{ IOException -> 0x0044 }
            java.lang.String r1 = "EXTERNAL_FILE_COPY_TASK_CRITICAL_EVENT"
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x0044 }
            r3.A08(r2, r1, r0)     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            X.C64062u9.A0T(r8, r4)     // Catch:{ all -> 0x0064 }
            r12 = 1
            X.68V r5 = new X.68V     // Catch:{ all -> 0x0064 }
            r10 = r6
            r11 = r6
            r7 = r5
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0064 }
            r4.close()     // Catch:{ IOException -> 0x006b }
            return r5
        L_0x0055:
            java.lang.String r0 = "ProcessCopyTask/processMedia failed to open input stream"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0064 }
            r10 = 0
            X.68V r5 = new X.68V     // Catch:{ all -> 0x0064 }
            r8 = r6
            r9 = r6
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0064 }
            return r5
        L_0x0064:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ IOException -> 0x006b }
            throw r0     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            r1 = move-exception
            java.lang.String r0 = "ProcessCopyTask/processMedia exception "
            com.whatsapp.util.Log.e(r0, r1)
            r10 = 0
            X.68V r5 = new X.68V
            r8 = r6
            r9 = r6
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68W.A07():X.2fe");
    }
}
