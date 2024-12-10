package X;

/* renamed from: X.ASd  reason: case insensitive filesystem */
public final class C20619ASd implements B83, B85, C436820m {
    public final C18030ve A00;

    public C20619ASd(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BDb(X.C19998A2m r12, X.AnonymousClass206 r13) {
        /*
            r11 = this;
            X.C18070vi.A0h(r13, r12)
            boolean r0 = r13 instanceof X.C442622t
            if (r0 == 0) goto L_0x0099
            X.205 r10 = r13.A0v
            X.C18070vi.A0W(r10)
            X.22t r13 = (X.C442622t) r13
            int r9 = r13.A00
            long r0 = r13.A01
            long r4 = X.C17880vN.A04(r0)
            int r8 = r13.A00
            int r7 = r13.A04
            java.lang.Boolean r6 = r13.A0Q
            X.8X8 r3 = r12.A00
            X.8Wt r2 = X.AnonymousClass8X8.A01(r3)
            X.Bm6 r0 = r2.A00
            X.8cm r0 = (X.C166368cm) r0
            X.8cq r0 = r0.key_
            if (r0 != 0) goto L_0x002c
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x002c:
            X.8X7 r1 = X.AnonymousClass8BR.A0f(r0)
            X.1BI r0 = r10.A00
            X.AnonymousClass8X7.A02(r0, r1, r10)
            r2.A0H(r1)
            X.8cm r1 = X.AnonymousClass8BS.A0H(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.ephemeralExpiration_ = r9
            X.8cm r1 = X.AnonymousClass8BS.A0H(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.ephemeralSettingTimestamp_ = r4
            X.8ci r0 = X.C166328ci.DEFAULT_INSTANCE
            X.Bmt r1 = r0.A0N()
            X.8Wz r1 = (X.C163958Wz) r1
            if (r8 == 0) goto L_0x0096
            r0 = 1
            if (r8 == r0) goto L_0x0093
            r0 = 2
            if (r8 != r0) goto L_0x0096
            X.9K8 r0 = X.AnonymousClass9K8.INITIATED_BY_OTHER
        L_0x0062:
            r1.A0G(r0)
            X.9KQ r0 = X.C196849vk.A01(r7)
            r1.A0H(r0)
            if (r6 == 0) goto L_0x0075
            boolean r0 = r6.booleanValue()
            r1.A0I(r0)
        L_0x0075:
            X.Bm6 r0 = r1.A0C()
            X.8ci r0 = (X.C166328ci) r0
            X.8cm r1 = X.AnonymousClass8BS.A0H(r2)
            r0.getClass()
            r1.disappearingMode_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            X.9Kc r0 = X.C179839Kc.EPHEMERAL_SYNC_RESPONSE
            r2.A0G(r0)
            r3.A0N(r2)
            return
        L_0x0093:
            X.9K8 r0 = X.AnonymousClass9K8.INITIATED_BY_ME
            goto L_0x0062
        L_0x0096:
            X.9K8 r0 = X.AnonymousClass9K8.CHANGED_IN_CHAT
            goto L_0x0062
        L_0x0099:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageEphemeralSyncResponseProtobuf not supported message: "
            r1.append(r0)
            java.lang.String r0 = X.C17890vO.A0U(r13)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20619ASd.BDb(X.A2m, X.206):void");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [X.22t, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        if (r1 == 2) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r10) {
        /*
            r9 = this;
            X.8cr r1 = X.C20077A6d.A01(r10)
            int r0 = r1.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x00a5
            X.8cm r0 = r1.protocolMessage_
            r5 = r0
            r1 = r0
            if (r0 != 0) goto L_0x0016
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
        L_0x0016:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00a5
            if (r5 != 0) goto L_0x0020
            X.8cm r1 = X.C166368cm.DEFAULT_INSTANCE
        L_0x0020:
            X.9Kc r1 = r1.A0R()
            X.9Kc r0 = X.C179839Kc.EPHEMERAL_SYNC_RESPONSE
            if (r1 != r0) goto L_0x00a5
            r8 = 0
            if (r5 != 0) goto L_0x002d
            X.8cm r5 = X.C166368cm.DEFAULT_INSTANCE
        L_0x002d:
            X.205 r3 = r10.A0A
            long r1 = r10.A03
            r0 = 77
            X.22t r4 = new X.22t
            r4.<init>(r3, r0, r1)
            long r6 = r5.ephemeralSettingTimestamp_
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 2010(0x7da, float:2.817E-42)
            r3 = 1
            r1.set(r0, r3, r3)
            long r1 = r1.getTimeInMillis()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
        L_0x004f:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r4.A0h(r0)
            int r0 = r5.ephemeralExpiration_
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A17(r0)
            X.8ci r0 = r5.disappearingMode_
            if (r0 != 0) goto L_0x0065
            X.8ci r0 = X.C166328ci.DEFAULT_INSTANCE
        L_0x0065:
            X.9K8 r0 = r0.A0R()
            int r0 = r0.value
            r4.A00 = r0
            X.0ve r2 = r9.A00
            r1 = 5309(0x14bd, float:7.44E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00a4
            X.8ci r0 = r5.disappearingMode_
            if (r0 != 0) goto L_0x007f
            X.8ci r0 = X.C166328ci.DEFAULT_INSTANCE
        L_0x007f:
            int r0 = r0.trigger_
            X.9KQ r0 = X.AnonymousClass9KQ.A00(r0)
            if (r0 != 0) goto L_0x0089
            X.9KQ r0 = X.AnonymousClass9KQ.UNKNOWN
        L_0x0089:
            int r1 = X.C196849vk.A00(r0)
            r4.A04 = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r4.A0Q = r0
            if (r1 != 0) goto L_0x00a4
            int r1 = r4.A00
            if (r1 == 0) goto L_0x00a2
            r0 = 2
            if (r1 == r3) goto L_0x00a1
            r3 = 0
            if (r1 != r0) goto L_0x00a2
        L_0x00a1:
            r3 = 2
        L_0x00a2:
            r4.A04 = r3
        L_0x00a4:
            return r4
        L_0x00a5:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20619ASd.CBG(X.A6d):X.206");
    }
}
