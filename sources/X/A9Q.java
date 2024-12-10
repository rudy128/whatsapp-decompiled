package X;

import android.content.DialogInterface;

public class A9Q implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public A9Q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C73203Rj r1, Object obj, int i) {
        r1.A0G(new A9Q(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        X.AnonymousClass4Yv.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
        com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013a, code lost:
        r0.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x012f;
                case 1: goto L_0x011e;
                case 2: goto L_0x0110;
                case 3: goto L_0x0104;
                case 4: goto L_0x00f8;
                case 5: goto L_0x00e7;
                case 6: goto L_0x001e;
                case 7: goto L_0x00df;
                case 8: goto L_0x00d7;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x00cc;
                case 12: goto L_0x0014;
                case 13: goto L_0x00bf;
                case 14: goto L_0x00b8;
                case 15: goto L_0x00b0;
                case 16: goto L_0x00a9;
                case 17: goto L_0x00a2;
                case 18: goto L_0x0098;
                case 19: goto L_0x0091;
                case 20: goto L_0x008a;
                case 21: goto L_0x0083;
                case 22: goto L_0x007c;
                case 23: goto L_0x0075;
                case 24: goto L_0x006e;
                case 25: goto L_0x0066;
                case 26: goto L_0x0053;
                case 27: goto L_0x004c;
                case 28: goto L_0x0040;
                case 29: goto L_0x0033;
                case 30: goto L_0x0028;
                case 31: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0009:
            r0.finish()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r3.A01
            X.8Bb r0 = (X.C161028Bb) r0
            android.app.Activity r0 = r0.A00
            goto L_0x0009
        L_0x0014:
            java.lang.Object r0 = r3.A01
            X.BB3 r0 = (X.BB3) r0
            if (r0 == 0) goto L_0x000c
            r0.C4N()
            return
        L_0x001e:
            java.lang.Object r0 = r3.A01
            X.B7S r0 = (X.B7S) r0
            if (r0 == 0) goto L_0x000c
            r0.BrW()
            return
        L_0x0028:
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 7
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 8
            goto L_0x003c
        L_0x0033:
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 6
        L_0x003c:
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x0040:
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.finish()
            return
        L_0x004c:
            java.lang.Object r1 = r3.A01
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            return
        L_0x0053:
            java.lang.Object r2 = r3.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 0
            android.content.Intent r0 = r2.getIntent()
            r2.setResult(r1, r0)
            r2.finish()
            r2.overridePendingTransition(r1, r1)
            return
        L_0x0066:
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.C108965cb.A0y(r0)
            return
        L_0x006e:
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 19
            goto L_0x009e
        L_0x0075:
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 12
            goto L_0x009e
        L_0x007c:
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 11
            goto L_0x009e
        L_0x0083:
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 10
            goto L_0x009e
        L_0x008a:
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 15
            goto L_0x009e
        L_0x0091:
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 13
            goto L_0x009e
        L_0x0098:
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 100
        L_0x009e:
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x00a2:
            java.lang.Object r1 = r3.A01
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 10
            goto L_0x00c5
        L_0x00a9:
            java.lang.Object r1 = r3.A01
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 19
            goto L_0x00c5
        L_0x00b0:
            java.lang.Object r0 = r3.A01
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r0 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r0
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A0V(r0)
            return
        L_0x00b8:
            java.lang.Object r1 = r3.A01
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 11
            goto L_0x00c5
        L_0x00bf:
            java.lang.Object r1 = r3.A01
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 12
        L_0x00c5:
            X.AnonymousClass4Yv.A00(r1, r0)
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A0V(r1)
            return
        L_0x00cc:
            java.lang.Object r0 = r3.A01
            com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity r0 = (com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity) r0
            com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity.A03(r0)
            r0.finish()
            return
        L_0x00d7:
            java.lang.Object r0 = r3.A01
            X.8kf r0 = (X.C169258kf) r0
            r0.A4b()
            return
        L_0x00df:
            java.lang.Object r0 = r3.A01
            X.A6I r0 = (X.A6I) r0
            r0.A03()
            return
        L_0x00e7:
            java.lang.Object r0 = r3.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1B()
            X.C17960vV.A07(r1)
            com.whatsapp.backup.google.SettingsGoogleDrive r1 = (com.whatsapp.backup.google.SettingsGoogleDrive) r1
            r0 = 1
            r1.A0v = r0
            return
        L_0x00f8:
            java.lang.Object r1 = r3.A01
            com.whatsapp.backup.google.SettingsGoogleDrive r1 = (com.whatsapp.backup.google.SettingsGoogleDrive) r1
            java.lang.String r0 = "settings-gdrive/gps-unavailable-and-user-declined-install"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.ConditionVariable r0 = r1.A0t
            goto L_0x013a
        L_0x0104:
            java.lang.Object r1 = r3.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r1 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r1
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-unavailable/user declined to install Google Play Services."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.ConditionVariable r0 = r1.A0x
            goto L_0x013a
        L_0x0110:
            java.lang.Object r1 = r3.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r1 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r1
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-error-dialog/user declined to install Google Play Services."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 1
            com.whatsapp.backup.google.RestoreFromBackupActivity.A12(r1, r0)
            return
        L_0x011e:
            java.lang.Object r0 = r3.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1B()
            X.C17960vV.A07(r1)
            X.8gR r1 = (X.C167498gR) r1
            r0 = 1
            r1.A0P = r0
            return
        L_0x012f:
            java.lang.Object r1 = r3.A01
            X.8gR r1 = (X.C167498gR) r1
            java.lang.String r0 = "settings-gdrive/gps-unavailable-and-user-declined-install"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.ConditionVariable r0 = r1.A0M
        L_0x013a:
            r0.open()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9Q.onCancel(android.content.DialogInterface):void");
    }
}
