package X;

/* renamed from: X.AkN  reason: case insensitive filesystem */
public class C21456AkN implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C21456AkN(C25238CbZ cbZ, C26381Cyh cyh, Integer num) {
        this.A00 = 2;
        this.A01 = cyh;
        this.A03 = cbZ;
        this.A02 = num;
        this.A04 = "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v118, resolved type: X.8zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v244, resolved type: X.8yn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v69, resolved type: X.8yn} */
    /* JADX WARNING: type inference failed for: r1v113 */
    /* JADX WARNING: type inference failed for: r1v192, types: [X.20i, X.2MF, X.206] */
    /* JADX WARNING: type inference failed for: r7v48, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0428, code lost:
        r1 = new X.C171218rM();
        r1.A05 = r6;
        r1.A02 = r4;
        r1.A03 = r2;
        r1.A01 = null;
        r1.A06 = r7;
        r1.A00 = java.lang.Boolean.valueOf(r8);
        r5.A00.CC4(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0443, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x079b, code lost:
        if (r8 <= 0) goto L_0x079d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x086c, code lost:
        if (r28 == false) goto L_0x086e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0b78, code lost:
        r13.A0I(r1, r15, r16, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0b7c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0e9e, code lost:
        r9.putString(r4, X.C200410p.A0I(",", r5, r5, r8)).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0eab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x11cf, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x11d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x1407, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x140b, code lost:
        throw null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0c0b  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0c12  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0ce8  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0d07  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0d24  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0d3b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r0 = r29
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x13d2;
                case 1: goto L_0x13c0;
                case 2: goto L_0x136b;
                case 3: goto L_0x12ce;
                case 4: goto L_0x12b9;
                case 5: goto L_0x1274;
                case 6: goto L_0x121e;
                case 7: goto L_0x11d4;
                case 8: goto L_0x118b;
                case 9: goto L_0x1172;
                case 10: goto L_0x1154;
                case 11: goto L_0x112b;
                case 12: goto L_0x1115;
                case 13: goto L_0x0f95;
                case 14: goto L_0x0470;
                case 15: goto L_0x0f82;
                case 16: goto L_0x0f6f;
                case 17: goto L_0x0f5d;
                case 18: goto L_0x0edb;
                case 19: goto L_0x0eb3;
                case 20: goto L_0x0e2c;
                case 21: goto L_0x0d58;
                case 22: goto L_0x0446;
                case 23: goto L_0x03e5;
                case 24: goto L_0x039f;
                case 25: goto L_0x0c95;
                case 26: goto L_0x0364;
                case 27: goto L_0x0c83;
                case 28: goto L_0x0c64;
                case 29: goto L_0x0c2a;
                case 30: goto L_0x0c18;
                case 31: goto L_0x0313;
                case 32: goto L_0x0b98;
                case 33: goto L_0x0b86;
                case 34: goto L_0x028f;
                case 35: goto L_0x0b20;
                case 36: goto L_0x0930;
                case 37: goto L_0x0918;
                case 38: goto L_0x08d3;
                case 39: goto L_0x06d2;
                case 40: goto L_0x06b0;
                case 41: goto L_0x020d;
                case 42: goto L_0x067d;
                case 43: goto L_0x0668;
                case 44: goto L_0x00bf;
                case 45: goto L_0x0630;
                case 46: goto L_0x05fa;
                case 47: goto L_0x002a;
                case 48: goto L_0x05e0;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r0.A01
            X.A6L r6 = (X.A6L) r6
            java.lang.String r5 = r0.A04
            java.lang.Object r4 = r0.A02
            java.lang.Object r3 = r0.A03
            X.00H r0 = r6.A0M
            java.lang.Object r2 = r0.get()
            X.31f r2 = (X.C678831f) r2
            X.2R1 r1 = X.AnonymousClass2R1.A0F
            r0 = 0
            r2.A03(r1, r0, r5)
            r1 = 40
            X.7RO r0 = new X.7RO
            r0.<init>(r6, r4, r3, r1)
            X.C26078Crs.A00(r0)
        L_0x0029:
            return
        L_0x002a:
            java.lang.Object r4 = r0.A01
            X.1EJ r4 = (X.AnonymousClass1EJ) r4
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.String r3 = r0.A04
            java.lang.Object r5 = r0.A03
            java.util.AbstractMap r5 = (java.util.AbstractMap) r5
            java.util.Iterator r10 = r1.iterator()
        L_0x003c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r10.next()
            X.10M r0 = (X.AnonymousClass10M) r0
            int r6 = r4.A00
            X.190 r2 = r0.A02
            java.lang.String r0 = com.whatsapp.util.Log.stackTraceStartPhrase()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            r9.append(r3)
            java.lang.String r8 = "\n"
            r9.append(r8)
            java.lang.String r0 = "Job anomaly detected [type: "
            r9.append(r0)
            r9.append(r6)
            java.lang.String r0 = "]\n"
            r9.append(r0)
            java.util.Iterator r7 = X.C17890vO.A0i(r5)
        L_0x006e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x008f
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r7)
            java.lang.String r0 = X.C17880vN.A0x(r1)
            r9.append(r0)
            java.lang.String r0 = ":"
            r9.append(r0)
            java.lang.String r0 = X.AnonymousClass8BR.A10(r1)
            r9.append(r0)
            r9.append(r8)
            goto L_0x006e
        L_0x008f:
            java.lang.String r0 = "### end stack trace"
            X.C17890vO.A1B(r9, r0)
            X.C22781De.A01()
            if (r2 == 0) goto L_0x003c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "job-anomaly-"
            r1.append(r0)
            r0 = 1
            if (r6 == r0) goto L_0x00bc
            r0 = 2
            if (r6 == r0) goto L_0x00b9
            r0 = 3
            if (r6 == r0) goto L_0x00b6
            java.lang.String r0 = "DELAYED_JOB"
        L_0x00ad:
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            r0 = 0
            r2.A0G(r1, r3, r0)
            goto L_0x003c
        L_0x00b6:
            java.lang.String r0 = "FREQUENT_RUNNING_JOB"
            goto L_0x00ad
        L_0x00b9:
            java.lang.String r0 = "LONG_RUNNING_JOB"
            goto L_0x00ad
        L_0x00bc:
            java.lang.String r0 = "BLOCKED_QUEUE"
            goto L_0x00ad
        L_0x00bf:
            java.lang.Object r6 = r0.A01
            X.1m1 r6 = (X.C35311m1) r6
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.Object r10 = r0.A03
            X.1BI r10 = (X.AnonymousClass1BI) r10
            java.lang.String r0 = "scheduled-call/onScheduledCallCancelMessageAdded execute on worker thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Uq r0 = r6.A06
            X.2mw r8 = r0.A02(r1, r2)
            if (r8 == 0) goto L_0x0029
            long r1 = r8.A02
            X.1Cd r0 = r0.A03
            X.1au r9 = r0.A05()
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x13ee }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x13ee }
            java.lang.String r5 = "scheduled_calls"
            java.lang.String r4 = "creation_message_row_id = ?"
            java.lang.String[] r3 = X.C17900vP.A0t(r1)     // Catch:{ all -> 0x13ee }
            java.lang.String r0 = "ScheduledCallsStore/DELETE_SCHEDULED_CALL_BY_ROW_ID"
            int r0 = r7.A04(r5, r4, r0, r3)     // Catch:{ all -> 0x13ee }
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = "ScheduledCallsStore/deleteScheduledCallByRowID delete failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x13ee }
        L_0x00fc:
            r9.close()
            r6.A00(r1)
            X.1KB r4 = r6.A00
            r3 = 24
            X.7Ph r0 = new X.7Ph
            r0.<init>(r6, r1, r3)
            r4.A0J(r0)
            X.00H r0 = r6.A09
            java.lang.Object r2 = r0.get()
            X.1TC r2 = (X.AnonymousClass1TC) r2
            X.1PP r1 = r2.A03
            X.1BI r0 = r8.A04
            X.205 r5 = X.C17880vN.A0Z(r0, r1)
            X.11P r1 = r2.A01
            long r1 = X.AnonymousClass11P.A01(r1)
            r4 = 121(0x79, float:1.7E-43)
            X.97r r3 = new X.97r
            r3.<init>(r5, r4, r1)
            r3.A0d(r10)
            java.lang.String r2 = r8.A06
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            r3.A0j(r2)
            X.121 r1 = r6.A05
            r1.BBM(r3)
            X.00H r1 = r6.A0B
            java.lang.Object r5 = r1.get()
            X.9h5 r5 = (X.C188229h5) r5
            X.11S r2 = r5.A01
            boolean r1 = r2.A0O(r10)
            if (r1 != 0) goto L_0x0029
            X.1M9 r1 = r5.A03
            X.1E7 r11 = r1.A0H(r0)
            android.content.Context r3 = r5.A00
            X.1LU r7 = new X.1LU
            r7.<init>()
            X.1BI r4 = r11.A0J
            r6 = 0
            android.content.Intent r7 = r7.A1w(r3, r4, r6)
            java.lang.String r4 = "fromNotification"
            r13 = 1
            android.content.Intent r9 = r7.putExtra(r4, r13)
            r7 = 134217728(0x8000000, float:3.85186E-34)
            r4 = 2
            android.app.PendingIntent r9 = X.C1408573i.A00(r3, r4, r9, r7)
            java.lang.String r7 = "critical_app_alerts@1"
            X.73t r4 = new X.73t
            r4.<init>(r3, r7)
            X.C17880vN.A1G(r4)
            r7 = 2131102224(0x7f060a10, float:1.781688E38)
            int r7 = X.C19740yt.A00(r3, r7)
            r4.A00 = r7
            r4.A0A = r9
            r4.A0G(r13)
            X.1Vd r9 = r5.A05
            X.1VW r7 = r5.A02
            android.graphics.Bitmap r12 = X.AnonymousClass74H.A01(r3, r7, r9, r11)
            r15 = 0
            r11 = 2131895414(0x7f122476, float:1.942566E38)
            java.lang.Object[] r9 = new java.lang.Object[r13]
            java.lang.String r7 = r8.A00()
            java.lang.String r14 = X.C17880vN.A0q(r3, r7, r9, r6, r11)
            androidx.core.graphics.drawable.IconCompat r13 = androidx.core.graphics.drawable.IconCompat.A03(r12)
            r18 = r6
            X.6uT r12 = new X.6uT
            r16 = r15
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18)
            androidx.core.app.NotificationCompat$MessagingStyle r7 = new androidx.core.app.NotificationCompat$MessagingStyle
            r7.<init>(r12)
            X.1Me r11 = r5.A04
            r9 = 1
            if (r10 != 0) goto L_0x0200
            r0 = 2131888741(0x7f120a65, float:1.9412126E38)
            java.lang.String r1 = r3.getString(r0)
        L_0x01bc:
            boolean r0 = r2.A0O(r10)
            if (r0 == 0) goto L_0x01f2
            r2 = 2131895413(0x7f122475, float:1.9425658E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r0 = r8.A00()
            r1[r6] = r0
        L_0x01cd:
            java.lang.String r3 = r3.getString(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            X.6yJ r0 = new X.6yJ
            r0.<init>(r12, r3, r1)
            r7.A07(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r7.A00 = r0
            r4.A0B(r7)
            X.1Vn r2 = r5.A06
            r1 = 58
            android.app.Notification r0 = r4.A05()
            r2.BkR(r1, r0)
            return
        L_0x01f2:
            r2 = 2131895412(0x7f122474, float:1.9425656E38)
            java.lang.Object[] r1 = X.AnonymousClass3MX.A1b(r1, r6)
            java.lang.String r0 = r8.A00()
            r1[r9] = r0
            goto L_0x01cd
        L_0x0200:
            X.1E7 r1 = r1.A0H(r10)
            int r0 = r11.A0B(r0)
            java.lang.String r1 = r11.A0U(r1, r0, r6)
            goto L_0x01bc
        L_0x020d:
            java.lang.Object r4 = r0.A01
            X.9gt r4 = (X.C188109gt) r4
            java.lang.String r7 = r0.A04
            java.lang.Object r5 = r0.A02
            X.0vk r5 = (X.C18090vk) r5
            java.lang.Object r3 = r0.A03
            X.0vk r3 = (X.C18090vk) r3
            X.C18070vi.A0k(r5, r3)
            com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository r2 = r4.A03
            X.0wl r1 = r2.A01
            r6 = 0
            com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository$fetchAvatarAREffect$1 r0 = new com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository$fetchAvatarAREffect$1
            r0.<init>(r2, r7, r6)
            java.lang.Object r1 = X.AnonymousClass4GT.A00(r1, r0)
            X.9Mb r1 = (X.C180319Mb) r1
            boolean r0 = r1 instanceof X.AnonymousClass971
            if (r0 == 0) goto L_0x0282
            r5.invoke()
            X.971 r1 = (X.AnonymousClass971) r1
            X.5aj r3 = r1.A00
            X.6uQ r0 = r4.A05
            X.732 r1 = r0.A00()
            X.4D9 r8 = X.AnonymousClass4D9.LIVE_EDITING
            X.4DE r7 = X.AnonymousClass4DE.FUN_EFFECT
            X.5cD r0 = r3.BUq()
            java.lang.Float r10 = r0.BUT()
            r5 = 0
            if (r1 == 0) goto L_0x0252
            X.77e r6 = r1.A04
            X.77e r5 = r1.A02
        L_0x0252:
            X.B4o r1 = r4.A01
            X.ClW r0 = r4.A00
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            X.9sH r2 = new X.9sH
            r2.<init>(r1, r6, r5, r0)
            X.CWg r1 = r4.A02
            r0 = 0
            r12 = 1
            X.A1g r9 = new X.A1g
            r9.<init>(r2, r1, r0)
            java.lang.String r11 = "AvatarLiveEditingArEffectController"
            X.4hD r6 = new X.4hD
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.AMA r1 = new X.AMA
            r1.<init>(r12)
            X.CZL r0 = r4.A04
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.9so r0 = (X.C195109so) r0
            r0.A00(r3, r1, r6)
            return
        L_0x0282:
            boolean r0 = r1 instanceof X.AnonymousClass970
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "AvatarLiveEditingArEffectController/AR Effect download failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3.invoke()
            return
        L_0x028f:
            java.lang.Object r4 = r0.A01
            X.1O4 r4 = (X.AnonymousClass1O4) r4
            java.lang.Object r2 = r0.A02
            X.1O5 r2 = (X.AnonymousClass1O5) r2
            java.lang.String r3 = r0.A04
            java.lang.Object r1 = r0.A03
            X.1ca r1 = (X.C29621ca) r1
            java.lang.String r0 = "type"
            r5 = 0
            java.lang.String r6 = r1.A0Q(r0, r5)
            java.lang.String r0 = "result"
            boolean r0 = r0.equals(r6)     // Catch:{ 1O9 -> 0x02e1 }
            if (r0 == 0) goto L_0x02b6
            r2.C7Z(r1, r3)     // Catch:{ 1O9 -> 0x02e1 }
        L_0x02af:
            X.1Nx r0 = r4.A05     // Catch:{ 1O9 -> 0x02e1 }
            r0.A03(r3, r5)     // Catch:{ 1O9 -> 0x02e1 }
            goto L_0x13f8
        L_0x02b6:
            java.lang.String r0 = "error"
            boolean r0 = r0.equals(r6)     // Catch:{ 1O9 -> 0x02e1 }
            if (r0 == 0) goto L_0x02c2
            r2.Bt9(r1, r3)     // Catch:{ 1O9 -> 0x02e1 }
            goto L_0x02af
        L_0x02c2:
            X.190 r2 = r4.A03     // Catch:{ 1O9 -> 0x02e1 }
            java.lang.String r1 = "unexpected_recv_iq_type"
            r0 = 0
            r2.A0G(r1, r6, r0)     // Catch:{ 1O9 -> 0x02e1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1O9 -> 0x02e1 }
            java.lang.String r0 = "Unexpected type="
            r1.append(r0)     // Catch:{ 1O9 -> 0x02e1 }
            r1.append(r6)     // Catch:{ 1O9 -> 0x02e1 }
            java.lang.String r0 = " for iq="
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ 1O9 -> 0x02e1 }
            r0 = 0
            X.C17960vV.A0F(r0, r1)     // Catch:{ 1O9 -> 0x02e1 }
            goto L_0x02af
        L_0x02e1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "XmppIncomingMessageRouter/handleIncomingIqResponse/corrupt-stream-error iqId="
            r1.append(r0)
            X.C17890vO.A13(r3, r1, r2)
            X.190 r1 = r4.A03
            java.lang.String r0 = "XmppIncomingMessageRouter:iq"
            r1.A0D(r2, r0)
            boolean r0 = r2 instanceof X.AnonymousClass1UI
            if (r0 == 0) goto L_0x0310
            java.lang.Integer r1 = X.AnonymousClass00R.A01
        L_0x02fb:
            X.1Nx r0 = r4.A05
            r0.A03(r3, r1)
            boolean r0 = r2.A02()
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r2.getMessage()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x0310:
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            goto L_0x02fb
        L_0x0313:
            java.lang.Object r1 = r0.A01
            X.4rF r1 = (X.C98494rF) r1
            java.lang.Object r4 = r0.A02
            java.util.AbstractCollection r4 = (java.util.AbstractCollection) r4
            java.lang.Object r3 = r0.A03
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r3 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r3
            java.lang.String r9 = r0.A04
            X.C18070vi.A0h(r1, r4)
            r0 = 3
            X.C18070vi.A0d(r9, r0)
            java.lang.Object r0 = r1.element
            if (r0 == 0) goto L_0x0360
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0360
            X.1FL r5 = r3.A1B()
            if (r5 == 0) goto L_0x0029
            X.733 r7 = r3.A05
            if (r7 == 0) goto L_0x13f9
            java.lang.Object r8 = r1.element
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.String r1 = ";"
            X.B29 r0 = X.B29.A00
            java.lang.String r2 = X.C29431cG.A0h(r1, r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sms:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            android.net.Uri r6 = android.net.Uri.parse(r0)
            X.C18070vi.A0X(r6)
            long r10 = X.AnonymousClass8BR.A06(r4)
            X.AnonymousClass733.A01(r5, r6, r7, r8, r9, r10)
        L_0x0360:
            r3.A29()
            return
        L_0x0364:
            java.lang.Object r9 = r0.A01
            X.1BI r9 = (X.AnonymousClass1BI) r9
            java.lang.Object r8 = r0.A02
            com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver r8 = (com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver) r8
            java.lang.Object r2 = r0.A03
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.String r7 = r0.A04
            if (r9 == 0) goto L_0x0029
            X.1PQ r1 = r8.A08
            if (r1 == 0) goto L_0x1402
            X.11P r0 = r8.A02
            if (r0 == 0) goto L_0x13ff
            long r3 = X.AnonymousClass11P.A01(r0)
            long r5 = r2.A0x
            if (r7 != 0) goto L_0x0386
            java.lang.String r7 = ""
        L_0x0386:
            X.1PP r0 = r1.A02
            X.205 r2 = X.C17880vN.A0Z(r9, r0)
            r0 = 164(0xa4, float:2.3E-43)
            X.2MF r1 = new X.2MF
            r1.<init>(r2, r0, r3)
            r1.A00 = r5
            r1.A01 = r7
            X.121 r0 = r8.A06
            if (r0 == 0) goto L_0x13fc
            r0.BBY(r1)
            return
        L_0x039f:
            java.lang.Object r4 = r0.A01
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r4 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r4
            java.lang.Object r2 = r0.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.String r1 = r0.A04
            java.lang.Object r3 = r0.A03
            X.206 r1 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel.A00(r4, r2, r1)
            if (r1 == 0) goto L_0x0029
            com.whatsapp.jid.UserJid r0 = r1.A0I()
            java.lang.String r6 = X.C22971Dz.A06(r0)
            X.9XF r5 = r4.A02
            boolean r0 = r1 instanceof X.C439421n
            if (r0 == 0) goto L_0x03e3
            r0 = r1
            X.21n r0 = (X.C439421n) r0
            X.2k6 r0 = r0.BaE()
            java.lang.String r7 = r0.A05
        L_0x03c8:
            X.9j9 r2 = r4.A04
            long r0 = r1.A0x
            java.lang.Integer r0 = r2.A00(r0)
            boolean r8 = X.AnonymousClass000.A1W(r0)
            java.lang.Integer r4 = X.C17880vN.A0j()
            X.3wE r1 = X.C79903wE.A00
            r0 = 2
            if (r3 != r1) goto L_0x03de
            r0 = 1
        L_0x03de:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0428
        L_0x03e3:
            r7 = 0
            goto L_0x03c8
        L_0x03e5:
            java.lang.Object r4 = r0.A01
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r4 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r4
            java.lang.Object r2 = r0.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.String r1 = r0.A04
            java.lang.Object r3 = r0.A03
            X.206 r1 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel.A00(r4, r2, r1)
            if (r1 == 0) goto L_0x0029
            com.whatsapp.jid.UserJid r0 = r1.A0I()
            java.lang.String r6 = X.C22971Dz.A06(r0)
            X.9XF r5 = r4.A02
            boolean r0 = r1 instanceof X.C439421n
            if (r0 == 0) goto L_0x0444
            r0 = r1
            X.21n r0 = (X.C439421n) r0
            X.2k6 r0 = r0.BaE()
            java.lang.String r7 = r0.A05
        L_0x040e:
            X.9j9 r2 = r4.A04
            long r0 = r1.A0x
            java.lang.Integer r0 = r2.A00(r0)
            boolean r8 = X.AnonymousClass000.A1W(r0)
            r1 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            X.3wE r0 = X.C79903wE.A00
            if (r3 == r0) goto L_0x0424
            r1 = 2
        L_0x0424:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x0428:
            r0 = 0
            X.8rM r1 = new X.8rM
            r1.<init>()
            r1.A05 = r6
            r1.A02 = r4
            r1.A03 = r2
            r1.A01 = r0
            r1.A06 = r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1.A00 = r0
            X.18K r0 = r5.A00
            r0.CC4(r1)
            return
        L_0x0444:
            r7 = 0
            goto L_0x040e
        L_0x0446:
            java.lang.Object r5 = r0.A01
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r1 = r0.A02
            X.206 r1 = (X.AnonymousClass206) r1
            java.lang.String r4 = r0.A04
            java.lang.Object r3 = r0.A03
            X.5ZJ r3 = (X.AnonymousClass5ZJ) r3
            X.205 r2 = r1.A0v
            r1 = 2131436009(0x7f0b21e9, float:1.8493876E38)
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            java.lang.Object r0 = r5.getTag(r1)
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0029
            r5.setText(r4)
            r3.BlI()
            return
        L_0x0470:
            java.lang.Object r9 = r0.A01
            X.1lj r9 = (X.C35151lj) r9
            java.lang.Object r13 = r0.A02
            java.util.Set r13 = (java.util.Set) r13
            java.lang.String r15 = r0.A04
            java.lang.Object r10 = r0.A03
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10
            int r0 = r13.size()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            java.util.ArrayList r8 = X.C17880vN.A0z(r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            java.util.HashMap r18 = X.C17880vN.A11()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            java.util.Iterator r17 = r13.iterator()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r7 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x0495:
            boolean r0 = r17.hasNext()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            if (r0 == 0) goto L_0x05c3
            java.lang.String r0 = X.C17880vN.A0v(r17)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            byte[] r1 = X.AnonymousClass8BT.A1a(r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.8ZA r0 = X.AnonymousClass8ZA.DEFAULT_INSTANCE     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.Bm6 r0 = X.C23577Bm6.A07(r0, r1)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.8ZA r0 = (X.AnonymousClass8ZA) r0     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            java.lang.String r6 = r0.url_     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            if (r6 != 0) goto L_0x04b5
            java.lang.String r0 = "NonMessageDataRequestManager/handleLinkPreviewRequest no url in request"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            goto L_0x0495
        L_0x04b5:
            boolean r12 = r0.includeHqThumbnail_     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.1gU r4 = r9.A0F     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r0 = 1
            java.util.ArrayList r0 = r4.A04(r6, r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            if (r0 == 0) goto L_0x052c
            java.lang.String r5 = X.C108945cZ.A1H(r0, r7)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
        L_0x04c4:
            X.181 r3 = r9.A02     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.0vb r14 = r9.A08     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r11 = 0
            if (r5 == 0) goto L_0x04e5
            java.lang.String r2 = X.C32011gU.A00(r5)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            if (r0 != 0) goto L_0x04e5
            X.7Fe r0 = X.C20016A3i.A00(r2)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r16 = 0
            if (r0 == 0) goto L_0x04ef
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            android.util.Pair r11 = X.C108945cZ.A0N(r0, r1)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
        L_0x04e5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            java.lang.String r0 = "NonMessageDataRequestManager/handleLinkPreviewRequest load result="
            r1.append(r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            goto L_0x052e
        L_0x04ef:
            X.0ve r1 = r9.A0E     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.7Fe r0 = new X.7Fe     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r0.<init>(r3, r1, r4, r2)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r3 = 5
            android.net.TrafficStats.setThreadStatsTag(r3)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r4 = 1
            java.lang.String r3 = r14.A05()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0514 }
            r0.A0J(r1, r3)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0514 }
            boolean r3 = r0.A0K()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0514 }
            if (r3 == 0) goto L_0x0510
            X.C20016A3i.A01(r0, r2)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0514 }
            r0.A0H(r1)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0514 }
            r16 = 1
        L_0x0510:
            r0.A0E()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0514 }
            goto L_0x051e
        L_0x0514:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x140c }
            java.lang.String r1 = "WebPageLoader/loadPage/ex="
            X.C17900vP.A0X(r3, r1, r2)     // Catch:{ all -> 0x140c }
        L_0x051e:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            if (r16 == 0) goto L_0x04e5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            android.util.Pair r11 = X.C108945cZ.A0N(r0, r1)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            goto L_0x04e5
        L_0x052c:
            r5 = 0
            goto L_0x04c4
        L_0x052e:
            boolean r0 = X.AnonymousClass000.A1W(r11)
            X.C17900vP.A0r(r1, r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.Af0 r4 = new X.Af0     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r4.<init>()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r8.add(r4)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r0 = 0
            if (r11 != 0) goto L_0x0541
            goto L_0x05b5
        L_0x0541:
            java.lang.Object r3 = r11.first     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.7Fe r3 = (X.C143887Fe) r3     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            java.lang.Object r1 = r11.second     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            boolean r1 = X.AnonymousClass000.A1Y(r1)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            if (r1 == 0) goto L_0x0550
            int r20 = r20 + 1
            goto L_0x0552
        L_0x0550:
            int r21 = r21 + 1
        L_0x0552:
            byte[] r1 = r3.A0K     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            if (r1 == 0) goto L_0x05a9
            if (r12 == 0) goto L_0x05a9
            X.0ve r2 = r9.A0E     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r11 = 3665(0xe51, float:5.136E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            boolean r1 = X.C18020vd.A05(r1, r2, r11)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            if (r1 == 0) goto L_0x05a9
            X.1T6 r11 = r9.A0G     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.AVQ r1 = new X.AVQ     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r23 = r1
            r24 = r3
            r25 = r4
            r26 = r9
            r27 = r6
            r28 = r5
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.2Qz r0 = X.C49572Qz.WEB_THUMBNAIL     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r11.A0G(r3, r1, r0, r7)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.10I r12 = r9.A0K     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r0 = 3668(0xe54, float:5.14E-42)
            long r0 = X.AnonymousClass8BR.A05(r2, r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            java.lang.String r2 = "NonMessageDataRequestManager/handleLinkPreviewRequest/"
            r11.append(r2)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r11.append(r15)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r11.toString()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r28 = 1
            X.7Pw r2 = new X.7Pw     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r23 = r2
            r24 = r4
            r25 = r3
            r26 = r6
            r27 = r5
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r12.CGv(r2, r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            goto L_0x0495
        L_0x05a9:
            X.9KN r1 = X.AnonymousClass9KN.SUCCESS     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.9yh r0 = X.C198659yh.A00(r3, r0, r6, r5)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.9dA r2 = new X.9dA     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r2.<init>(r0, r1, r6)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            goto L_0x05be
        L_0x05b5:
            int r22 = r22 + 1
            X.9KN r1 = X.AnonymousClass9KN.NOT_FOUND     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.9dA r2 = new X.9dA     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r2.<init>(r0, r1, r6)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
        L_0x05be:
            r4.A0B(r2)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            goto L_0x0495
        L_0x05c3:
            boolean r0 = r8.isEmpty()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            if (r0 != 0) goto L_0x0029
            X.8fc r1 = new X.8fc     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r1.<init>(r8)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            X.Aeu r0 = new X.Aeu     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r19 = r13
            r16 = r10
            r17 = r15
            r14 = r0
            r15 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            r1.A09(r0)     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            goto L_0x1411
        L_0x05e0:
            java.lang.Object r1 = r0.A01
            X.AfJ r1 = (X.C21148AfJ) r1
            java.lang.Object r4 = r0.A02
            X.A45 r4 = (X.A45) r4
            java.lang.String r3 = r0.A04
            java.lang.Object r2 = r0.A03
            java.util.Map r2 = (java.util.Map) r2
            X.9k7 r1 = r1.A01
            java.lang.String r0 = "address_message_validate"
            X.9sN r0 = r1.A00(r4, r0)
            r0.A02(r3, r2)
            return
        L_0x05fa:
            java.lang.Object r7 = r0.A01
            X.6xC r7 = (X.C138506xC) r7
            java.lang.Object r6 = r0.A02
            X.ANI r6 = (X.ANI) r6
            java.lang.String r5 = r0.A04
            java.lang.Object r4 = r0.A03
            X.BBi r4 = (X.C22525BBi) r4
            r3 = 0
            X.163 r2 = r7.A04
            X.C18070vi.A0X(r2)
            X.161 r1 = r7.A03
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.shops.graphql.ShopMetaDataProcessor"
            X.C18070vi.A0z(r1, r0)
            int r0 = r7.A00
            if (r0 != 0) goto L_0x062a
            java.lang.Object r1 = r1.A00
            X.77H r1 = (X.AnonymousClass77H) r1
            if (r1 == 0) goto L_0x062a
            r1.A00 = r5
            r4.BuL(r1)
            X.00z r0 = r6.A01
            r0.A08(r5, r1)
            return
        L_0x062a:
            java.util.Map r0 = r2.A00
            r6.A01(r4, r5, r0, r3)
            return
        L_0x0630:
            java.lang.Object r2 = r0.A01
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r7 = r0.A02
            X.ANI r7 = (X.ANI) r7
            java.lang.String r6 = r0.A04
            java.lang.Object r5 = r0.A03
            X.BBi r5 = (X.C22525BBi) r5
            r4 = 1
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)
            java.util.HashMap r3 = X.C17880vN.A11()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to fetch metadata: "
            r1.append(r0)
            java.lang.String r0 = r2.getLocalizedMessage()
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.71m r0 = new X.71m
            r0.<init>((java.lang.String) r2)
            r3.put(r1, r0)
            r7.A01(r5, r6, r3, r4)
            return
        L_0x0668:
            java.lang.Object r3 = r0.A01
            X.1o3 r3 = (X.C36531o3) r3
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A02
            X.1FL r1 = (X.AnonymousClass1FL) r1
            java.lang.Object r0 = r0.A03
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r3.A01(r1, r2)
            r0.run()
            return
        L_0x067d:
            java.lang.Object r4 = r0.A01
            X.5nE r4 = (X.C113525nE) r4
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r5 = r0.A03
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.String r9 = r0.A04
            r2 = 0
            r0 = 2131894919(0x7f122287, float:1.9424656E38)
            java.lang.String r7 = r3.getString(r0)
            r0 = 2131894920(0x7f122288, float:1.9424658E38)
            java.lang.String r8 = r3.getString(r0)
            r11 = 2131102342(0x7f060a86, float:1.781712E38)
            X.C18070vi.A0b(r5)
            r1 = 2131894913(0x7f122281, float:1.9424644E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r10 = X.AnonymousClass3Ma.A10(r3, r9, r0, r2, r1)
            r6 = 0
            r4.A0B(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x06b0:
            java.lang.Object r4 = r0.A01
            X.6nJ r4 = (X.C132666nJ) r4
            java.lang.String r3 = r0.A04
            java.lang.Object r2 = r0.A02
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.Object r1 = r0.A03
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            X.00H r0 = r4.A01
            java.lang.Object r0 = r0.get()
            X.9gN r0 = (X.C187789gN) r0
            X.0vl r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.4VT r0 = (X.AnonymousClass4VT) r0
            r0.A01(r1, r1, r2, r3)
            return
        L_0x06d2:
            java.lang.Object r4 = r0.A01
            X.96o r4 = (X.AnonymousClass96o) r4
            java.lang.Object r3 = r0.A02
            java.lang.String r2 = r0.A04
            java.lang.Object r5 = r0.A03
            java.util.Map r5 = (java.util.Map) r5
            r0 = 0
            X.AnonymousClass3Ma.A1O(r4, r0, r5)
            java.lang.Object r1 = r4.A05
            monitor-enter(r1)
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x11d1 }
            r4.A03 = r0     // Catch:{ all -> 0x11d1 }
            if (r3 == 0) goto L_0x06f0
            r0.add(r3)     // Catch:{ all -> 0x11d1 }
        L_0x06f0:
            java.lang.String r0 = "all_options"
            boolean r18 = X.C18070vi.A18(r2, r0)     // Catch:{ all -> 0x11d1 }
            if (r18 == 0) goto L_0x0738
            X.22H r0 = r4.A01()     // Catch:{ all -> 0x11d1 }
            X.205 r0 = r0.A0v     // Catch:{ all -> 0x11d1 }
            X.1BI r0 = r0.A00     // Catch:{ all -> 0x11d1 }
            if (r0 == 0) goto L_0x0738
            X.22H r0 = r4.A01()     // Catch:{ all -> 0x11d1 }
            java.util.List r2 = r0.A07     // Catch:{ all -> 0x11d1 }
            int r0 = r2.size()     // Catch:{ all -> 0x11d1 }
            if (r0 > 0) goto L_0x070f
            r2 = 0
        L_0x070f:
            r7 = 0
            if (r2 == 0) goto L_0x0727
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x11d1 }
            r6 = 0
        L_0x0717:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x11d1 }
            if (r0 == 0) goto L_0x0728
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x11d1 }
            X.A18 r0 = (X.A18) r0     // Catch:{ all -> 0x11d1 }
            int r0 = r0.A00     // Catch:{ all -> 0x11d1 }
            int r6 = r6 + r0
            goto L_0x0717
        L_0x0727:
            r6 = 0
        L_0x0728:
            java.util.List r3 = r4.A03     // Catch:{ all -> 0x11d1 }
            X.22H r0 = r4.A01()     // Catch:{ all -> 0x11d1 }
            java.lang.String r2 = r0.A05     // Catch:{ all -> 0x11d1 }
            X.Aax r0 = new X.Aax     // Catch:{ all -> 0x11d1 }
            r0.<init>(r7, r6, r2, r7)     // Catch:{ all -> 0x11d1 }
            r3.add(r0)     // Catch:{ all -> 0x11d1 }
        L_0x0738:
            X.22H r0 = r4.A01()     // Catch:{ all -> 0x11d1 }
            java.util.List r0 = r0.A07     // Catch:{ all -> 0x11d1 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x11d1 }
            int r14 = X.C19996A2j.A00(r0)     // Catch:{ all -> 0x11d1 }
            X.22H r0 = r4.A01()     // Catch:{ all -> 0x11d1 }
            java.util.List r2 = r0.A07     // Catch:{ all -> 0x11d1 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x11d1 }
            r0 = 41
            java.util.List r0 = X.C21486Akr.A00(r2, r0)     // Catch:{ all -> 0x11d1 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x11d1 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x11d1 }
        L_0x075c:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x11d1 }
            if (r0 == 0) goto L_0x0775
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x11d1 }
            r0 = r2
            X.A18 r0 = (X.A18) r0     // Catch:{ all -> 0x11d1 }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x11d1 }
            boolean r0 = r5.containsKey(r0)     // Catch:{ all -> 0x11d1 }
            if (r0 == 0) goto L_0x075c
            r6.add(r2)     // Catch:{ all -> 0x11d1 }
            goto L_0x075c
        L_0x0775:
            java.util.Iterator r17 = r6.iterator()     // Catch:{ all -> 0x11d1 }
        L_0x0779:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x11d1 }
            if (r0 == 0) goto L_0x08c6
            java.lang.Object r3 = r17.next()     // Catch:{ all -> 0x11d1 }
            X.A18 r3 = (X.A18) r3     // Catch:{ all -> 0x11d1 }
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x11d1 }
            r28 = r18 ^ 1
            java.util.List r10 = r4.A03     // Catch:{ all -> 0x11d1 }
            long r6 = r3.A01     // Catch:{ all -> 0x11d1 }
            java.lang.String r9 = r3.A04     // Catch:{ all -> 0x11d1 }
            X.C18070vi.A0X(r9)     // Catch:{ all -> 0x11d1 }
            int r8 = r3.A00     // Catch:{ all -> 0x11d1 }
            int r2 = r4.A00     // Catch:{ all -> 0x11d1 }
            if (r14 != r8) goto L_0x079d
            r27 = 1
            if (r8 > 0) goto L_0x079f
        L_0x079d:
            r27 = 0
        L_0x079f:
            X.Aay r0 = new X.Aay     // Catch:{ all -> 0x11d1 }
            r21 = r0
            r22 = r9
            r23 = r8
            r24 = r2
            r25 = r6
            r21.<init>(r22, r23, r24, r25, r27, r28)     // Catch:{ all -> 0x11d1 }
            r10.add(r0)     // Catch:{ all -> 0x11d1 }
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x11d1 }
            java.util.List r16 = X.AnonymousClass8BS.A0t(r0, r5)     // Catch:{ all -> 0x11d1 }
            if (r16 == 0) goto L_0x0779
            long r6 = r3.A01     // Catch:{ all -> 0x11d1 }
            int r2 = r3.A00     // Catch:{ all -> 0x11d1 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x11d1 }
            java.util.Map r8 = r4.A05     // Catch:{ all -> 0x11d1 }
            java.lang.Long r11 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x11d1 }
            java.util.List r8 = X.AnonymousClass8BS.A0t(r11, r8)     // Catch:{ all -> 0x11d1 }
            if (r8 == 0) goto L_0x07d0
            r0.addAll(r8)     // Catch:{ all -> 0x11d1 }
        L_0x07d0:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x11d1 }
            java.util.Iterator r15 = r16.iterator()     // Catch:{ all -> 0x11d1 }
        L_0x07d8:
            boolean r9 = r15.hasNext()     // Catch:{ all -> 0x11d1 }
            if (r9 == 0) goto L_0x080f
            java.lang.Object r9 = r15.next()     // Catch:{ all -> 0x11d1 }
            X.9se r9 = (X.C195009se) r9     // Catch:{ all -> 0x11d1 }
            long r12 = r9.A02     // Catch:{ all -> 0x11d1 }
            long r25 = X.C17880vN.A04(r12)     // Catch:{ all -> 0x11d1 }
            X.1E7 r10 = r9.A00     // Catch:{ all -> 0x11d1 }
            if (r10 == 0) goto L_0x07d8
            java.lang.CharSequence r9 = r9.A01     // Catch:{ all -> 0x11d1 }
            if (r9 == 0) goto L_0x07f8
            java.lang.String r23 = r9.toString()     // Catch:{ all -> 0x11d1 }
            if (r23 != 0) goto L_0x07fa
        L_0x07f8:
            java.lang.String r23 = ""
        L_0x07fa:
            r21 = 0
            java.lang.String r24 = ""
            r27 = 0
            X.Aaz r9 = new X.Aaz     // Catch:{ all -> 0x11d1 }
            r20 = r10
            r22 = r11
            r19 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r27)     // Catch:{ all -> 0x11d1 }
            r8.add(r9)     // Catch:{ all -> 0x11d1 }
            goto L_0x07d8
        L_0x080f:
            r0.addAll(r8)     // Catch:{ all -> 0x11d1 }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x11d1 }
            java.util.Iterator r13 = r16.iterator()     // Catch:{ all -> 0x11d1 }
        L_0x081a:
            boolean r9 = r13.hasNext()     // Catch:{ all -> 0x11d1 }
            if (r9 == 0) goto L_0x0846
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x11d1 }
            X.9se r11 = (X.C195009se) r11     // Catch:{ all -> 0x11d1 }
            long r9 = r11.A02     // Catch:{ all -> 0x11d1 }
            long r21 = X.C17880vN.A04(r9)     // Catch:{ all -> 0x11d1 }
            X.1E7 r9 = r11.A00     // Catch:{ all -> 0x11d1 }
            if (r9 != 0) goto L_0x081a
            X.1E2 r9 = r11.A03     // Catch:{ all -> 0x11d1 }
            X.1E7 r10 = new X.1E7     // Catch:{ all -> 0x11d1 }
            r10.<init>(r9)     // Catch:{ all -> 0x11d1 }
            X.Aaw r9 = new X.Aaw     // Catch:{ all -> 0x11d1 }
            r19 = r9
            r20 = r10
            r23 = r6
            r19.<init>(r20, r21, r23)     // Catch:{ all -> 0x11d1 }
            r12.add(r9)     // Catch:{ all -> 0x11d1 }
            goto L_0x081a
        L_0x0846:
            r0.addAll(r12)     // Catch:{ all -> 0x11d1 }
            r9 = 5
            if (r28 != 0) goto L_0x0851
            r10 = 5
            if (r9 <= r2) goto L_0x0850
            r10 = r2
        L_0x0850:
            r2 = r10
        L_0x0851:
            int r11 = r0.size()     // Catch:{ all -> 0x11d1 }
            r10 = 0
            if (r2 >= r11) goto L_0x085f
            if (r2 >= r10) goto L_0x085b
            r2 = 0
        L_0x085b:
            java.util.List r0 = r0.subList(r10, r2)     // Catch:{ all -> 0x11d1 }
        L_0x085f:
            boolean r2 = X.AnonymousClass000.A1a(r8)     // Catch:{ all -> 0x11d1 }
            if (r2 == 0) goto L_0x086e
            boolean r2 = X.AnonymousClass000.A1a(r12)     // Catch:{ all -> 0x11d1 }
            if (r2 == 0) goto L_0x086e
            r13 = 1
            if (r28 != 0) goto L_0x086f
        L_0x086e:
            r13 = 0
        L_0x086f:
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x11d1 }
            r8 = 0
        L_0x0874:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x11d1 }
            if (r0 == 0) goto L_0x08b1
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x11d1 }
            X.BCe r11 = (X.C22547BCe) r11     // Catch:{ all -> 0x11d1 }
            if (r13 == 0) goto L_0x08ab
            if (r10 != 0) goto L_0x0896
            int r2 = r11.Bbd()     // Catch:{ all -> 0x11d1 }
            r0 = 2
            if (r2 != r0) goto L_0x0896
            java.util.List r2 = r4.A03     // Catch:{ all -> 0x11d1 }
            X.Aau r0 = new X.Aau     // Catch:{ all -> 0x11d1 }
            r0.<init>(r6, r9)     // Catch:{ all -> 0x11d1 }
            r2.add(r0)     // Catch:{ all -> 0x11d1 }
            r10 = 1
        L_0x0896:
            if (r8 != 0) goto L_0x08ab
            int r2 = r11.Bbd()     // Catch:{ all -> 0x11d1 }
            r0 = 4
            if (r2 != r0) goto L_0x08ab
            java.util.List r8 = r4.A03     // Catch:{ all -> 0x11d1 }
            r2 = 6
            X.Aau r0 = new X.Aau     // Catch:{ all -> 0x11d1 }
            r0.<init>(r6, r2)     // Catch:{ all -> 0x11d1 }
            r8.add(r0)     // Catch:{ all -> 0x11d1 }
            r8 = 1
        L_0x08ab:
            java.util.List r0 = r4.A03     // Catch:{ all -> 0x11d1 }
            r0.add(r11)     // Catch:{ all -> 0x11d1 }
            goto L_0x0874
        L_0x08b1:
            if (r18 == 0) goto L_0x0779
            int r0 = r3.A00     // Catch:{ all -> 0x11d1 }
            if (r0 <= r9) goto L_0x0779
            java.util.List r7 = r4.A03     // Catch:{ all -> 0x11d1 }
            long r2 = r3.A01     // Catch:{ all -> 0x11d1 }
            r6 = -1
            X.Aav r0 = new X.Aav     // Catch:{ all -> 0x11d1 }
            r0.<init>(r2, r6)     // Catch:{ all -> 0x11d1 }
            r7.add(r0)     // Catch:{ all -> 0x11d1 }
            goto L_0x0779
        L_0x08c6:
            X.1DT r2 = r4.A06     // Catch:{ all -> 0x11d1 }
            java.util.List r0 = r4.A03     // Catch:{ all -> 0x11d1 }
            java.util.ArrayList r0 = X.C29431cG.A0m(r0)     // Catch:{ all -> 0x11d1 }
            r2.A0E(r0)     // Catch:{ all -> 0x11d1 }
            goto L_0x11cf
        L_0x08d3:
            java.lang.Object r1 = r0.A01
            X.9dd r1 = (X.C186089dd) r1
            java.lang.Object r5 = r0.A02
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r5 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r5
            java.lang.String r2 = r0.A04
            java.lang.Object r4 = r0.A03
            X.206 r4 = (X.AnonymousClass206) r4
            X.8zf r1 = (X.C176028zf) r1
            java.util.List r1 = r1.A01
            if (r1 == 0) goto L_0x08f4
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x08f4
            X.1QR r0 = r5.A09
            if (r0 == 0) goto L_0x1405
            r0.A0g(r1)
        L_0x08f4:
            X.Aa6 r0 = r5.A4b()
            X.8Gd r0 = r0.A06
            X.BCp r0 = r0.A08
            X.AW0 r3 = r0.BL7(r2)
            X.122 r0 = r5.A07
            if (r0 == 0) goto L_0x0914
            r0.CQw(r4)
            X.1KB r2 = r5.A05
            r1 = 39
            X.Ak2 r0 = new X.Ak2
            r0.<init>(r5, r4, r3, r1)
            r2.A0J(r0)
            return
        L_0x0914:
            java.lang.String r0 = "coreMessageStore"
            goto L_0x1407
        L_0x0918:
            java.lang.Object r2 = r0.A01
            X.ARl r2 = (X.C20601ARl) r2
            java.lang.Object r1 = r0.A02
            X.ARR r1 = (X.ARR) r1
            java.lang.Object r4 = r0.A03
            X.ADQ r4 = (X.ADQ) r4
            java.lang.String r3 = r0.A04
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r2 = r2.A01
            X.1KN r1 = r1.A02
            java.lang.String r0 = "p2m_context"
            com.whatsapp.payments.ui.BrazilPaymentActivity.A0x(r1, r2, r4, r0, r3)
            return
        L_0x0930:
            java.lang.Object r3 = r0.A01
            X.9yw r3 = (X.C198809yw) r3
            java.lang.Object r2 = r0.A02
            X.BDs r2 = (X.BDs) r2
            java.lang.String r10 = r0.A04
            java.lang.Object r9 = r0.A03
            X.0ve r7 = r3.A09
            X.1Ln r4 = r3.A04
            com.whatsapp.jid.UserJid r1 = r3.A0A
            r0 = 0
            com.whatsapp.jid.UserJid r5 = X.C60432o1.A01(r0, r4, r7, r1, r0)
            if (r5 != 0) goto L_0x095e
            java.lang.String r1 = "PaymentPrecheckAction"
            java.lang.String r0 = "lidCompatibleJid is null"
            java.lang.String r1 = X.AnonymousClass1QE.A01(r1, r0)
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.A7B r0 = X.A7B.A00()
            r0.A07 = r1
            r2.BtH(r0)
            return
        L_0x095e:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.String r1 = "action"
            java.lang.String r0 = "pay-precheck"
            X.C17890vO.A11(r1, r0, r6)
            java.lang.String r4 = "country"
            java.lang.String r8 = "BR"
            X.C17890vO.A11(r4, r8, r6)
            java.lang.String r1 = "credential-id"
            java.lang.String r0 = r3.A0S
            X.C17890vO.A11(r1, r0, r6)
            java.lang.String r0 = "nonce"
            X.C17890vO.A11(r0, r10, r6)
            java.lang.String r0 = "receiver"
            X.C17890vO.A0n(r5, r0, r6)
            X.1ek r0 = r3.A0Q
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = "device-id"
            X.C17890vO.A11(r0, r1, r6)
            java.lang.String r0 = "transaction-type"
            java.lang.String r1 = r3.A0V
            X.C17890vO.A11(r0, r1, r6)
            r0 = 1746(0x6d2, float:2.447E-42)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r7, r0)
            r14 = 1
            if (r0 == 0) goto L_0x09aa
            java.lang.String r0 = "p2m"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0ab8
            X.AEo r0 = r3.A08
            if (r0 == 0) goto L_0x0ab8
        L_0x09aa:
            X.2r1 r0 = r3.A0M
            if (r0 == 0) goto L_0x09b5
            long r0 = r0.A01
            java.lang.String r10 = "offer_id"
            X.AnonymousClass8BT.A1U(r10, r6, r0)
        L_0x09b5:
            java.lang.String r1 = r3.A0T
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09c2
            java.lang.String r0 = "payment-rails"
            X.C17890vO.A11(r0, r1, r6)
        L_0x09c2:
            java.lang.String r1 = r3.A0U
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x09cf
            java.lang.String r0 = "request-id"
            X.C17890vO.A11(r0, r1, r6)
        L_0x09cf:
            X.1QS r0 = r3.A0E
            X.2is r1 = r0.A04(r8)
            if (r1 == 0) goto L_0x0ab5
            X.BDa r0 = r3.A05
            X.ARR r0 = (X.ARR) r0
            java.lang.String r0 = X.AnonymousClass8BU.A0n(r0)
            X.BD1 r13 = r1.A00(r0)
        L_0x09e3:
            r10 = 0
            X.1MD[] r8 = new X.AnonymousClass1MD[r10]
            X.BDa r0 = r3.A05
            X.1ca r1 = r13.BV4(r0)
            java.lang.String r0 = "amount"
            X.1ca r12 = new X.1ca
            r12.<init>((X.C29621ca) r1, (java.lang.String) r0, (X.AnonymousClass1MD[]) r8)
            X.1MD[] r11 = new X.AnonymousClass1MD[r10]
            X.BDa r0 = r3.A06
            X.1ca r1 = r13.BV4(r0)
            java.lang.String r0 = "total-amount"
            X.1ca r8 = new X.1ca
            r8.<init>((X.C29621ca) r1, (java.lang.String) r0, (X.AnonymousClass1MD[]) r11)
            r0 = 3
            X.1ca[] r1 = new X.C29621ca[r0]
            r1[r10] = r9
            r1[r14] = r12
            r0 = 2
            java.util.List r0 = X.AnonymousClass8BR.A15(r8, r1, r0)
            java.util.ArrayList r9 = X.C17880vN.A10(r0)
            X.AEo r1 = r3.A08
            if (r1 == 0) goto L_0x0ae1
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.lang.String r8 = "id"
            java.lang.String r0 = r1.A01
            X.C17890vO.A11(r8, r0, r11)
            java.lang.String r8 = "message_id"
            java.lang.String r0 = r1.A02
            X.C17890vO.A11(r8, r0, r11)
            java.lang.String r8 = r1.A04
            if (r8 == 0) goto L_0x0a37
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0a37
            java.lang.String r0 = "payment_config_id"
            X.C17890vO.A11(r0, r8, r11)
        L_0x0a37:
            java.util.List r12 = r1.A05
            java.lang.String r8 = "order"
            if (r12 == 0) goto L_0x0ad6
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0ad6
            java.lang.String r0 = "physical-goods"
            java.lang.String r1 = r1.A03
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0ad6
            java.lang.String r0 = "order-type"
            X.C17890vO.A11(r0, r1, r11)
            java.util.ArrayList r14 = X.AnonymousClass000.A14(r12)
            java.util.Iterator r16 = r12.iterator()
        L_0x0a5a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0ac1
            java.lang.Object r13 = r16.next()
            X.ADC r13 = (X.ADC) r13
            java.lang.String r12 = "beneficiary"
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.lang.String r15 = "name"
            java.lang.String r0 = r13.A04
            X.C17890vO.A11(r15, r0, r1)
            java.lang.String r15 = "address_line1"
            java.lang.String r0 = r13.A00
            X.C17890vO.A11(r15, r0, r1)
            java.lang.String r15 = r13.A01
            int r0 = r15.length()
            if (r0 == 0) goto L_0x0a87
            java.lang.String r0 = "address_line2"
            X.C17890vO.A11(r0, r15, r1)
        L_0x0a87:
            java.lang.String r15 = r13.A02
            int r0 = r15.length()
            if (r0 == 0) goto L_0x0a94
            java.lang.String r0 = "city"
            X.C17890vO.A11(r0, r15, r1)
        L_0x0a94:
            java.lang.String r15 = r13.A06
            int r0 = r15.length()
            if (r0 == 0) goto L_0x0aa1
            java.lang.String r0 = "state"
            X.C17890vO.A11(r0, r15, r1)
        L_0x0aa1:
            java.lang.String r0 = r13.A03
            X.C17890vO.A11(r4, r0, r1)
            java.lang.String r15 = "postal_code"
            java.lang.String r0 = r13.A05
            X.C17890vO.A11(r15, r0, r1)
            X.1MD[] r0 = X.AnonymousClass8BT.A1b(r1, r10)
            X.C29621ca.A05(r12, r14, r0)
            goto L_0x0a5a
        L_0x0ab5:
            r13 = 0
            goto L_0x09e3
        L_0x0ab8:
            java.lang.String r1 = "payment_initiator"
            java.lang.String r0 = "buyer"
            X.C17890vO.A11(r1, r0, r6)
            goto L_0x09aa
        L_0x0ac1:
            X.1ca[] r4 = X.C17890vO.A1Y(r14, r10)
            java.lang.String r1 = "beneficiaries"
            r0 = 0
            X.1ca r1 = X.AnonymousClass8BR.A0l(r1, r0, r4)
            X.1MD[] r0 = X.AnonymousClass8BT.A1b(r11, r10)
            X.1ca r4 = new X.1ca
            r4.<init>((X.C29621ca) r1, (java.lang.String) r8, (X.AnonymousClass1MD[]) r0)
            goto L_0x0ade
        L_0x0ad6:
            X.1MD[] r0 = X.AnonymousClass8BT.A1b(r11, r10)
            X.1ca r4 = X.AnonymousClass8BR.A0k(r8, r0)
        L_0x0ade:
            r9.add(r4)
        L_0x0ae1:
            X.AEh r1 = r3.A07
            if (r1 == 0) goto L_0x0af4
            r0 = 4443(0x115b, float:6.226E-42)
            boolean r0 = X.C18020vd.A05(r5, r7, r0)
            if (r0 == 0) goto L_0x0af4
            X.1ca r0 = r1.A01()
            r9.add(r0)
        L_0x0af4:
            java.lang.Integer r11 = r2.Bi6()
            X.1MD[] r4 = X.AnonymousClass8BT.A1b(r6, r10)
            int r0 = r9.size()
            X.1ca[] r1 = X.C17890vO.A1Y(r9, r0)
            java.lang.String r0 = "account"
            X.1ca r15 = X.AnonymousClass8BR.A0l(r0, r4, r1)
            X.1ex r13 = r3.A0D
            android.content.Context r6 = r3.A00
            X.1KB r8 = r3.A01
            X.1jG r7 = r3.A0C
            r12 = 6
            X.8yn r1 = new X.8yn
            r5 = r1
            r10 = r3
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r17 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r16 = "set"
            goto L_0x0b78
        L_0x0b20:
            java.lang.Object r7 = r0.A01
            X.8z8 r7 = (X.C175698z8) r7
            java.lang.String r1 = r0.A04
            java.lang.Object r5 = r0.A02
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r6 = r0.A03
            X.B8h r6 = (X.C22449B8h) r6
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.lang.String r0 = "action"
            java.lang.String r3 = "upi-get-p2m-config"
            X.C17890vO.A11(r0, r3, r4)
            java.lang.String r0 = "payment-config-id"
            X.C17890vO.A11(r0, r1, r4)
            X.0ve r2 = r7.A04
            X.1Ln r1 = r7.A03
            X.190 r0 = r7.A00
            com.whatsapp.jid.UserJid r1 = X.C60432o1.A01(r0, r1, r2, r5, r3)
            if (r1 == 0) goto L_0x0b7d
            java.lang.String r0 = "receiver"
            X.C17890vO.A0n(r1, r0, r4)
            X.9ui r5 = X.C197889xR.A04(r7, r3)
            X.00H r0 = r7.A08
            X.9r1 r0 = X.AnonymousClass8BR.A0b(r0)
            java.lang.Integer r8 = r0.A00(r3)
            X.1ex r13 = r7.A05
            X.1ca r15 = X.AnonymousClass8BX.A0P(r4)
            X.118 r0 = r7.A02
            android.content.Context r2 = r0.A00
            X.1KB r3 = r7.A01
            X.00H r0 = r7.A07
            X.1jG r4 = X.AnonymousClass8BR.A0a(r0)
            X.8zZ r1 = new X.8zZ
            r1.<init>((android.content.Context) r2, (X.AnonymousClass1KB) r3, (X.C33711jG) r4, (X.C196259ui) r5, (X.C22449B8h) r6, (X.C175698z8) r7, (java.lang.Integer) r8)
            r17 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r16 = "get"
        L_0x0b78:
            r14 = r1
            r13.A0I(r14, r15, r16, r17)
            return
        L_0x0b7d:
            X.A7B r1 = X.A7B.A00()
            r0 = 0
            r6.C3t(r1, r0)
            return
        L_0x0b86:
            java.lang.Object r3 = r0.A01
            X.1RO r3 = (X.AnonymousClass1RO) r3
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A02
            X.73o r1 = (X.C1409173o) r1
            java.lang.Object r0 = r0.A03
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.AnonymousClass1RO.A01(r1, r3, r0, r2)
            return
        L_0x0b98:
            java.lang.Object r8 = r0.A01
            X.1h6 r8 = (X.C32381h6) r8
            java.lang.Object r1 = r0.A02
            X.6zF r1 = (X.C139666zF) r1
            java.lang.Object r7 = r0.A03
            X.64W r7 = (X.AnonymousClass64W) r7
            java.lang.String r9 = r0.A04
            X.1h4 r11 = r8.A03
            java.lang.String r10 = r1.A0H
            r2 = 0
            if (r10 == 0) goto L_0x0bef
            X.2Ql[] r6 = X.C49432Ql.values()
            int r5 = r6.length
            r4 = 0
            r14 = 0
        L_0x0bb6:
            if (r4 >= r5) goto L_0x0be5
            r12 = r6[r4]
            X.00H r0 = r11.A02
            java.lang.Object r0 = r0.get()
            X.2iD r0 = (X.C56902iD) r0
            boolean r0 = r0.A00(r12)
            if (r0 == 0) goto L_0x0be2
            X.0vl r13 = r11.A04
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r13)
            java.lang.String r0 = X.C32361h4.A00(r12, r10)
            long r0 = r1.getLong(r0, r2)
            long r14 = r14 + r0
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r13)
            java.lang.String r0 = X.C32361h4.A00(r12, r10)
            X.C17880vN.A1B(r1, r0)
        L_0x0be2:
            int r4 = r4 + 1
            goto L_0x0bb6
        L_0x0be5:
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0bef
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r7.A0j = r0
        L_0x0bef:
            X.18K r3 = r8.A02
            boolean r0 = X.AnonymousClass1RO.A02(r9)
            if (r0 == 0) goto L_0x0c16
            X.0ve r2 = r8.A01
            r1 = 2810(0xafa, float:3.938E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0c16
            X.0vt r1 = X.AnonymousClass1RO.A08
        L_0x0c05:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            if (r1 != 0) goto L_0x0c12
            r3.CC7(r7)
        L_0x0c0e:
            r3.Bio()
            return
        L_0x0c12:
            r3.CC6(r7, r1)
            goto L_0x0c0e
        L_0x0c16:
            r1 = 0
            goto L_0x0c05
        L_0x0c18:
            java.lang.Object r3 = r0.A01
            com.whatsapp.group.newgroup.NewGroup r3 = (com.whatsapp.group.newgroup.NewGroup) r3
            java.lang.Object r2 = r0.A02
            X.1EB r2 = (X.AnonymousClass1EB) r2
            java.lang.String r1 = r0.A04
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            r3.A4c(r2, r1, r0)
            return
        L_0x0c2a:
            java.lang.Object r4 = r0.A01
            X.4RX r4 = (X.AnonymousClass4RX) r4
            java.lang.String r10 = r0.A04
            java.lang.Object r3 = r0.A02
            java.lang.Object r5 = r0.A03
            r12 = 0
            r0 = 3
            X.C18070vi.A0d(r5, r0)
            android.app.Activity r8 = r4.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.C18070vi.A0z(r8, r0)
            r0 = r8
            X.1FU r0 = (X.AnonymousClass1FU) r0
            android.view.View r7 = r0.A00
            java.util.ArrayList r11 = X.C108965cb.A0t(r7)
            X.11C r9 = r4.A05
            X.1F9 r8 = (X.AnonymousClass1F9) r8
            X.4eK r6 = new X.4eK
            r13 = r12
            r6.<init>((android.view.View) r7, (X.AnonymousClass1F9) r8, (X.AnonymousClass11C) r9, (java.lang.String) r10, (java.util.List) r11, (int) r12, (boolean) r13)
            r2 = 2131897304(0x7f122bd8, float:1.9429494E38)
            r1 = 8
            X.78A r0 = new X.78A
            r0.<init>(r4, r5, r3, r1)
            r6.A06(r0, r2)
            r6.A03()
            return
        L_0x0c64:
            java.lang.Object r1 = r0.A01
            X.1WL r1 = (X.AnonymousClass1WL) r1
            java.lang.String r5 = r0.A04
            java.lang.Object r3 = r0.A02
            java.lang.Object r4 = r0.A03
            X.00H r0 = r1.A04
            java.lang.Object r2 = r0.get()
            X.1m1 r2 = (X.C35311m1) r2
            X.10s r0 = r2.A08
            r6 = 44
            X.AkN r1 = new X.AkN
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
        L_0x0c83:
            java.lang.Object r3 = r0.A01
            X.3TA r3 = (X.AnonymousClass3TA) r3
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.Object r0 = r0.A03
            X.00H r0 = (X.AnonymousClass00H) r0
            r3.A0Y(r1, r0, r2)
            return
        L_0x0c95:
            java.lang.Object r1 = r0.A01
            X.2sw r1 = (X.C63362sw) r1
            java.lang.Object r7 = r0.A02
            X.9ea r7 = (X.C186679ea) r7
            java.lang.Object r6 = r0.A03
            X.8cr r6 = (X.C166418cr) r6
            java.lang.String r3 = r0.A04
            X.205 r5 = r1.A0B
            X.00H r4 = r7.A01
            r4.get()
            int r0 = r6.bitField1_
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0d4b
            X.8cp r0 = r6.interactiveMessage_
            r1 = r0
            if (r0 != 0) goto L_0x0cbc
            X.8cp r0 = X.C166398cp.DEFAULT_INSTANCE
        L_0x0cbc:
            int r0 = r0.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0d4b
            if (r1 != 0) goto L_0x0cc6
            X.8cp r1 = X.C166398cp.DEFAULT_INSTANCE
        L_0x0cc6:
            X.8cd r1 = r1.contextInfo_
            if (r1 != 0) goto L_0x0ccc
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0ccc:
            int r0 = r1.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0cd7
            boolean r0 = r1.isForwarded_
            if (r0 == 0) goto L_0x0cd7
            r2 = 1
        L_0x0cd7:
            X.00H r0 = r7.A03
            java.lang.Object r8 = X.C18070vi.A0E(r0)
            X.9eg r8 = (X.C186739eg) r8
            r4.get()
            r4.get()
            r1 = 0
            if (r2 == 0) goto L_0x0d3b
            r7 = 0
        L_0x0ce9:
            org.json.JSONObject r6 = X.C17880vN.A15()
            java.lang.String r1 = "cta"
            java.lang.String r0 = "catalog_message"
            r6.put(r1, r0)
            java.lang.String r0 = r5.A01
            X.C18070vi.A0X(r0)
            java.lang.String r1 = X.AnonymousClass8BY.A0Y(r0)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "catalog_message_id"
            r6.put(r0, r1)
            if (r7 != 0) goto L_0x0d09
            java.lang.Object r7 = org.json.JSONObject.NULL
        L_0x0d09:
            java.lang.String r0 = "is_template"
            java.lang.String r12 = X.AnonymousClass8BV.A0r(r7, r0, r6)
            java.lang.Object r0 = r4.get()
            X.9ls r0 = (X.C191009ls) r0
            X.1BI r9 = r5.A00
            int r0 = r0.A00(r9, r3, r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r4.get()
            if (r2 == 0) goto L_0x0d2a
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r9 = X.C22951Dx.A01(r3)
        L_0x0d2a:
            r11 = 0
            r15 = 4
            r16 = 22
            X.10I r0 = r8.A03
            r14 = r11
            X.AkA r7 = new X.AkA
            r13 = r11
            r7.<init>((X.C186739eg) r8, (com.whatsapp.jid.Jid) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (int) r15, (int) r16)
            r0.CGF(r7)
            return
        L_0x0d3b:
            boolean r0 = r6.A0R()
            if (r0 == 0) goto L_0x0d46
            java.lang.Integer r7 = X.C17880vN.A0h()
            goto L_0x0ce9
        L_0x0d46:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            goto L_0x0ce9
        L_0x0d4b:
            java.lang.String r0 = r5.A01
            X.C18070vi.A0X(r0)
            java.lang.String r0 = X.AnonymousClass8BY.A0Y(r0)
            X.C18070vi.A0X(r0)
            goto L_0x0cd7
        L_0x0d58:
            java.lang.Object r1 = r0.A01
            X.1i1 r1 = (X.C32951i1) r1
            java.lang.Object r8 = r0.A02
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r4 = r0.A04
            java.lang.Object r9 = r0.A03
            java.lang.Number r9 = (java.lang.Number) r9
            r1.A09()
            java.lang.String r5 = ""
            java.lang.String r3 = r8.getString(r4, r5)
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            char[] r2 = new char[r0]
            r0 = 44
            r1 = 0
            r2[r1] = r0
            java.util.List r0 = X.AnonymousClass1YF.A0R(r3, r2)
            java.lang.String[] r2 = X.C108955ca.A1b(r0)
            java.lang.Long r0 = X.C63782tg.A05(r2, r1)
            java.lang.Long r11 = X.C17890vO.A0L()
            r7 = r11
            if (r0 != 0) goto L_0x0d8e
            r0 = r11
        L_0x0d8e:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r6 = new java.util.concurrent.atomic.AtomicLong
            r6.<init>(r0)
            r0 = 2
            java.lang.Long r0 = X.C63782tg.A05(r2, r0)
            if (r0 != 0) goto L_0x0d9f
            r0 = r11
        L_0x0d9f:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r10 = new java.util.concurrent.atomic.AtomicLong
            r10.<init>(r0)
            r0 = 4
            java.lang.Long r0 = X.C63782tg.A05(r2, r0)
            if (r0 != 0) goto L_0x0db0
            r0 = r11
        L_0x0db0:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r0)
            r0 = 5
            java.lang.Long r0 = X.C63782tg.A05(r2, r0)
            if (r0 == 0) goto L_0x0dc1
            r11 = r0
        L_0x0dc1:
            long r0 = r11.longValue()
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>(r0)
            r1 = r2
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            int r0 = r9.intValue()
            switch(r0) {
                case 0: goto L_0x0dfc;
                case 1: goto L_0x0dd6;
                case 2: goto L_0x0dfa;
                case 3: goto L_0x0dd6;
                case 4: goto L_0x0df8;
                case 5: goto L_0x0dfd;
                default: goto L_0x0dd6;
            }
        L_0x0dd6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            switch(r0) {
                case 0: goto L_0x0de9;
                case 1: goto L_0x0dec;
                case 2: goto L_0x0def;
                case 3: goto L_0x0df2;
                case 4: goto L_0x0df5;
                default: goto L_0x0ddd;
            }
        L_0x0ddd:
            java.lang.String r0 = "IMAGINE_CMD_IN_CMD_PICKER_CLICK"
        L_0x0ddf:
            r1.append(r0)
            java.lang.String r0 = " is deprecated"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        L_0x0de9:
            java.lang.String r0 = "DEFAULT_BOT_SHOWN"
            goto L_0x0ddf
        L_0x0dec:
            java.lang.String r0 = "DEFAULT_BOT_IMAGINE_CMD_SHOWN"
            goto L_0x0ddf
        L_0x0def:
            java.lang.String r0 = "DEFAULT_BOT_CLICKED"
            goto L_0x0ddf
        L_0x0df2:
            java.lang.String r0 = "DEFAULT_BOT_IMAGINE_CMD_CLICKED"
            goto L_0x0ddf
        L_0x0df5:
            java.lang.String r0 = "CMD_PICKER_SHOWN"
            goto L_0x0ddf
        L_0x0df8:
            r1 = r3
            goto L_0x0dfd
        L_0x0dfa:
            r1 = r10
            goto L_0x0dfd
        L_0x0dfc:
            r1 = r6
        L_0x0dfd:
            r1.incrementAndGet()
            android.content.SharedPreferences$Editor r9 = r8.edit()
            r0 = 6
            java.lang.Long[] r8 = new java.lang.Long[r0]
            long r0 = r6.get()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.AnonymousClass001.A1Q(r0, r7, r8)
            long r0 = r10.get()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.AnonymousClass001.A1R(r0, r7, r8)
            long r0 = r3.get()
            X.C17890vO.A1P(r8, r0)
            long r0 = r2.get()
            X.C17890vO.A1Q(r8, r0)
            goto L_0x0e9e
        L_0x0e2c:
            java.lang.Object r1 = r0.A01
            X.1i1 r1 = (X.C32951i1) r1
            java.lang.Object r8 = r0.A02
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r4 = r0.A04
            java.lang.Object r10 = r0.A03
            java.lang.Number r10 = (java.lang.Number) r10
            r1.A09()
            java.lang.String r5 = ""
            java.lang.String r2 = r8.getString(r4, r5)
            r3 = 1
            r6 = 0
            X.C18070vi.A0d(r2, r3)
            char[] r1 = new char[r3]
            r0 = 44
            r1[r6] = r0
            java.util.List r0 = X.AnonymousClass1YF.A0R(r2, r1)
            java.lang.String[] r9 = X.C108955ca.A1b(r0)
            java.lang.Long r0 = X.C63782tg.A05(r9, r6)
            java.lang.Long r2 = X.C17890vO.A0L()
            if (r0 != 0) goto L_0x0e61
            r0 = r2
        L_0x0e61:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r7 = new java.util.concurrent.atomic.AtomicLong
            r7.<init>(r0)
            java.lang.Long r0 = X.C63782tg.A05(r9, r3)
            if (r0 == 0) goto L_0x0e71
            r2 = r0
        L_0x0e71:
            long r0 = r2.longValue()
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>(r0)
            X.C18070vi.A0d(r10, r6)
            int r0 = r10.intValue()
            if (r0 == r6) goto L_0x0eac
            if (r0 != r3) goto L_0x0eae
            r0 = r2
        L_0x0e86:
            r0.incrementAndGet()
            android.content.SharedPreferences$Editor r9 = r8.edit()
            r0 = 2
            java.lang.Long[] r8 = new java.lang.Long[r0]
            long r0 = r7.get()
            X.AnonymousClass3MX.A1S(r8, r6, r0)
            long r0 = r2.get()
            X.AnonymousClass3MX.A1S(r8, r3, r0)
        L_0x0e9e:
            java.lang.String r0 = ","
            java.lang.String r0 = X.C200410p.A0I(r0, r5, r5, r8)
            android.content.SharedPreferences$Editor r0 = r9.putString(r4, r0)
            r0.apply()
            return
        L_0x0eac:
            r0 = r7
            goto L_0x0e86
        L_0x0eae:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0eb3:
            java.lang.Object r2 = r0.A01
            X.67x r2 = (X.C1193867x) r2
            java.lang.Object r1 = r0.A02
            java.lang.String r13 = r0.A04
            java.lang.Object r3 = r0.A03
            X.7Fe r3 = (X.C143887Fe) r3
            X.1iW r2 = r2.A04
            java.util.List r14 = X.C18070vi.A0M(r1)
            r4 = 0
            r16 = 0
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r15 = r4
            r18 = r16
            r19 = r16
            r5 = r4
            r17 = r16
            r2.A0J(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0edb:
            java.lang.Object r4 = r0.A01
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.Object r5 = r0.A02
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.Object r2 = r0.A03
            java.util.List r2 = (java.util.List) r2
            java.lang.String r7 = r0.A04
            int r1 = r5.intValue()
            r0 = 37
            if (r1 != r0) goto L_0x0f16
            r0 = 1
            X.6sb r6 = new X.6sb
            r6.<init>(r0)
            android.os.Bundle r1 = r4.A27()
            java.lang.String r0 = "newsletter_invite_link_jid"
            java.lang.String r1 = r1.getString(r0)
            X.25J r0 = X.C29681ch.A03
            X.1ch r0 = r0.A01(r1)
            r6.A00 = r0
        L_0x0f09:
            X.1KB r0 = r4.A0S
            r8 = 17
            X.AkN r3 = new X.AkN
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0J(r3)
            return
        L_0x0f16:
            if (r2 == 0) goto L_0x0f5b
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0f5b
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r2.iterator()
        L_0x0f26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0f40
            java.lang.Object r1 = r2.next()
            X.205 r1 = (X.AnonymousClass205) r1
            X.00H r0 = r4.A2S
            X.206 r0 = X.AnonymousClass1W2.A01(r1, r0)
            if (r0 == 0) goto L_0x0f26
            long r0 = r0.A0x
            X.C17880vN.A1R(r3, r0)
            goto L_0x0f26
        L_0x0f40:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0f5b
            r0 = 2
            X.6sb r6 = new X.6sb
            r6.<init>(r0)
            r6.A02 = r3
            X.1BI r1 = r4.A1b
            boolean r0 = X.C22971Dz.A0V(r1)
            if (r0 == 0) goto L_0x0f09
            X.1ch r1 = (X.C29681ch) r1
            r6.A00 = r1
            goto L_0x0f09
        L_0x0f5b:
            r6 = 0
            goto L_0x0f09
        L_0x0f5d:
            java.lang.Object r3 = r0.A01
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r0.A03
            X.6sb r0 = (X.C135686sb) r0
            com.whatsapp.contact.picker.ContactPickerFragment.A0g(r3, r0, r1, r2)
            return
        L_0x0f6f:
            java.lang.Object r4 = r0.A01
            X.1Vc r4 = (X.C27191Vc) r4
            java.lang.Object r3 = r0.A02
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A03
            X.1GV r1 = (X.AnonymousClass1GV) r1
            r0 = 0
            X.C27191Vc.A02(r1, r4, r3, r0, r2)
            return
        L_0x0f82:
            java.lang.Object r4 = r0.A01
            X.2k9 r4 = (X.C58102k9) r4
            java.lang.String r3 = r0.A04
            java.lang.Object r2 = r0.A02
            X.9KN r2 = (X.AnonymousClass9KN) r2
            java.lang.Object r1 = r0.A03
            X.77d r1 = (X.C1418377d) r1
            r0 = 0
            r4.A00(r2, r1, r3, r0)
            return
        L_0x0f95:
            java.lang.Object r1 = r0.A01
            X.1mx r1 = (X.C35881mx) r1
            java.lang.Object r9 = r0.A02
            byte[] r9 = (byte[]) r9
            java.lang.Object r6 = r0.A03
            byte[] r6 = (byte[]) r6
            java.lang.String r10 = r0.A04
            X.1mw r1 = r1.A00
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x11d1 }
            java.lang.Object r4 = r0.remove(r10)     // Catch:{ all -> 0x11d1 }
            X.9d9 r4 = (X.C185789d9) r4     // Catch:{ all -> 0x11d1 }
            X.00H r0 = r1.A06     // Catch:{ all -> 0x11d1 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x11d1 }
            X.9sz r2 = (X.C195219sz) r2     // Catch:{ all -> 0x11d1 }
            r3 = 0
            if (r4 == 0) goto L_0x0fc0
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x11d1 }
        L_0x0fbb:
            r7 = 5
            r2.A01(r7, r10, r0)     // Catch:{ all -> 0x11d1 }
            goto L_0x0fc2
        L_0x0fc0:
            r0 = r3
            goto L_0x0fbb
        L_0x0fc2:
            if (r4 != 0) goto L_0x0fc6
            goto L_0x10e2
        L_0x0fc6:
            int r3 = r9.length     // Catch:{ IllegalArgumentException -> 0x1108 }
            r0 = 44
            if (r3 < r0) goto L_0x1101
            r2 = 32
            r0 = 0
            byte[] r5 = java.util.Arrays.copyOfRange(r9, r0, r2)     // Catch:{ IllegalArgumentException -> 0x1108 }
            r0 = 44
            byte[] r8 = java.util.Arrays.copyOfRange(r9, r2, r0)     // Catch:{ IllegalArgumentException -> 0x1108 }
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r0, r3)     // Catch:{ IllegalArgumentException -> 0x1108 }
            byte[] r3 = r4.A02     // Catch:{ all -> 0x11d1 }
            java.lang.String r0 = "link_code_pairing_key_bundle_encryption_key"
            byte[] r2 = r0.getBytes()     // Catch:{ all -> 0x11d1 }
            java.util.List r0 = X.C60732oW.A00     // Catch:{ all -> 0x11d1 }
            r0 = 32
            byte[] r2 = X.C20058A5h.A02(r3, r5, r2, r0)     // Catch:{ all -> 0x11d1 }
            java.lang.String r0 = "AES-GCM"
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec     // Catch:{ all -> 0x11d1 }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x11d1 }
            javax.crypto.Cipher r2 = X.AnonymousClass8BR.A18()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x10c7 }
            javax.crypto.spec.IvParameterSpec r0 = X.AnonymousClass8BR.A19(r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x10c7 }
            r8 = 2
            byte[] r5 = X.AnonymousClass8BS.A1Q(r5, r0, r2, r9, r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x10c7 }
            int r0 = r5.length     // Catch:{ ParseException -> 0x10b3 }
            int r2 = r0 + -64
            r0 = 32
            byte[][] r5 = X.A8G.A07(r5, r0, r0, r2)     // Catch:{ ParseException -> 0x10b3 }
            r0 = 0
            r9 = r5[r0]     // Catch:{ all -> 0x11d1 }
            r0 = 1
            r2 = r5[r0]     // Catch:{ all -> 0x11d1 }
            r5 = r5[r8]     // Catch:{ all -> 0x11d1 }
            java.lang.Boolean r0 = X.C17970vW.A01     // Catch:{ all -> 0x11d1 }
            X.1P3 r0 = r1.A04     // Catch:{ all -> 0x11d1 }
            X.1PJ r0 = r0.A01     // Catch:{ all -> 0x11d1 }
            X.2cG r8 = r0.A03()     // Catch:{ all -> 0x11d1 }
            X.2kO r0 = r8.A01     // Catch:{ all -> 0x11d1 }
            X.1jP r0 = r0.A00     // Catch:{ all -> 0x11d1 }
            byte[] r0 = r0.A00     // Catch:{ all -> 0x11d1 }
            boolean r0 = java.util.Arrays.equals(r0, r2)     // Catch:{ all -> 0x11d1 }
            if (r0 != 0) goto L_0x103b
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/primary identity doesn't match"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x11d1 }
            X.1mv r0 = r1.A01     // Catch:{ all -> 0x11d1 }
            r0.A02(r10)     // Catch:{ all -> 0x11d1 }
            java.lang.String r2 = r4.A00     // Catch:{ all -> 0x11d1 }
            r0 = 4
            X.7KS r4 = new X.7KS     // Catch:{ all -> 0x11d1 }
            r4.<init>(r10, r2, r0)     // Catch:{ all -> 0x11d1 }
            goto L_0x10fd
        L_0x103b:
            boolean r0 = java.util.Arrays.equals(r6, r9)     // Catch:{ all -> 0x11d1 }
            if (r0 != 0) goto L_0x1055
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/companion identity doesn't match"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x11d1 }
            X.1mv r0 = r1.A01     // Catch:{ all -> 0x11d1 }
            r0.A02(r10)     // Catch:{ all -> 0x11d1 }
            java.lang.String r2 = r4.A00     // Catch:{ all -> 0x11d1 }
            r0 = 4
            X.7KS r4 = new X.7KS     // Catch:{ all -> 0x11d1 }
            r4.<init>(r10, r2, r0)     // Catch:{ all -> 0x11d1 }
            goto L_0x10fd
        L_0x1055:
            X.1jP r2 = new X.1jP     // Catch:{ all -> 0x11d1 }
            r2.<init>(r9)     // Catch:{ all -> 0x11d1 }
            X.2kN r0 = r8.A00     // Catch:{ all -> 0x11d1 }
            byte[] r2 = X.C63962tz.A08(r0, r2)     // Catch:{ all -> 0x11d1 }
            r0 = 3
            byte[][] r0 = new byte[r0][]     // Catch:{ all -> 0x11d1 }
            X.AnonymousClass8BX.A1K(r3, r2, r5, r0)     // Catch:{ all -> 0x11d1 }
            byte[] r3 = X.A8G.A05(r0)     // Catch:{ all -> 0x11d1 }
            java.lang.String r0 = "adv_secret"
            byte[] r2 = r0.getBytes()     // Catch:{ all -> 0x11d1 }
            r0 = 32
            byte[] r12 = X.C20058A5h.A00(r3, r2, r0)     // Catch:{ all -> 0x11d1 }
            byte[] r11 = r4.A01     // Catch:{ all -> 0x11d1 }
            java.lang.String r3 = r4.A00     // Catch:{ all -> 0x11d1 }
            r0 = 2
            byte[][] r5 = new byte[r0][]     // Catch:{ 1Ak -> 0x10a6 }
            r4 = 1
            byte[] r2 = new byte[r4]     // Catch:{ 1Ak -> 0x10a6 }
            r0 = 0
            r2[r0] = r7     // Catch:{ 1Ak -> 0x10a6 }
            r5[r0] = r2     // Catch:{ 1Ak -> 0x10a6 }
            r5[r4] = r6     // Catch:{ 1Ak -> 0x10a6 }
            byte[] r0 = X.A8G.A05(r5)     // Catch:{ 1Ak -> 0x10a6 }
            X.1jP r0 = X.C63962tz.A01(r0)     // Catch:{ 1Ak -> 0x10a6 }
            X.2kO r7 = new X.2kO     // Catch:{ 1Ak -> 0x10a6 }
            r7.<init>(r0)     // Catch:{ 1Ak -> 0x10a6 }
            java.lang.Integer r9 = X.C138746xc.A00(r3)     // Catch:{ 1Ak -> 0x10a6 }
            X.2RD r8 = X.AnonymousClass2RD.E2EE     // Catch:{ 1Ak -> 0x10a6 }
            X.6ii r6 = new X.6ii     // Catch:{ 1Ak -> 0x10a6 }
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 1Ak -> 0x10a6 }
            monitor-exit(r1)
            r0 = 11
            X.C17890vO.A0s(r1, r6, r0)
            return
        L_0x10a6:
            r2 = move-exception
            java.lang.String r0 = "CompanionPairingData/createFromCodePairing invalidCompanionIdentity "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x11d1 }
            r0 = 2
            X.7KS r4 = new X.7KS     // Catch:{ all -> 0x11d1 }
            r4.<init>(r10, r3, r0)     // Catch:{ all -> 0x11d1 }
            goto L_0x10fd
        L_0x10b3:
            r2 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeUtil/decodeLinkCodePairingWrappedKeyBundle split fail"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x11d1 }
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/invalid linkCodePairingWrappedKeyBundleDecrypted"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x11d1 }
            java.lang.String r2 = r4.A00     // Catch:{ all -> 0x11d1 }
            r0 = 4
            X.7KS r4 = new X.7KS     // Catch:{ all -> 0x11d1 }
            r4.<init>(r10, r2, r0)     // Catch:{ all -> 0x11d1 }
            goto L_0x10fd
        L_0x10c7:
            r2 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/decryption fail"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x11d1 }
            X.00H r0 = r1.A05     // Catch:{ all -> 0x11d1 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x11d1 }
            X.9j4 r3 = (X.AnonymousClass9j4) r3     // Catch:{ all -> 0x11d1 }
            java.lang.String r2 = r4.A00     // Catch:{ all -> 0x11d1 }
            r0 = 3
            r3.A00(r0, r10, r2)     // Catch:{ all -> 0x11d1 }
            r0 = 4
            X.7KS r4 = new X.7KS     // Catch:{ all -> 0x11d1 }
            r4.<init>(r10, r2, r0)     // Catch:{ all -> 0x11d1 }
            goto L_0x10fd
        L_0x10e2:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x11d1 }
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish ref not exists, ref="
            X.C17900vP.A0e(r0, r10, r2)     // Catch:{ all -> 0x11d1 }
            X.00H r0 = r1.A05     // Catch:{ all -> 0x11d1 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x11d1 }
            X.9j4 r2 = (X.AnonymousClass9j4) r2     // Catch:{ all -> 0x11d1 }
            r0 = 4
            r2.A00(r0, r10, r3)     // Catch:{ all -> 0x11d1 }
            r0 = 2
            X.7KS r4 = new X.7KS     // Catch:{ all -> 0x11d1 }
            r4.<init>(r10, r3, r0)     // Catch:{ all -> 0x11d1 }
        L_0x10fd:
            r1.notifyAllObservers(r4)     // Catch:{ all -> 0x11d1 }
            goto L_0x110e
        L_0x1101:
            java.lang.String r0 = "LinkCodePairingWrappedKeyBundleData input byte array length too small"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x1108 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x1108 }
        L_0x1108:
            r2 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish exception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x11d1 }
        L_0x110e:
            monitor-exit(r1)
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/onCompanionFinish companionPairingData is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x1115:
            java.lang.Object r4 = r0.A01
            X.1gf r4 = (X.C32111gf) r4
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A03
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            java.lang.String r1 = r0.A04
            android.content.Context r0 = X.AnonymousClass3MY.A04(r3)
            X.C32111gf.A01(r0, r4, r2, r1)
            return
        L_0x112b:
            java.lang.Object r2 = r0.A01
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Object r1 = r0.A02
            X.9fU r1 = (X.C187239fU) r1
            java.lang.Object r3 = r0.A03
            X.1EC r3 = (X.AnonymousClass1EC) r3
            java.lang.String r7 = r0.A04
            X.1yX r0 = r2.A0M
            com.whatsapp.protocol.SetGroupDescriptionProtocolHelper r5 = r1.A02
            if (r0 == 0) goto L_0x1152
            java.lang.String r6 = r0.A04
        L_0x1141:
            X.Acs r4 = new X.Acs
            r4.<init>(r1, r3, r7)
            X.1OX r0 = r5.A06
            r8 = 0
            com.whatsapp.protocol.SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1 r2 = new com.whatsapp.protocol.SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass3MX.A1Q(r2, r0)
            return
        L_0x1152:
            r6 = 0
            goto L_0x1141
        L_0x1154:
            java.lang.Object r5 = r0.A01
            X.1FU r5 = (X.AnonymousClass1FU) r5
            java.lang.Object r1 = r0.A02
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r4 = r0.A03
            android.view.View r4 = (android.view.View) r4
            java.lang.String r3 = r0.A04
            r1.setText(r3)
            X.1KB r2 = r5.A05
            X.11C r1 = r5.A08
            X.4dn r0 = new X.4dn
            r0.<init>(r2, r1, r3)
            r4.setOnLongClickListener(r0)
            return
        L_0x1172:
            java.lang.Object r5 = r0.A01
            com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel r5 = (com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel) r5
            java.lang.String r4 = r0.A04
            java.lang.Object r3 = r0.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.Object r2 = r0.A03
            X.9Hk r2 = (X.C179299Hk) r2
            X.9oc r1 = r5.A03
            X.B1I r0 = new X.B1I
            r0.<init>(r2, r5, r3)
            r1.A00(r3, r4, r0)
            return
        L_0x118b:
            java.lang.Object r1 = r0.A01
            X.1pj r1 = (X.C37551pj) r1
            java.lang.Object r2 = r0.A02
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r7 = r0.A04
            java.lang.Object r6 = r0.A03
            r0 = 3
            X.C18070vi.A0d(r6, r0)
            monitor-enter(r1)
            java.util.Set r0 = r1.A0K     // Catch:{ all -> 0x11d1 }
            r0.clear()     // Catch:{ all -> 0x11d1 }
            r0.addAll(r2)     // Catch:{ all -> 0x11d1 }
            X.1pe r0 = r1.A02     // Catch:{ all -> 0x11d1 }
            r0.A0J(r2)     // Catch:{ all -> 0x11d1 }
            X.0z4 r5 = r1.A07     // Catch:{ all -> 0x11d1 }
            X.11P r0 = r1.A06     // Catch:{ all -> 0x11d1 }
            long r3 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x11d1 }
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r5)     // Catch:{ all -> 0x11d1 }
            java.lang.String r0 = "block_list_receive_time"
            X.C17880vN.A1D(r2, r0, r3)     // Catch:{ all -> 0x11d1 }
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r5)     // Catch:{ all -> 0x11d1 }
            java.lang.String r0 = "block_list_v2_dhash"
            X.C17880vN.A1E(r2, r0, r7)     // Catch:{ all -> 0x11d1 }
            X.1KB r3 = r1.A00     // Catch:{ all -> 0x11d1 }
            r2 = 11
            X.AkI r0 = new X.AkI     // Catch:{ all -> 0x11d1 }
            r0.<init>(r1, r6, r2)     // Catch:{ all -> 0x11d1 }
            r3.A0J(r0)     // Catch:{ all -> 0x11d1 }
        L_0x11cf:
            monitor-exit(r1)
            return
        L_0x11d1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x11d4:
            java.lang.Object r5 = r0.A01
            X.9n3 r5 = (X.C191709n3) r5
            java.lang.Object r13 = r0.A02
            android.content.Context r13 = (android.content.Context) r13
            java.lang.Object r6 = r0.A03
            X.1BI r6 = (X.AnonymousClass1BI) r6
            java.lang.String r7 = r0.A04
            r11 = 1
            X.9aE r0 = r5.A01
            long r9 = r0.A00
            X.9IT r1 = X.AnonymousClass9IT.YES
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            X.A2Y r14 = new X.A2Y
            r14.<init>(r1, r0)
            X.9lm r12 = r5.A03
            r15 = r6
            r16 = r7
            r17 = r11
            X.21g r4 = r12.A00(r13, r14, r15, r16, r17)
            X.1iW r3 = r5.A00
            r2 = 0
            X.10I r1 = r3.A19
            r0 = 2
            X.C21455AkM.A00(r1, r3, r2, r4, r0)
            X.9aF r2 = r5.A04
            X.10I r1 = r2.A01
            r0 = 42
            X.C21450AkH.A01(r1, r4, r2, r0)
            r8 = 0
            X.C18070vi.A0d(r6, r8)
            X.10I r0 = r5.A08
            X.Aj4 r4 = new X.Aj4
            r4.<init>(r5, r6, r7, r8, r9, r11)
            r0.CGF(r4)
            return
        L_0x121e:
            java.lang.Object r4 = r0.A01
            X.11r r4 = (X.C203211r) r4
            java.lang.Object r2 = r0.A02
            android.os.ConditionVariable r2 = (android.os.ConditionVariable) r2
            java.lang.String r1 = r0.A04
            java.lang.Object r5 = r0.A03
            android.content.ServiceConnection r5 = (android.content.ServiceConnection) r5
            java.lang.String r0 = "registrationmanager/success/waiting-for-gdrive-service-object"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.block()
            java.lang.String r0 = "registrationmanager/success/cancel-pending-gdrive-backup-and-restore-if-any"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9ug r0 = r4.A02
            r0.A04()
            java.lang.String r0 = "registrationmanager/success/gdrive-start-change-number"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r4.A0B
            r0.get()
            X.118 r0 = r4.A06
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "action_change_number"
            android.content.Intent r2 = X.AnonymousClass1LU.A1M(r3, r0)
            java.lang.String r0 = "old_phone_number"
            r2.putExtra(r0, r1)
            X.11S r0 = r4.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            if (r0 != 0) goto L_0x1271
            r1 = 0
        L_0x1260:
            java.lang.String r0 = "new_phone_number"
            r2.putExtra(r0, r1)
            X.C25081Mu.A00(r3, r2)
            r3.unbindService(r5)
            X.A1Q r1 = r4.A08
            r0 = 1
            r1.A01 = r0
            return
        L_0x1271:
            java.lang.String r1 = r0.user
            goto L_0x1260
        L_0x1274:
            java.lang.Object r5 = r0.A01
            X.9zx r5 = (X.C199409zx) r5
            java.lang.Object r4 = r0.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.String r3 = r0.A04
            java.lang.Object r6 = r0.A03
            X.BAC r6 = (X.BAC) r6
            X.00H r0 = r5.A03
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass8BV.A0F(r4, r0)
            X.0z4 r1 = r5.A01
            java.lang.String r0 = r0.getRawString()
            java.lang.String r0 = r1.A0q(r0)
            boolean r0 = X.C18070vi.A18(r3, r0)
            if (r0 != 0) goto L_0x12b5
            X.1Ty r0 = r5.A00
            X.AEW r2 = r0.A08(r4)
            if (r2 == 0) goto L_0x12b5
            boolean r0 = r2.A0Y
            if (r0 == 0) goto L_0x12b5
            X.00H r0 = r5.A02
            java.lang.Object r1 = r0.get()
            X.9lk r1 = (X.C190929lk) r1
            X.ANi r0 = new X.ANi
            r0.<init>(r6, r5, r4, r3)
            r1.A00(r0, r2, r4, r3)
            return
        L_0x12b5:
            r6.onSuccess()
            return
        L_0x12b9:
            java.lang.Object r3 = r0.A01
            X.3cE r3 = (X.C74703cE) r3
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r0.A03
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r0 = r0.A04
            X.C18070vi.A0b(r1)
            r3.A03(r1, r2, r0)
            return
        L_0x12ce:
            java.lang.String r4 = "lam:LinkedDeviceManager"
            java.net.Socket r10 = new java.net.Socket     // Catch:{ IOException -> 0x135b }
            r10.<init>()     // Catch:{ IOException -> 0x135b }
            java.lang.Object r6 = r0.A03     // Catch:{ IOException -> 0x135b }
            X.9hg r6 = (X.C188599hg) r6     // Catch:{ IOException -> 0x135b }
            java.lang.String r3 = r0.A04     // Catch:{ IOException -> 0x135b }
            r1 = 10000(0x2710, float:1.4013E-41)
            r10.setSoTimeout(r1)     // Catch:{ IOException -> 0x135b }
            java.lang.String r1 = "Connecting to TCP socket..."
            X.C26294Cx6.A04(r4, r1)     // Catch:{ IOException -> 0x135b }
            java.util.ArrayDeque r5 = r6.A06     // Catch:{ IOException -> 0x135b }
            X.AtL r1 = new X.AtL     // Catch:{ IOException -> 0x135b }
            r1.<init>(r10)     // Catch:{ IOException -> 0x135b }
            r5.add(r1)     // Catch:{ IOException -> 0x135b }
            r2 = 20203(0x4eeb, float:2.831E-41)
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x135b }
            r1.<init>(r3, r2)     // Catch:{ IOException -> 0x135b }
            r10.connect(r1)     // Catch:{ IOException -> 0x135b }
            java.lang.String r1 = "CONNECTED to TCP socket..."
            X.C26294Cx6.A06(r4, r1)     // Catch:{ IOException -> 0x135b }
            X.Csp r11 = r6.A00     // Catch:{ IOException -> 0x135b }
            if (r11 != 0) goto L_0x132c
            java.lang.String r1 = "connectSecureTcpSocket: Creating LinkedDevice object"
            X.C26294Cx6.A06(r4, r1)     // Catch:{ IOException -> 0x135b }
            java.util.UUID r13 = r6.A07     // Catch:{ IOException -> 0x135b }
            r1 = 4
            X.Are r14 = new X.Are     // Catch:{ IOException -> 0x135b }
            r14.<init>(r6, r1)     // Catch:{ IOException -> 0x135b }
            r1 = 5
            X.Are r15 = new X.Are     // Catch:{ IOException -> 0x135b }
            r15.<init>(r6, r1)     // Catch:{ IOException -> 0x135b }
            r1 = 2
            X.Arh r2 = new X.Arh     // Catch:{ IOException -> 0x135b }
            r2.<init>(r6, r1)     // Catch:{ IOException -> 0x135b }
            java.lang.Object r1 = r0.A01     // Catch:{ IOException -> 0x135b }
            X.1Di r1 = (X.C22821Di) r1     // Catch:{ IOException -> 0x135b }
            X.CCP r12 = r6.A03     // Catch:{ IOException -> 0x135b }
            X.Csp r11 = new X.Csp     // Catch:{ IOException -> 0x135b }
            r16 = r1
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x135b }
            r6.A00 = r11     // Catch:{ IOException -> 0x135b }
        L_0x132c:
            java.lang.Integer r9 = X.AnonymousClass00R.A01     // Catch:{ IOException -> 0x135b }
            r2 = 262144(0x40000, float:3.67342E-40)
            r8 = 262144(0x40000, float:3.67342E-40)
            X.ByZ r7 = X.C24276ByZ.WifiTcpIp     // Catch:{ IOException -> 0x135b }
            java.io.InputStream r1 = r10.getInputStream()     // Catch:{ IOException -> 0x135b }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x135b }
            r3.<init>(r1, r2)     // Catch:{ IOException -> 0x135b }
            java.io.OutputStream r2 = r10.getOutputStream()     // Catch:{ IOException -> 0x135b }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x135b }
            r1.<init>(r2, r8)     // Catch:{ IOException -> 0x135b }
            X.8Qv r2 = new X.8Qv     // Catch:{ IOException -> 0x135b }
            r2.<init>(r7, r3, r1, r9)     // Catch:{ IOException -> 0x135b }
            java.lang.Object r1 = r0.A02     // Catch:{ IOException -> 0x135b }
            X.BTW r1 = (X.BTW) r1     // Catch:{ IOException -> 0x135b }
            r11.A03(r2, r1)     // Catch:{ IOException -> 0x135b }
            X.AtK r1 = new X.AtK     // Catch:{ IOException -> 0x135b }
            r1.<init>(r6)     // Catch:{ IOException -> 0x135b }
            r5.add(r1)     // Catch:{ IOException -> 0x135b }
            return
        L_0x135b:
            r2 = move-exception
            java.lang.String r1 = "Failed to connect to tcp socket"
            X.C26294Cx6.A0A(r4, r1, r2)
            java.lang.Object r1 = r0.A01
            X.1Di r1 = (X.C22821Di) r1
            X.Bzt r0 = X.C24358Bzt.FAILED_TO_CONNECT_SOCKET
            r1.invoke(r0)
            return
        L_0x136b:
            java.lang.Object r2 = r0.A01
            X.Cyh r2 = (X.C26381Cyh) r2
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r1 = "buildRenderersCompleted starts"
            X.C26381Cyh.A0E(r2, r1, r3)
            java.lang.Object r1 = r0.A03
            X.CbZ r1 = (X.C25238CbZ) r1
            X.C26056CrS.A01(r1)
            X.D47 r3 = r1.A0C
            X.C26056CrS.A01(r3)
            X.CbZ r1 = r2.A10
            if (r1 == 0) goto L_0x13b8
            X.CbZ r1 = r2.A10
            X.D47 r1 = r1.A0C
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x13b8
            r1 = 1
            r2.A0Z = r1
            java.lang.Object r0 = r0.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.A0S = r0
            android.view.Surface r1 = r2.A0H
            if (r1 == 0) goto L_0x13a5
            X.DRp r0 = r2.A0p
            boolean r0 = r0.useBlockingSetSurfaceExo2
            X.C26381Cyh.A09(r1, r2, r0)
        L_0x13a5:
            float r0 = r2.A01
            X.C26381Cyh.A0C(r2, r0)
            float r0 = r2.A00
            X.C26381Cyh.A0B(r2, r0)
            int r0 = r2.A02
            X.C26381Cyh.A0D(r2, r0)
            X.C26381Cyh.A0A(r2)
            return
        L_0x13b8:
            java.lang.String r1 = "skipped buildRenderersCompleted because of non-matching request"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.C26381Cyh.A0E(r2, r1, r0)
            return
        L_0x13c0:
            java.lang.Object r3 = r0.A01
            X.Cgd r3 = (X.C25482Cgd) r3
            java.lang.Object r2 = r0.A02
            X.Cr9 r2 = (X.C26045Cr9) r2
            java.lang.String r1 = r0.A04
            java.lang.Object r0 = r0.A03
            X.DDm r0 = (X.DDm) r0
            X.C25482Cgd.A00(r2, r3, r0, r1)
            return
        L_0x13d2:
            java.lang.Object r5 = r0.A01
            X.DFL r5 = (X.DFL) r5
            java.lang.Object r4 = r0.A02
            X.E8A r4 = (X.E8A) r4
            X.A4p r3 = new X.A4p
            r3.<init>()
            r2 = 0
            java.lang.String r1 = r0.A04
            X.9zJ r1 = X.C20046A4p.A00(r3, r1, r2)
            java.lang.Object r0 = r0.A03
            X.DOZ r0 = (X.DOZ) r0
            X.C26209Cul.A01(r0, r5, r1, r4)
            return
        L_0x13ee:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x13f3 }
            throw r1
        L_0x13f3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x13f8:
            return
        L_0x13f9:
            java.lang.String r0 = "inviteContactUtils"
            goto L_0x1407
        L_0x13fc:
            java.lang.String r0 = "coreMessageStoreWrapper"
            goto L_0x1407
        L_0x13ff:
            java.lang.String r0 = "time"
            goto L_0x1407
        L_0x1402:
            java.lang.String r0 = "systemMessageFactory"
            goto L_0x1407
        L_0x1405:
            java.lang.String r0 = "paymentTransactionStore"
        L_0x1407:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x140c:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
            throw r0     // Catch:{ 1PN | IllegalArgumentException -> 0x1412 }
        L_0x1411:
            return
        L_0x1412:
            r1 = move-exception
            java.lang.String r0 = "NonMessageDataRequestManager/handleLinkPreviewRequest error in parsing request"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21456AkN.run():void");
    }

    public C21456AkN(C58102k9 r2, AnonymousClass9KN r3, C1418377d r4, String str) {
        this.A00 = 15;
        this.A01 = r2;
        this.A04 = str;
        this.A02 = r3;
        this.A03 = r4;
    }

    public C21456AkN(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A03 = obj3;
    }
}
