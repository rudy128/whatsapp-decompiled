package X;

/* renamed from: X.1nP  reason: invalid class name and case insensitive filesystem */
public class C36141nP extends C31911gK {
    public final AnonymousClass1KB A00;
    public final AnonymousClass120 A01;
    public final C25001Mm A02;
    public final AnonymousClass1P3 A03;
    public final C25571Os A04;
    public final C27131Uv A05;
    public final C27101Us A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C36141nP(X.AnonymousClass190 r9, X.AnonymousClass1KB r10, X.AnonymousClass120 r11, X.C25001Mm r12, X.AnonymousClass1P3 r13, X.C25571Os r14, X.C27131Uv r15, X.C27101Us r16, X.AnonymousClass1OZ r17, X.AnonymousClass1N7 r18, X.AnonymousClass10I r19, X.AnonymousClass00H r20) {
        /*
            r8 = this;
            r0 = 1
            int[] r6 = new int[r0]
            r7 = 0
            r0 = 240(0xf0, float:3.36E-43)
            r6[r7] = r0
            r1 = r8
            r2 = r9
            r3 = r17
            r4 = r18
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A00 = r10
            r8.A07 = r5
            r8.A04 = r14
            r8.A02 = r12
            r0 = r20
            r8.A08 = r0
            r8.A01 = r11
            r8.A03 = r13
            r0 = r16
            r8.A06 = r0
            r8.A05 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36141nP.<init>(X.190, X.1KB, X.120, X.1Mm, X.1P3, X.1Os, X.1Uv, X.1Us, X.1OZ, X.1N7, X.10I, X.00H):void");
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r3v19, types: [X.3CF] */
    /* JADX WARNING: type inference failed for: r3v20, types: [X.3CF] */
    /* JADX WARNING: type inference failed for: r5v27, types: [X.Aiu] */
    /* JADX WARNING: type inference failed for: r5v28, types: [X.Aiu] */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x042d, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0430, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04dd, code lost:
        r1.append(r10);
        r1.append(r7);
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04e7, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05d0, code lost:
        r1.CGF(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x06d0, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0260, code lost:
        if (r10 != null) goto L_0x0262;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0720  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C29621ca r26, int r27) {
        /*
            r25 = this;
            r4 = 0
            r2 = r26
            X.1ca r5 = r2.A0J(r4)
            if (r5 == 0) goto L_0x0739
            java.lang.String r1 = "t"
            r0 = 0
            java.lang.String r15 = r2.A0Q(r1, r0)
            r2 = r25
            com.whatsapp.jid.Jid r3 = r2.A00
            X.1BI r1 = X.C22971Dz.A00(r3)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A01(r1)
            X.1E0 r1 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r16 = r1.A02(r3)
            com.whatsapp.jid.Jid r0 = r2.A01
            X.1BI r3 = X.C22971Dz.A00(r0)
            com.whatsapp.jid.DeviceJid r7 = r1.A02(r0)
            java.lang.String r1 = r5.A00
            int r0 = r1.hashCode()
            java.lang.String r8 = "enc"
            r9 = -1
            switch(r0) {
                case -1607257499: goto L_0x014d;
                case 100570: goto L_0x0158;
                case 1671308008: goto L_0x0161;
                case 1901043637: goto L_0x016c;
                default: goto L_0x003b;
            }
        L_0x003b:
            java.lang.String r13 = "registration"
            java.lang.String r14 = "retry"
            java.lang.String r22 = "count"
            java.lang.String r0 = "request"
            java.lang.String r10 = "; retryCount="
            java.lang.String r1 = "invalid registration node"
            switch(r9) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0177;
                case 2: goto L_0x01f2;
                case 3: goto L_0x0416;
                default: goto L_0x004a;
            }
        L_0x004a:
            return
        L_0x004b:
            X.1ca r9 = r5.A0K(r0)
            java.lang.String r8 = "deny"
            X.1ca r0 = r5.A0K(r8)
            if (r9 == 0) goto L_0x00af
            int r4 = r9.A0A(r14, r4)
            X.1ca r0 = r5.A0K(r13)
            if (r0 == 0) goto L_0x0406
            byte[] r5 = r0.A01
            if (r5 == 0) goto L_0x0400
            int r9 = r5.length
            r0 = 4
            if (r9 != r0) goto L_0x0400
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/handleLocationNotifications/location key retry/participant="
            r1.append(r0)
            r1.append(r6)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onLocationKeyRetryNotification; remoteChatJid="
            r1.append(r0)
            r1.append(r3)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C22971Dz.A0e(r3)
            if (r0 != 0) goto L_0x03fc
            boolean r0 = X.C22971Dz.A0N(r3)
            if (r0 != 0) goto L_0x03fc
            if (r7 != 0) goto L_0x0306
            java.lang.String r0 = "LocationNotificationHandler/axolotl received location key retry notification for non-device jid"
            goto L_0x04e7
        L_0x00af:
            if (r0 == 0) goto L_0x0413
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onLocationKeyDenyNotification; jid="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C22971Dz.A0e(r3)
            if (r0 != 0) goto L_0x040f
            boolean r0 = X.C22971Dz.A0N(r3)
            if (r0 != 0) goto L_0x040f
            X.1Uv r4 = r2.A05
            com.whatsapp.jid.UserJid r5 = X.C22941Dw.A01(r3)
            X.C17960vV.A07(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationSharingManager/onReceiveDenySharing; jid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.lang.Object r6 = r4.A0T
            monitor-enter(r6)
            java.util.Map r0 = X.C27131Uv.A05(r4)     // Catch:{ all -> 0x040c }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x040c }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x040c }
        L_0x0102:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x0138
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x040c }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x040c }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x040c }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x040c }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x040c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x040c }
        L_0x011c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x0102
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x040c }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x040c }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x011c
            java.lang.Object r0 = r2.getKey()     // Catch:{ all -> 0x040c }
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ all -> 0x040c }
            r7.add(r0)     // Catch:{ all -> 0x040c }
            goto L_0x011c
        L_0x0138:
            monitor-exit(r6)     // Catch:{ all -> 0x040c }
            java.util.Iterator r1 = r7.iterator()
        L_0x013d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r1.next()
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.C27131Uv.A08(r0, r5, r4)
            goto L_0x013d
        L_0x014d:
            java.lang.String r0 = "encrypt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            r9 = 0
            goto L_0x003b
        L_0x0158:
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x003b
            r9 = 1
            goto L_0x003b
        L_0x0161:
            java.lang.String r0 = "disable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            r9 = 2
            goto L_0x003b
        L_0x016c:
            java.lang.String r0 = "location"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            r9 = 3
            goto L_0x003b
        L_0x0177:
            r0 = r22
            int r3 = r5.A0A(r0, r4)
            X.9r6 r7 = X.AnonymousClass9RW.A00(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "LocationNotificationHandler/app/xmpp/recv/notification location key "
            r5.append(r0)
            r5.append(r6)
            r4 = 32
            r5.append(r4)
            r5.append(r15)
            r5.append(r4)
            long r0 = java.lang.System.currentTimeMillis()
            r5.append(r0)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/on-location-key-notification; retryCount="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C17960vV.A07(r16)
            X.1P3 r0 = r2.A03
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x01dc
            X.10I r1 = r2.A07
            r10 = 28
            X.Aiu r0 = new X.Aiu
            r5 = r0
            r6 = r2
            r8 = r16
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x05d0
        L_0x01dc:
            X.00H r0 = r2.A08
            java.lang.Object r1 = r0.get()
            X.1Ot r1 = (X.C25581Ot) r1
            r10 = 29
            X.Aiu r0 = new X.Aiu
            r5 = r0
            r6 = r2
            r8 = r16
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x06d0
        L_0x01f2:
            java.lang.String r4 = "id"
            r0 = -1
            long r0 = r5.A0D(r4, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "LocationNotificationHandler/on-location-disabled-notification; sequenceNumber="
            r5.append(r4)
            r5.append(r0)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.1Uv r4 = r2.A05
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "LocationSharingManager/onReceiveStopSharing; jid="
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = "; participant="
            r5.append(r2)
            r5.append(r6)
            java.lang.String r2 = "; sequenceNumber="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r2 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.Object r5 = r4.A0T
            monitor-enter(r5)
            java.util.Map r9 = X.C27131Uv.A05(r4)     // Catch:{ all -> 0x0303 }
            java.lang.Object r10 = r9.get(r3)     // Catch:{ all -> 0x0303 }
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ all -> 0x0303 }
            if (r10 != 0) goto L_0x0262
            boolean r2 = X.C22971Dz.A0d(r3)     // Catch:{ all -> 0x0303 }
            if (r2 == 0) goto L_0x02dd
            X.00H r2 = r4.A0Q     // Catch:{ all -> 0x0303 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0303 }
            X.2qa r2 = (X.C61972qa) r2     // Catch:{ all -> 0x0303 }
            r7 = r3
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7     // Catch:{ all -> 0x0303 }
            X.1Ln r2 = r2.A00     // Catch:{ all -> 0x0303 }
            com.whatsapp.jid.UserJid r2 = r2.A0F(r7)     // Catch:{ all -> 0x0303 }
            java.lang.Object r10 = r9.get(r2)     // Catch:{ all -> 0x0303 }
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ all -> 0x0303 }
            if (r10 == 0) goto L_0x02dd
        L_0x0262:
            if (r6 != 0) goto L_0x0265
            goto L_0x0267
        L_0x0265:
            r12 = r6
            goto L_0x026b
        L_0x0267:
            com.whatsapp.jid.UserJid r12 = X.C22941Dw.A01(r3)     // Catch:{ all -> 0x0303 }
        L_0x026b:
            java.lang.Object r2 = r10.get(r12)     // Catch:{ all -> 0x0303 }
            X.2e4 r2 = (X.C54392e4) r2     // Catch:{ all -> 0x0303 }
            if (r2 == 0) goto L_0x02dd
            X.205 r2 = r2.A02     // Catch:{ all -> 0x0303 }
            X.219 r2 = X.C27131Uv.A03(r4, r2)     // Catch:{ all -> 0x0303 }
            android.util.Pair r11 = android.util.Pair.create(r3, r12)     // Catch:{ all -> 0x0303 }
            r14 = 0
            if (r2 == 0) goto L_0x028c
            long r7 = r2.A01     // Catch:{ all -> 0x0303 }
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x028c
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x028c
            goto L_0x02d3
        L_0x028c:
            java.util.Map r13 = r4.A0a     // Catch:{ all -> 0x0303 }
            java.lang.Object r7 = r13.get(r11)     // Catch:{ all -> 0x0303 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0303 }
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x02a9
            if (r7 == 0) goto L_0x02a2
            long r7 = r7.longValue()     // Catch:{ all -> 0x0303 }
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x02a9
        L_0x02a2:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0303 }
            r13.put(r11, r0)     // Catch:{ all -> 0x0303 }
        L_0x02a9:
            java.lang.Object r0 = r10.remove(r12)     // Catch:{ all -> 0x0303 }
            X.2e4 r0 = (X.C54392e4) r0     // Catch:{ all -> 0x0303 }
            X.C27131Uv.A0D(r4, r0)     // Catch:{ all -> 0x0303 }
            X.1Uu r2 = r4.A0K     // Catch:{ all -> 0x0303 }
            r1 = 0
            if (r6 == 0) goto L_0x02cb
            java.util.List r0 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x0303 }
            X.C27121Uu.A01(r3, r2, r0, r1)     // Catch:{ all -> 0x0303 }
        L_0x02be:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0303 }
            if (r0 == 0) goto L_0x02c7
            r9.remove(r3)     // Catch:{ all -> 0x0303 }
        L_0x02c7:
            X.C27131Uv.A0F(r4, r9)     // Catch:{ all -> 0x0303 }
            goto L_0x02dd
        L_0x02cb:
            java.util.List r0 = java.util.Collections.singletonList(r3)     // Catch:{ all -> 0x0303 }
            X.C27121Uu.A03(r2, r0, r1)     // Catch:{ all -> 0x0303 }
            goto L_0x02be
        L_0x02d3:
            java.lang.String r0 = "LocationSharingManager/onReceiveStopSharing; received old sequence number; skip stopping"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0303 }
            java.util.Map r0 = r4.A0a     // Catch:{ all -> 0x0303 }
            r0.remove(r11)     // Catch:{ all -> 0x0303 }
        L_0x02dd:
            monitor-exit(r5)     // Catch:{ all -> 0x0303 }
            java.util.List r0 = r4.A0X
            java.util.Iterator r1 = r0.iterator()
        L_0x02e4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02f4
            java.lang.Object r0 = r1.next()
            X.3Lt r0 = (X.C72393Lt) r0
            r0.C2g(r3, r6)
            goto L_0x02e4
        L_0x02f4:
            X.C27131Uv.A0B(r4)
            android.os.Handler r2 = r4.A06
            r1 = 2
            X.7Qr r0 = new X.7Qr
            r0.<init>(r4, r3, r1)
            r2.post(r0)
            return
        L_0x0303:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0303 }
            throw r0
        L_0x0306:
            r0 = 0
            int r3 = X.A8G.A01(r5, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/axolotl got location retry request "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " with "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            if (r4 <= r0) goto L_0x033b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "LocationNotificationHandler/axolotl skipping retry; reached max retry; jid="
            goto L_0x04dd
        L_0x033b:
            X.1Uv r6 = r2.A05
            com.whatsapp.jid.UserJid r5 = r7.userJid
            java.lang.Object r1 = r6.A0U
            monitor-enter(r1)
            java.util.HashSet r0 = X.C27131Uv.A04(r6)     // Catch:{ all -> 0x03f9 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x03f9 }
            monitor-exit(r1)     // Catch:{ all -> 0x03f9 }
            if (r0 != 0) goto L_0x03b6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/axolotl skipping retry; user should not get location key; jid="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1Us r0 = r2.A06
            com.whatsapp.jid.UserJid r3 = r7.userJid
            X.00H r5 = r0.A02
            java.lang.Object r0 = r5.get()
            X.1OZ r0 = (X.AnonymousClass1OZ) r0
            java.lang.String r2 = r0.A0B()
            r0 = 3
            X.1MD[] r4 = new X.AnonymousClass1MD[r0]
            java.lang.String r0 = "id"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r0, (java.lang.String) r2)
            r0 = 0
            r4[r0] = r1
            java.lang.String r0 = "to"
            X.1MD r1 = new X.1MD
            r1.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r0)
            r0 = 1
            r4[r0] = r1
            java.lang.String r2 = "type"
            java.lang.String r0 = "location"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 2
            r4[r0] = r1
            r3 = 0
            X.1ca r2 = new X.1ca
            r2.<init>(r8, r3)
            java.lang.String r0 = "encrypt"
            X.1ca r1 = new X.1ca
            r1.<init>((X.C29621ca) r2, (java.lang.String) r0, (X.AnonymousClass1MD[]) r3)
            java.lang.String r0 = "notification"
            X.1ca r2 = new X.1ca
            r2.<init>((X.C29621ca) r1, (java.lang.String) r0, (X.AnonymousClass1MD[]) r4)
            java.lang.Object r1 = r5.get()
            X.1OZ r1 = (X.AnonymousClass1OZ) r1
            r0 = 126(0x7e, float:1.77E-43)
            r1.A0O(r2, r0)
            return
        L_0x03b6:
            com.whatsapp.jid.UserJid r0 = r7.userJid
            boolean r0 = r6.A0e(r0, r4)
            if (r0 != 0) goto L_0x03c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "LocationNotificationHandler/axolotl skipping retry; retry too soon; jid="
            goto L_0x04dd
        L_0x03c7:
            X.1P3 r0 = r2.A03
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x03e1
            X.10I r1 = r2.A07
            r13 = 10
            X.3Cq r0 = new X.3Cq
            r8 = r0
            r9 = r2
            r10 = r4
            r11 = r7
            r12 = r3
            r8.<init>((java.lang.Object) r9, (int) r10, (java.lang.Object) r11, (int) r12, (int) r13)
            r1.CGF(r0)
            return
        L_0x03e1:
            X.00H r0 = r2.A08
            java.lang.Object r1 = r0.get()
            X.1Ot r1 = (X.C25581Ot) r1
            r13 = 11
            X.3Cq r0 = new X.3Cq
            r8 = r0
            r9 = r2
            r10 = r4
            r11 = r7
            r12 = r3
            r8.<init>((java.lang.Object) r9, (int) r10, (java.lang.Object) r11, (int) r12, (int) r13)
            r1.A02(r0)
            return
        L_0x03f9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03f9 }
            throw r0
        L_0x03fc:
            java.lang.String r0 = "LocationNotificationHandler/axolotl received location key retry notification sent to a group or broadcast"
            goto L_0x04e7
        L_0x0400:
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0406:
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x040c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x040c }
            throw r0
        L_0x040f:
            java.lang.String r0 = "LocationNotificationHandler/axolotl received location key deny notification sent to a group or broadcast"
            goto L_0x04e7
        L_0x0413:
            java.lang.String r0 = "LocationNotificationHandler/handleLocationNotifications/none of request nor deny node exists"
            goto L_0x042d
        L_0x0416:
            X.1ca r0 = r5.A0K(r0)
            X.1ca r11 = r5.A0K(r8)
            java.lang.String r6 = "final"
            r12 = 0
            java.lang.String r6 = r5.A0Q(r6, r12)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L_0x0431
            java.lang.String r0 = "LocationNotificationHandler/handleLocationNotifications/final attribute is empty"
        L_0x042d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0431:
            java.lang.String r9 = "; msgId="
            java.lang.String r8 = "context"
            if (r0 == 0) goto L_0x05ed
            int r12 = r0.A0A(r14, r4)
            X.1ca r0 = r5.A0K(r13)
            if (r0 == 0) goto L_0x06ff
            byte[] r4 = r0.A01
            if (r4 == 0) goto L_0x06f9
            int r11 = r4.length
            r0 = 4
            if (r11 != r0) goto L_0x06f9
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r11 = r5.A0F(r0, r8)
            X.1BI r11 = (X.AnonymousClass1BI) r11
            if (r11 != 0) goto L_0x0454
            r11 = r3
        L_0x0454:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/handleLocationNotifications/final live location retry notification; contextJid="
            r1.append(r0)
            r1.append(r11)
            r1.append(r9)
            r1.append(r6)
            r1.append(r10)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; jid="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; contextJid="
            r1.append(r0)
            r1.append(r11)
            r1.append(r9)
            r1.append(r6)
            r1.append(r10)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C22971Dz.A0e(r3)
            if (r0 != 0) goto L_0x05e9
            boolean r0 = X.C22971Dz.A0N(r3)
            if (r0 != 0) goto L_0x05e9
            r0 = 0
            int r21 = X.A8G.A01(r4, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl got final location retry request; retryCount="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r10 = "; targetDeviceJid="
            r1.append(r10)
            r1.append(r7)
            java.lang.String r0 = "; targetRegistrationIdInt="
            r1.append(r0)
            r0 = r21
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            if (r12 <= r0) goto L_0x04eb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl skipping retry; reached max retry; jid="
        L_0x04dd:
            r1.append(r10)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
        L_0x04e7:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x04eb:
            r0 = 1
            X.205 r8 = new X.205
            r8.<init>(r11, r6, r0)
            X.1Uv r1 = r2.A05
            X.C17960vV.A07(r7)
            com.whatsapp.jid.UserJid r0 = r7.userJid
            r24 = r0
            X.219 r14 = X.C27131Uv.A03(r1, r8)
            if (r14 == 0) goto L_0x05d4
            java.lang.Object r5 = r1.A0U
            monitor-enter(r5)
            java.util.Map r0 = X.C27131Uv.A06(r1)     // Catch:{ all -> 0x06f6 }
            X.1BI r3 = r8.A00     // Catch:{ all -> 0x06f6 }
            java.lang.Object r13 = r0.get(r3)     // Catch:{ all -> 0x06f6 }
            X.2er r13 = (X.C54882er) r13     // Catch:{ all -> 0x06f6 }
            r19 = 1000(0x3e8, double:4.94E-321)
            if (r13 == 0) goto L_0x054c
            X.00H r0 = r1.A0O     // Catch:{ all -> 0x06f6 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x06f6 }
            X.121 r0 = (X.AnonymousClass121) r0     // Catch:{ all -> 0x06f6 }
            boolean r0 = r0.BfY(r8)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x052a
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x06f6 }
            r1.A0V(r3)     // Catch:{ all -> 0x06f6 }
        L_0x0527:
            monitor-exit(r5)     // Catch:{ all -> 0x06f6 }
            goto L_0x05d4
        L_0x052a:
            X.2nL r0 = r13.A00     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x054c
            java.util.List r4 = r13.A03     // Catch:{ all -> 0x06f6 }
            r0 = r24
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x054c
            X.2nL r13 = r13.A00     // Catch:{ all -> 0x06f6 }
            long r0 = r13.A05     // Catch:{ all -> 0x06f6 }
            long r3 = r14.A0I     // Catch:{ all -> 0x06f6 }
            long r0 = r0 - r3
            long r0 = r0 / r19
            int r3 = (int) r0     // Catch:{ all -> 0x06f6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x06f6 }
            android.util.Pair r4 = android.util.Pair.create(r13, r0)     // Catch:{ all -> 0x06f6 }
            monitor-exit(r5)     // Catch:{ all -> 0x06f6 }
            goto L_0x05b8
        L_0x054c:
            X.2nL r13 = r14.A02     // Catch:{ all -> 0x06f6 }
            if (r13 == 0) goto L_0x0527
            X.1Uu r0 = r1.A0K     // Catch:{ all -> 0x06f6 }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x06f6 }
            java.lang.String r1 = r8.A01     // Catch:{ all -> 0x06f6 }
            X.1Ut r0 = r0.A00     // Catch:{ Exception -> 0x06ea }
            X.1at r18 = r0.get()     // Catch:{ Exception -> 0x06ea }
            r0 = r18
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x06e0 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x06e0 }
            r23 = r0
            java.lang.String r17 = "SELECT COUNT(*) AS count FROM location_sharer WHERE remote_jid = ? AND from_me = ? AND remote_resource = ? AND message_id = ?"
            r0 = 4
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ all -> 0x06e0 }
            java.lang.String r0 = r3.getRawString()     // Catch:{ all -> 0x06e0 }
            r16 = 0
            r15[r16] = r0     // Catch:{ all -> 0x06e0 }
            java.lang.String r0 = "1"
            r4 = 1
            r15[r4] = r0     // Catch:{ all -> 0x06e0 }
            java.lang.String r3 = r24.getRawString()     // Catch:{ all -> 0x06e0 }
            r0 = 2
            r15[r0] = r3     // Catch:{ all -> 0x06e0 }
            r0 = 3
            r15[r0] = r1     // Catch:{ all -> 0x06e0 }
            java.lang.String r0 = "isLocationReceiver/QUERY_LOCATION_SHARER"
            r3 = r23
            r1 = r17
            android.database.Cursor r3 = r3.A0A(r1, r0, r15)     // Catch:{ all -> 0x06e0 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x06d4 }
            if (r0 == 0) goto L_0x059f
            r0 = r22
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x06d4 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x06d4 }
            if (r0 != r4) goto L_0x059f
            r16 = 1
        L_0x059f:
            r3.close()     // Catch:{ all -> 0x06e0 }
            r18.close()     // Catch:{ Exception -> 0x06ea }
            if (r16 == 0) goto L_0x0527
            long r3 = r13.A05     // Catch:{ all -> 0x06f6 }
            long r0 = r14.A0I     // Catch:{ all -> 0x06f6 }
            long r3 = r3 - r0
            long r3 = r3 / r19
            int r0 = (int) r3     // Catch:{ all -> 0x06f6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x06f6 }
            android.util.Pair r4 = android.util.Pair.create(r13, r0)     // Catch:{ all -> 0x06f6 }
            monitor-exit(r5)     // Catch:{ all -> 0x06f6 }
        L_0x05b8:
            if (r4 == 0) goto L_0x05d4
            X.1P3 r0 = r2.A03
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x06bc
            X.10I r1 = r2.A07
            X.3CF r0 = new X.3CF
            r3 = r0
            r5 = r7
            r6 = r2
            r7 = r8
            r8 = r12
            r9 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x05d0:
            r1.CGF(r0)
            return
        L_0x05d4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl skipping retry; final location message not found; contextJid="
            r1.append(r0)
            r1.append(r11)
            r1.append(r9)
            r1.append(r6)
            goto L_0x04dd
        L_0x05e9:
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl received location key retry notification sent to a group or broadcast"
            goto L_0x04e7
        L_0x05ed:
            if (r11 == 0) goto L_0x06b8
            r0 = r22
            int r4 = r11.A0A(r0, r4)
            java.lang.String r0 = "source"
            java.lang.String r1 = r5.A0Q(r0, r12)
            java.lang.String r0 = "cache"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x06b4
            int r0 = java.lang.Integer.parseInt(r15)
            long r0 = (long) r0
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
        L_0x060c:
            java.lang.Class<X.1BI> r12 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r12 = r5.A0F(r12, r8)
            X.1BI r12 = (X.AnonymousClass1BI) r12
            X.9r6 r8 = X.AnonymousClass9RW.A00(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r5 = "LocationNotificationHandler/handleLocationNotifications/final live location notification; remoteChatJid="
            r11.append(r5)
            r11.append(r3)
            java.lang.String r14 = "; contextJid="
            r11.append(r14)
            r11.append(r12)
            r11.append(r9)
            r11.append(r6)
            r11.append(r10)
            r11.append(r4)
            java.lang.String r13 = "; cachedTime="
            r11.append(r13)
            r11.append(r0)
            java.lang.String r5 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r5 = "LocationNotificationHandler/onFinalLocationNotification/fromJid="
            r11.append(r5)
            r11.append(r3)
            r11.append(r14)
            r11.append(r12)
            r11.append(r9)
            r11.append(r6)
            r11.append(r10)
            r11.append(r4)
            r11.append(r13)
            r11.append(r0)
            java.lang.String r5 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r9 = 2
            boolean r5 = X.C22971Dz.A0e(r3)
            if (r5 != 0) goto L_0x0684
            boolean r5 = X.C22971Dz.A0e(r12)
            r16 = r7
            if (r5 == 0) goto L_0x0684
            r3 = r12
        L_0x0684:
            X.30J r14 = new X.30J
            r15 = r3
            r17 = r2
            r18 = r6
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            int r7 = r8.A00
            r5 = 3
            if (r7 != r5) goto L_0x06aa
            if (r4 <= 0) goto L_0x0705
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version for retry final location notification; ciphertextVersion="
        L_0x069e:
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            goto L_0x04e7
        L_0x06aa:
            if (r4 != 0) goto L_0x0705
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version for final location notification; ciphertextVersion="
            goto L_0x069e
        L_0x06b4:
            r0 = 0
            goto L_0x060c
        L_0x06b8:
            java.lang.String r0 = "LocationNotificationHandler/handleLocationNotifications/none of request nor enc node exists"
            goto L_0x042d
        L_0x06bc:
            X.00H r0 = r2.A08
            java.lang.Object r1 = r0.get()
            X.1Ot r1 = (X.C25581Ot) r1
            X.3CF r0 = new X.3CF
            r3 = r0
            r5 = r7
            r6 = r2
            r7 = r8
            r8 = r12
            r9 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x06d0:
            r1.A02(r0)
            return
        L_0x06d4:
            r1 = move-exception
            if (r3 == 0) goto L_0x06df
            r3.close()     // Catch:{ all -> 0x06db }
            goto L_0x06df
        L_0x06db:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x06e0 }
        L_0x06df:
            throw r1     // Catch:{ all -> 0x06e0 }
        L_0x06e0:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x06e5 }
            goto L_0x06e9
        L_0x06e5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x06ea }
        L_0x06e9:
            throw r1     // Catch:{ Exception -> 0x06ea }
        L_0x06ea:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/isLocationReceiver/error checking location sharer"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x06f6 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x06f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x06f6 }
            throw r0     // Catch:{ all -> 0x06f6 }
        L_0x06f6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x06f6 }
            throw r0
        L_0x06f9:
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x06ff:
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0705:
            X.1P3 r5 = r2.A03
            boolean r5 = r5.A0Y()
            if (r5 == 0) goto L_0x0720
            X.10I r5 = r2.A07
            X.AjL r13 = new X.AjL
            r18 = r8
            r19 = r6
            r20 = r4
            r21 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r5.CGF(r13)
            return
        L_0x0720:
            X.00H r5 = r2.A08
            java.lang.Object r5 = r5.get()
            X.1Ot r5 = (X.C25581Ot) r5
            X.AjL r13 = new X.AjL
            r18 = r8
            r19 = r6
            r20 = r4
            r21 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r5.A02(r13)
            return
        L_0x0739:
            java.lang.String r1 = "invalid location notification"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36141nP.A05(X.1ca, int):void");
    }
}
