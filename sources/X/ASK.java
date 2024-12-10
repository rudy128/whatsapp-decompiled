package X;

public final class ASK implements B83, C436820m, C22575BDq {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;

    public /* synthetic */ void BDb(C19998A2m a2m, AnonymousClass206 r4) {
        C17960vV.A0F(false, "buildProtobufMessage() must never be called.");
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.24R, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r4 == null) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r7) {
        /*
            r6 = this;
            r5 = 0
            X.C18070vi.A0d(r7, r5)
            X.8cr r1 = r7.A08
            int r0 = r1.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r4 = 0
            if (r0 == 0) goto L_0x00c0
            X.8cm r3 = X.AnonymousClass8BS.A0I(r1)
            int r2 = r3.bitField0_
            r0 = r2 & 2
            if (r0 == 0) goto L_0x00c0
            X.9Kc r1 = r3.A0R()
            X.9Kc r0 = X.C179839Kc.CLOUD_API_THREAD_CONTROL_NOTIFICATION
            if (r1 != r0) goto L_0x00c0
            r0 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00b9
            X.8ao r2 = r3.cloudApiThreadControlNotification_
            if (r2 != 0) goto L_0x002e
            X.8ao r2 = X.C165238ao.DEFAULT_INSTANCE
        L_0x002e:
            int r3 = r2.bitField0_
            r0 = r3 & 1
            if (r0 == 0) goto L_0x00b2
            r0 = r3 & 2
            if (r0 == 0) goto L_0x00b2
            int r1 = r2.status_
            if (r1 == 0) goto L_0x0055
            r0 = 1
            if (r1 == r0) goto L_0x0052
            r0 = 2
            if (r1 != r0) goto L_0x0055
            X.9Jt r5 = X.C179749Jt.CONTROL_TAKEN
        L_0x0044:
            r0 = r3 & 4
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r3 = 0
            if (r0 == 0) goto L_0x006e
            java.lang.String r1 = r2.consumerLid_
            if (r1 == 0) goto L_0x006e
            goto L_0x0058
        L_0x0052:
            X.9Jt r5 = X.C179749Jt.CONTROL_PASSED
            goto L_0x0044
        L_0x0055:
            X.9Jt r5 = X.C179749Jt.UNKNOWN
            goto L_0x0044
        L_0x0058:
            X.1yH r0 = X.AnonymousClass1E2.A01     // Catch:{ all -> 0x005f }
            X.1E2 r4 = X.C42501yH.A01(r1)     // Catch:{ all -> 0x005f }
            goto L_0x0064
        L_0x005f:
            r0 = move-exception
            X.1IU r4 = X.C108945cZ.A1J(r0)
        L_0x0064:
            boolean r0 = r4 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x0069
            r4 = r3
        L_0x0069:
            X.1BI r4 = (X.AnonymousClass1BI) r4
            if (r4 == 0) goto L_0x006e
            goto L_0x0094
        L_0x006e:
            int r0 = r2.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00aa
            java.lang.String r1 = r2.consumerPhoneNumber_
            if (r1 == 0) goto L_0x00aa
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "+"
            java.lang.String r0 = X.AnonymousClass1YF.A0J(r0, r1)     // Catch:{ all -> 0x0085 }
            com.whatsapp.jid.PhoneUserJid r1 = X.C22951Dx.A01(r0)     // Catch:{ all -> 0x0085 }
            goto L_0x008a
        L_0x0085:
            r0 = move-exception
            X.1IU r1 = X.C108945cZ.A1J(r0)
        L_0x008a:
            boolean r0 = r1 instanceof X.AnonymousClass1IU
            if (r0 != 0) goto L_0x008f
            r3 = r1
        L_0x008f:
            X.1BI r3 = (X.AnonymousClass1BI) r3
            if (r3 == 0) goto L_0x00aa
            r4 = r3
        L_0x0094:
            X.205 r0 = r7.A0A
            boolean r1 = r0.A02
            java.lang.String r0 = r0.A01
            X.205 r4 = X.AnonymousClass205.A01(r4, r0, r1)
            long r2 = r2.senderNotificationTimestampMs_
            r1 = 100
            X.24R r0 = new X.24R
            r0.<init>(r4, r1, r2)
            r0.A00 = r5
            return r0
        L_0x00aa:
            r1 = 0
            java.lang.String r0 = "CAPI thread control notification does not have valid lid or phone number"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x00b2:
            java.lang.String r0 = "CAPI thread control notification is missing fields"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r5)
            throw r0
        L_0x00b9:
            java.lang.String r0 = "missing cloud api thread control notification"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r5)
            throw r0
        L_0x00c0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ASK.CBG(X.A6d):X.206");
    }

    public ASK(AnonymousClass11S r1, AnonymousClass11P r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
