package X;

/* renamed from: X.2zM  reason: invalid class name and case insensitive filesystem */
public final class C67172zM implements AnonymousClass1R4 {
    public final AnonymousClass1NP A00;
    public final C36861oa A01;
    public final AnonymousClass11N A02;
    public final AnonymousClass118 A03;
    public final C19830z4 A04;
    public final A1Q A05;
    public final C27431Wb A06;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        if (X.C41361wE.A09(r11.A03.A00) != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bvh() {
        /*
            r11 = this;
            X.A1Q r2 = r11.A05
            X.11S r1 = r2.A03
            r1.A0I()
            com.whatsapp.Me r0 = r1.A00
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r1.A0N()
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "BackupCronJob/backup was started, finishing cron job"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1NP r1 = r11.A00
            java.lang.String r0 = "BACKUP_LAST_CHECK_TIMESTAMP"
            r1.A0M(r0)
        L_0x0023:
            return
        L_0x0024:
            X.1NP r2 = r11.A00
            java.lang.String r1 = "BACKUP_LAST_CHECK_TIMESTAMP"
            android.content.SharedPreferences r0 = r2.A07()
            long r7 = X.C17890vO.A04(r0, r1)
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0085
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r7
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0023
            int r4 = r2.A03()
            if (r4 == 0) goto L_0x008f
            r0 = 4
            if (r4 == r0) goto L_0x008f
            X.0z4 r3 = r11.A04
            java.lang.String r0 = r3.A0f()
            if (r0 == 0) goto L_0x0089
            long r7 = X.C41361wE.A01(r4)
            long r5 = r3.A0U(r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r5
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
            java.lang.String r0 = "BackupCronJob/google backup was not recently completed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0069:
            X.1oa r4 = r11.A01
            X.118 r0 = r4.A0G
            android.content.Context r3 = r0.A00
            r0 = 2131890670(0x7f1211ee, float:1.9416038E38)
            java.lang.String r5 = r3.getString(r0)
            r0 = 2131890668(0x7f1211ec, float:1.9416034E38)
            java.lang.String r6 = r3.getString(r0)
            r7 = 1
            r3 = 0
            r8 = -1
            r9 = 0
            r10 = r7
            X.C36861oa.A03(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0085:
            r2.A0M(r1)
            return
        L_0x0089:
            java.lang.String r0 = "gdrive-notification-manager/backup-error/google-account-is-null/unexpected"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0085
        L_0x008f:
            X.1Wb r0 = r11.A06
            long r7 = r0.A0G()
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r7
            r3 = 345600000(0x14997000, double:1.70749087E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
        L_0x00a7:
            java.lang.String r0 = "BackupCronJob/local backup was not recently created"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.118 r0 = r11.A03
            android.content.Context r0 = r0.A00
            boolean r0 = X.C41361wE.A09(r0)
            if (r0 == 0) goto L_0x0085
            goto L_0x0069
        L_0x00b7:
            java.lang.String r0 = "BackupCronJob/backup is disabled, finishing cron job"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67172zM.Bvh():void");
    }

    public C67172zM(AnonymousClass1NP r1, C36861oa r2, AnonymousClass11N r3, AnonymousClass118 r4, C19830z4 r5, A1Q a1q, C27431Wb r7) {
        C18070vi.A0w(r4, r3, a1q, r7, r5);
        C18070vi.A0l(r1, r2);
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = a1q;
        this.A06 = r7;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
    }
}
