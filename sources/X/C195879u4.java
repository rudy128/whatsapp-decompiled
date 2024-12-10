package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.AlarmBroadcastReceiver;

/* renamed from: X.9u4  reason: invalid class name and case insensitive filesystem */
public abstract class C195879u4 {
    public final Context A00;

    public void A04() {
        C167078fM.A00((C167078fM) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0117 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Intent r16) {
        /*
            r15 = this;
            r8 = r15
            X.8fM r8 = (X.C167078fM) r8
            java.lang.String r0 = "backupMessages"
            X.1Ez r6 = new X.1Ez
            r6.<init>((java.lang.String) r0)
            X.8sL r14 = new X.8sL
            r14.<init>()
            r13 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r14.A09 = r0
            java.lang.Long r0 = X.C108955ca.A0m()
            r14.A0J = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BackupMessagesAction/backupMessages; intent="
            r2 = r16
            X.C17900vP.A0Y(r2, r0, r1)
            X.11C r0 = r8.A07
            android.os.PowerManager r12 = r0.A0G()
            r11 = 0
            r2 = 600000(0x927c0, double:2.964394E-318)
            r4 = 0
            if (r12 != 0) goto L_0x0045
            java.lang.String r0 = "BackupMessagesAction/backupMessages pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r9 = r11
        L_0x003a:
            android.os.ConditionVariable r10 = new android.os.ConditionVariable
            r10.<init>(r13)
            android.os.ConditionVariable r7 = new android.os.ConditionVariable
            r7.<init>(r13)
            goto L_0x0052
        L_0x0045:
            java.lang.String r0 = "BackupMessagesAction#backupMessages"
            android.os.PowerManager$WakeLock r9 = X.C181789Rv.A00(r12, r0, r13)
            r9.setReferenceCounted(r4)
            r9.acquire(r2)
            goto L_0x003a
        L_0x0052:
            X.11S r5 = r8.A03     // Catch:{ all -> 0x015f }
            r5.A0I()     // Catch:{ all -> 0x015f }
            com.whatsapp.Me r0 = r5.A00     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "BackupMessagesAction/backupMessages skipping message backup due to not yet registered"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015f }
            r1 = 2
            goto L_0x00f5
        L_0x0063:
            X.1Cd r0 = r8.A09     // Catch:{ all -> 0x015f }
            r0.A06()     // Catch:{ all -> 0x015f }
            boolean r0 = r0.A08     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = "BackupMessagesAction/backupMessages skipping message backup due message store is not ready"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015f }
            r1 = 6
            goto L_0x00f5
        L_0x0074:
            X.1NM r0 = r8.A06     // Catch:{ all -> 0x015f }
            boolean r1 = r0.A02()     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = "BackupMessagesAction/backupMessages skipping message backup due to missing external writable media"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x015f }
            X.A1Q r1 = r8.A08     // Catch:{ all -> 0x015f }
            X.00H r0 = r0.A01     // Catch:{ all -> 0x015f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x015f }
            X.2dm r0 = (X.C54212dm) r0     // Catch:{ all -> 0x015f }
            boolean r0 = r0.A00     // Catch:{ all -> 0x015f }
            r1.A00 = r0     // Catch:{ all -> 0x015f }
            r1 = 3
            goto L_0x00f5
        L_0x0091:
            X.1Vz r0 = r8.A05     // Catch:{ all -> 0x015f }
            X.1W0 r0 = r0.A00     // Catch:{ all -> 0x015f }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "BackupMessagesAction/backupMessages skipping message backup due to not plugged in and low battery"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015f }
            X.A1Q r0 = r8.A08     // Catch:{ all -> 0x015f }
            r0.A00 = r13     // Catch:{ all -> 0x015f }
            r1 = 4
            goto L_0x00f5
        L_0x00a6:
            X.195 r0 = r8.A01     // Catch:{ all -> 0x015f }
            boolean r0 = r0.A00     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = "BackupMessagesAction/backupMessages skipping message backup since app is in foreground"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015f }
            X.A1Q r0 = r8.A08     // Catch:{ all -> 0x015f }
            r0.A00 = r13     // Catch:{ all -> 0x015f }
            r1 = 5
            goto L_0x00f5
        L_0x00b7:
            java.lang.String r0 = "BackupMessagesAction/backupMessages starting message backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015f }
            X.A1Q r1 = r8.A08     // Catch:{ all -> 0x015f }
            r1.A00 = r4     // Catch:{ all -> 0x015f }
            r10.close()     // Catch:{ all -> 0x015f }
            X.ARA r0 = new X.ARA     // Catch:{ all -> 0x015f }
            r0.<init>(r10, r1, r14)     // Catch:{ all -> 0x015f }
            r1.A01(r0, r14, r13)     // Catch:{ all -> 0x015f }
            X.1NP r1 = r8.A04     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "BACKUP_LAST_CHECK_TIMESTAMP"
            r1.A0M(r0)     // Catch:{ all -> 0x015f }
            if (r12 != 0) goto L_0x00da
            java.lang.String r0 = "BackupMessagesAction/backupMessages/media-cleanup pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x015f }
            goto L_0x00e9
        L_0x00da:
            java.lang.String r0 = "BackupMessagesAction#backupMessages#mediaCleanup"
            android.os.PowerManager$WakeLock r11 = X.C181789Rv.A00(r12, r0, r13)     // Catch:{ all -> 0x015f }
            r11.setReferenceCounted(r4)     // Catch:{ all -> 0x015f }
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r11.acquire(r0)     // Catch:{ all -> 0x015f }
        L_0x00e9:
            X.10I r4 = r8.A0D     // Catch:{ all -> 0x015f }
            r1 = 3
            X.AkK r0 = new X.AkK     // Catch:{ all -> 0x015f }
            r0.<init>(r8, r11, r1)     // Catch:{ all -> 0x015f }
            r4.CGF(r0)     // Catch:{ all -> 0x015f }
            goto L_0x0112
        L_0x00f5:
            X.1NP r0 = r8.A04     // Catch:{ all -> 0x015f }
            int r0 = X.C20134A8u.A00(r0, r4)     // Catch:{ all -> 0x015f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x015f }
            r14.A02 = r0     // Catch:{ all -> 0x015f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x015f }
            r14.A00 = r0     // Catch:{ all -> 0x015f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x015f }
            r14.A08 = r0     // Catch:{ all -> 0x015f }
            X.18K r0 = r8.A0C     // Catch:{ all -> 0x015f }
            r0.CC7(r14)     // Catch:{ all -> 0x015f }
        L_0x0112:
            X.C167078fM.A00(r8)     // Catch:{ all -> 0x015f }
            if (r9 == 0) goto L_0x011a
            r9.release()
        L_0x011a:
            r10.block(r2)
            r5.A0I()
            com.whatsapp.Me r0 = r5.A00
            if (r0 == 0) goto L_0x0156
            X.1Cd r0 = r8.A09
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0156
            java.lang.String r0 = "backupMessages/db-migration"
            X.1Ez r5 = new X.1Ez
            r5.<init>((java.lang.String) r0)
            r7.close()
            X.10I r4 = r8.A0D
            X.0ve r3 = r8.A0B
            X.1DN r2 = r8.A0A
            X.00H r0 = r8.A0E
            java.lang.Object r1 = r0.get()
            X.1a3 r1 = (X.C28371a3) r1
            X.3Cr r0 = new X.3Cr
            r0.<init>(r7, r1, r2, r3)
            r4.CGF(r0)
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            r7.block(r0)
            r5.A02()
        L_0x0156:
            java.lang.String r0 = "BackupMessagesAction/backupMessages done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A02()
            return
        L_0x015f:
            r0 = move-exception
            if (r9 == 0) goto L_0x0165
            r9.release()
        L_0x0165:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195879u4.A05(android.content.Intent):void");
    }

    public PendingIntent A03(String str, int i) {
        Context context = this.A00;
        return C1408573i.A01(context, 0, new Intent(str, (Uri) null, context, AlarmBroadcastReceiver.class), i);
    }

    public boolean A06(Intent intent) {
        return C17890vO.A1S(intent, "com.whatsapp.action.BACKUP_MESSAGES");
    }

    public C195879u4(Context context) {
        this.A00 = context;
    }
}
