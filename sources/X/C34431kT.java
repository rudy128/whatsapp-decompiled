package X;

/* renamed from: X.1kT  reason: invalid class name and case insensitive filesystem */
public final class C34431kT extends C31911gK {
    public final AnonymousClass11S A00;
    public final C34401kQ A01;
    public final C34421kS A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34431kT(AnonymousClass190 r9, AnonymousClass11S r10, AnonymousClass1OZ r11, AnonymousClass1N7 r12, AnonymousClass10I r13, C34401kQ r14, C34421kS r15) {
        super(r9, r11, r12, r13, new int[]{246}, true);
        C18070vi.A0d(r9, 1);
        C18070vi.A0d(r13, 2);
        C18070vi.A0d(r11, 3);
        C18070vi.A0d(r12, 4);
        C18070vi.A0d(r10, 5);
        this.A00 = r10;
        this.A01 = r14;
        this.A02 = r15;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0098, code lost:
        if (r2 >= r8) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00f5, code lost:
        r2 = r4.A03;
        r3 = ((X.C34991lS) r2.get()).A00(X.C35011lV.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0103, code lost:
        if (r3 != null) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0105, code lost:
        r0 = "PrimaryDeviceWfalNotificationHandler/syncState/null user";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0109, code lost:
        ((X.C34991lS) r2.get()).A02(r3, new X.AnonymousClass7GS(r4, 3), (X.AnonymousClass705) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0119, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01d7, code lost:
        r1.CGF(new X.AnonymousClass7R1(r4, r3, r2, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0261, code lost:
        r4 = r5.A00;
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x026e, code lost:
        if (r4.A00.A0N() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0270, code lost:
        r4.A01.CGF(new X.C146827Qt(r4, r3, 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x027b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x028e, code lost:
        X.C31081ez.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02af, code lost:
        X.C18070vi.A0d(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C29621ca r11, int r12) {
        /*
            r10 = this;
            r6 = 1
            X.C18070vi.A0d(r11, r6)
            X.11S r0 = r10.A00
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0200
            X.1kQ r4 = r10.A01
            X.1ca r3 = r11.A0I()
            X.C18070vi.A0X(r3)
            java.lang.String r0 = "notification_metadata"
            java.lang.String r2 = r3.A00
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01e8
            java.lang.String r7 = "event"
            java.lang.String r0 = r3.A0P(r7)
            int r2 = r3.A0B(r0, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PrimaryDeviceWfalNotificationHandler/received event:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            X.C31081ez.A02(r0)
            java.lang.String r5 = "show_user_notif"
            switch(r2) {
                case 1: goto L_0x01b0;
                case 2: goto L_0x009e;
                case 3: goto L_0x027c;
                case 4: goto L_0x0175;
                case 5: goto L_0x011a;
                case 6: goto L_0x0063;
                case 7: goto L_0x01e0;
                default: goto L_0x0043;
            }
        L_0x0043:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unexpected value for event: "
            r1.append(r0)
            java.lang.String r0 = r3.A0P(r7)
            int r0 = r3.A0B(r0, r7)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0063:
            java.lang.String r1 = "sync_delay"
            java.lang.String r0 = r3.A0P(r1)
            long r8 = r3.A0E(r0, r1)
            X.00H r0 = r4.A05
            java.lang.Object r7 = r0.get()
            X.1lN r7 = (X.C34951lN) r7
            android.content.SharedPreferences r3 = r7.A04()
            java.lang.String r0 = "last_cache_update_time"
            r1 = 0
            long r5 = r3.getLong(r0, r1)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            X.11P r0 = r7.A02
            long r2 = X.AnonymousClass11P.A01(r0)
            long r2 = r2 - r5
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            if (r0 == 0) goto L_0x009a
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f5
        L_0x009a:
            java.lang.String r0 = "PrimaryDeviceWfalNotificationHandler/handleResyncState/not valid for cache sync"
            goto L_0x028e
        L_0x009e:
            java.lang.String r1 = "type"
            r0 = -1
            int r2 = r3.A0A(r1, r0)
            java.lang.String r0 = r3.A0P(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C18070vi.A0X(r0)
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "client_resync"
            java.lang.String r0 = r3.A0P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C18070vi.A0X(r0)
            boolean r5 = r0.booleanValue()
            if (r2 != 0) goto L_0x00d3
            X.00H r0 = r4.A07
            java.lang.Object r0 = r0.get()
            X.2iP r0 = (X.C57022iP) r0
            r0.A00()
        L_0x00d3:
            if (r1 == 0) goto L_0x00f3
            X.118 r0 = r4.A00
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131898556(0x7f1230bc, float:1.9432033E38)
            java.lang.String r3 = r1.getString(r0)
            X.C18070vi.A0X(r3)
            r2 = 44
            X.10I r1 = r4.A01
            X.7R1 r0 = new X.7R1
            r0.<init>((X.C34401kQ) r4, (java.lang.String) r3, (int) r2, (int) r6)
            r1.CGF(r0)
        L_0x00f3:
            if (r5 == 0) goto L_0x0291
        L_0x00f5:
            X.00H r2 = r4.A03
            java.lang.Object r1 = r2.get()
            X.1lS r1 = (X.C34991lS) r1
            X.1lW r0 = X.C35011lV.A00
            X.732 r3 = r1.A00(r0)
            if (r3 != 0) goto L_0x0109
            java.lang.String r0 = "PrimaryDeviceWfalNotificationHandler/syncState/null user"
            goto L_0x028e
        L_0x0109:
            java.lang.Object r2 = r2.get()
            X.1lS r2 = (X.C34991lS) r2
            r0 = 3
            X.7GS r1 = new X.7GS
            r1.<init>(r4, r0)
            r0 = 0
            r2.A02(r3, r1, r0)
            return
        L_0x011a:
            java.lang.String r0 = "npr"
            java.lang.String r0 = r3.A0P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C18070vi.A0X(r0)
            boolean r2 = r0.booleanValue()
            X.00H r0 = r4.A06
            java.lang.Object r1 = r0.get()
            X.1lN r1 = (X.C34951lN) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A06(r0)
            if (r2 != 0) goto L_0x015d
            X.00H r0 = r4.A03
            java.lang.Object r1 = r0.get()
            X.1lS r1 = (X.C34991lS) r1
            X.1lW r0 = X.C35011lV.A00
            X.732 r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x015d
            X.00H r0 = r4.A02
            java.lang.Object r1 = r0.get()
            X.6li r1 = (X.C131816li) r1
            X.31j r0 = new X.31j
            r0.<init>()
            r1.A00(r0)
            return
        L_0x015d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PrimaryDeviceWfalNotificationHandler/handleSuspendState/needs password reset ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") or null user"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x028e
        L_0x0175:
            java.lang.String r0 = "false"
            java.lang.String r0 = r3.A0Q(r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C18070vi.A0X(r0)
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "PrimaryDeviceWfalNotificationHandler/handleDeleted/cleaning state"
            X.C31081ez.A02(r0)
            X.00H r0 = r4.A07
            java.lang.Object r0 = r0.get()
            X.2iP r0 = (X.C57022iP) r0
            r0.A00()
            if (r1 == 0) goto L_0x0291
            X.118 r0 = r4.A00
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131898557(0x7f1230bd, float:1.9432035E38)
            java.lang.String r3 = r1.getString(r0)
            X.C18070vi.A0X(r3)
            r2 = 44
            X.10I r1 = r4.A01
            r6 = 2
            goto L_0x01d7
        L_0x01b0:
            java.lang.String r0 = r3.A0P(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C18070vi.A0X(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0291
            X.118 r0 = r4.A00
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131898555(0x7f1230bb, float:1.9432031E38)
            java.lang.String r3 = r1.getString(r0)
            X.C18070vi.A0X(r3)
            r2 = 43
            X.10I r1 = r4.A01
        L_0x01d7:
            X.7R1 r0 = new X.7R1
            r0.<init>((X.C34401kQ) r4, (java.lang.String) r3, (int) r2, (int) r6)
            r1.CGF(r0)
            return
        L_0x01e0:
            java.lang.String r1 = "Failure notification handling is not supported"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x01e8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unexpected tag: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0200:
            X.1kS r5 = r10.A02
            X.1ca r4 = r11.A0I()
            X.C18070vi.A0X(r4)
            java.lang.String r0 = "notification_metadata"
            java.lang.String r2 = r4.A00
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02b4
            java.lang.String r3 = "event"
            java.lang.String r0 = r4.A0P(r3)
            int r2 = r4.A0B(r0, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CompanionDeviceWfalNotificationHandler/received event:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            X.C31081ez.A02(r0)
            switch(r2) {
                case 1: goto L_0x029e;
                case 2: goto L_0x0254;
                case 3: goto L_0x029e;
                case 4: goto L_0x0261;
                case 5: goto L_0x0265;
                case 6: goto L_0x029e;
                case 7: goto L_0x029e;
                default: goto L_0x0234;
            }
        L_0x0234:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unexpected value for event: "
            r1.append(r0)
            java.lang.String r0 = r4.A0P(r3)
            int r0 = r4.A0B(r0, r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0254:
            java.lang.String r1 = "type"
            r0 = -1
            int r0 = r4.A0A(r1, r0)
            if (r0 == 0) goto L_0x0261
            java.lang.String r1 = "CompanionDeviceWfalNotificationHandler/handleUnlinking/ Skip handling of unlink notification for non self accounts"
            goto L_0x02af
        L_0x0261:
            X.1kR r4 = r5.A00
            r3 = 4
            goto L_0x0268
        L_0x0265:
            X.1kR r4 = r5.A00
            r3 = 3
        L_0x0268:
            X.11S r0 = r4.A00
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0291
            X.10I r2 = r4.A01
            r1 = 4
            X.7Qt r0 = new X.7Qt
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
            return
        L_0x027c:
            X.00H r0 = r4.A03
            java.lang.Object r1 = r0.get()
            X.1lS r1 = (X.C34991lS) r1
            X.1lW r0 = X.C35011lV.A00
            X.732 r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x0292
            java.lang.String r0 = "PrimaryDeviceWfalNotificationHandler/handleChangeSettings/null user"
        L_0x028e:
            X.C31081ez.A02(r0)
        L_0x0291:
            return
        L_0x0292:
            r0 = 0
            com.whatsapp.waffle.accountlinking.notification.PrimaryDeviceWfalNotificationHandler$handleChangeSettings$1 r1 = new com.whatsapp.waffle.accountlinking.notification.PrimaryDeviceWfalNotificationHandler$handleChangeSettings$1
            r1.<init>(r4, r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.AnonymousClass4GT.A00(r0, r1)
            return
        L_0x029e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CompanionDeviceWfalNotificationHandler/received an unsupported wfal notification event:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x02af:
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            return
        L_0x02b4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unexpected tag: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34431kT.A05(X.1ca, int):void");
    }
}
