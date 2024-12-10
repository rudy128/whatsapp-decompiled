package X;

import android.app.Activity;
import java.util.Locale;

public class ARB implements BCU {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass1FR A01;
    public final /* synthetic */ AnonymousClass1NW A02;
    public final /* synthetic */ C27341Vs A03;
    public final /* synthetic */ C18000vb A04;
    public final /* synthetic */ AnonymousClass11Z A05;
    public final /* synthetic */ A1Q A06;
    public final /* synthetic */ C22395B5y A07;

    public void Bqa() {
    }

    public ARB(Activity activity, AnonymousClass1FR r2, AnonymousClass1NW r3, C27341Vs r4, C18000vb r5, AnonymousClass11Z r6, A1Q a1q, C22395B5y b5y) {
        this.A00 = activity;
        this.A04 = r5;
        this.A06 = a1q;
        this.A07 = b5y;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01be, code lost:
        if (r2 != 1) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01cb, code lost:
        if (r1 == 1) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01cd, code lost:
        com.whatsapp.util.Log.i("settings-gdrive/perform-backup/start-gdrive-backup");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlD(int r9) {
        /*
            r8 = this;
            X.A1Q r0 = r8.A06
            X.8yM r0 = r0.A0B
            r0.unregisterObserver(r8)
            android.app.Activity r6 = r8.A00
            r0 = 600(0x258, float:8.41E-43)
            X.AnonymousClass4Yv.A00(r6, r0)
            r5 = 0
            X.A3f.A00 = r5
            X.B5y r1 = r8.A07
            X.Adl r1 = (X.C21055Adl) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r2 = r1.A01
            com.whatsapp.settings.SettingsChat r2 = (com.whatsapp.settings.SettingsChat) r2
            java.lang.Object r1 = r1.A02
            X.8sL r1 = (X.C171828sL) r1
            if (r9 != 0) goto L_0x0026
            com.whatsapp.settings.SettingsChat.A0c(r2)
        L_0x0026:
            int r0 = X.A8L.A00(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A08 = r0
            X.00H r0 = r2.A0J
            r0.get()
            X.00H r0 = X.C20134A8u.A00
            java.lang.Integer r0 = X.C17880vN.A0k()
            r1.A02 = r0
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r1.A00 = r0
            X.18K r0 = r2.A0B
            r0.CC7(r1)
        L_0x0048:
            r0 = 3
            java.lang.String r4 = "settings/backup/failed/null"
            if (r9 != r0) goto L_0x0075
            android.content.Context r0 = r6.getApplicationContext()
            X.A85.A02(r0)
            r0 = 16
            byte[] r3 = X.C17970vW.A0I(r0)
            byte[] r2 = X.A8L.A05(r3)
            if (r2 == 0) goto L_0x01ec
            X.1Vs r1 = r8.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r1.A01(r0, r5, r2, r3)
            X.1FR r1 = r8.A01
            r0 = 2131892319(0x7f12185f, float:1.9419383E38)
            r1.BhQ(r0)
            java.lang.String r0 = "settings/backup/failed/missing-or-mismatch"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0074:
            return
        L_0x0075:
            r0 = 2
            if (r9 != r0) goto L_0x008a
            X.1FR r2 = r8.A01
            boolean r1 = X.AnonymousClass11Z.A00()
            r0 = 2131892318(0x7f12185e, float:1.941938E38)
            if (r1 == 0) goto L_0x0086
            r0 = 2131892317(0x7f12185d, float:1.9419379E38)
        L_0x0086:
            r2.BhQ(r0)
            return
        L_0x008a:
            r0 = 1
            if (r9 == r0) goto L_0x01ec
            X.1NW r0 = r8.A02
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = "settings/backup/failed/missing-permissions"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FR r2 = r8.A01
            r0 = 2131892316(0x7f12185c, float:1.9419377E38)
            goto L_0x0086
        L_0x00a0:
            java.lang.Object r4 = r1.A01
            com.whatsapp.backup.google.SettingsGoogleDrive r4 = (com.whatsapp.backup.google.SettingsGoogleDrive) r4
            java.lang.Object r3 = r1.A02
            X.8sL r3 = (X.C171828sL) r3
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0P
            r1 = 1
            X.1DT r0 = r0.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.A0E(r1)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0P
            X.1DT r0 = r0.A0B
            r0.A0E(r1)
            if (r9 != 0) goto L_0x00e8
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0P
            r0.A0U()
            X.00H r0 = r4.A0h
            int r0 = X.AnonymousClass8BV.A02(r0)
            if (r0 == 0) goto L_0x00e8
            X.C17960vV.A02()
            X.118 r0 = r4.A0R
            android.content.Context r0 = r0.A00
            boolean r0 = X.C41361wE.A09(r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = X.AnonymousClass8BR.A0z(r4)
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = "settings-gdrive/perform-backup/account/null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131886912(0x7f120340, float:1.9408416E38)
        L_0x00e5:
            r4.BhQ(r0)
        L_0x00e8:
            r7 = 0
        L_0x00e9:
            int r0 = X.A8L.A00(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A08 = r0
            X.00H r0 = r4.A0h
            r0.get()
            X.00H r0 = X.C20134A8u.A00
            java.lang.Integer r0 = X.C17880vN.A0k()
            r3.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r3.A00 = r0
            X.18K r0 = r4.A0U
            r0.CC7(r3)
            goto L_0x0048
        L_0x010d:
            X.1NP r1 = X.AnonymousClass8BT.A0C(r4)
            X.00H r0 = X.C20134A8u.A00
            int r0 = r1.A05()
            boolean r0 = X.C17890vO.A1R(r0)
            if (r0 == 0) goto L_0x0144
            java.lang.String r0 = "settings-gdrive/perform-backup/backup/pending"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0P
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0f
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0138
            X.1NP r0 = X.AnonymousClass8BT.A0C(r4)
            int r1 = r0.A02()
            r0 = 10
            if (r1 == r0) goto L_0x0140
        L_0x0138:
            android.view.View$OnClickListener r0 = r4.A02
            if (r0 == 0) goto L_0x0140
            r0.onClick(r5)
            goto L_0x00e8
        L_0x0140:
            r0 = 2131895852(0x7f12262c, float:1.9426549E38)
            goto L_0x00e5
        L_0x0144:
            X.00H r0 = r4.A0h
            boolean r0 = X.AnonymousClass8BW.A1T(r0)
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = "settings-gdrive/perform-backup/restore-media/running"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131895897(0x7f122659, float:1.942664E38)
            goto L_0x00e5
        L_0x0155:
            X.1NP r0 = X.AnonymousClass8BT.A0C(r4)
            int r1 = r0.A04()
            X.11E r0 = r4.A07
            r7 = 1
            int r2 = r0.A03(r7)
            if (r2 != 0) goto L_0x0178
            r0 = 2131895879(0x7f122647, float:1.9426603E38)
            if (r1 != 0) goto L_0x016e
            r0 = 2131895880(0x7f122648, float:1.9426605E38)
        L_0x016e:
            r4.BhQ(r0)
            java.lang.String r0 = "settings-gdrive/perform-backup/no-data-connection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00e8
        L_0x0178:
            r0 = 3
            if (r2 != r0) goto L_0x018b
            r0 = 2131890672(0x7f1211f0, float:1.9416042E38)
            if (r1 != 0) goto L_0x0183
            r0 = 2131890674(0x7f1211f2, float:1.9416046E38)
        L_0x0183:
            r4.BhQ(r0)
        L_0x0186:
            com.whatsapp.backup.google.SettingsGoogleDrive.A0s(r4)
            goto L_0x00e9
        L_0x018b:
            r0 = 2
            if (r2 != r0) goto L_0x01be
            if (r1 != 0) goto L_0x01cb
            r7 = 13
            X.4VU r1 = new X.4VU
            r1.<init>(r7)
            r0 = 2131898582(0x7f1230d6, float:1.9432086E38)
            X.AnonymousClass8BW.A11(r4, r1, r0)
            r0 = 2131890673(0x7f1211f1, float:1.9416044E38)
            X.AnonymousClass8BS.A12(r4, r1, r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A03(r0)
            r0 = 2131886911(0x7f12033f, float:1.9408414E38)
            X.AnonymousClass8BS.A11(r4, r1, r0)
            com.whatsapp.dialogs.PromptDialogFragment r2 = r1.A00()
            boolean r0 = com.whatsapp.backup.google.SettingsGoogleDrive.A0x(r4)
            if (r0 != 0) goto L_0x00e8
            goto L_0x01d3
        L_0x01be:
            if (r2 == r7) goto L_0x01cd
        L_0x01c0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "settings-gdrive/perform-backup/unknown-network-type/"
            X.C17900vP.A0i(r0, r1, r2)
            goto L_0x00e8
        L_0x01cb:
            if (r1 != r7) goto L_0x01c0
        L_0x01cd:
            java.lang.String r0 = "settings-gdrive/perform-backup/start-gdrive-backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0186
        L_0x01d3:
            X.1jj r1 = X.AnonymousClass3Ma.A0H(r4)     // Catch:{ IllegalStateException -> 0x01e0 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ IllegalStateException -> 0x01e0 }
            X.AnonymousClass8BV.A18(r1, r2, r0)     // Catch:{ IllegalStateException -> 0x01e0 }
            goto L_0x00e8
        L_0x01e0:
            r1 = move-exception
            java.lang.String r0 = "settings-gdrive/perform-backup"
            com.whatsapp.util.Log.e(r0, r1)
            com.whatsapp.backup.google.SettingsGoogleDrive.A0s(r4)
            r7 = 1
            goto L_0x00e9
        L_0x01ec:
            X.1FR r1 = r8.A01
            r0 = 2131892316(0x7f12185c, float:1.9419377E38)
            r1.BhQ(r0)
            com.whatsapp.util.Log.w((java.lang.String) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARB.BlD(int):void");
    }

    public void BmT() {
        AnonymousClass4Yv.A01(this.A00, 600);
    }

    public void C24(int i) {
        C161058Bf r6 = A3f.A00;
        if (r6 != null) {
            r6.setMessage(C17880vN.A0q(this.A00, AnonymousClass8BX.A0Z(this.A04, i), new Object[1], 0, 2131895807));
        }
        int i2 = i % 10;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, i, 0);
        if (i2 == 0) {
            C108955ca.A1X("settings/backup/msgstore/progress/%d%%", locale, objArr);
        } else {
            String.format(locale, "settings/backup/msgstore/progress/%d%%", objArr);
        }
    }
}
