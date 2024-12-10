package X;

/* renamed from: X.3CH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C27191Vc A03;
    public final /* synthetic */ AnonymousClass1BI A04;
    public final /* synthetic */ String A05;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if ((r8 * 1000) >= X.AnonymousClass11P.A01(r6)) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            X.1Vc r1 = r0.A03
            X.1BI r3 = r0.A04
            int r5 = r0.A00
            int r9 = r0.A01
            java.lang.String r8 = r0.A05
            long r6 = r0.A02
            boolean r0 = X.C22971Dz.A0V(r3)
            if (r0 == 0) goto L_0x0117
            X.1Ui r12 = r1.A04
            X.1ch r3 = (X.C29681ch) r3
            r11 = 0
            X.00H r4 = r12.A06
            java.lang.Object r0 = r4.get()
            X.2eL r0 = (X.C54562eL) r0
            X.1U8 r14 = r12.A05
            X.33e r10 = new X.33e
            r13 = r12
            r15 = r11
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            long r0 = r12.A00
            X.11P r6 = r12.A01
            long r7 = X.AnonymousClass11P.A01(r6)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0128
            java.lang.Object r1 = r4.get()
            X.2eL r1 = (X.C54562eL) r1
            r0 = r5 & 1
            if (r0 == 0) goto L_0x0077
            X.2lS r0 = r1.A01
            boolean r0 = r0.A02(r3)
            if (r0 == 0) goto L_0x0077
        L_0x004a:
            r7 = 1
            if (r7 == r5) goto L_0x004e
            r7 = 0
        L_0x004e:
            X.00H r5 = r12.A08
            java.lang.Object r0 = r5.get()
            X.2jW r0 = (X.C57712jW) r0
            X.2gM r4 = r0.A00(r3, r7)
            if (r4 == 0) goto L_0x0128
            X.1BI r0 = r4.A03
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = r4.A04
            if (r0 == 0) goto L_0x010f
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "oe"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x0099
            r0 = 16
            goto L_0x0084
        L_0x0077:
            r0 = r5 & 2
            if (r0 == 0) goto L_0x0128
            X.2lS r0 = r1.A02
            boolean r0 = r0.A02(r3)
            if (r0 == 0) goto L_0x0128
            goto L_0x004a
        L_0x0084:
            long r8 = java.lang.Long.parseLong(r1, r0)     // Catch:{ NumberFormatException -> 0x0099 }
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0099
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
            long r1 = X.AnonymousClass11P.A01(r6)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x010f
        L_0x0099:
            java.lang.String r0 = "ProfilePhotoManager/loadNewsletterProfilePicture loading pic with expired url/requesting new url"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r6 = r5.get()
            X.2jW r6 = (X.C57712jW) r6
            X.357 r5 = new X.357
            r5.<init>(r10, r12, r7)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.00H r2 = r6.A03
            java.lang.Object r0 = r2.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x0128
            X.1CJ r1 = r6.A01
            java.lang.Object r0 = X.C18070vi.A0E(r2)
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = X.AnonymousClass4aS.A08(r1, r3, r0)
            if (r0 == 0) goto L_0x0128
            X.1mY r1 = r6.A02
            X.00H r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x0128
            X.0ve r4 = r1.A00
            r0 = 3604(0xe14, float:5.05E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x0128
            r1 = 1
            r9 = 0
            int r1 = r1 << r9
            r0 = 3605(0xe15, float:5.052E-42)
            int r0 = X.C18020vd.A00(r2, r4, r0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0128
            X.1Mm r1 = r6.A00
            r7 = 1
            X.9yl r6 = new X.9yl
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r8 = r7
            r10 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.whatsapp.newsletter.mex.BaseMetadataNewsletterGraphqlJob r0 = new com.whatsapp.newsletter.mex.BaseMetadataNewsletterGraphqlJob
            r0.<init>(r3, r5, r6)
            r1.A01(r0)
            return
        L_0x010f:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.C1y(r4, r0)
            return
        L_0x0117:
            X.1Ui r4 = r1.A04
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            boolean r6 = X.AnonymousClass000.A1R(r0)
            r1 = r4
            r2 = r3
            r3 = r8
            r4 = r9
            r1.A03(r2, r3, r4, r5, r6)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CH.run():void");
    }

    public /* synthetic */ AnonymousClass3CH(C27191Vc r1, AnonymousClass1BI r2, String str, int i, int i2, long j) {
        this.A03 = r1;
        this.A04 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = str;
        this.A02 = j;
    }
}
