package X;

/* renamed from: X.9ma  reason: invalid class name and case insensitive filesystem */
public final class C191429ma {
    public final C175698z8 A00;
    public final C175738zC A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C25181Nf A04;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.9NV, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015a, code lost:
        r2 = (X.C175688z7) r11.A06.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0162, code lost:
        if (r10 == null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0164, code lost:
        r1 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0166, code lost:
        if (r1 != null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0168, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016a, code lost:
        r2.A05.CGF(new X.C21419Ajm(r14, r6, r15, new X.AYH(r12, r11, r10, r13), r2, r5, r23, r20, r1, r9, r13, r28, r8, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.BBC r32, X.C22449B8h r33, X.C195769ts r34, java.lang.String r35, java.util.List r36) {
        /*
            r31 = this;
            r0 = 3
            r12 = r32
            X.C18070vi.A0d(r12, r0)
            r0 = r34
            boolean r1 = r0.A0A
            r3 = r31
            if (r1 == 0) goto L_0x00e2
            X.Abq r1 = X.C20089A6r.A02(r36)
            if (r1 == 0) goto L_0x0061
            java.lang.String r2 = r1.A01
            org.json.JSONObject r1 = r1.A04
            X.1D6 r2 = X.AnonymousClass1D6.A01(r2, r1)
        L_0x001c:
            long r4 = r0.A00
            r8 = 0
            r7 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x005e
            java.lang.Long r23 = java.lang.Long.valueOf(r4)
        L_0x0029:
            X.00H r1 = r3.A02
            java.lang.Object r11 = r1.get()
            X.A0J r11 = (X.A0J) r11
            java.lang.String r1 = r0.A08
            r20 = r1
            X.205 r10 = r0.A06
            com.whatsapp.jid.UserJid r15 = r0.A03
            X.ARR r14 = r0.A01
            java.lang.String r9 = r0.A09
            java.lang.String r28 = X.C108985cd.A0f()
            if (r2 == 0) goto L_0x005c
            java.lang.Object r8 = r2.first
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r2.second
            org.json.JSONObject r7 = (org.json.JSONObject) r7
        L_0x004b:
            X.AES r6 = r0.A02
            X.ADy r5 = r0.A04
            X.00H r0 = r11.A07
            java.lang.Object r4 = r0.get()
            X.9AY r4 = (X.AnonymousClass9AY) r4
            X.C18070vi.A0b(r4)
            monitor-enter(r4)
            goto L_0x0063
        L_0x005c:
            r8 = r7
            goto L_0x004b
        L_0x005e:
            r23 = r7
            goto L_0x0029
        L_0x0061:
            r2 = 0
            goto L_0x001c
        L_0x0063:
            X.0ve r2 = r4.A02     // Catch:{ all -> 0x00df }
            r1 = 7302(0x1c86, float:1.0232E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00df }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x00df }
            r13 = r35
            if (r0 == 0) goto L_0x0159
            if (r10 == 0) goto L_0x0159
            java.lang.String r0 = "UPI"
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0159
            android.util.LruCache r0 = r4.A01     // Catch:{ all -> 0x00df }
            java.lang.Object r3 = r0.get(r10)     // Catch:{ all -> 0x00df }
            X.9qx r3 = (X.C193969qx) r3     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x0159
            X.1QE r2 = r11.A03     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "Cache found for "
            java.lang.String r0 = X.AnonymousClass001.A1E(r10, r0, r1)     // Catch:{ all -> 0x00df }
            r2.A07(r0)     // Catch:{ all -> 0x00df }
            X.9FM r0 = r3.A00     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00b2
            X.9DA r0 = r0.A02     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x00df }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00d2
            long r18 = r0.longValue()     // Catch:{ all -> 0x00df }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00df }
            long r16 = X.C17880vN.A04(r0)     // Catch:{ all -> 0x00df }
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d2
        L_0x00b2:
            boolean r0 = r3.A01     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00cd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "Request in progress for "
            java.lang.String r0 = X.AnonymousClass001.A1E(r10, r0, r1)     // Catch:{ all -> 0x00df }
            r2.A04(r0)     // Catch:{ all -> 0x00df }
            android.util.LruCache r1 = r4.A00     // Catch:{ all -> 0x00df }
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r12)     // Catch:{ all -> 0x00df }
            r1.put(r10, r0)     // Catch:{ all -> 0x00df }
            goto L_0x00dd
        L_0x00cd:
            r4.A0B(r10, r13)     // Catch:{ all -> 0x00df }
            goto L_0x0159
        L_0x00d2:
            X.1KB r2 = r11.A00     // Catch:{ all -> 0x00df }
            r1 = 1
            X.Ajz r0 = new X.Ajz     // Catch:{ all -> 0x00df }
            r0.<init>(r12, r3, r1)     // Catch:{ all -> 0x00df }
            r2.A0J(r0)     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r4)
            return
        L_0x00df:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00e2:
            java.lang.Integer r2 = r0.A07
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r7 = r33
            if (r2 != r1) goto L_0x0194
            if (r36 == 0) goto L_0x0147
            java.util.Iterator r5 = r36.iterator()
        L_0x00f0:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0147
            java.lang.Object r4 = r5.next()
            X.ADj r4 = (X.C20251ADj) r4
            java.lang.String r2 = r4.A01
            java.lang.String r1 = "upi_merchant_vpa"
            boolean r1 = X.C18070vi.A18(r2, r1)
            r6 = 0
            if (r1 == 0) goto L_0x0133
            X.BDZ r2 = r4.A00
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.protocol.CheckoutInfoContent.PaymentSettings.UpiMerchantVpa"
            X.C18070vi.A0z(r2, r1)
            X.Abk r2 = (X.C20930Abk) r2
            X.Abp r1 = r2.A00
        L_0x0112:
            if (r1 == 0) goto L_0x00f0
            java.lang.String r5 = r1.A00
            java.lang.String r4 = r1.A01
            java.lang.String r3 = r1.A02
            java.lang.String r2 = r1.A03
            java.lang.String r1 = r1.A04
            X.9NV r0 = new X.9NV
            r0.<init>()
            r0.A00 = r5
            r0.A04 = r4
            r0.A02 = r3
            r0.A03 = r2
            r0.A05 = r1
            r0.A01 = r6
            r7.C3t(r6, r0)
            return
        L_0x0133:
            java.lang.String r1 = "upi_intent_link"
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 == 0) goto L_0x00f0
            X.BDZ r2 = r4.A00
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.protocol.CheckoutInfoContent.PaymentSettings.UpiIntentLink"
            X.C18070vi.A0z(r2, r1)
            X.Abj r2 = (X.C20929Abj) r2
            X.Abp r1 = r2.A00
            goto L_0x0112
        L_0x0147:
            X.Abl r0 = r0.A05
            if (r0 == 0) goto L_0x0193
            X.8zC r3 = r3.A01
            java.lang.String r2 = X.C20089A6r.A04(r36)
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A02
            r3.A00(r7, r2, r1, r0)
            return
        L_0x0159:
            monitor-exit(r4)
            X.00H r0 = r11.A06
            java.lang.Object r2 = r0.get()
            X.8z7 r2 = (X.C175688z7) r2
            if (r10 == 0) goto L_0x0168
            java.lang.String r1 = r10.A01
            if (r1 != 0) goto L_0x016a
        L_0x0168:
            java.lang.String r1 = ""
        L_0x016a:
            X.AYH r0 = new X.AYH
            r0.<init>(r12, r11, r10, r13)
            X.10I r4 = r2.A05
            X.Ajm r3 = new X.Ajm
            r24 = r20
            r25 = r1
            r26 = r9
            r27 = r13
            r29 = r8
            r30 = r7
            r16 = r3
            r17 = r14
            r18 = r6
            r19 = r15
            r20 = r0
            r21 = r2
            r22 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4.CGF(r3)
        L_0x0193:
            return
        L_0x0194:
            X.8z8 r5 = r3.A00
            java.lang.String r8 = r0.A09
            com.whatsapp.jid.UserJid r6 = r0.A03
            X.10I r0 = r5.A06
            r9 = 35
            X.AkN r4 = new X.AkN
            r4.<init>(r5, r6, r7, r8, r9)
            r0.CGF(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191429ma.A00(X.BBC, X.B8h, X.9ts, java.lang.String, java.util.List):void");
    }

    public C191429ma(C25181Nf r2, C175698z8 r3, C175738zC r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0p(r4, r5, r6);
        C18070vi.A0d(r2, 5);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r2;
    }
}
