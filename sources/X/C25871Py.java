package X;

/* renamed from: X.1Py  reason: invalid class name and case insensitive filesystem */
public abstract class C25871Py {
    /* JADX WARNING: type inference failed for: r0v33, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01fc, code lost:
        if (X.C18020vd.A05(r1, r2, 2189) == false) goto L_0x0209;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.AnonymousClass2EC
            if (r0 == 0) goto L_0x001e
            r0 = r11
            X.2EC r0 = (X.AnonymousClass2EC) r0
            X.118 r0 = r0.A00
            android.content.Context r3 = r0.A00
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            X.C18070vi.A0X(r2)
            java.lang.String r0 = "com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity"
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r3, r0)
            r0 = 1
            r2.setComponentEnabledSetting(r1, r0, r0)
        L_0x001d:
            return
        L_0x001e:
            boolean r0 = r11 instanceof X.AnonymousClass2EJ
            if (r0 == 0) goto L_0x0042
            r3 = r11
            X.2EJ r3 = (X.AnonymousClass2EJ) r3
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x001d
            X.0ve r2 = r3.A02
            r1 = 544(0x220, float:7.62E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001d
            X.10I r4 = r3.A03
            r0 = 12
            X.AkF r2 = new X.AkF
            r2.<init>(r3, r0)
        L_0x003e:
            r4.CGF(r2)
            return
        L_0x0042:
            boolean r0 = r11 instanceof X.AnonymousClass2EN
            if (r0 == 0) goto L_0x0116
            r5 = r11
            X.2EN r5 = (X.AnonymousClass2EN) r5
            X.0z4 r4 = r5.A02
            X.00H r0 = r4.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "newsletter_wait_list_subscription"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x001d
            X.00H r0 = r5.A03
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x001d
            r3 = 0
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r4)
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r3)
            r0.apply()
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "whatsapp"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "channel"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "directory"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri r2 = r0.build()
            X.118 r0 = r5.A00
            android.content.Context r8 = r0.A00
            X.C18070vi.A0X(r8)
            X.00H r0 = r5.A05
            r0.get()
            android.content.Intent r1 = X.AnonymousClass1LU.A02(r8)
            java.lang.String r0 = X.C28901bF.A03
            r1.setAction(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.setAction(r0)
            r1.setData(r2)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.addFlags(r0)
            java.lang.String r0 = "extra_from_notification"
            r7 = 1
            r1.putExtra(r0, r7)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r6 = X.C1408573i.A00(r8, r3, r1, r0)
            r0 = 2131898396(0x7f12301c, float:1.9431709E38)
            java.lang.String r4 = r8.getString(r0)
            X.C18070vi.A0X(r4)
            X.73t r3 = X.C217217d.A03(r8)
            java.lang.String r0 = "newsletter_key_messages"
            r3.A0N = r0
            r2 = 8
            android.app.Notification r1 = r3.A08
            int r0 = r1.flags
            r2 = r2 | r0
            r1.flags = r2
            java.lang.String r0 = "critical_app_alerts@1"
            r3.A0M = r0
            r0 = 2131899103(0x7f1232df, float:1.9433143E38)
            java.lang.String r0 = r8.getString(r0)
            r3.A0E(r0)
            r3.A0D(r4)
            r3.A0F(r4)
            r3.A03 = r7
            r3.A0G(r7)
            r3.A0A = r6
            r0 = 2131231578(0x7f08035a, float:1.807924E38)
            r1.icon = r0
            X.1Vn r2 = r5.A01
            android.app.Notification r1 = r3.A05()
            X.C18070vi.A0X(r1)
            r0 = 70
            r2.BkR(r0, r1)
            X.00H r0 = r5.A04
            java.lang.Object r1 = r0.get()
            X.74D r1 = (X.AnonymousClass74D) r1
            r0 = 4
            r1.A08(r0)
            return
        L_0x0116:
            boolean r0 = r11 instanceof X.AnonymousClass2EE
            if (r0 == 0) goto L_0x012f
            r0 = r11
            X.2EE r0 = (X.AnonymousClass2EE) r0
            X.10I r3 = r0.A01
            X.A7R r2 = r0.A00
            r2.getClass()
            r1 = 39
            X.3Bs r0 = new X.3Bs
            r0.<init>(r2, r1)
            r3.CGF(r0)
            return
        L_0x012f:
            boolean r0 = r11 instanceof X.AnonymousClass2EI
            if (r0 == 0) goto L_0x0155
            r3 = r11
            X.2EI r3 = (X.AnonymousClass2EI) r3
            X.0ve r2 = r3.A02
            r1 = 7821(0x1e8d, float:1.096E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            int r0 = r3.A00
            if (r1 == r0) goto L_0x001d
            if (r0 <= 0) goto L_0x0148
            if (r1 > 0) goto L_0x001d
        L_0x0148:
            X.10I r2 = r3.A03
            r1 = 44
            X.7Pd r0 = new X.7Pd
            r0.<init>(r3, r1)
            r2.CGN(r0)
            return
        L_0x0155:
            boolean r0 = r11 instanceof X.AnonymousClass2EH
            if (r0 == 0) goto L_0x0170
            r3 = r11
            X.2EH r3 = (X.AnonymousClass2EH) r3
            X.0ve r2 = r3.A01
            r1 = 8008(0x1f48, float:1.1222E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            boolean r0 = r3.A00
            if (r0 == r1) goto L_0x001d
            X.1VC r0 = r3.A02
            r0.A01()
            return
        L_0x0170:
            boolean r0 = r11 instanceof X.AnonymousClass2ED
            if (r0 == 0) goto L_0x019a
            r0 = r11
            X.2ED r0 = (X.AnonymousClass2ED) r0
            X.188 r3 = r0.A01
            X.0ve r2 = r0.A00
            r1 = 3664(0xe50, float:5.134E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            r1 = 13293(0x33ed, float:1.8627E-41)
            r3.CHx(r2, r1, r0)
            r0 = 1
            r3.CHx(r2, r1, r0)
            r0 = 3
            r3.CHx(r2, r1, r0)
            r0 = 2
            r3.CHx(r2, r1, r0)
            return
        L_0x019a:
            boolean r0 = r11 instanceof X.C35521mN
            if (r0 == 0) goto L_0x01b7
            r4 = r11
            X.1mN r4 = (X.C35521mN) r4
            java.lang.Runnable r1 = r4.A00
            if (r1 == 0) goto L_0x01aa
            X.10I r0 = r4.A01
            r0.CEz(r1)
        L_0x01aa:
            X.10I r3 = r4.A01
            java.lang.Runnable r2 = r4.A07
            r0 = 500(0x1f4, double:2.47E-321)
            X.25d r0 = r3.CGv(r2, r0)
            r4.A00 = r0
            return
        L_0x01b7:
            boolean r0 = r11 instanceof X.C25881Pz
            if (r0 == 0) goto L_0x01db
            r4 = r11
            X.1Pz r4 = (X.C25881Pz) r4
            X.1Px r3 = r4.A01
            X.0ve r2 = r3.A02
            r1 = 736(0x2e0, float:1.031E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x001d
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x001d
            X.1Pw r3 = r3.A01
            java.lang.String r0 = "setting_unarchiveChats"
            java.lang.String r2 = "syncd_bootstrapped_mutations"
            monitor-enter(r2)
            goto L_0x03a4
        L_0x01db:
            boolean r0 = r11 instanceof X.AnonymousClass2EL
            if (r0 == 0) goto L_0x0226
            r3 = r11
            X.2EL r3 = (X.AnonymousClass2EL) r3
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0209
            X.0ve r2 = r3.A03
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 2190(0x88e, float:3.069E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x01fe
            r0 = 2189(0x88d, float:3.067E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0209
        L_0x01fe:
            X.10I r4 = r3.A04
            r0 = 18
            X.4rh r2 = new X.4rh
            r2.<init>(r3, r0)
            goto L_0x003e
        L_0x0209:
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x001d
            X.0ve r2 = r3.A03
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 3687(0xe67, float:5.167E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x01fe
            r0 = 3686(0xe66, float:5.165E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x001d
            goto L_0x01fe
        L_0x0226:
            boolean r0 = r11 instanceof X.AnonymousClass2EP
            if (r0 == 0) goto L_0x0251
            r4 = r11
            X.2EP r4 = (X.AnonymousClass2EP) r4
            X.1UN r1 = r4.A04
            boolean r3 = r1.A08()
            if (r3 == 0) goto L_0x0242
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0242
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0245
            X.AnonymousClass2EP.A00(r4)
        L_0x0242:
            r4.A00 = r3
            return
        L_0x0245:
            X.0z4 r2 = r4.A03
            X.11P r0 = r4.A02
            long r0 = X.AnonymousClass11P.A01(r0)
            r2.A1M(r0)
            goto L_0x0242
        L_0x0251:
            boolean r0 = r11 instanceof X.AnonymousClass2EM
            if (r0 == 0) goto L_0x02a0
            r3 = r11
            X.2EM r3 = (X.AnonymousClass2EM) r3
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0276
            X.0ve r2 = r3.A04
            r1 = 3530(0xdca, float:4.947E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0276
            X.10I r2 = r3.A05
            r0 = 47
            X.4rg r1 = new X.4rg
            r1.<init>((java.lang.Object) r3, (int) r0)
            java.lang.String r0 = "external_web_beta_sync_enabled"
            r2.CGL(r1, r0)
        L_0x0276:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0294
            X.0ve r2 = r3.A04
            r1 = 2775(0xad7, float:3.889E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0294
            X.10I r2 = r3.A05
            r0 = 48
            X.4rg r1 = new X.4rg
            r1.<init>((java.lang.Object) r3, (int) r0)
            java.lang.String r0 = "favorite_sticker_sync_enabled"
            r2.CGL(r1, r0)
        L_0x0294:
            X.1To r1 = r3.A02
            X.10I r4 = r1.A0W
            r0 = 1
            X.7Pc r2 = new X.7Pc
            r2.<init>(r1, r0)
            goto L_0x003e
        L_0x02a0:
            boolean r0 = r11 instanceof X.AnonymousClass2EG
            if (r0 == 0) goto L_0x02c2
            r3 = r11
            X.2EG r3 = (X.AnonymousClass2EG) r3
            X.0ve r2 = r3.A02
            r1 = 8070(0x1f86, float:1.1308E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            X.2l4 r0 = r3.A01
            X.0z4 r2 = r0.A01
            java.lang.String r1 = "community_get_subgroups_sync_key"
            r0 = 1
            r2.A1w(r1, r0)
            return
        L_0x02c2:
            boolean r0 = r11 instanceof X.AnonymousClass2EF
            if (r0 == 0) goto L_0x02e2
            r3 = r11
            X.2EF r3 = (X.AnonymousClass2EF) r3
            X.0ve r2 = r3.A02
            r1 = 8069(0x1f85, float:1.1307E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            r2 = 1
            X.0z4 r1 = r3.A01
            java.lang.String r0 = "community_get_parent_group_info_sync_key"
            r1.A1w(r0, r2)
            return
        L_0x02e2:
            r5 = r11
            X.2EK r5 = (X.AnonymousClass2EK) r5
            X.0z4 r3 = r5.A01
            X.00H r0 = r3.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "notify_account_switching_available"
            r0 = 0
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L_0x001d
            X.00H r0 = r5.A02
            java.lang.Object r0 = r0.get()
            X.1cN r0 = (X.C29491cN) r0
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x001d
            r1 = 0
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r3)
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            r0.apply()
            java.lang.String r0 = "AccountSwitchingAbPropObserver/showAccountSwitchingAvailableNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r5.A03
            java.lang.Object r7 = r0.get()
            X.2bh r7 = (X.C52922bh) r7
            X.118 r1 = r5.A00
            android.content.Context r2 = r1.A00
            r0 = 2131898700(0x7f12314c, float:1.9432325E38)
            java.lang.String r10 = r2.getString(r0)
            X.C18070vi.A0X(r10)
            r0 = 2131886382(0x7f12012e, float:1.9407341E38)
            java.lang.String r6 = r1.A01(r0)
            X.C18070vi.A0X(r6)
            r1 = 17
            r0 = 0
            android.content.Intent r8 = X.AnonymousClass1LU.A0I(r2, r1, r0)
            java.lang.String r4 = "account_switching_available"
            r9 = 1
            r1 = 3
            X.118 r0 = r7.A00
            android.content.Context r2 = r0.A00
            java.lang.String r0 = "other_notifications@1"
            X.73t r3 = new X.73t
            r3.<init>(r2, r0)
            r0 = 2131102224(0x7f060a10, float:1.781688E38)
            int r0 = X.C19740yt.A00(r2, r0)
            r3.A00 = r0
            r3.A06(r1)
            r3.A0G(r9)
            r3.A0E(r10)
            r3.A0D(r6)
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r3.A08
            r0.icon = r1
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A07(r6)
            r3.A0B(r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = 0
            android.app.PendingIntent r0 = X.C1408573i.A00(r2, r1, r8, r0)
            r3.A0A = r0
            r3.A0F(r6)
            r3.A03 = r1
            X.1Vn r2 = r7.A01
            android.app.Notification r1 = r3.A05()
            X.C18070vi.A0X(r1)
            r0 = 64
            r2.BkS(r4, r0, r1)
            X.00H r0 = r5.A04
            java.lang.Object r3 = r0.get()
            X.C18070vi.A0X(r3)
            X.739 r3 = (X.AnonymousClass739) r3
            r2 = 0
            r1 = 17
            r0 = 15
            r3.A04(r2, r1, r0)
            return
        L_0x03a4:
            java.util.Set r1 = r3.A02()     // Catch:{ all -> 0x03bc }
            r1.remove(r0)     // Catch:{ all -> 0x03bc }
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r3)     // Catch:{ all -> 0x03bc }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x03bc }
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r2, r1)     // Catch:{ all -> 0x03bc }
            r0.apply()     // Catch:{ all -> 0x03bc }
            monitor-exit(r2)     // Catch:{ all -> 0x03bc }
            return
        L_0x03bc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03bc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25871Py.A01():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (X.C18020vd.A05(r2, r3, 2189) != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (X.C18020vd.A05(r2, r3, 3686) != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass2EJ
            if (r0 == 0) goto L_0x0014
            r3 = r5
            X.2EJ r3 = (X.AnonymousClass2EJ) r3
            X.0ve r2 = r3.A02
            r1 = 544(0x220, float:7.62E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3.A00 = r0
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r5 instanceof X.AnonymousClass2EI
            if (r0 == 0) goto L_0x0028
            r3 = r5
            X.2EI r3 = (X.AnonymousClass2EI) r3
            X.0ve r2 = r3.A02
            r1 = 7821(0x1e8d, float:1.096E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            r3.A00 = r0
            return
        L_0x0028:
            boolean r0 = r5 instanceof X.AnonymousClass2EH
            if (r0 == 0) goto L_0x003c
            r3 = r5
            X.2EH r3 = (X.AnonymousClass2EH) r3
            X.0ve r2 = r3.A01
            r1 = 8008(0x1f48, float:1.1222E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3.A00 = r0
            return
        L_0x003c:
            boolean r0 = r5 instanceof X.C25881Pz
            if (r0 == 0) goto L_0x0052
            r3 = r5
            X.1Pz r3 = (X.C25881Pz) r3
            X.1Px r0 = r3.A01
            X.0ve r2 = r0.A02
            r1 = 736(0x2e0, float:1.031E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3.A00 = r0
            return
        L_0x0052:
            boolean r0 = r5 instanceof X.AnonymousClass2EL
            if (r0 == 0) goto L_0x008a
            r4 = r5
            X.2EL r4 = (X.AnonymousClass2EL) r4
            X.0ve r3 = r4.A03
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r0 = 2190(0x88e, float:3.069E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 != 0) goto L_0x0072
            r0 = 2189(0x88d, float:3.067E-42)
            boolean r1 = X.C18020vd.A05(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0073
        L_0x0072:
            r0 = 1
        L_0x0073:
            r4.A01 = r0
            r0 = 3687(0xe67, float:5.167E-42)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 != 0) goto L_0x0086
            r0 = 3686(0xe66, float:5.165E-42)
            boolean r1 = X.C18020vd.A05(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0087
        L_0x0086:
            r0 = 1
        L_0x0087:
            r4.A00 = r0
            return
        L_0x008a:
            boolean r0 = r5 instanceof X.AnonymousClass2EP
            if (r0 == 0) goto L_0x009a
            r1 = r5
            X.2EP r1 = (X.AnonymousClass2EP) r1
            X.1UN r0 = r1.A04
            boolean r0 = r0.A08()
            r1.A00 = r0
            return
        L_0x009a:
            boolean r0 = r5 instanceof X.AnonymousClass2EM
            if (r0 == 0) goto L_0x00b6
            r3 = r5
            X.2EM r3 = (X.AnonymousClass2EM) r3
            X.0ve r2 = r3.A04
            r0 = 3530(0xdca, float:4.947E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r3.A00 = r0
            r0 = 2775(0xad7, float:3.889E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r3.A01 = r0
            return
        L_0x00b6:
            boolean r0 = r5 instanceof X.AnonymousClass2EG
            if (r0 == 0) goto L_0x00ca
            r3 = r5
            X.2EG r3 = (X.AnonymousClass2EG) r3
            X.0ve r2 = r3.A02
            r1 = 8070(0x1f86, float:1.1308E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3.A00 = r0
            return
        L_0x00ca:
            boolean r0 = r5 instanceof X.AnonymousClass2EF
            if (r0 == 0) goto L_0x0013
            r3 = r5
            X.2EF r3 = (X.AnonymousClass2EF) r3
            X.0ve r2 = r3.A02
            r1 = 8069(0x1f85, float:1.1307E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25871Py.A02():void");
    }
}
