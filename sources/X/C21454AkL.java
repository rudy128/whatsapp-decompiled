package X;

import com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler;

/* renamed from: X.AkL  reason: case insensitive filesystem */
public class C21454AkL implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public C21454AkL(WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler, String str) {
        this.A00 = 8;
        this.A02 = wifiDirectScannerConnectionHandler;
        this.A01 = 602;
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0289, code lost:
        X.AnonymousClass4aY.A1e(r1, r3, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02bf, code lost:
        r0.A00(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        r2.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00be, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r7 = r18
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x01d3;
                case 1: goto L_0x0032;
                case 2: goto L_0x0078;
                case 3: goto L_0x0272;
                case 4: goto L_0x027e;
                case 5: goto L_0x00bf;
                case 6: goto L_0x028d;
                case 7: goto L_0x02a6;
                case 8: goto L_0x02b5;
                case 9: goto L_0x00f2;
                case 10: goto L_0x012f;
                case 11: goto L_0x0194;
                case 12: goto L_0x02c3;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r7.A02
            X.6Ms r6 = (X.C122086Ms) r6
            int r5 = r7.A01
            java.lang.String r4 = r7.A03
            java.lang.String r0 = "InlineYoutubeVideoPlayer/init/runOnUiThread"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.videoplayback.YoutubePlayerTouchOverlay r0 = r6.A0G
            android.webkit.WebView r3 = r6.A0C
            r0.addView(r3)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r1 = -1
            r2.width = r1
            r2.height = r1
            r0 = 13
            r2.addRule(r0, r1)
            r3.setLayoutParams(r2)
            X.C122086Ms.A02(r6, r4, r5)
        L_0x0031:
            return
        L_0x0032:
            java.lang.Object r4 = r7.A02
            X.8F9 r4 = (X.AnonymousClass8F9) r4
            int r2 = r7.A01
            java.lang.String r5 = r7.A03
            r0 = -1
            if (r2 == r0) goto L_0x0310
            r1 = 1
            if (r2 == r1) goto L_0x0050
            r0 = 2
            if (r2 == r0) goto L_0x0050
            r0 = 3
            if (r2 == r0) goto L_0x0050
            r0 = 4
            if (r2 != r0) goto L_0x0031
            X.1wy r2 = r4.A0G
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x00bb
        L_0x0050:
            X.1Dg r3 = r4.A05
            X.8we[] r2 = new X.C174358we[r1]
            r0 = 3
            X.8kC r1 = new X.8kC
            r1.<init>(r4, r5, r0)
            r0 = 0
            r2[r0] = r1
            java.util.ArrayList r0 = X.C220618l.newArrayList((java.lang.Object[]) r2)
            r3.A0E(r0)
            X.0I4 r1 = r4.A09
            java.lang.String r0 = r4.A0H
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0031
            X.A17 r0 = r4.A0E
            r1 = -1
            r3 = 0
            r4 = r1
            r0.A02(r1, r3, r4)
            return
        L_0x0078:
            java.lang.Object r5 = r7.A02
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r5 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r5
            int r3 = r7.A01
            java.lang.String r2 = r7.A03
            android.os.Handler r1 = r5.A0B
            java.lang.Runnable r0 = r5.A03
            r1.removeCallbacks(r0)
            r0 = -1
            if (r3 == r0) goto L_0x0326
            r0 = 1
            if (r3 == r0) goto L_0x0335
            r0 = 2
            if (r3 == r0) goto L_0x0335
            r0 = 3
            if (r3 == r0) goto L_0x0335
            r0 = 4
            if (r3 != r0) goto L_0x0031
            r0 = 6
            X.AM5 r3 = r5.A0L
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.8sH r1 = new X.8sH
            r1.<init>()
            r0 = 46
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0C = r0
            java.lang.Long r0 = X.C108975cc.A0X()
            r1.A0G = r0
            r1.A0B = r2
            X.AM5.A02(r3, r1)
            X.1wy r2 = r5.A0b
            java.lang.Integer r0 = X.C17880vN.A0i()
        L_0x00bb:
            r2.A0E(r0)
            return
        L_0x00bf:
            java.lang.Object r0 = r7.A02
            X.4Lm r0 = (X.C84954Lm) r0
            int r1 = r7.A01
            java.lang.String r3 = r7.A03
            r6 = 0
            X.C18070vi.A0d(r0, r6)
            X.49c r0 = r0.A00
            java.lang.ref.WeakReference r0 = r0.A07
            java.lang.Object r4 = r0.get()
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            if (r4 == 0) goto L_0x0031
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x00ec
            r0 = 406(0x196, float:5.69E-43)
            if (r1 == r0) goto L_0x03cc
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x036f
            X.1KB r1 = r4.A05
            r0 = 2131890983(0x7f121327, float:1.9416673E38)
        L_0x00e8:
            r1.A08(r0, r6)
            return
        L_0x00ec:
            X.1KB r1 = r4.A05
            r0 = 2131890985(0x7f121329, float:1.9416677E38)
            goto L_0x00e8
        L_0x00f2:
            java.lang.Object r8 = r7.A02
            X.9si r8 = (X.C195049si) r8
            java.lang.String r1 = r7.A03
            int r6 = r7.A01
            java.util.Map r0 = r8.A03
            java.lang.Object r0 = r0.get(r1)
            X.9dq r0 = (X.C186219dq) r0
            if (r0 == 0) goto L_0x0031
            int r1 = r0.A01
            int r5 = r0.A00
            com.whatsapp.jid.UserJid r4 = r0.A02
            X.00H r0 = r8.A01
            r0.get()
            java.lang.Integer r3 = X.A3X.A00(r1)
            if (r3 == 0) goto L_0x0031
            java.lang.String r1 = "smax"
            r0 = 0
            X.2f9 r2 = new X.2f9
            r2.<init>(r4, r1, r0, r0)
            X.00H r0 = r8.A02
            java.lang.Object r1 = r0.get()
            X.2sl r1 = (X.C63252sl) r1
            int r0 = r3.intValue()
            if (r6 != 0) goto L_0x03ee
            r1.A04(r2, r0, r5)
            return
        L_0x012f:
            java.lang.Object r4 = r7.A02
            X.98y r4 = (X.C1775098y) r4
            java.lang.String r3 = r7.A03
            int r1 = r7.A01
            r0 = 0
            r4.A0a = r0
            r4.CEx()
            if (r3 == 0) goto L_0x0163
            r4.A0Y = r3
            com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment r0 = r4.A0Q
            if (r0 == 0) goto L_0x0158
            r0.A02 = r3
            com.whatsapp.qrcode.contactqr.ContactQrContactCardView r2 = r0.A01
            if (r2 == 0) goto L_0x0158
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r3)
            java.lang.String r0 = "https://wa.me/qr/"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            r2.setQrCode(r0)
        L_0x0158:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0031
            r1 = 2131888836(0x7f120ac4, float:1.9412319E38)
        L_0x015f:
            r4.BhQ(r1)
            return
        L_0x0163:
            if (r1 != 0) goto L_0x0173
            java.lang.String r0 = r4.A0Y
            if (r0 != 0) goto L_0x0031
            X.1KB r2 = r4.A05
            r1 = 2131892931(0x7f121ac3, float:1.9420624E38)
            r0 = 1
            r2.A08(r1, r0)
            return
        L_0x0173:
            boolean r0 = r4.A01
            r1 = 2131888833(0x7f120ac1, float:1.9412312E38)
            if (r0 != 0) goto L_0x015f
            r7 = 2131888848(0x7f120ad0, float:1.9412343E38)
            r8 = 2131888827(0x7f120abb, float:1.94123E38)
            r10 = 2131888826(0x7f120aba, float:1.9412298E38)
            r0 = 7
            X.ALj r5 = new X.ALj
            r5.<init>(r4, r0)
            r0 = 6
            X.ALj r6 = new X.ALj
            r6.<init>(r4, r0)
            r9 = r7
            r4.A3x(r5, r6, r7, r8, r9, r10)
            return
        L_0x0194:
            java.lang.Object r0 = r7.A02
            X.AcU r0 = (X.C20976AcU) r0
            java.lang.String r8 = r7.A03
            int r7 = r7.A01
            X.9ds r0 = r0.A02
            java.lang.ref.WeakReference r0 = r0.A01
            java.lang.Object r2 = r0.get()
            X.98y r2 = (X.C1775098y) r2
            if (r2 == 0) goto L_0x0031
            if (r8 != 0) goto L_0x01ac
            if (r7 == 0) goto L_0x01b5
        L_0x01ac:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BR.A08(r2)
            java.lang.String r0 = "contact_qr_code"
            X.C17880vN.A1E(r1, r0, r8)
        L_0x01b5:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r2.A00
            long r5 = r5 - r0
            X.1KB r4 = r2.A05
            r0 = 10
            X.AkL r3 = new X.AkL
            r3.<init>(r2, r8, r7, r0)
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d0
            long r1 = r1 - r5
        L_0x01cc:
            r4.A0K(r3, r1)
            return
        L_0x01d0:
            r1 = 0
            goto L_0x01cc
        L_0x01d3:
            java.lang.Object r4 = r7.A02
            com.whatsapp.backup.google.RestoreFromBackupActivity r4 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r4
            java.lang.String r6 = r7.A03
            int r5 = r7.A01
            java.lang.String r7 = "restore>RestoreFromBackupActivity/auth-request"
            r3 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            java.lang.String r0 = "restore>RestoreFromBackupActivity/auth-request/asking GoogleAuthUtil for token for "
            X.AnonymousClass8BY.A1H(r0, r6, r1)     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            java.lang.String r0 = "com.google"
            android.accounts.Account r1 = new android.accounts.Account     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            r1.<init>(r6, r0)     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            java.lang.String r0 = "oauth2:https://www.googleapis.com/auth/drive.appdata"
            java.lang.String r0 = X.C26266CwB.A02(r1, r4, r0)     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            r4.A0k = r0     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            java.lang.String r0 = "restore>RestoreFromBackupActivity/auth-request/for account "
            X.AnonymousClass8BV.A1L(r0, r6, r1)     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            java.lang.String r0 = ", token has been received."
            X.C17890vO.A1A(r1, r0)     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            android.content.Intent r2 = X.C17880vN.A0A()     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            java.lang.String r1 = "authtoken"
            java.lang.String r0 = r4.A0k     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            r2.putExtra(r1, r0)     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            java.lang.String r0 = "authAccount"
            r2.putExtra(r0, r6)     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            r0 = -1
            r4.onActivityResult(r5, r0, r2)     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            android.os.ConditionVariable r0 = r4.A0x     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            r0.open()     // Catch:{ BYF -> 0x0262, UserRecoverableAuthException -> 0x0233, IOException -> 0x021e, C2U | SecurityException -> 0x024a }
            return
        L_0x021e:
            r0 = move-exception
            com.whatsapp.util.Log.e(r7, r0)
            r4.A0k = r3
            android.os.ConditionVariable r0 = r4.A0x
            r0.open()
            X.1KB r3 = r4.A05
            r0 = 42
            X.AkO r2 = new X.AkO
            r2.<init>((java.lang.Object) r4, (int) r0)
            goto L_0x025e
        L_0x0233:
            r1 = move-exception
            android.os.ConditionVariable r0 = r4.A0x
            r0.close()
            r4.A0k = r3
            r0 = 25
            r4.A4j(r3, r0)
            X.1KB r3 = r4.A05
            r0 = 18
            X.Akb r2 = new X.Akb
            r2.<init>((java.lang.Object) r4, (int) r5, (int) r0, (java.lang.Object) r1)
            goto L_0x025e
        L_0x024a:
            r0 = move-exception
            com.whatsapp.util.Log.e(r7, r0)
            r4.A0k = r3
            android.os.ConditionVariable r0 = r4.A0x
            r0.open()
            X.1KB r3 = r4.A05
            r0 = 20
            X.AkJ r2 = new X.AkJ
            r2.<init>(r0, r6, r4)
        L_0x025e:
            r3.A0J(r2)
            return
        L_0x0262:
            r2 = move-exception
            X.1KB r1 = r4.A05
            r0 = 41
            X.C21457AkO.A00(r1, r4, r0)
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-unavailable"
            com.whatsapp.util.Log.e(r0, r2)
            r4.A0k = r3
            return
        L_0x0272:
            java.lang.Object r0 = r7.A02
            X.4LW r0 = (X.AnonymousClass4LW) r0
            java.lang.String r3 = r7.A03
            int r2 = r7.A01
            X.4aY r1 = r0.A00
            r0 = 0
            goto L_0x0289
        L_0x027e:
            java.lang.Object r0 = r7.A02
            X.4LW r0 = (X.AnonymousClass4LW) r0
            java.lang.String r3 = r7.A03
            int r2 = r7.A01
            X.4aY r1 = r0.A00
            r0 = 1
        L_0x0289:
            X.AnonymousClass4aY.A1e(r1, r3, r2, r0)
            return
        L_0x028d:
            java.lang.Object r0 = r7.A02
            X.7LK r0 = (X.AnonymousClass7LK) r0
            int r4 = r7.A01
            java.lang.String r3 = r7.A03
            X.6e8 r2 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onError, errorCode="
            X.C17900vP.A0i(r0, r1, r4)
            X.89p r0 = r2.A00
            r0.BoU(r4, r3)
            return
        L_0x02a6:
            java.lang.Object r1 = r7.A02
            X.9gk r1 = (X.C188019gk) r1
            java.lang.String r3 = r7.A03
            r2 = 602(0x25a, float:8.44E-43)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.8yO r0 = r1.A02
            goto L_0x02bf
        L_0x02b5:
            java.lang.Object r0 = r7.A02
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler r0 = (com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler) r0
            java.lang.String r3 = r7.A03
            r2 = 602(0x25a, float:8.44E-43)
            X.8yO r0 = r0.A06
        L_0x02bf:
            r0.A00(r2, r3)
            return
        L_0x02c3:
            java.lang.Object r4 = r7.A02
            com.whatsapp.status.notifications.StatusReminderReceiver r4 = (com.whatsapp.status.notifications.StatusReminderReceiver) r4
            java.lang.String r3 = r7.A03
            int r2 = r7.A01
            X.63z r1 = new X.63z
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0k()
            r1.A02 = r0
            X.00H r0 = r4.A0B
            if (r0 == 0) goto L_0x0306
            java.lang.Object r0 = r0.get()
            X.9iv r0 = (X.C189339iv) r0
            X.0vl r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass3MW.A0y(r0)
            r1.A05 = r0
            r1.A08 = r3
            java.lang.Integer r0 = X.AnonymousClass8BS.A0U()
            r1.A01 = r0
            java.lang.String r0 = "status_views_reminder_inorganic_notification"
            r1.A07 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A00 = r0
            java.lang.String r0 = "status_views_reminder_notification"
            r1.A06 = r0
            X.18K r0 = r4.A06
            if (r0 == 0) goto L_0x0309
            r0.CC7(r1)
            return
        L_0x0306:
            java.lang.String r0 = "appSession"
            goto L_0x030b
        L_0x0309:
            java.lang.String r0 = "wamRuntime"
        L_0x030b:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0310:
            X.1Dg r3 = r4.A05
            r0 = 1
            X.8we[] r2 = new X.C174358we[r0]
            r0 = 2
            X.8kC r1 = new X.8kC
            r1.<init>(r4, r5, r0)
            r0 = 0
            r2[r0] = r1
            java.util.ArrayList r0 = X.C220618l.newArrayList((java.lang.Object[]) r2)
            r3.A0E(r0)
            return
        L_0x0326:
            X.AP5 r0 = r5.A0P
            r0.A0C()
            java.util.List r0 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A09(r5)
            java.util.ArrayList r4 = X.C17880vN.A10(r0)
            r1 = 1
            goto L_0x0343
        L_0x0335:
            X.AP5 r0 = r5.A0P
            r0.A0C()
            java.util.List r0 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A09(r5)
            java.util.ArrayList r4 = X.C17880vN.A10(r0)
            r1 = 2
        L_0x0343:
            X.8wF r0 = new X.8wF
            r0.<init>(r5, r2, r1)
            r4.add(r0)
            X.AM5 r3 = r5.A0L
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.8sH r1 = new X.8sH
            r1.<init>()
            r0 = 46
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0C = r0
            java.lang.Long r0 = X.C108975cc.A0X()
            r1.A0G = r0
            r1.A0B = r2
            X.AM5.A02(r3, r1)
            X.1Dg r0 = r5.A0F
            r0.A0E(r4)
            return
        L_0x036f:
            X.12M r8 = r4.A1C
            X.1EC r10 = r4.A1K
            java.lang.String r0 = "GroupXmppMethods/sendGetGroupDescription"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r8.A0A
            java.lang.String r14 = X.C17890vO.A0T(r0)
            X.1OZ r11 = X.C17880vN.A0U(r0)
            r7 = 1
            X.1MD[] r1 = new X.AnonymousClass1MD[r7]
            java.lang.String r0 = "request"
            java.lang.String r2 = "description"
            X.C17880vN.A1Q(r0, r2, r1, r6)
            java.lang.String r0 = "query"
            X.1ca r9 = X.AnonymousClass8BR.A0k(r0, r1)
            r0 = 4
            X.1MD[] r5 = new X.AnonymousClass1MD[r0]
            java.lang.String r0 = "id"
            X.C17880vN.A1Q(r0, r14, r5, r6)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.C17880vN.A1Q(r1, r0, r5, r7)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C17890vO.A12(r1, r0, r5)
            X.1ca r13 = X.C29621ca.A00(r10, r9, r5)
            X.Ach r12 = new X.Ach
            r12.<init>(r8, r7)
            r16 = 32000(0x7d00, double:1.581E-319)
            r15 = 158(0x9e, float:2.21E-43)
            r11.A0N(r12, r13, r14, r15, r16)
            com.whatsapp.group.GroupChatInfoActivity$DescriptionConflictDialogFragment r1 = new com.whatsapp.group.GroupChatInfoActivity$DescriptionConflictDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.C17880vN.A0D()
            r0.putString(r2, r3)
            r1.A1R(r0)
            r0 = 0
            r4.CMk(r1, r0)
            return
        L_0x03cc:
            X.00H r0 = r4.A1u
            java.lang.Object r0 = r0.get()
            X.4Pm r0 = (X.C85944Pm) r0
            int r3 = r0.A00()
            X.1KB r2 = r4.A05
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131755090(0x7f100052, float:1.914105E38)
            java.lang.String r0 = X.C72473Md.A0k(r1, r3, r0)
            r2.A0G(r0, r6)
            X.1Mn r0 = r4.A1O
            r0.A04(r6)
            return
        L_0x03ee:
            r1.A03(r2, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21454AkL.run():void");
    }

    public C21454AkL(Object obj, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = i;
    }

    public C21454AkL(C188019gk r2, String str) {
        this.A00 = 7;
        this.A02 = r2;
        this.A01 = 602;
        this.A03 = str;
    }
}
