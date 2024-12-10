package X;

import android.content.BroadcastReceiver;

/* renamed from: X.8Bv  reason: invalid class name and case insensitive filesystem */
public class C161128Bv extends BroadcastReceiver {
    public final int A00;
    public final Object A01;

    public C161128Bv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0253, code lost:
        ((X.C29831cw) r2.A0K.get()).A02(r7, r2.A0G.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0277, code lost:
        r1 = X.AnonymousClass1LU.A1V(r4, r3, (java.lang.String) null, 2);
        r1.setFlags(335544320);
        r4.startActivity(r1);
        ((X.C29831cw) r2.A0K.get()).A02(r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r3 = (X.A99) r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0171, code lost:
        if (r4.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0173, code lost:
        r0 = true;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0182, code lost:
        if (r4.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0184, code lost:
        r0 = false;
        r6 = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0069;
                case 2: goto L_0x0294;
                case 3: goto L_0x0263;
                case 4: goto L_0x0231;
                case 5: goto L_0x01db;
                case 6: goto L_0x01c5;
                case 7: goto L_0x01b5;
                case 8: goto L_0x0056;
                case 9: goto L_0x01ad;
                case 10: goto L_0x003d;
                case 11: goto L_0x0011;
                case 12: goto L_0x0192;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A01
            X.91M r1 = (X.AnonymousClass91M) r1
            X.8pN r0 = r1.A00
            if (r0 == 0) goto L_0x018a
            r1.A5F()
        L_0x0010:
            return
        L_0x0011:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r0 = X.C17890vO.A1S(r9, r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Object r3 = r7.A01
            X.A99 r3 = (X.A99) r3
            com.whatsapp.voipcalling.CallInfo r2 = X.AnonymousClass8BR.A0r(r3)
            if (r2 == 0) goto L_0x0010
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0010
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x0033
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2I
            if (r0 != 0) goto L_0x0010
        L_0x0033:
            java.lang.String r0 = "voip/unlockReceiver generate headsup notification when user unlock the screen in RECEIVED_CALL state"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            X.A99.A0D(r3, r2, r0)
            return
        L_0x003d:
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r0 = X.C17890vO.A1S(r9, r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r7.A01
            X.A99 r0 = (X.A99) r0
            X.A7v r0 = r0.A0X
            if (r0 == 0) goto L_0x0050
            r0.A06()
        L_0x0050:
            java.lang.String r0 = "Screen is being turned off"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0056:
            java.lang.Object r1 = r7.A01
            X.A2H r1 = (X.A2H) r1
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "reload commerce translation metadata since locale changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A02()
            return
        L_0x0069:
            java.lang.Object r2 = r7.A01
            X.8Kn r2 = (X.C162388Kn) r2
            android.net.ConnectivityManager r0 = r2.A03
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x0010
            int r1 = r0.getType()
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0010
            r2.A04()
            r2.A00 = r1
            return
        L_0x0083:
            r0 = 1
            X.C18070vi.A0d(r9, r0)
            java.lang.Object r6 = r7.A01
            X.8KO r6 = (X.AnonymousClass8KO) r6
            boolean r0 = r6 instanceof X.AnonymousClass8KL
            if (r0 == 0) goto L_0x00d0
            r4 = 0
            java.lang.String r0 = r9.getAction()
            if (r0 == 0) goto L_0x0010
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = X.C182059Sx.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Received "
            r1.append(r0)
            java.lang.String r0 = r9.getAction()
            X.AnonymousClass8BW.A16(r3, r0, r2, r1)
            java.lang.String r2 = r9.getAction()
            if (r2 == 0) goto L_0x0010
            int r1 = r2.hashCode()
            r0 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r1 == r0) goto L_0x012c
            r0 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r1 != r0) goto L_0x0010
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
        L_0x00cc:
            r6.A03(r0)
            return
        L_0x00d0:
            boolean r0 = r6 instanceof X.AnonymousClass8KN
            if (r0 == 0) goto L_0x00f4
            X.8KN r6 = (X.AnonymousClass8KN) r6
            java.lang.String r1 = r9.getAction()
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0010
            X.A5Z r2 = X.A5Z.A00()
            java.lang.String r1 = X.C20091A6t.A00
            java.lang.String r0 = "Network broadcast received"
            r2.A03(r1, r0)
            android.net.ConnectivityManager r0 = r6.A00
            X.9sC r0 = X.C20091A6t.A01(r0)
            goto L_0x00cc
        L_0x00f4:
            boolean r0 = r6 instanceof X.AnonymousClass8KK
            if (r0 == 0) goto L_0x0146
            r4 = 0
            java.lang.String r0 = r9.getAction()
            if (r0 == 0) goto L_0x0010
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = X.C182029Su.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Received "
            r1.append(r0)
            java.lang.String r0 = r9.getAction()
            X.AnonymousClass8BW.A16(r3, r0, r2, r1)
            java.lang.String r2 = r9.getAction()
            if (r2 == 0) goto L_0x0010
            int r1 = r2.hashCode()
            r0 = -1980154005(0xffffffff89f93f6b, float:-6.0004207E-33)
            if (r1 == r0) goto L_0x0139
            r0 = 490310653(0x1d398bfd, float:2.4556918E-21)
            if (r1 != r0) goto L_0x0010
            java.lang.String r0 = "android.intent.action.BATTERY_LOW"
            goto L_0x012e
        L_0x012c:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
        L_0x012e:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            goto L_0x00cc
        L_0x0139:
            java.lang.String r0 = "android.intent.action.BATTERY_OKAY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            goto L_0x00cc
        L_0x0146:
            r5 = 0
            java.lang.String r4 = r9.getAction()
            if (r4 == 0) goto L_0x0010
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = X.C182019St.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Received "
            r1.append(r0)
            X.AnonymousClass8BW.A16(r3, r4, r2, r1)
            int r0 = r4.hashCode()
            r1 = 1
            switch(r0) {
                case -1886648615: goto L_0x017c;
                case -54942926: goto L_0x0179;
                case 948344062: goto L_0x016b;
                case 1019184907: goto L_0x0168;
                default: goto L_0x0167;
            }
        L_0x0167:
            return
        L_0x0168:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            goto L_0x016d
        L_0x016b:
            java.lang.String r0 = "android.os.action.CHARGING"
        L_0x016d:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x00cc
        L_0x0179:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            goto L_0x017e
        L_0x017c:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
        L_0x017e:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            goto L_0x00cc
        L_0x018a:
            X.1QE r1 = r1.A03
            java.lang.String r0 = "onLibraryResult got resend otp but bankaccount is null"
            r1.A06(r0)
            return
        L_0x0192:
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = X.C17890vO.A1S(r9, r0)
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r1 = r7.A01
            X.34U r1 = (X.AnonymousClass34U) r1
            r0 = 0
            X.AnonymousClass34U.A00(r1, r0)
            return
        L_0x01a3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unknown intent received in connectivity receiver "
            X.C17900vP.A0Z(r9, r0, r1)
            return
        L_0x01ad:
            java.lang.Object r0 = r7.A01
            X.9O5 r0 = (X.AnonymousClass9O5) r0
            r0.A02()
            return
        L_0x01b5:
            java.lang.String r0 = "gdrive-notification-manager/user-decided-to-restore-over-low-battery"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r7.A01
            X.1oa r2 = (X.C36861oa) r2
            X.1oU r0 = r2.A0E
            r0.A05()
            goto L_0x0253
        L_0x01c5:
            java.lang.String r0 = "gdrive-notification-manager/user-decided-to-restore-over-data-connection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r7.A01
            X.1oa r2 = (X.C36861oa) r2
            X.00H r0 = r2.A0L
            r0.get()
            X.118 r0 = r2.A0G
            android.content.Context r4 = r0.A00
            java.lang.String r3 = "action_perform_media_restore_over_cellular"
            goto L_0x0277
        L_0x01db:
            java.lang.String r0 = "gdrive-notification-manager/user-dismissed the notification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r7.A01
            X.1oa r2 = (X.C36861oa) r2
            X.00H r0 = r2.A0K
            java.lang.Object r1 = r0.get()
            X.1cw r1 = (X.C29831cw) r1
            X.118 r0 = r2.A0G
            android.content.Context r0 = r0.A00
            r1.A02(r7, r0)
            X.19K r5 = r2.A0J     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            X.A7W r1 = X.AnonymousClass8BR.A0D(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            java.lang.String r0 = "com.whatsapp.backup.google.google-backup-worker"
            X.5oM r0 = r1.A04(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            java.util.Iterator r3 = X.AnonymousClass8BR.A13(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
        L_0x0207:
            boolean r0 = r3.hasNext()     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            if (r0 == 0) goto L_0x0290
            java.lang.Object r4 = r3.next()     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            X.9tt r4 = (X.C195779tt) r4     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            java.lang.Integer r1 = r4.A02     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            if (r1 != r0) goto L_0x0207
            X.A7W r3 = X.AnonymousClass8BR.A0D(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            java.util.UUID r0 = r4.A03     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            X.8KR r1 = new X.8KR     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            r1.<init>(r3, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            X.3Kb r0 = r3.A06     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            r0.BKq(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x022a }
            goto L_0x0290
        L_0x022a:
            r1 = move-exception
            java.lang.String r0 = "gdrive-notification-manager/couldn't cancel worker."
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0290
        L_0x0231:
            java.lang.String r0 = "gdrive-notification-manager/user-decided-to-restore-over-low-battery"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r7.A01
            X.1oa r2 = (X.C36861oa) r2
            X.1oU r3 = r2.A0E
            r0 = 1
            r3.A08 = r0
            X.00H r0 = r3.A0M
            java.lang.Object r0 = r0.get()
            X.1Vz r0 = (X.C27411Vz) r0
            X.1W0 r0 = r0.A00
            r3.A0B(r0)
            X.10I r1 = r3.A0L
            r0 = 25
            X.C21457AkO.A01(r1, r3, r0)
        L_0x0253:
            X.00H r0 = r2.A0K
            java.lang.Object r1 = r0.get()
            X.1cw r1 = (X.C29831cw) r1
            X.118 r0 = r2.A0G
            android.content.Context r0 = r0.A00
            r1.A02(r7, r0)
            goto L_0x0290
        L_0x0263:
            java.lang.String r0 = "gdrive-notification-manager/user-decided-to-backup-over-data-connection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r7.A01
            X.1oa r2 = (X.C36861oa) r2
            X.00H r0 = r2.A0L
            r0.get()
            X.118 r0 = r2.A0G
            android.content.Context r4 = r0.A00
            java.lang.String r3 = "action_perform_backup_over_cellular"
        L_0x0277:
            r1 = 0
            r0 = 2
            android.content.Intent r1 = X.AnonymousClass1LU.A1V(r4, r3, r1, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.setFlags(r0)
            r4.startActivity(r1)
            X.00H r0 = r2.A0K
            java.lang.Object r0 = r0.get()
            X.1cw r0 = (X.C29831cw) r0
            r0.A02(r7, r4)
        L_0x0290:
            r2.A05()
            return
        L_0x0294:
            java.lang.Object r0 = r7.A01
            X.1Rm r0 = (X.C26271Rm) r0
            X.10I r2 = r0.A06
            r1 = 49
            X.3C0 r0 = new X.3C0
            r0.<init>(r7, r8, r1)
            r2.CGF(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161128Bv.onReceive(android.content.Context, android.content.Intent):void");
    }
}
