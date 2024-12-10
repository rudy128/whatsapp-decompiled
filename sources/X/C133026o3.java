package X;

/* renamed from: X.6o3  reason: invalid class name and case insensitive filesystem */
public final class C133026o3 {
    public final AnonymousClass118 A00;
    public final C32981i4 A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass11P A03;
    public final C27301Vn A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass5YR r21, java.lang.String r22) {
        /*
            r20 = this;
            r9 = 1
            r18 = r21
            r10 = r18
            X.Ai4 r10 = (X.C21319Ai4) r10
            X.9gz r13 = r10.A07
            if (r13 != 0) goto L_0x0011
            java.lang.String r0 = "PSANotificationComposer/null primary creative"
        L_0x000d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0010:
            return
        L_0x0011:
            r8 = r20
            X.118 r0 = r8.A00
            android.content.Context r7 = X.C108945cZ.A0E(r0)
            X.1yL r1 = X.C42541yL.A00
            X.1M9 r0 = r8.A02
            X.1E7 r0 = r0.A0E(r1)
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "PushPSANotificationComposer/null server contact"
            goto L_0x000d
        L_0x0026:
            java.lang.String r17 = X.C108985cd.A0f()
            r0 = 0
            X.73t r6 = new X.73t
            r6.<init>(r7, r0)
            r0 = 2131102224(0x7f060a10, float:1.781688E38)
            int r0 = X.C19740yt.A00(r7, r0)
            r6.A00 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r6.A09(r0)
            r0 = 3
            r6.A06(r0)
            r0 = 0
            r6.A03 = r0
            r6.A0G(r9)
            r6.A06 = r0
            java.lang.String r0 = "status"
            r6.A0L = r0
            java.lang.String r0 = r13.A06
            r6.A0E(r0)
            java.lang.String r0 = r13.A05
            r6.A0D(r0)
            java.lang.String r5 = r10.A0F
            int r0 = r10.A00
            r19 = r0
            r1 = 11231(0x2bdf, float:1.5738E-41)
            android.content.Intent r14 = X.C17880vN.A0A()
            java.lang.String r12 = "com.whatsapp.waquickpromotionclient.ui.PushPsaNotificationActivity"
            r14.setClassName(r7, r12)
            java.lang.String r0 = r14.getAction()
            r14.setAction(r0)
            java.lang.String r4 = "is_dismiss_intent"
            r14.putExtra(r4, r9)
            java.lang.String r3 = "surface_id"
            r14.putExtra(r3, r1)
            java.lang.String r2 = "campaign_id"
            r14.putExtra(r2, r5)
            java.lang.String r1 = "eligibility_duration_after_impression_ms"
            r0 = r19
            r14.putExtra(r1, r0)
            r11 = r22
            if (r22 == 0) goto L_0x009d
            java.lang.String r0 = "inorganic_notification_type"
            r14.putExtra(r0, r11)
            java.lang.String r15 = "inorganic_notification_id"
            r0 = r17
            r14.putExtra(r15, r0)
            java.lang.String r0 = "inorganic_notification_promotion_id"
            r14.putExtra(r0, r5)
        L_0x009d:
            java.lang.String r0 = "com.whatsapp.waquickpromotionclient.ui.PushPsaNotificationAction"
            r14.setAction(r0)
            long r15 = java.lang.System.currentTimeMillis()
            int r0 = (int) r15
            android.app.PendingIntent r0 = X.C17880vN.A07(r7, r14, r0)
            X.C18070vi.A0X(r0)
            android.app.Notification r14 = r6.A08
            r14.deleteIntent = r0
            X.9fz r0 = r13.A01
            if (r0 != 0) goto L_0x011f
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/no primary action"
        L_0x00b8:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00bb:
            r0 = 2131231578(0x7f08035a, float:1.807924E38)
            r14.icon = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00ca
            java.lang.String r0 = "failure_notifications@1"
            r6.A0M = r0
        L_0x00ca:
            X.00H r0 = r8.A06
            java.lang.Object r7 = r0.get()
            X.6wx r7 = (X.C138366wx) r7
            r4 = 11231(0x2bdf, float:1.5738E-41)
            X.62R r1 = new X.62R
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0i()
            r1.A00 = r0
            r1.A01 = r5
            X.18K r0 = r7.A00
            r0.CC7(r1)
            X.1OX r3 = r7.A03
            r2 = 0
            com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1 r1 = new com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1
            r0 = r18
            r1.<init>(r7, r0, r2, r4)
            X.AnonymousClass3MX.A1Q(r1, r3)
            java.lang.String r0 = r10.A0D
            if (r0 != 0) goto L_0x011a
            r3 = r5
        L_0x00f8:
            X.1Vn r2 = r8.A04
            android.app.Notification r1 = r6.A05()
            X.C18070vi.A0X(r1)
            r0 = 71
            r2.BkS(r3, r0, r1)
            if (r22 == 0) goto L_0x0010
            X.00H r0 = r8.A05
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.6pl r0 = (X.C133946pl) r0
            r1 = 0
            r2 = r1
            r4 = r11
            r6 = r9
            r3 = r17
            r0.A01(r1, r2, r3, r4, r5, r6)
            return
        L_0x011a:
            java.lang.String r3 = X.C17900vP.A0A(r5, r0)
            goto L_0x00f8
        L_0x011f:
            java.lang.String r15 = r0.A03
            if (r15 == 0) goto L_0x0184
            boolean r0 = X.AnonymousClass1YF.A0T(r15)
            if (r0 != 0) goto L_0x0184
            android.net.Uri r0 = android.net.Uri.parse(r15)
            if (r0 != 0) goto L_0x0132
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/parsed uri is null"
            goto L_0x00b8
        L_0x0132:
            android.content.Intent r13 = X.C17880vN.A0A()
            r13.setClassName(r7, r12)
            java.lang.String r12 = r13.getAction()
            r13.setAction(r12)
            X.1i4 r12 = r8.A01
            int r0 = r12.A0E(r0)
            if (r9 != r0) goto L_0x0181
            java.lang.String r0 = "universal_link"
        L_0x014a:
            r13.putExtra(r0, r15)
            r0 = 0
            r13.putExtra(r4, r0)
            r0 = 11231(0x2bdf, float:1.5738E-41)
            r13.putExtra(r3, r0)
            r13.putExtra(r2, r5)
            r0 = r19
            r13.putExtra(r1, r0)
            if (r22 == 0) goto L_0x0171
            java.lang.String r0 = "inorganic_notification_type"
            r13.putExtra(r0, r11)
            java.lang.String r1 = "inorganic_notification_id"
            r0 = r17
            r13.putExtra(r1, r0)
            java.lang.String r0 = "inorganic_notification_promotion_id"
            r13.putExtra(r0, r5)
        L_0x0171:
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = (int) r0
            android.app.PendingIntent r0 = X.C17880vN.A07(r7, r13, r2)
            X.C18070vi.A0X(r0)
            r6.A0A = r0
            goto L_0x00bb
        L_0x0181:
            java.lang.String r0 = "deep_link"
            goto L_0x014a
        L_0x0184:
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/No urls provided"
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133026o3.A00(X.5YR, java.lang.String):void");
    }

    public C133026o3(AnonymousClass1M9 r1, AnonymousClass11P r2, AnonymousClass118 r3, C27301Vn r4, C32981i4 r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r3, r1, r5, r4);
        C18070vi.A0l(r6, r7);
        this.A03 = r2;
        this.A00 = r3;
        this.A02 = r1;
        this.A01 = r5;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r7;
    }
}
