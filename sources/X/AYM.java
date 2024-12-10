package X;

public final /* synthetic */ class AYM implements C22449B8h {
    public final /* synthetic */ ARR A00;
    public final /* synthetic */ B91 A01;
    public final /* synthetic */ B92 A02;
    public final /* synthetic */ AnonymousClass92s A03;
    public final /* synthetic */ C195769ts A04;

    /* JADX WARNING: type inference failed for: r0v11, types: [X.9NG, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a6, code lost:
        if (r1.verify(android.util.Base64.decode(r8.A01, r7)) != false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C3t(X.A7B r14, X.AnonymousClass9NV r15) {
        /*
            r13 = this;
            X.92s r3 = r13.A03
            X.9ts r4 = r13.A04
            X.B92 r6 = r13.A02
            X.B91 r2 = r13.A01
            X.ARR r5 = r13.A00
            r3.CEx()
            if (r14 != 0) goto L_0x00b7
            if (r15 == 0) goto L_0x00b7
            java.lang.String r10 = r15.A00
            r3.A0a = r10
            java.lang.String r11 = r15.A03
            r3.A0d = r11
            java.lang.String r0 = r15.A01
            r3.A0B = r0
            java.lang.String r12 = r15.A05
            r3.A0A = r12
            X.7Ik r0 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.String r8 = r15.A04
            X.77e r0 = X.AnonymousClass8BT.A0L(r0, r8)
            r3.A0J = r0
            java.lang.String r9 = r15.A02
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0043
            X.7Ik r1 = X.AnonymousClass8BR.A0Z()
            java.lang.String r0 = "accountHolderName"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r1, r7, r9, r0)
            r3.A0H = r0
        L_0x0043:
            java.lang.Integer r1 = r4.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x005e
            X.Abp r7 = new X.Abp
            r7.<init>(r8, r9, r10, r11, r12)
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity
            if (r0 != 0) goto L_0x005e
            X.1KB r4 = r3.A05
            r1 = 14
            X.Ajz r0 = new X.Ajz
            r0.<init>(r3, r7, r1)
            r4.A0J(r0)
        L_0x005e:
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity
            if (r0 == 0) goto L_0x00a8
            java.lang.String r9 = r3.A0B
            r4 = 0
            if (r9 == 0) goto L_0x00b3
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "extra_merchant_signature_data"
            android.os.Parcelable r8 = r1.getParcelableExtra(r0)
            X.ADu r8 = (X.C20262ADu) r8
            boolean r7 = X.C72453Mb.A1Z(r8)
            byte[] r0 = android.util.Base64.decode(r9, r7)
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec
            r1.<init>(r0)
            java.lang.String r0 = r8.A02
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)
            java.security.PublicKey r3 = r0.generatePublic(r1)
            java.lang.String r0 = "SHA256withRSA"
            java.security.Signature r1 = java.security.Signature.getInstance(r0)
            r1.initVerify(r3)
            java.lang.String r0 = r8.A00
            byte[] r0 = X.C108975cc.A1O(r0)
            r1.update(r0)
            java.lang.String r0 = r8.A01
            byte[] r0 = android.util.Base64.decode(r0, r7)
            boolean r0 = r1.verify(r0)
            if (r0 == 0) goto L_0x00b3
        L_0x00a8:
            X.9NG r0 = new X.9NG
            r0.<init>()
            r0.A01 = r5
            r6.C7M(r0)
            return
        L_0x00b3:
            r2.Bss(r4)
            return
        L_0x00b7:
            java.lang.Integer r1 = r4.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x00d2
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity
            if (r0 != 0) goto L_0x00d2
            int r1 = r14.A00
            r0 = 4003(0xfa3, float:5.61E-42)
            if (r1 != r0) goto L_0x00d2
            X.1KB r1 = r3.A05
            r0 = 18
            X.AkE r0 = X.C21447AkE.A00(r3, r0)
            r1.A0J(r0)
        L_0x00d2:
            r2.Bss(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AYM.C3t(X.A7B, X.9NV):void");
    }

    public /* synthetic */ AYM(ARR arr, B91 b91, B92 b92, AnonymousClass92s r4, C195769ts r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = b92;
        this.A01 = b91;
        this.A00 = arr;
    }
}
