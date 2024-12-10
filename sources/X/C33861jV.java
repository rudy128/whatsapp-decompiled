package X;

/* renamed from: X.1jV  reason: invalid class name and case insensitive filesystem */
public final class C33861jV extends C31911gK {
    public final AnonymousClass1KB A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05 = C217517g.A00(32847);
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33861jV(X.AnonymousClass190 r17, X.AnonymousClass1KB r18, X.C18030ve r19, X.AnonymousClass1OZ r20, X.AnonymousClass1N7 r21, X.AnonymousClass10I r22, X.AnonymousClass00H r23, X.AnonymousClass00H r24, X.AnonymousClass00H r25, X.AnonymousClass00H r26, X.AnonymousClass00H r27, X.AnonymousClass00H r28) {
        /*
            r16 = this;
            r15 = 1
            r10 = r17
            X.C18070vi.A0d(r10, r15)
            r0 = 2
            r13 = r22
            X.C18070vi.A0d(r13, r0)
            r0 = 3
            r11 = r20
            X.C18070vi.A0d(r11, r0)
            r0 = 4
            r12 = r21
            X.C18070vi.A0d(r12, r0)
            r0 = 5
            r7 = r19
            X.C18070vi.A0d(r7, r0)
            r0 = 6
            r8 = r18
            X.C18070vi.A0d(r8, r0)
            r0 = 7
            r6 = r23
            X.C18070vi.A0d(r6, r0)
            r0 = 8
            r5 = r24
            X.C18070vi.A0d(r5, r0)
            r0 = 9
            r4 = r25
            X.C18070vi.A0d(r4, r0)
            r0 = 10
            r3 = r26
            X.C18070vi.A0d(r3, r0)
            r0 = 11
            r2 = r27
            X.C18070vi.A0d(r2, r0)
            r0 = 12
            r1 = r28
            X.C18070vi.A0d(r1, r0)
            int[] r14 = new int[r15]
            r9 = 0
            r0 = 253(0xfd, float:3.55E-43)
            r14[r9] = r0
            r9 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r9.A01 = r7
            r9.A00 = r8
            r9.A08 = r6
            r9.A03 = r5
            r9.A07 = r4
            r9.A02 = r3
            r9.A06 = r2
            r9.A04 = r1
            r0 = 32847(0x804f, float:4.6028E-41)
            X.11g r0 = X.C217517g.A00(r0)
            r9.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33861jV.<init>(X.190, X.1KB, X.0ve, X.1OZ, X.1N7, X.10I, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H):void");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C29621ca r26, int r27) {
        /*
            r25 = this;
            r0 = 1
            r10 = r26
            X.C18070vi.A0d(r10, r0)
            r1 = 253(0xfd, float:3.55E-43)
            r5 = r27
            if (r5 == r1) goto L_0x0021
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AvatarUpdateNotificationHandler/invalid notification type: "
            r1.append(r0)
            r1.append(r5)
        L_0x0019:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0020:
            return
        L_0x0021:
            java.lang.String r4 = "type"
            X.1MD r2 = r10.A0H(r4)
            r14 = 0
            if (r2 == 0) goto L_0x0047
            java.lang.String r1 = r2.A03
        L_0x002d:
            java.lang.String r3 = "avatars:update"
            boolean r1 = X.C18070vi.A18(r1, r3)
            if (r1 != 0) goto L_0x0049
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AvatarUpdateNotificationHandler/invalid type: "
            r1.append(r0)
            if (r2 == 0) goto L_0x0043
            java.lang.String r14 = r2.A03
        L_0x0043:
            r1.append(r14)
            goto L_0x0019
        L_0x0047:
            r1 = r14
            goto L_0x002d
        L_0x0049:
            r1 = r25
            X.00H r2 = r1.A07
            java.lang.Object r2 = r2.get()
            X.1Uk r2 = (X.C27021Uk) r2
            boolean r2 = r2.A01()
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = "AvatarUpdateNotificationHandler/received avatar update notification but user has no avatar"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            X.00H r1 = r1.A08
            java.lang.Object r3 = r1.get()
            X.6ue r3 = (X.C136936ue) r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "notificationType="
            r2.append(r1)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "avatar_notification_received_user_has_no_avatar"
            r3.A02(r0, r1, r2)
            return
        L_0x007d:
            X.8v4 r22 = X.C173438v4.A00     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "notification"
            X.C29621ca.A04(r10, r2)     // Catch:{ all -> 0x021a }
            X.2rm r9 = new X.2rm     // Catch:{ all -> 0x021a }
            r9.<init>()     // Catch:{ all -> 0x021a }
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "to"
            r16 = 0
            r15[r16] = r2     // Catch:{ all -> 0x021a }
            java.lang.Class<com.whatsapp.jid.UserJid> r11 = com.whatsapp.jid.UserJid.class
            r5 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r12 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x021a }
            r5 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r13 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x021a }
            r9.A05(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x021a }
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "from"
            r5[r16] = r2     // Catch:{ all -> 0x021a }
            java.lang.Class<X.8v4> r19 = X.C173438v4.class
            r17 = r9
            r18 = r10
            r20 = r12
            r21 = r13
            r23 = r5
            r24 = r16
            java.lang.Object r2 = r17.A05(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x020a
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x021a }
            r2[r16] = r4     // Catch:{ all -> 0x021a }
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r22 = r3
            r23 = r2
            java.lang.Object r2 = r17.A05(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x0202
            X.2ov r8 = X.C60982ov.A00     // Catch:{ all -> 0x021a }
            r3 = 22
            X.AhT r2 = new X.AhT     // Catch:{ all -> 0x021a }
            r2.<init>(r8, r3)     // Catch:{ all -> 0x021a }
            java.lang.Object r2 = r2.BCF(r10, r9)     // Catch:{ all -> 0x021a }
            X.9DC r2 = (X.AnonymousClass9DC) r2     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x01fa
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "fbid"
            r4[r16] = r2     // Catch:{ all -> 0x021a }
            r3 = 23
            X.AhT r2 = new X.AhT     // Catch:{ all -> 0x021a }
            r2.<init>(r8, r3)     // Catch:{ all -> 0x021a }
            java.lang.Object r5 = r9.A02(r10, r2, r4)     // Catch:{ all -> 0x021a }
            X.9CY r5 = (X.AnonymousClass9CY) r5     // Catch:{ all -> 0x021a }
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "revision"
            r4[r16] = r2     // Catch:{ all -> 0x021a }
            r3 = 24
            X.AhT r2 = new X.AhT     // Catch:{ all -> 0x021a }
            r2.<init>(r8, r3)     // Catch:{ all -> 0x021a }
            java.lang.Object r4 = r9.A02(r10, r2, r4)     // Catch:{ all -> 0x021a }
            X.9DN r4 = (X.AnonymousClass9DN) r4     // Catch:{ all -> 0x021a }
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "event_type"
            r6[r16] = r2     // Catch:{ all -> 0x021a }
            r3 = 25
            X.AhT r2 = new X.AhT     // Catch:{ all -> 0x021a }
            r2.<init>(r8, r3)     // Catch:{ all -> 0x021a }
            java.lang.Object r6 = r9.A02(r10, r2, r6)     // Catch:{ all -> 0x021a }
            X.9DN r6 = (X.AnonymousClass9DN) r6     // Catch:{ all -> 0x021a }
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "artifact"
            r7[r16] = r2     // Catch:{ all -> 0x021a }
            r3 = 26
            X.AhT r2 = new X.AhT     // Catch:{ all -> 0x021a }
            r2.<init>(r8, r3)     // Catch:{ all -> 0x021a }
            r21 = 0
            r23 = 10000(0x2710, double:4.9407E-320)
            r19 = r2
            r20 = r7
            java.util.ArrayList r2 = r17.A08(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x0212
            if (r6 == 0) goto L_0x0140
            java.lang.Object r2 = r6.A00     // Catch:{ all -> 0x021a }
            X.9CY r2 = (X.AnonymousClass9CY) r2     // Catch:{ all -> 0x021a }
            java.lang.String r14 = r2.A01     // Catch:{ all -> 0x021a }
        L_0x0140:
            java.lang.String r2 = "revision_update"
            boolean r2 = X.C18070vi.A18(r14, r2)     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x015a
            X.0ve r3 = r1.A01     // Catch:{ all -> 0x021a }
            r2 = 3275(0xccb, float:4.589E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x021a }
            boolean r0 = X.C18020vd.A05(r0, r3, r2)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x01ea
            if (r4 != 0) goto L_0x01cd
            java.lang.String r0 = "AvatarUpdateNotificationHandler/revision is null"
            goto L_0x01e7
        L_0x015a:
            java.lang.String r2 = "social_update"
            boolean r2 = X.C18070vi.A18(r14, r2)     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x01ea
            X.0ve r4 = r1.A01     // Catch:{ all -> 0x021a }
            r3 = 5979(0x175b, float:8.378E-42)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ all -> 0x021a }
            boolean r2 = X.C18020vd.A05(r2, r4, r3)     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x01ea
            if (r5 != 0) goto L_0x0174
            java.lang.String r0 = "AvatarUpdateNotificationHandler/social id is null"
            goto L_0x01e7
        L_0x0174:
            java.lang.String r4 = r5.A01     // Catch:{ all -> 0x021a }
            X.00H r2 = r1.A06     // Catch:{ all -> 0x021a }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x021a }
            X.6uQ r2 = (X.C136796uQ) r2     // Catch:{ all -> 0x021a }
            X.732 r2 = r2.A00()     // Catch:{ all -> 0x021a }
            r5 = 0
            if (r2 == 0) goto L_0x01cb
            X.77e r2 = r2.A04     // Catch:{ all -> 0x021a }
            java.lang.Object r2 = r2.A00     // Catch:{ all -> 0x021a }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x01cb
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x021a }
        L_0x0191:
            boolean r3 = X.C18070vi.A18(r4, r2)     // Catch:{ all -> 0x021a }
            X.00H r2 = r1.A04     // Catch:{ all -> 0x021a }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x021a }
            X.11p r2 = (X.C203011p) r2     // Catch:{ all -> 0x021a }
            if (r3 != 0) goto L_0x01a3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x021a }
            r5[r16] = r4     // Catch:{ all -> 0x021a }
        L_0x01a3:
            X.6uS r0 = r2.A01     // Catch:{ all -> 0x021a }
            java.io.File r0 = r0.A02(r5)     // Catch:{ all -> 0x021a }
            boolean r0 = X.C21721ArX.A05(r0)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x01b6
            X.1Sw r0 = r2.A00     // Catch:{ all -> 0x021a }
            java.util.concurrent.ConcurrentHashMap r0 = r0.A0F     // Catch:{ all -> 0x021a }
            r0.clear()     // Catch:{ all -> 0x021a }
        L_0x01b6:
            X.00H r0 = r1.A05     // Catch:{ all -> 0x021a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x021a }
            X.6cO r0 = (X.C126226cO) r0     // Catch:{ all -> 0x021a }
            X.5bm r0 = r0.A00     // Catch:{ all -> 0x021a }
            java.lang.Object r0 = r0.CQ0(r4)     // Catch:{ all -> 0x021a }
            boolean r0 = r0 instanceof X.AnonymousClass4PR     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x01ea
            java.lang.String r0 = "AvatarSocialStickerReloadSignal/unable to send signal"
            goto L_0x01e7
        L_0x01cb:
            r2 = r5
            goto L_0x0191
        L_0x01cd:
            java.lang.Object r0 = r4.A01     // Catch:{ all -> 0x021a }
            X.9CY r0 = (X.AnonymousClass9CY) r0     // Catch:{ all -> 0x021a }
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x021a }
            X.00H r0 = r1.A02     // Catch:{ all -> 0x021a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x021a }
            X.6xr r0 = (X.C138886xr) r0     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r0.A01()     // Catch:{ all -> 0x021a }
            boolean r0 = X.C18070vi.A18(r4, r0)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = "AvatarUpdateNotificationHandler/received notification for same revision, ignoring"
        L_0x01e7:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x021a }
        L_0x01ea:
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x021a }
            goto L_0x0220
        L_0x01ed:
            X.1KB r3 = r1.A00     // Catch:{ all -> 0x021a }
            r2 = 49
            X.7Qs r0 = new X.7Qs     // Catch:{ all -> 0x021a }
            r0.<init>(r2, r4, r1)     // Catch:{ all -> 0x021a }
            r3.A0J(r0)     // Catch:{ all -> 0x021a }
            goto L_0x01ea
        L_0x01fa:
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x021a }
            X.1UI r1 = new X.1UI     // Catch:{ all -> 0x021a }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x021a }
            goto L_0x0219
        L_0x0202:
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x021a }
            X.1UI r1 = new X.1UI     // Catch:{ all -> 0x021a }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x021a }
            goto L_0x0219
        L_0x020a:
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x021a }
            X.1UI r1 = new X.1UI     // Catch:{ all -> 0x021a }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x021a }
            goto L_0x0219
        L_0x0212:
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x021a }
            X.1UI r1 = new X.1UI     // Catch:{ all -> 0x021a }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x021a }
        L_0x0219:
            throw r1     // Catch:{ all -> 0x021a }
        L_0x021a:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x0220:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)
            if (r1 == 0) goto L_0x0020
            java.lang.String r0 = "AvatarUpdateNotificationHandler/Unable to process avatar update notification."
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33861jV.A05(X.1ca, int):void");
    }
}
