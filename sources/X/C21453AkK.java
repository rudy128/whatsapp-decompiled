package X;

import android.os.Handler;

/* renamed from: X.AkK  reason: case insensitive filesystem */
public class C21453AkK implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21453AkK(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(Handler handler, Object obj, Object obj2, int i) {
        handler.post(new C21453AkK(obj, obj2, i));
    }

    public static void A01(AnonymousClass1KB r1, Object obj, Object obj2, int i) {
        r1.A0J(new C21453AkK(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: X.8gR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v136, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v137, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0259, code lost:
        com.whatsapp.util.Log.i("settings-gdrive/gps-unavailable/prompting-user-to-fix");
        r5.A29();
        r1.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0264, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0286, code lost:
        X.AnonymousClass8BV.A18(X.AnonymousClass3Ma.A0H(r1), r2, "auth_request_dialog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b8, code lost:
        if (r11 != 0) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0397, code lost:
        X.C18070vi.A0d(r2, 0);
        r2.set(true);
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0440, code lost:
        r1.registerObserver(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0443, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0450, code lost:
        r2.CNh(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0454, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0719, code lost:
        r0.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x071c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r1.unregisterObserver(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0157, code lost:
        r4.A0J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015a, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x068c;
                case 1: goto L_0x0680;
                case 2: goto L_0x062c;
                case 3: goto L_0x0597;
                case 4: goto L_0x0587;
                case 5: goto L_0x0587;
                case 6: goto L_0x02dc;
                case 7: goto L_0x0290;
                case 8: goto L_0x057b;
                case 9: goto L_0x0571;
                case 10: goto L_0x0562;
                case 11: goto L_0x04cb;
                case 12: goto L_0x0498;
                case 13: goto L_0x046f;
                case 14: goto L_0x0265;
                case 15: goto L_0x0455;
                case 16: goto L_0x0215;
                case 17: goto L_0x0444;
                case 18: goto L_0x0438;
                case 19: goto L_0x020b;
                case 20: goto L_0x0401;
                case 21: goto L_0x03e7;
                case 22: goto L_0x03d7;
                case 23: goto L_0x0278;
                case 24: goto L_0x0455;
                case 25: goto L_0x0239;
                case 26: goto L_0x03c7;
                case 27: goto L_0x03b4;
                case 28: goto L_0x01fa;
                case 29: goto L_0x03a3;
                case 30: goto L_0x038f;
                case 31: goto L_0x037f;
                case 32: goto L_0x01ee;
                case 33: goto L_0x0374;
                case 34: goto L_0x015b;
                case 35: goto L_0x0366;
                case 36: goto L_0x0355;
                case 37: goto L_0x0344;
                case 38: goto L_0x0130;
                case 39: goto L_0x0338;
                case 40: goto L_0x0314;
                case 41: goto L_0x00f0;
                case 42: goto L_0x00d9;
                case 43: goto L_0x00a3;
                case 44: goto L_0x0068;
                case 45: goto L_0x0300;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x0043;
                case 49: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.9tU r0 = (X.C195529tU) r0
            java.lang.Object r2 = r15.A02
            X.00H r0 = r0.A06
            X.10T r1 = X.C17880vN.A0V(r0)
        L_0x0011:
            r1.unregisterObserver(r2)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r2 = r15.A01
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r1 = r15.A02
            X.8hr r1 = (X.C167838hr) r1
            r0 = 1
            if (r2 == 0) goto L_0x0031
            X.B9L r0 = r1.A01
            if (r0 == 0) goto L_0x0027
            r0.Bso(r2)
        L_0x0027:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RefreshCartProtocol onError : "
            X.C17900vP.A0Y(r2, r0, r1)
            return
        L_0x0031:
            X.B9L r2 = r1.A01
            if (r2 == 0) goto L_0x0014
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "error code is null"
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            r2.Bso(r0)
            return
        L_0x0043:
            java.lang.Object r1 = r15.A01
            X.Acf r1 = (X.C20987Acf) r1
            java.lang.Object r2 = r15.A02
            X.AEW r2 = (X.AEW) r2
            X.1tC r0 = r1.A03
            r0.A00(r2)
            X.1nW r0 = r1.A00
            if (r0 == 0) goto L_0x0057
            r0.BvC()
        L_0x0057:
            X.1nW r1 = r1.A00
            boolean r0 = r1 instanceof X.C22572BDn
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.biz.GetBusinessProfileProtocol.GetBusinessProfileListenerWithBusinessProfile"
            X.C18070vi.A0z(r1, r0)
            X.BDn r1 = (X.C22572BDn) r1
            r1.BvD(r2)
            return
        L_0x0068:
            java.lang.Object r6 = r15.A01
            X.4i3 r6 = (X.C92874i3) r6
            java.lang.Object r5 = r15.A02
            X.1PM r1 = r6.A0n
            com.whatsapp.biz.viewmodel.BusinessDetailsViewModel r0 = r6.A0h
            com.whatsapp.jid.UserJid r0 = r0.A0T()
            X.1yf r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0014
            X.1R2 r4 = r6.A0z
            r3 = 2131103095(0x7f060d77, float:1.7818646E38)
            r2 = 2131169467(0x7f0710bb, float:1.7953265E38)
            X.118 r0 = r6.A0r
            android.content.Context r1 = r0.A00
            X.1QJ r0 = r6.A0x
            X.2tK r0 = r0.A02()
            X.26n r1 = r4.A0N(r1, r0, r3, r2)
            X.1KB r4 = r6.A0V
            r0 = 42
            X.AkK r3 = new X.AkK
            r3.<init>(r5, r1, r0)
            goto L_0x0157
        L_0x00a3:
            java.lang.Object r3 = r15.A01
            X.4i3 r3 = (X.C92874i3) r3
            java.lang.Object r2 = r15.A02
            X.1Ty r1 = r3.A0a
            com.whatsapp.biz.viewmodel.BusinessDetailsViewModel r0 = r3.A0h
            X.1E7 r0 = r0.A00
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r0)
            X.AEW r1 = r1.A08(r0)
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.A0W
            if (r0 == 0) goto L_0x0014
            int r0 = r1.A01
            r0 = r0 & 2
            if (r0 != 0) goto L_0x0014
            boolean r0 = X.C92874i3.A09(r3)
            if (r0 != 0) goto L_0x0014
            boolean r0 = X.C92874i3.A0A(r3)
            if (r0 != 0) goto L_0x0014
            X.1KB r4 = r3.A0V
            r0 = 17
            X.Ajr r3 = new X.Ajr
            r3.<init>(r2, r0)
            goto L_0x0157
        L_0x00d9:
            java.lang.Object r2 = r15.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r15.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r0 = r2 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x0014
            r0 = r2
            com.whatsapp.wds.components.actiontile.WDSActionTile r0 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r0
            r0.setIcon((android.graphics.drawable.Drawable) r1)
            r0 = 0
            r2.setVisibility(r0)
            return
        L_0x00f0:
            java.lang.Object r4 = r15.A01
            X.1dJ r4 = (X.C30051dJ) r4
            java.lang.Object r5 = r15.A02
            android.content.Context r5 = (android.content.Context) r5
            X.0ve r2 = r4.A0F
            r0 = 7051(0x1b8b, float:9.88E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r4.A08 = r0
            r0 = 2643(0xa53, float:3.704E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x06aa
            r0 = 6998(0x1b56, float:9.806E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0014
            X.2Gz r2 = r4.A04
            if (r2 != 0) goto L_0x011f
            X.2Gz r2 = new X.2Gz
            r2.<init>()
            r4.A04 = r2
        L_0x011f:
            X.18K r1 = r4.A0G
            r0 = 0
            X.1Be r0 = r1.BDn(r2, r0)
            r4.A03 = r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0014
            goto L_0x06aa
        L_0x0130:
            java.lang.Object r6 = r15.A01
            X.3iM r6 = (X.C75743iM) r6
            java.lang.Object r5 = r15.A02
            X.9tr r5 = (X.C195759tr) r5
            X.5YR r1 = r5.A01
            if (r1 == 0) goto L_0x0014
            X.1oE r0 = r6.A01
            boolean r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x0014
            X.1oC r2 = r6.A03
            X.Ai4 r1 = (X.C21319Ai4) r1
            java.lang.String r1 = r1.A0F
            r0 = 4
            r2.A05(r1, r0)
            X.1KB r4 = r6.A00
            r0 = 39
            X.AkK r3 = new X.AkK
            r3.<init>(r6, r5, r0)
        L_0x0157:
            r4.A0J(r3)
            return
        L_0x015b:
            java.lang.Object r0 = r15.A01
            com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = (com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel) r0
            java.lang.Object r1 = r15.A02
            java.util.Set r1 = (java.util.Set) r1
            X.9Zu r4 = r0.A07
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0014
            X.17r r3 = r4.A00
            r3.A0h()
            java.util.Iterator r6 = r1.iterator()
        L_0x0174:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = X.C17880vN.A0v(r6)
            X.1L7 r0 = r4.A01
            java.io.File r5 = r0.A08(r1)
            X.00H r0 = X.C20134A8u.A00
            boolean r0 = r3.A0l(r5)     // Catch:{ IOException -> 0x01dd }
            if (r0 == 0) goto L_0x0174
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x0174
            java.io.File r1 = r5.getParentFile()
            if (r1 == 0) goto L_0x01b5
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x01b5
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto L_0x01b5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "gdrive-activity/create-placeholder/dir/failed "
            r1.append(r0)
            java.lang.String r0 = r5.getAbsolutePath()
            X.C17890vO.A19(r1, r0)
            goto L_0x0174
        L_0x01b5:
            boolean r0 = r5.exists()     // Catch:{ IOException -> 0x01d2 }
            if (r0 != 0) goto L_0x0174
            boolean r0 = r5.createNewFile()     // Catch:{ IOException -> 0x01d2 }
            if (r0 != 0) goto L_0x0174
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01d2 }
            java.lang.String r0 = "gdrive-activity/create-placeholder/file/failed "
            r1.append(r0)     // Catch:{ IOException -> 0x01d2 }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x01d2 }
            X.C17890vO.A19(r1, r0)     // Catch:{ IOException -> 0x01d2 }
            goto L_0x0174
        L_0x01d2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "gdrive-activity/create-placeholder/failed "
            X.C17900vP.A0N(r5, r0, r1)
            goto L_0x01ea
        L_0x01dd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "gdrive-util/in-media-folder "
            r1.append(r0)
            r1.append(r5)
        L_0x01ea:
            X.C17880vN.A1M(r1, r2)
            goto L_0x0174
        L_0x01ee:
            java.lang.Object r1 = r15.A01
            X.9yr r1 = (X.C198759yr) r1
            java.lang.Object r2 = r15.A02
            java.util.regex.Pattern r0 = X.C198759yr.A0G
            X.11E r1 = r1.A09
            goto L_0x0011
        L_0x01fa:
            java.lang.Object r1 = r15.A01
            X.9hW r1 = (X.C188499hW) r1
            java.lang.Object r0 = r15.A02
            X.4rF r0 = (X.C98494rF) r0
            X.C18070vi.A0h(r1, r0)
            X.11E r1 = r1.A06
            java.lang.Object r2 = r0.element
            goto L_0x0011
        L_0x020b:
            java.lang.Object r1 = r15.A01
            X.10T r1 = (X.AnonymousClass10T) r1
            java.lang.Object r2 = r15.A02
            X.00H r0 = X.C20134A8u.A00
            goto L_0x0011
        L_0x0215:
            java.lang.Object r4 = r15.A01
            X.8gR r4 = (X.C167498gR) r4
            java.lang.Object r5 = r15.A02
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            int r3 = X.C41371wF.A00(r4)
            r2 = 0
            X.A9Q r1 = new X.A9Q
            r1.<init>(r4, r2)
            r0 = 1
            android.app.Dialog r1 = X.C20134A8u.A01(r4, r1, r3, r2, r0)
            if (r1 == 0) goto L_0x0712
            boolean r0 = X.AnonymousClass4Yv.A02(r4)
            if (r0 != 0) goto L_0x0014
            boolean r0 = r4.A0J
            if (r0 == 0) goto L_0x0259
            return
        L_0x0239:
            java.lang.Object r4 = r15.A01
            com.whatsapp.backup.google.SettingsGoogleDrive r4 = (com.whatsapp.backup.google.SettingsGoogleDrive) r4
            java.lang.Object r5 = r15.A02
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            int r3 = X.C41371wF.A00(r4)
            r0 = 4
            X.A9Q r2 = new X.A9Q
            r2.<init>(r4, r0)
            r1 = 1
            r0 = 0
            android.app.Dialog r1 = X.C20134A8u.A01(r4, r2, r3, r0, r1)
            if (r1 == 0) goto L_0x070a
            boolean r0 = com.whatsapp.backup.google.SettingsGoogleDrive.A0x(r4)
            if (r0 != 0) goto L_0x0014
        L_0x0259:
            java.lang.String r0 = "settings-gdrive/gps-unavailable/prompting-user-to-fix"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A29()
            r1.show()
            return
        L_0x0265:
            java.lang.Object r1 = r15.A01
            X.8gR r1 = (X.C167498gR) r1
            java.lang.Object r2 = r15.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r0 = X.AnonymousClass4Yv.A02(r1)
            if (r0 != 0) goto L_0x0014
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x0286
            return
        L_0x0278:
            java.lang.Object r1 = r15.A01
            com.whatsapp.backup.google.SettingsGoogleDrive r1 = (com.whatsapp.backup.google.SettingsGoogleDrive) r1
            java.lang.Object r2 = r15.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r0 = com.whatsapp.backup.google.SettingsGoogleDrive.A0x(r1)
            if (r0 != 0) goto L_0x0014
        L_0x0286:
            X.1jj r1 = X.AnonymousClass3Ma.A0H(r1)
            java.lang.String r0 = "auth_request_dialog"
            X.AnonymousClass8BV.A18(r1, r2, r0)
            return
        L_0x0290:
            java.lang.Object r5 = r15.A01
            X.Ajj r5 = (X.C21416Ajj) r5
            java.lang.Object r0 = r15.A02
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            com.whatsapp.appwidget.WidgetProvider.A0C = r0
            int[] r4 = r5.A09
            int r3 = r4.length
            r2 = 0
        L_0x029e:
            if (r2 >= r3) goto L_0x0014
            r9 = r4[r2]
            android.appwidget.AppWidgetManager r1 = r5.A00
            android.os.Bundle r6 = r1.getAppWidgetOptions(r9)
            if (r6 == 0) goto L_0x02ba
            java.lang.String r0 = "appWidgetMinWidth"
            int r10 = r6.getInt(r0)
            java.lang.String r0 = "appWidgetMinHeight"
            int r11 = r6.getInt(r0)
            if (r10 == 0) goto L_0x02ba
            if (r11 != 0) goto L_0x02c0
        L_0x02ba:
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
        L_0x02c0:
            android.content.Context r6 = r5.A01
            X.1XL r7 = r5.A02
            X.0vb r8 = r5.A04
            android.widget.RemoteViews r0 = com.whatsapp.appwidget.WidgetProvider.A00(r6, r7, r8, r9, r10, r11)
            r1.updateAppWidget(r9, r0)
            r0 = 100
            if (r10 <= r0) goto L_0x02d9
            if (r11 <= r0) goto L_0x02d9
            r0 = 2131432116(0x7f0b12b4, float:1.848598E38)
            r1.notifyAppWidgetViewDataChanged(r9, r0)
        L_0x02d9:
            int r2 = r2 + 1
            goto L_0x029e
        L_0x02dc:
            java.lang.Object r2 = r15.A01
            X.4OK r2 = (X.AnonymousClass4OK) r2
            java.lang.Object r1 = r15.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1gt r0 = r2.A00
            java.util.List r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = X.C29431cG.A0c(r0)
            X.206 r1 = (X.AnonymousClass206) r1
            if (r1 == 0) goto L_0x0014
            X.00H r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.1Co r0 = (X.C22621Co) r0
            r0.A09(r1)
            return
        L_0x0300:
            java.lang.Object r0 = r15.A01
            X.1Ty r0 = (X.C26911Ty) r0
            java.lang.Object r1 = r15.A02
            X.AEW r1 = (X.AEW) r1
            X.0vl r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.1tC r0 = (X.C39511tC) r0
            r0.A00(r1)
            return
        L_0x0314:
            java.lang.Object r3 = r15.A01
            X.6id r3 = (X.C129946id) r3
            java.lang.Object r2 = r15.A02
            android.content.Context r2 = (android.content.Context) r2
            X.00H r0 = r3.A00
            java.lang.Object r1 = r0.get()
            X.129 r1 = (X.AnonymousClass129) r1
            java.lang.String r0 = "3882536868700056"
            android.net.Uri r1 = r1.A03(r0)
            X.C18070vi.A0X(r1)
            X.00H r0 = r3.A05
            r0.get()
            java.lang.String r0 = "android.intent.action.VIEW"
            X.AnonymousClass8BT.A14(r2, r1, r0)
            return
        L_0x0338:
            java.lang.Object r1 = r15.A01
            X.3iM r1 = (X.C75743iM) r1
            java.lang.Object r0 = r15.A02
            X.9tr r0 = (X.C195759tr) r0
            r1.A05(r0)
            return
        L_0x0344:
            java.lang.Object r0 = r15.A01
            X.4gV r0 = (X.C91944gV) r0
            java.lang.Object r1 = r15.A02
            X.5YR r1 = (X.AnonymousClass5YR) r1
            X.C18070vi.A0h(r0, r1)
            X.1oC r0 = r0.A03
            r0.A04(r1)
            return
        L_0x0355:
            java.lang.Object r0 = r15.A01
            X.4gV r0 = (X.C91944gV) r0
            java.lang.Object r1 = r15.A02
            X.5YR r1 = (X.AnonymousClass5YR) r1
            X.C18070vi.A0h(r0, r1)
            X.1oC r0 = r0.A03
            r0.A02(r1)
            return
        L_0x0366:
            java.lang.Object r0 = r15.A01
            X.4gV r0 = (X.C91944gV) r0
            java.lang.Object r1 = r15.A02
            X.5YR r1 = (X.AnonymousClass5YR) r1
            X.1oC r0 = r0.A03
            r0.A03(r1)
            return
        L_0x0374:
            java.lang.Object r2 = r15.A01
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r1 = r15.A02
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            java.util.regex.Pattern r0 = X.C198759yr.A0G
            goto L_0x0397
        L_0x037f:
            java.lang.Object r1 = r15.A01
            X.9yr r1 = (X.C198759yr) r1
            java.lang.Object r2 = r15.A02
            java.util.regex.Pattern r0 = X.C198759yr.A0G
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.11E r1 = r1.A09
            goto L_0x0440
        L_0x038f:
            java.lang.Object r2 = r15.A01
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r1 = r15.A02
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
        L_0x0397:
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 1
            r2.set(r0)
            r1.disconnect()
            return
        L_0x03a3:
            java.lang.Object r1 = r15.A01
            X.9hW r1 = (X.C188499hW) r1
            java.lang.Object r0 = r15.A02
            X.4rF r0 = (X.C98494rF) r0
            X.C18070vi.A0h(r1, r0)
            X.11E r1 = r1.A06
            java.lang.Object r2 = r0.element
            goto L_0x0440
        L_0x03b4:
            java.lang.Object r2 = r15.A01
            com.whatsapp.backup.google.SettingsGoogleDrive r2 = (com.whatsapp.backup.google.SettingsGoogleDrive) r2
            java.lang.Object r1 = r15.A02
            com.whatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment r1 = (com.whatsapp.backup.google.SettingsGoogleDrive.AuthRequestDialogFragment) r1
            java.lang.String r0 = X.AnonymousClass8BR.A0z(r2)
            X.C17960vV.A07(r0)
            com.whatsapp.backup.google.SettingsGoogleDrive.A0c(r1, r2, r0)
            return
        L_0x03c7:
            java.lang.Object r2 = r15.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            java.lang.Object r0 = r15.A02
            com.google.android.gms.auth.UserRecoverableAuthException r0 = (com.google.android.gms.auth.UserRecoverableAuthException) r0
            android.content.Intent r1 = r0.A00()
            X.C17960vV.A07(r1)
            goto L_0x0450
        L_0x03d7:
            java.lang.Object r0 = r15.A01
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            java.lang.Object r1 = r15.A02
            android.content.Intent r1 = (android.content.Intent) r1
            X.118 r0 = r0.A0R
            android.content.Context r0 = r0.A00
            X.C25081Mu.A00(r0, r1)
            return
        L_0x03e7:
            java.lang.Object r6 = r15.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r6 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r6
            java.lang.Object r1 = r15.A02
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "total_download_size"
            r4 = -1
            long r2 = r1.getLong(r0, r4)
            java.lang.String r0 = "media_download_size"
            long r0 = r1.getLong(r0, r4)
            r6.A4i(r2, r0)
            return
        L_0x0401:
            java.lang.Object r3 = r15.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r3 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r3
            java.lang.Object r0 = r15.A02
            android.accounts.AccountManagerFuture r0 = (android.accounts.AccountManagerFuture) r0
            java.lang.String r2 = "authAccount"
            java.lang.Object r1 = r0.getResult()     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x042a }
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x042a }
            boolean r0 = r1.containsKey(r2)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x042a }
            if (r0 != 0) goto L_0x041d
            java.lang.String r0 = "restore>RestoreFromBackupActivity/error-during-add-account/account-manager-returned-with-no-account-name"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x042a }
            return
        L_0x041d:
            java.lang.Object r0 = r1.get(r2)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x042a }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x042a }
            r0 = 4
            com.whatsapp.backup.google.RestoreFromBackupActivity.A1B(r3, r1, r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x042a }
            return
        L_0x042a:
            r1 = move-exception
            java.lang.String r0 = "restore>RestoreFromBackupActivity/error-during-add-account"
            com.whatsapp.util.Log.e(r0, r1)
            X.1KB r1 = r3.A05
            r0 = 35
            X.C21457AkO.A00(r1, r3, r0)
            return
        L_0x0438:
            java.lang.Object r1 = r15.A01
            X.10T r1 = (X.AnonymousClass10T) r1
            java.lang.Object r2 = r15.A02
            X.00H r0 = X.C20134A8u.A00
        L_0x0440:
            r1.registerObserver(r2)
            return
        L_0x0444:
            java.lang.Object r2 = r15.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            java.lang.Object r0 = r15.A02
            com.google.android.gms.auth.UserRecoverableAuthException r0 = (com.google.android.gms.auth.UserRecoverableAuthException) r0
            android.content.Intent r1 = r0.A00()
        L_0x0450:
            r0 = 1
            r2.CNh(r1, r0)
            return
        L_0x0455:
            java.lang.Object r5 = r15.A01
            X.1FL r5 = (X.AnonymousClass1FL) r5
            java.lang.Object r0 = r15.A02
            X.1Ez r0 = (X.AnonymousClass1Ez) r0
            long r3 = r0.A02()
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x046b
            long r1 = r1 - r3
            android.os.SystemClock.sleep(r1)
        L_0x046b:
            X.AnonymousClass8BY.A0j(r5)
            return
        L_0x046f:
            java.lang.Object r3 = r15.A01
            com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment r3 = (com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment) r3
            java.lang.Object r2 = r15.A02
            X.3xb r2 = (X.C80633xb) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r3.A26()
            r0 = 5
            r1.A0Y(r0)
            boolean r0 = X.AnonymousClass112.A01()
            if (r0 == 0) goto L_0x0493
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x0493
            r2.A06()
            return
        L_0x0493:
            r0 = -1
            com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment.A00(r3, r0)
            return
        L_0x0498:
            java.lang.Object r5 = r15.A01
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r5 = (com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment) r5
            java.lang.Object r4 = r15.A02
            X.3xb r4 = (X.C80633xb) r4
            r3 = 1
            X.C18070vi.A0d(r4, r3)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r2 = r5.A06
            java.lang.String r1 = "viewModel"
            if (r2 == 0) goto L_0x04c6
            r0 = 5
            r2.A0Y(r0)
            boolean r0 = X.AnonymousClass112.A01()
            if (r0 == 0) goto L_0x04be
            boolean r0 = r4.A05()
            if (r0 == 0) goto L_0x04be
            r4.A06()
            return
        L_0x04be:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r5.A06
            if (r0 == 0) goto L_0x04c6
            r0.A0b(r3)
            return
        L_0x04c6:
            X.C18070vi.A11(r1)
            r0 = 0
            throw r0
        L_0x04cb:
            java.lang.Object r0 = r15.A01
            X.9q2 r0 = (X.C193399q2) r0
            java.lang.Object r4 = r15.A02
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r4 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r4
            r8 = 1
            X.9pb r7 = r0.A01
            X.9pa r1 = r0.A00
            X.1NT r5 = r4.A0F
            byte[] r0 = r5.A05()
            X.9pc r9 = new X.9pc
            r9.<init>(r0)
            javax.crypto.Cipher r6 = X.AnonymousClass8BR.A18()
            X.9pc r0 = r1.A00
            byte[] r0 = r0.A00
            javax.crypto.spec.SecretKeySpec r3 = X.AnonymousClass8BS.A0v(r0)
            r2 = 12
            byte[] r1 = X.C17970vW.A0I(r2)
            int r0 = r1.length
            if (r0 != r2) goto L_0x055b
            javax.crypto.spec.IvParameterSpec r0 = X.AnonymousClass8BR.A19(r1)
            r6.init(r8, r3, r0)
            byte[] r0 = r9.A00
            byte[] r0 = r6.doFinal(r0)
            X.C18070vi.A0b(r0)
            byte[] r1 = X.C200310o.A0A(r1, r0)
            X.9pc r0 = new X.9pc
            r0.<init>(r1)
            X.9pZ r6 = new X.9pZ
            r6.<init>(r0)
            X.1NO r0 = r4.A0E
            X.118 r0 = r0.A00
            java.io.File r1 = X.AnonymousClass8BR.A0t(r0)
            java.lang.String r0 = "passkey_data.key"
            java.io.File r3 = X.C17880vN.A0e(r1, r0)
            org.json.JSONObject r2 = X.C17880vN.A15()
            java.lang.String r0 = "version"
            r2.put(r0, r8)
            X.9pc r0 = r7.A00
            java.lang.String r1 = X.C196759vb.A01(r0)
            java.lang.String r0 = "credentialId"
            r2.put(r0, r1)
            X.9pc r0 = r6.A00
            java.lang.String r1 = X.C196759vb.A01(r0)
            java.lang.String r0 = "encapsulatedRootKey"
            java.lang.String r1 = X.AnonymousClass8BV.A0r(r1, r0, r2)
            java.nio.charset.Charset r0 = X.C26571Sq.A05
            X.AnonymousClass3Gr.A01(r3, r1, r0)
            X.1NP r1 = r5.A01
            X.2Qv r0 = X.C49532Qv.PASSKEY_ENCRYPTED
            r1.A0J(r0)
            r0 = 5
            r4.A0X(r0)
            X.1DT r1 = r4.A07
            r0 = -1
            X.AnonymousClass3MX.A1K(r1, r0)
            return
        L_0x055b:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0562:
            java.lang.Object r0 = r15.A02
            X.11o r0 = (X.C202911o) r0
            X.1T6 r2 = r0.A02
            java.lang.Object r1 = r15.A01
            X.34B r1 = (X.AnonymousClass34B) r1
            r0 = 0
            r2.A0J(r1, r0)
            return
        L_0x0571:
            java.lang.Object r1 = r15.A01
            X.1TI r1 = (X.AnonymousClass1TI) r1
            java.lang.Object r0 = r15.A02
            r1.accept(r0)
            return
        L_0x057b:
            java.lang.Object r1 = r15.A01
            com.whatsapp.areffects.button.ArEffectsLottieButton r1 = (com.whatsapp.areffects.button.ArEffectsLottieButton) r1
            java.lang.Object r0 = r15.A02
            X.0vk r0 = (X.C18090vk) r0
            com.whatsapp.areffects.button.ArEffectsLottieButton.A00(r1, r0)
            return
        L_0x0587:
            java.lang.Object r0 = r15.A01
            X.35a r0 = (X.C688735a) r0
            java.lang.Object r2 = r15.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A00
            r0 = 45
            r1.A02(r2, r0)
            return
        L_0x0597:
            java.lang.Object r8 = r15.A01
            X.8fM r8 = (X.C167078fM) r8
            java.lang.Object r6 = r15.A02
            android.os.PowerManager$WakeLock r6 = (android.os.PowerManager.WakeLock) r6
            java.lang.String r0 = "backupMessages/mediaCleanup"
            X.1Ez r5 = new X.1Ez
            r5.<init>((java.lang.String) r0)
            X.0ve r7 = r8.A0B     // Catch:{ all -> 0x0622 }
            r0 = 0
            X.C18070vi.A0d(r7, r0)     // Catch:{ all -> 0x0622 }
            r0 = 12136(0x2f68, float:1.7006E-41)
            boolean r0 = X.C25291Nq.A04(r7, r0)     // Catch:{ all -> 0x0622 }
            if (r0 != 0) goto L_0x05cd
            X.17r r3 = r8.A02     // Catch:{ all -> 0x0622 }
            java.io.File r2 = r3.A0G()     // Catch:{ all -> 0x0622 }
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            X.C64062u9.A0H(r2, r0)     // Catch:{ all -> 0x0622 }
            X.2hC r2 = r3.A08()     // Catch:{ all -> 0x0622 }
            java.io.File r3 = r2.A0B     // Catch:{ all -> 0x0622 }
            r2 = 0
            X.C218617r.A07(r3, r2)     // Catch:{ all -> 0x0622 }
            X.C64062u9.A0H(r3, r0)     // Catch:{ all -> 0x0622 }
        L_0x05cd:
            X.00H r10 = r8.A0F     // Catch:{ all -> 0x0622 }
            java.lang.Object r4 = r10.get()     // Catch:{ all -> 0x0622 }
            X.11Z r4 = (X.AnonymousClass11Z) r4     // Catch:{ all -> 0x0622 }
            X.17r r0 = r8.A02     // Catch:{ all -> 0x0622 }
            X.00H r9 = r0.A03     // Catch:{ all -> 0x0622 }
            java.lang.Object r1 = r9.get()     // Catch:{ all -> 0x0622 }
            X.1L7 r1 = (X.AnonymousClass1L7) r1     // Catch:{ all -> 0x0622 }
            java.lang.String r0 = ".Thumbs"
            java.io.File r0 = r1.A08(r0)     // Catch:{ all -> 0x0622 }
            r2 = 604800000(0x240c8400, double:2.988109026E-315)
            X.C64062u9.A0D(r4, r0)     // Catch:{ all -> 0x0622 }
            java.lang.Object r4 = r10.get()     // Catch:{ all -> 0x0622 }
            X.11Z r4 = (X.AnonymousClass11Z) r4     // Catch:{ all -> 0x0622 }
            java.lang.Object r1 = r9.get()     // Catch:{ all -> 0x0622 }
            X.1L7 r1 = (X.AnonymousClass1L7) r1     // Catch:{ all -> 0x0622 }
            java.lang.String r0 = ".StickerThumbs"
            java.io.File r1 = r1.A08(r0)     // Catch:{ all -> 0x0622 }
            r0 = 0
            X.C218617r.A07(r1, r0)     // Catch:{ all -> 0x0622 }
            X.C64062u9.A0D(r4, r1)     // Catch:{ all -> 0x0622 }
            android.content.Context r4 = r8.A00     // Catch:{ all -> 0x0622 }
            X.00H r1 = r8.A0G     // Catch:{ all -> 0x0622 }
            java.lang.String r0 = "gif/gif_preview_cache"
            java.io.File r1 = X.C124296Xu.A00(r4, r7, r1, r0)     // Catch:{ all -> 0x0622 }
            if (r1 == 0) goto L_0x0619
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0622 }
            if (r0 == 0) goto L_0x0619
            X.C64062u9.A0H(r1, r2)     // Catch:{ all -> 0x0622 }
        L_0x0619:
            if (r6 == 0) goto L_0x061e
            r6.release()
        L_0x061e:
            r5.A02()
            return
        L_0x0622:
            r0 = move-exception
            if (r6 == 0) goto L_0x0628
            r6.release()
        L_0x0628:
            r5.A02()
            throw r0
        L_0x062c:
            java.lang.Object r0 = r15.A01
            X.6gx r0 = (X.C128956gx) r0
            java.lang.Object r2 = r15.A02
            X.6sz r2 = (X.C135926sz) r2
            X.2Ym r3 = r0.A00
            java.lang.String r11 = r2.A01
            X.0vl r0 = r0.A03
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "minted_idv_token"
            java.lang.String r12 = ""
            java.lang.String r0 = r1.getString(r0, r12)
            if (r0 == 0) goto L_0x0649
            r12 = r0
        L_0x0649:
            java.lang.String r13 = r2.A02
            org.json.JSONObject r0 = r2.A03
            java.lang.String r14 = X.C17900vP.A08(r0)
            X.10F r0 = r3.A00
            X.10E r0 = r0.A00
            X.11W r9 = X.AnonymousClass8BU.A0e(r0)
            X.181 r4 = X.C108965cb.A0H(r0)
            X.1fq r8 = X.C108955ca.A0X(r0)
            X.0z4 r5 = X.AnonymousClass3Ma.A0c(r0)
            X.00H r10 = X.C108945cZ.A14(r0)
            X.0ve r7 = X.AnonymousClass10E.A8r(r0)
            X.0vb r6 = X.AnonymousClass10E.A6Q(r0)
            X.8k3 r3 = new X.8k3
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 0
            X.7I7 r0 = new X.7I7
            r0.<init>(r2, r1)
            r3.CBv(r0)
            return
        L_0x0680:
            java.lang.Object r1 = r15.A01
            X.4VL r1 = (X.AnonymousClass4VL) r1
            java.lang.Object r0 = r15.A02
            X.5cE r0 = (X.C108745cE) r0
            r1.A04(r0)
            return
        L_0x068c:
            java.lang.Object r3 = r15.A01
            com.whatsapp.accountsync.ProfileActivity r3 = (com.whatsapp.accountsync.ProfileActivity) r3
            java.lang.Object r2 = r15.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.1LU r1 = r3.A08
            r0 = 0
            android.content.Intent r2 = r1.A1x(r3, r2, r0)
            java.lang.String r1 = "CHAT"
            java.lang.String r0 = "ctc_deeplink_option"
            r2.putExtra(r0, r1)
            X.1L9 r1 = r3.A01
            java.lang.String r0 = "CallContactLandingActivity"
            r1.A0B(r3, r2, r0)
            return
        L_0x06aa:
            r0 = 0
            X.00O r3 = new X.00O     // Catch:{ Exception -> 0x06f5 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x06f5 }
            java.lang.Class<X.8Kf> r1 = X.C162308Kf.class
            X.8Kj r0 = new X.8Kj     // Catch:{ Exception -> 0x06f5 }
            r0.<init>()     // Catch:{ Exception -> 0x06f5 }
            r3.put(r1, r0)     // Catch:{ Exception -> 0x06f5 }
            java.lang.Class<X.8Kh> r1 = X.C162328Kh.class
            X.8Kl r0 = new X.8Kl     // Catch:{ Exception -> 0x06f5 }
            r0.<init>()     // Catch:{ Exception -> 0x06f5 }
            r3.put(r1, r0)     // Catch:{ Exception -> 0x06f5 }
            java.lang.Class<X.8Kg> r2 = X.C162318Kg.class
            X.00H r0 = r4.A0L     // Catch:{ Exception -> 0x06f5 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x06f5 }
            X.1cw r1 = (X.C29831cw) r1     // Catch:{ Exception -> 0x06f5 }
            X.8Km r0 = new X.8Km     // Catch:{ Exception -> 0x06f5 }
            r0.<init>(r5, r1)     // Catch:{ Exception -> 0x06f5 }
            r3.put(r2, r0)     // Catch:{ Exception -> 0x06f5 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x06f5 }
            r4.A00 = r0     // Catch:{ Exception -> 0x06f5 }
            r0 = 1
            r4.A09 = r0     // Catch:{ Exception -> 0x06f5 }
            X.2Fx r0 = new X.2Fx     // Catch:{ Exception -> 0x06f5 }
            r0.<init>()     // Catch:{ Exception -> 0x06f5 }
            r4.A05 = r0     // Catch:{ Exception -> 0x06f5 }
            X.8Kk r1 = new X.8Kk     // Catch:{ Exception -> 0x06f5 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x06f5 }
            r4.A01 = r1     // Catch:{ Exception -> 0x06f5 }
            X.2fJ r0 = new X.2fJ     // Catch:{ Exception -> 0x06f5 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06f5 }
            r4.A02 = r0     // Catch:{ Exception -> 0x06f5 }
            return
        L_0x06f5:
            r0 = move-exception
            X.190 r3 = r4.A0B
            java.lang.String r2 = "BatteryMetrics/initializeAsync/exception"
            java.lang.String r0 = r0.getMessage()
            r1 = 0
            r3.A0G(r2, r0, r1)
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A09 = r1
            return
        L_0x070a:
            java.lang.String r0 = "settings-gdrive/gps-unavailable no way to install."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.os.ConditionVariable r0 = r4.A0t
            goto L_0x0719
        L_0x0712:
            java.lang.String r0 = "settings-gdrive/gps-unavailable no way to install."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.os.ConditionVariable r0 = r4.A0M
        L_0x0719:
            r0.open()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21453AkK.run():void");
    }
}
