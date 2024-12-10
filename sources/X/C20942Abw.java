package X;

/* renamed from: X.Abw  reason: case insensitive filesystem */
public abstract class C20942Abw implements AnonymousClass25D {
    public final int A00;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r3.equals("all,all") == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass8S3 r6, long r7, boolean r9) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass8oP
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r5 instanceof X.AnonymousClass8oQ
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r5 instanceof X.AnonymousClass8oR
            if (r0 == 0) goto L_0x00ad
            r4 = r5
            X.8oR r4 = (X.AnonymousClass8oR) r4
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.lang.String r2 = r4.A05     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r1 = X.C19620yd.A0A     // Catch:{ Exception -> 0x00a7 }
            X.DSQ r0 = X.DSQ.A00     // Catch:{ Exception -> 0x00a7 }
            byte[] r0 = r2.getBytes(r1)     // Catch:{ Exception -> 0x00a7 }
            X.BmB r2 = new X.BmB     // Catch:{ Exception -> 0x00a7 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00a7 }
            if (r9 == 0) goto L_0x0050
            X.8cd r1 = X.AnonymousClass8BS.A0D(r6)     // Catch:{ Exception -> 0x00a7 }
            int r0 = X.C166278cd.ACTION_LINK_FIELD_NUMBER     // Catch:{ Exception -> 0x00a7 }
            int r0 = r1.bitField1_     // Catch:{ Exception -> 0x00a7 }
            r0 = r0 | 4
            r1.bitField1_ = r0     // Catch:{ Exception -> 0x00a7 }
            r1.ctwaPayload_ = r2     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r3 = r4.A07     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x0050
            X.8cd r1 = X.AnonymousClass8BS.A0D(r6)     // Catch:{ Exception -> 0x00a7 }
            int r0 = r1.bitField1_     // Catch:{ Exception -> 0x00a7 }
            r0 = r0 | 2
            r1.bitField1_ = r0     // Catch:{ Exception -> 0x00a7 }
            r1.ctwaSignals_ = r3     // Catch:{ Exception -> 0x00a7 }
            boolean r0 = X.AnonymousClass1YF.A0T(r3)     // Catch:{ Exception -> 0x00a7 }
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "all,all"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x00a7 }
            if (r0 == 0) goto L_0x005e
        L_0x0050:
            X.8cd r1 = X.AnonymousClass8BS.A0D(r6)     // Catch:{ Exception -> 0x00a7 }
            int r0 = X.C166278cd.ACTION_LINK_FIELD_NUMBER     // Catch:{ Exception -> 0x00a7 }
            int r0 = r1.bitField0_     // Catch:{ Exception -> 0x00a7 }
            r0 = r0 | 32
            r1.bitField0_ = r0     // Catch:{ Exception -> 0x00a7 }
            r1.conversionData_ = r2     // Catch:{ Exception -> 0x00a7 }
        L_0x005e:
            java.lang.String r2 = r4.A06     // Catch:{ Exception -> 0x00a7 }
            X.8cd r1 = X.AnonymousClass8BS.A0D(r6)     // Catch:{ Exception -> 0x00a7 }
            int r0 = r1.bitField0_     // Catch:{ Exception -> 0x00a7 }
            r0 = r0 | 16
            r1.bitField0_ = r0     // Catch:{ Exception -> 0x00a7 }
            r1.conversionSource_ = r2     // Catch:{ Exception -> 0x00a7 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x00a7 }
            long r0 = r4.A01     // Catch:{ Exception -> 0x00a7 }
            long r7 = r7 - r0
            long r0 = r2.toSeconds(r7)     // Catch:{ Exception -> 0x00a7 }
            int r2 = (int) r0     // Catch:{ Exception -> 0x00a7 }
            X.8cd r1 = X.AnonymousClass8BS.A0D(r6)     // Catch:{ Exception -> 0x00a7 }
            int r0 = r1.bitField0_     // Catch:{ Exception -> 0x00a7 }
            r0 = r0 | 64
            r1.bitField0_ = r0     // Catch:{ Exception -> 0x00a7 }
            r1.conversionDelaySeconds_ = r2     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r3 = r4.A08     // Catch:{ Exception -> 0x00a7 }
            int r0 = r3.length()     // Catch:{ Exception -> 0x00a7 }
            if (r0 <= 0) goto L_0x0097
            X.8cd r2 = X.AnonymousClass8BS.A0D(r6)     // Catch:{ Exception -> 0x00a7 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x00a7 }
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x00a7 }
            r2.trustBannerType_ = r3     // Catch:{ Exception -> 0x00a7 }
        L_0x0097:
            int r3 = r4.A00     // Catch:{ Exception -> 0x00a7 }
            X.8cd r2 = X.AnonymousClass8BS.A0D(r6)     // Catch:{ Exception -> 0x00a7 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x00a7 }
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x00a7 }
            r2.trustBannerAction_ = r3     // Catch:{ Exception -> 0x00a7 }
            return
        L_0x00a7:
            r1 = move-exception
            java.lang.String r0 = "CtwaAdsEntryPoint/fillMessageE2EContextInfo/failed to fill E2E context info/exception="
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20942Abw.A00(X.8S3, long, boolean):void");
    }

    public boolean A01() {
        if (this instanceof AnonymousClass8oP) {
            return true;
        }
        if ((this instanceof AnonymousClass8oQ) || !(this instanceof AnonymousClass8oR)) {
            return false;
        }
        return true;
    }

    public C20942Abw(int i) {
        this.A00 = i;
    }
}
