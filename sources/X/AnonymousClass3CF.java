package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.3CF  reason: invalid class name */
public class AnonymousClass3CF implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r3 = r0.A02
            X.1nP r3 = (X.C36141nP) r3
            int r15 = r0.A00
            java.lang.Object r10 = r0.A03
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10
            int r7 = r0.A01
            java.lang.Object r11 = r0.A04
            X.205 r11 = (X.AnonymousClass205) r11
            java.lang.Object r0 = r0.A05
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r12 = r0.first
            X.2nL r12 = (X.C60072nL) r12
            java.lang.Object r0 = r0.second
            int r14 = X.AnonymousClass000.A0M(r0)
            java.lang.String r5 = "; targetJid="
            com.whatsapp.jid.UserJid r4 = r10.userJid
            X.2nE r6 = X.C63962tz.A02(r10)
            X.1Os r0 = r3.A04
            X.3Ez r2 = X.C25571Os.A00(r6, r0)
            X.C25571Os.A03(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl checking sessions due to retry receipt; recipient="
            r1.append(r0)     // Catch:{ all -> 0x00c1 }
            r1.append(r6)     // Catch:{ all -> 0x00c1 }
            X.C17900vP.A0Y(r4, r5, r1)     // Catch:{ all -> 0x00c1 }
            X.1P3 r1 = r3.A03     // Catch:{ all -> 0x00c1 }
            boolean r0 = r1.A0b(r6)     // Catch:{ all -> 0x00c1 }
            r13 = 0
            if (r0 == 0) goto L_0x008f
            X.9zg r0 = r1.A0F(r6)     // Catch:{ all -> 0x00c1 }
            X.9XJ r9 = r0.A01     // Catch:{ all -> 0x00c1 }
            X.8cI r0 = r9.A00     // Catch:{ all -> 0x00c1 }
            int r0 = r0.remoteRegistrationId_     // Catch:{ all -> 0x00c1 }
            if (r0 == r7) goto L_0x0065
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl deleting session due to registration id change; stop retrying; targetJid="
            X.C17900vP.A0Y(r4, r0, r3)     // Catch:{ all -> 0x00c1 }
            r1.A0G(r6)     // Catch:{ all -> 0x00c1 }
            r1.A0S(r6)     // Catch:{ all -> 0x00c1 }
            goto L_0x00bb
        L_0x0065:
            r7 = 2
            if (r15 < r7) goto L_0x008f
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl requiring new session before resending; targetJid="
            X.C17900vP.A0Y(r4, r0, r8)     // Catch:{ all -> 0x00c1 }
            X.8cI r0 = r9.A00     // Catch:{ all -> 0x00c1 }
            X.DSQ r0 = r0.aliceBaseKey_     // Catch:{ all -> 0x00c1 }
            byte[] r13 = r0.A06()     // Catch:{ all -> 0x00c1 }
            if (r15 <= r7) goto L_0x0087
            boolean r0 = r1.A0c(r6, r4)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl will wait to send notification until a new prekey has been fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x00bb
        L_0x0087:
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl will record the base key used to send"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c1 }
            r1.A0T(r6, r4, r13)     // Catch:{ all -> 0x00c1 }
        L_0x008f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; create new SendFinalLiveLocationRetryJob; messageKey="
            r1.append(r0)     // Catch:{ all -> 0x00c1 }
            r1.append(r11)     // Catch:{ all -> 0x00c1 }
            r1.append(r5)     // Catch:{ all -> 0x00c1 }
            r1.append(r4)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "; timeOffset="
            r1.append(r0)     // Catch:{ all -> 0x00c1 }
            r1.append(r14)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "; retryCount="
            X.C17900vP.A0j(r0, r1, r15)     // Catch:{ all -> 0x00c1 }
            X.1Mm r0 = r3.A02     // Catch:{ all -> 0x00c1 }
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x00c1 }
            com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r9 = new com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob     // Catch:{ all -> 0x00c1 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00c1 }
            r0.A01(r9)     // Catch:{ all -> 0x00c1 }
        L_0x00bb:
            if (r2 == 0) goto L_0x00c0
            r2.close()
        L_0x00c0:
            return
        L_0x00c1:
            r1 = move-exception
            if (r2 == 0) goto L_0x00cc
            r2.close()     // Catch:{ all -> 0x00c8 }
            throw r1
        L_0x00c8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x00cc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CF.run():void");
    }

    public AnonymousClass3CF(Pair pair, DeviceJid deviceJid, C36141nP r3, AnonymousClass205 r4, int i, int i2) {
        this.A02 = r3;
        this.A00 = i;
        this.A03 = deviceJid;
        this.A01 = i2;
        this.A04 = r4;
        this.A05 = pair;
    }
}
