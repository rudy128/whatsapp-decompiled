package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.DeviceJid;
import java.util.List;

/* renamed from: X.AkZ  reason: case insensitive filesystem */
public class C21468AkZ implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C21468AkZ(AnonymousClass1TQ r2, AnonymousClass2SB r3, C88344Zh r4, DeviceJid deviceJid, List list) {
        this.A00 = 15;
        this.A01 = r2;
        this.A02 = r4;
        this.A03 = r3;
        this.A04 = deviceJid;
        this.A05 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03e2, code lost:
        if (r1.equals(r11.A01) == false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x06da, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        X.CDX.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0c5f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A0E, 3626) == false) goto L_0x0c61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x1093, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A0S, 5309) == false) goto L_0x1095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x10a5, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A0S, 7141) != false) goto L_0x10a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x10a7, code lost:
        r2 = r27.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x10ab, code lost:
        if (r2 == null) goto L_0x10c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x10ad, code lost:
        r9.A0H(X.C196849vk.A01(r2.A00));
        r1 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x10b8, code lost:
        if (r1 == null) goto L_0x10c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x10ba, code lost:
        r9.A0I(r1.booleanValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x12c1, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x12c2, code lost:
        r0.A01.A0E("history-sync-send-methods/send-initial-bootstrap/exception", (java.lang.String) null, r4);
        com.whatsapp.util.Log.e("history-sync-send-methods/send-initial-bootstrap: recent msgs error", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:811:0x169e, code lost:
        if (r5 > 0) goto L_0x1615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02cc, code lost:
        if (r8.isEmpty() != false) goto L_0x02ce;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:1048:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:784:0x161d  */
    /* JADX WARNING: Removed duplicated region for block: B:789:0x1635  */
    /* JADX WARNING: Removed duplicated region for block: B:792:0x163b  */
    /* JADX WARNING: Removed duplicated region for block: B:795:0x1666  */
    /* JADX WARNING: Removed duplicated region for block: B:953:0x1bf4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r52 = this;
            r0 = r52
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x01a9;
                case 1: goto L_0x00b1;
                case 2: goto L_0x01c0;
                case 3: goto L_0x01eb;
                case 4: goto L_0x0248;
                case 5: goto L_0x0262;
                case 6: goto L_0x02c1;
                case 7: goto L_0x03ab;
                case 8: goto L_0x043e;
                case 9: goto L_0x0492;
                case 10: goto L_0x051a;
                case 11: goto L_0x058a;
                case 12: goto L_0x05d9;
                case 13: goto L_0x0899;
                case 14: goto L_0x0bf0;
                case 15: goto L_0x0c0c;
                case 16: goto L_0x16a2;
                case 17: goto L_0x16c3;
                case 18: goto L_0x0007;
                case 19: goto L_0x0007;
                case 20: goto L_0x16fb;
                case 21: goto L_0x173c;
                case 22: goto L_0x1762;
                case 23: goto L_0x1794;
                case 24: goto L_0x181f;
                case 25: goto L_0x188c;
                case 26: goto L_0x1937;
                case 27: goto L_0x19a5;
                case 28: goto L_0x19e7;
                case 29: goto L_0x1a3f;
                case 30: goto L_0x1a57;
                case 31: goto L_0x1b60;
                case 32: goto L_0x1bd0;
                case 33: goto L_0x1bf8;
                case 34: goto L_0x1c16;
                case 35: goto L_0x1c2e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r0.A01
            X.Aco r4 = (X.C20996Aco) r4
            java.lang.Object r7 = r0.A02
            com.whatsapp.jid.DeviceJid r7 = (com.whatsapp.jid.DeviceJid) r7
            java.lang.Object r3 = r0.A03
            X.1ca r3 = (X.C29621ca) r3
            java.lang.Object r1 = r0.A04
            X.1ca r1 = (X.C29621ca) r1
            java.lang.Object r2 = r0.A05
            X.1ca r2 = (X.C29621ca) r2
            java.lang.Object r4 = r4.A01
            X.123 r4 = (X.AnonymousClass123) r4
            byte[] r9 = r3.A01
            byte[] r1 = r1.A01
            r0 = 0
            byte r10 = r1[r0]
            if (r2 == 0) goto L_0x0037
            byte[] r8 = r2.A01
        L_0x002a:
            X.00H r0 = r4.A07
            java.lang.Object r0 = r0.get()
            X.1Os r0 = (X.C25571Os) r0
            X.3Ez r5 = r0.A08(r7)
            goto L_0x0039
        L_0x0037:
            r8 = 0
            goto L_0x002a
        L_0x0039:
            int r1 = r7.getDevice()     // Catch:{ all -> 0x00a5 }
            r0 = 0
            if (r1 != 0) goto L_0x0041
            r0 = 1
        L_0x0041:
            r3 = 1
            if (r0 != 0) goto L_0x0063
            X.00H r1 = r4.A02     // Catch:{ all -> 0x00a5 }
            java.lang.Object r6 = r1.get()     // Catch:{ all -> 0x00a5 }
            X.1U5 r6 = (X.AnonymousClass1U5) r6     // Catch:{ all -> 0x00a5 }
            r11 = 5
            boolean r0 = r6.A0E(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "recvmessagelistener/on-get-identity-success/invalid device identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00a5 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x00a5 }
            X.1U5 r0 = (X.AnonymousClass1U5) r0     // Catch:{ all -> 0x00a5 }
            r0.A0B(r7, r3)     // Catch:{ all -> 0x00a5 }
            goto L_0x1bf2
        L_0x0063:
            r0 = 2
            byte[][] r2 = new byte[r0][]     // Catch:{ all -> 0x00a5 }
            byte[] r1 = new byte[r3]     // Catch:{ all -> 0x00a5 }
            r0 = 0
            r1[r0] = r10     // Catch:{ all -> 0x00a5 }
            r2[r0] = r1     // Catch:{ all -> 0x00a5 }
            r2[r3] = r9     // Catch:{ all -> 0x00a5 }
            byte[] r0 = X.A8G.A05(r2)     // Catch:{ all -> 0x00a5 }
            X.1jP r3 = X.C63962tz.A01(r0)     // Catch:{ 1Ak -> 0x009d }
            X.00H r0 = r4.A05     // Catch:{ 1Ak -> 0x009d }
            java.lang.Object r2 = r0.get()     // Catch:{ 1Ak -> 0x009d }
            X.1P3 r2 = (X.AnonymousClass1P3) r2     // Catch:{ 1Ak -> 0x009d }
            X.2nE r1 = X.C63962tz.A02(r7)     // Catch:{ 1Ak -> 0x009d }
            X.2kO r0 = new X.2kO     // Catch:{ 1Ak -> 0x009d }
            r0.<init>(r3)     // Catch:{ 1Ak -> 0x009d }
            r2.A0a(r0, r1)     // Catch:{ 1Ak -> 0x009d }
            X.00H r0 = r4.A03     // Catch:{ 1Ak -> 0x009d }
            X.1KB r2 = X.C108945cZ.A0a(r0)     // Catch:{ 1Ak -> 0x009d }
            r1 = 24
            X.3Ch r0 = new X.3Ch     // Catch:{ 1Ak -> 0x009d }
            r0.<init>(r4, r7, r1)     // Catch:{ 1Ak -> 0x009d }
            r2.A0J(r0)     // Catch:{ 1Ak -> 0x009d }
            goto L_0x1bf2
        L_0x009d:
            r1 = move-exception
            java.lang.String r0 = "recvmessagelistener/on-get-identity-success/invalidkey/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x1bf2
        L_0x00a5:
            r1 = move-exception
            if (r5 == 0) goto L_0x00b0
            r5.close()     // Catch:{ all -> 0x00ac }
            throw r1
        L_0x00ac:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x00b0:
            throw r1
        L_0x00b1:
            java.lang.Object r4 = r0.A04     // Catch:{ all -> 0x01a0 }
            X.5oM r4 = (X.C113975oM) r4     // Catch:{ all -> 0x01a0 }
            boolean r1 = r4.isCancelled()     // Catch:{ all -> 0x01a0 }
            if (r1 != 0) goto L_0x019b
            java.lang.Object r1 = r0.A05     // Catch:{ all -> 0x01a0 }
            java.util.UUID r1 = (java.util.UUID) r1     // Catch:{ all -> 0x01a0 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x01a0 }
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x01a0 }
            X.AHb r2 = (X.C20345AHb) r2     // Catch:{ all -> 0x01a0 }
            X.BD8 r1 = r2.A01     // Catch:{ all -> 0x01a0 }
            X.A2t r6 = r1.Bbs(r9)     // Catch:{ all -> 0x01a0 }
            if (r6 == 0) goto L_0x015b
            java.lang.Integer r1 = r6.A0G     // Catch:{ all -> 0x01a0 }
            boolean r1 = X.C196349ut.A01(r1)     // Catch:{ all -> 0x01a0 }
            if (r1 != 0) goto L_0x015b
            X.B4Q r8 = r2.A00     // Catch:{ all -> 0x01a0 }
            java.lang.Object r7 = r0.A03     // Catch:{ all -> 0x01a0 }
            X.9rG r7 = (X.C194159rG) r7     // Catch:{ all -> 0x01a0 }
            X.AHp r8 = (X.C20359AHp) r8     // Catch:{ all -> 0x01a0 }
            java.lang.Object r5 = r8.A09     // Catch:{ all -> 0x01a0 }
            monitor-enter(r5)     // Catch:{ all -> 0x01a0 }
            X.A5Z r10 = X.A5Z.A00()     // Catch:{ all -> 0x0158 }
            java.lang.String r3 = X.C20359AHp.A0B     // Catch:{ all -> 0x0158 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "Moving WorkSpec ("
            r2.append(r1)     // Catch:{ all -> 0x0158 }
            r2.append(r9)     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = ") to the foreground"
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r2)     // Catch:{ all -> 0x0158 }
            r10.A05(r3, r1)     // Catch:{ all -> 0x0158 }
            java.util.Map r1 = r8.A04     // Catch:{ all -> 0x0158 }
            java.lang.Object r3 = r1.remove(r9)     // Catch:{ all -> 0x0158 }
            X.Aka r3 = (X.C21469Aka) r3     // Catch:{ all -> 0x0158 }
            if (r3 == 0) goto L_0x0156
            android.os.PowerManager$WakeLock r1 = r8.A01     // Catch:{ all -> 0x0158 }
            if (r1 != 0) goto L_0x0118
            android.content.Context r2 = r8.A00     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "ProcessorForegroundLck"
            android.os.PowerManager$WakeLock r1 = X.C197059w5.A00(r2, r1)     // Catch:{ all -> 0x0158 }
            r8.A01 = r1     // Catch:{ all -> 0x0158 }
            r1.acquire()     // Catch:{ all -> 0x0158 }
        L_0x0118:
            java.util.Map r1 = r8.A05     // Catch:{ all -> 0x0158 }
            r1.put(r9, r3)     // Catch:{ all -> 0x0158 }
            android.content.Context r8 = r8.A00     // Catch:{ all -> 0x0158 }
            X.A2t r1 = r3.A08     // Catch:{ all -> 0x0158 }
            X.9pp r9 = X.AnonymousClass9OL.A00(r1)     // Catch:{ all -> 0x0158 }
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r1 = androidx.work.impl.foreground.SystemForegroundService.class
            android.content.Intent r3 = X.AnonymousClass8BR.A07(r8, r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "ACTION_START_FOREGROUND"
            r3.setAction(r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "KEY_WORKSPEC_ID"
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x0158 }
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "KEY_GENERATION"
            int r1 = r9.A00     // Catch:{ all -> 0x0158 }
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "KEY_NOTIFICATION_ID"
            int r1 = r7.A01     // Catch:{ all -> 0x0158 }
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "KEY_FOREGROUND_SERVICE_TYPE"
            int r1 = r7.A00     // Catch:{ all -> 0x0158 }
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "KEY_NOTIFICATION"
            android.app.Notification r1 = r7.A02     // Catch:{ all -> 0x0158 }
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x0158 }
            X.C19740yt.A09(r8, r3)     // Catch:{ all -> 0x0158 }
        L_0x0156:
            monitor-exit(r5)     // Catch:{ all -> 0x0158 }
            goto L_0x0162
        L_0x0158:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0158 }
            goto L_0x0161
        L_0x015b:
            java.lang.String r1 = "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r1)     // Catch:{ all -> 0x01a0 }
        L_0x0161:
            throw r1     // Catch:{ all -> 0x01a0 }
        L_0x0162:
            java.lang.Object r5 = r0.A02     // Catch:{ all -> 0x01a0 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ all -> 0x01a0 }
            X.9pp r6 = X.AnonymousClass9OL.A00(r6)     // Catch:{ all -> 0x01a0 }
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r1 = androidx.work.impl.foreground.SystemForegroundService.class
            android.content.Intent r3 = X.AnonymousClass8BR.A07(r5, r1)     // Catch:{ all -> 0x01a0 }
            java.lang.String r1 = "ACTION_NOTIFY"
            r3.setAction(r1)     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = "KEY_NOTIFICATION_ID"
            int r1 = r7.A01     // Catch:{ all -> 0x01a0 }
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = "KEY_FOREGROUND_SERVICE_TYPE"
            int r1 = r7.A00     // Catch:{ all -> 0x01a0 }
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = "KEY_NOTIFICATION"
            android.app.Notification r1 = r7.A02     // Catch:{ all -> 0x01a0 }
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = "KEY_WORKSPEC_ID"
            java.lang.String r1 = r6.A01     // Catch:{ all -> 0x01a0 }
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = "KEY_GENERATION"
            int r1 = r6.A00     // Catch:{ all -> 0x01a0 }
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x01a0 }
            r5.startService(r3)     // Catch:{ all -> 0x01a0 }
        L_0x019b:
            r1 = 0
            r4.A05(r1)     // Catch:{ all -> 0x01a0 }
            return
        L_0x01a0:
            r1 = move-exception
            java.lang.Object r0 = r0.A04
            X.DMs r0 = (X.DMs) r0
            r0.A06(r1)
            return
        L_0x01a9:
            java.lang.Object r3 = r0.A05
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A02
            X.Cpf r2 = (X.C25972Cpf) r2
            java.lang.Object r1 = r0.A03
            X.CqH r1 = (X.C26000CqH) r1
            X.C22672BJn.A02(r3, r1, r2)
            java.lang.Object r0 = r0.A04
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.start()
            return
        L_0x01c0:
            java.lang.Object r3 = r0.A05
            android.view.View r3 = (android.view.View) r3
            r2 = 2131434499(0x7f0b1c03, float:1.8490814E38)
            r1 = 0
            r3.setTag(r2, r1)
            java.lang.Object r5 = r0.A01
            X.DFL r5 = (X.DFL) r5
            java.lang.Object r2 = r0.A03
            X.DFL r2 = (X.DFL) r2
            r1 = 35
            X.E8A r4 = r2.A0A(r1)
            X.A4p r3 = X.C108985cd.A0J(r5)
            r2 = 1
            java.lang.Object r1 = r0.A02
            X.DOZ r1 = (X.DOZ) r1
            r3.A03(r1, r2)
            X.C20046A4p.A01(r1, r5, r3, r4)
            java.lang.Object r0 = r0.A04
            goto L_0x0240
        L_0x01eb:
            java.lang.Object r2 = r0.A03
            X.9Zb r2 = (X.C183649Zb) r2
            r1 = 0
            r2.A00 = r1
            boolean r1 = r2.A01
            r6 = 0
            r5 = 1
            if (r1 != 0) goto L_0x021c
            r2.A01 = r5
            java.lang.Object r2 = r0.A04
            X.DFL r2 = (X.DFL) r2
            r1 = 35
            X.E8A r4 = r2.A0A(r1)
            if (r4 == 0) goto L_0x021c
            java.lang.Object r3 = r0.A01
            X.DFL r3 = (X.DFL) r3
            java.lang.Object r2 = r0.A02
            X.DOZ r2 = (X.DOZ) r2
            X.A4p r1 = new X.A4p
            r1.<init>()
            r1.A03(r3, r6)
            r1.A03(r2, r5)
            X.C20046A4p.A01(r2, r3, r1, r4)
        L_0x021c:
            java.lang.Object r2 = r0.A04
            X.DFL r2 = (X.DFL) r2
            r1 = 36
            X.E8A r4 = r2.A0A(r1)
            if (r4 == 0) goto L_0x023e
            java.lang.Object r3 = r0.A01
            X.DFL r3 = (X.DFL) r3
            java.lang.Object r2 = r0.A02
            X.DOZ r2 = (X.DOZ) r2
            X.A4p r1 = new X.A4p
            r1.<init>()
            r1.A03(r3, r6)
            r1.A03(r2, r5)
            X.C20046A4p.A01(r2, r3, r1, r4)
        L_0x023e:
            java.lang.Object r0 = r0.A05
        L_0x0240:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x1bf7
            r0.run()
            return
        L_0x0248:
            java.lang.Object r2 = r0.A02
            X.BCy r2 = (X.C22563BCy) r2
            java.lang.Object r1 = r0.A01
            X.CtM r1 = (X.C26154CtM) r1
            int r7 = r1.A00
            X.Caq r3 = r1.A01
            java.lang.Object r4 = r0.A03
            X.CJ1 r4 = (X.CJ1) r4
            java.lang.Object r5 = r0.A05
            X.CTB r5 = (X.CTB) r5
            java.lang.Object r6 = r0.A04
            r2.Bwr(r3, r4, r5, r6, r7)
            return
        L_0x0262:
            java.lang.Object r6 = r0.A01
            X.AIg r6 = (X.C20375AIg) r6
            java.lang.Object r4 = r0.A04
            X.AEq r4 = (X.C20282AEq) r4
            java.lang.Object r2 = r0.A02
            X.A4D r2 = (X.A4D) r2
            java.lang.Object r3 = r0.A03
            X.9LV r3 = (X.AnonymousClass9LV) r3
            X.A23 r1 = r6.A06
            r5 = 0
            r1.A03(r4, r3, r2, r5)
            X.8fU r6 = r6.A05
            boolean r4 = X.C18070vi.A17(r2, r3)
            X.0vl r1 = r6.A00
            boolean r1 = X.C72453Mb.A1a(r1)
            if (r1 != 0) goto L_0x02b9
            boolean r1 = r2.A02
            if (r1 != 0) goto L_0x02b9
            java.lang.String r1 = r2.A00
            int r2 = r1.hashCode()
            r1 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r7 = r6.A00(r1, r2)
            X.9Is r1 = r3.mType
            int r10 = r1.ordinal()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r1 = r3.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object[] r2 = X.C108945cZ.A1b(r1, r2, r5, r4)
            java.lang.String r1 = "Effect fetch failed, reason: %s"
            java.lang.String r11 = java.lang.String.format(r1, r2)
            X.C18070vi.A0X(r11)
            java.lang.String r9 = "ar_delivery"
            r6.A03(r7, r9, r10, r11)
        L_0x02b9:
            java.lang.Object r0 = r0.A05
            X.BA6 r0 = (X.BA6) r0
            r0.Btj(r3)
            return
        L_0x02c1:
            java.lang.Object r8 = r0.A04
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x02ce
            boolean r2 = r8.isEmpty()
            r1 = 0
            if (r2 == 0) goto L_0x02cf
        L_0x02ce:
            r1 = 1
        L_0x02cf:
            r3 = 0
            if (r1 == 0) goto L_0x02e8
            java.lang.Object r4 = r0.A05
            X.9lg r4 = (X.C190889lg) r4
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r4.A00(r1)
            java.lang.Object r1 = r0.A03
            X.9mq r1 = (X.C191589mq) r1
            X.9zQ r0 = new X.9zQ
            r0.<init>()
            r1.A00(r0, r3)
            return
        L_0x02e8:
            java.util.Iterator r6 = r8.iterator()
        L_0x02ec:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0336
            java.lang.Object r5 = r6.next()
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r5 = (com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling) r5
            java.lang.Object r1 = r0.A01
            X.9fJ r1 = (X.C187129fJ) r1
            X.9jy r1 = r1.A01
            X.9z7 r2 = X.C198909z7.A00
            X.00H r1 = r1.A01
            java.lang.Object r1 = X.C18070vi.A0E(r1)
            X.0ve r1 = (X.C18030ve) r1
            X.10w r1 = r2.A00(r1)
            java.util.Set r2 = r1.keySet()
            com.facebook.cameracore.ardelivery.model.VersionedCapability r1 = r5.mCapability
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x02ec
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1b()
            com.facebook.cameracore.ardelivery.model.VersionedCapability r1 = r5.mCapability
            java.lang.String r2 = r1.toServerValue()
            r1 = 0
            r4[r1] = r2
            java.lang.Object r1 = r0.A02
            X.A4D r1 = (X.A4D) r1
            java.lang.String r2 = r1.A01
            r1 = 1
            r4[r1] = r2
            java.lang.String r2 = "DefaultARModelManager"
            java.lang.String r1 = "tries to fetch unsupported capability: %s. operation id: %s"
            X.C26294Cx6.A0H(r2, r1, r4)
            goto L_0x02ec
        L_0x0336:
            java.lang.Object r6 = r0.A01
            X.9fJ r6 = (X.C187129fJ) r6
            java.util.HashSet r7 = X.C17880vN.A12()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r8.iterator()
        L_0x0346:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0384
            java.lang.Object r2 = r8.next()
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r2 = (com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling) r2
            if (r2 == 0) goto L_0x0346
            com.facebook.cameracore.ardelivery.model.VersionedCapability r10 = r2.mCapability
            boolean r1 = r7.contains(r10)
            r13 = 0
            if (r1 == 0) goto L_0x036f
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1a()
            java.lang.String r1 = r10.toServerValue()
            r4[r13] = r1
            java.lang.String r2 = "DefaultARModelManager"
            java.lang.String r1 = "should not request duplicated capability : %s"
            X.C26294Cx6.A0H(r2, r1, r4)
            goto L_0x0346
        L_0x036f:
            r7.add(r10)
            int r11 = r2.mMinVersion
            X.9jy r1 = r6.A01
            int r12 = r1.A00(r10)
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r9 = new com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest
            r14 = r13
            r9.<init>(r10, r11, r12, r13, r14)
            r5.add(r9)
            goto L_0x0346
        L_0x0384:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0398
            java.lang.Object r1 = r0.A03
            X.9mq r1 = (X.C191589mq) r1
            java.lang.String r0 = "no valid request for capabilityMinVersionList"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            r1.A00(r3, r0)
            return
        L_0x0398:
            X.A4c r4 = r6.A00
            java.lang.Object r3 = r0.A02
            X.A4D r3 = (X.A4D) r3
            java.lang.Object r2 = r0.A05
            X.9lg r2 = (X.C190889lg) r2
            X.AIV r1 = new X.AIV
            r1.<init>(r0, r5)
            r4.A02(r2, r1, r3, r5)
            return
        L_0x03ab:
            java.lang.Object r6 = r0.A02
            X.BPy r6 = (X.C22810BPy) r6
            java.lang.Object r11 = r0.A03
            X.CSm r11 = (X.C24986CSm) r11
            java.lang.Object r7 = r0.A01
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            int r10 = r6.A00
            java.lang.Object r5 = r0.A05
            X.CMu r5 = (X.C24851CMu) r5
            r9 = 0
            java.lang.Object r4 = r0.A04
            X.E7R r4 = (X.E7R) r4
            X.EDI r8 = r6.A06
            boolean r0 = r8.Bfg()
            if (r0 != 0) goto L_0x0437
            X.EDA r0 = r6.A01
            X.C18070vi.A0b(r0)
            X.BPw r0 = (X.C22808BPw) r0
            int r0 = r0.A00
            r3 = 0
            r2 = 1
            if (r0 != r2) goto L_0x03e4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r0 = r11.A01
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x03e5
        L_0x03e4:
            r0 = 0
        L_0x03e5:
            if (r10 != 0) goto L_0x03fd
            if (r0 != 0) goto L_0x0401
            boolean r0 = r8.Bfg()
            if (r0 != 0) goto L_0x03f6
            X.C22810BPy.A00(r6)
            X.C26379Cyf.A01(r7, r4, r5)
            return
        L_0x03f6:
            java.lang.String r0 = "Method handlePreviewPhotoTaken must be invoked on a background thread"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x03fd:
            android.graphics.Bitmap r7 = X.C9Q.A00(r7, r9, r10, r3)
        L_0x0401:
            if (r7 == 0) goto L_0x042a
            if (r0 == 0) goto L_0x0421
            android.graphics.Bitmap r1 = X.C9Q.A00(r7, r9, r3, r2)
            if (r1 == 0) goto L_0x0421
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L_0x0421
            r7.recycle()
        L_0x0414:
            boolean r0 = r8.Bfg()
            if (r0 != 0) goto L_0x0423
            X.C22810BPy.A00(r6)
            X.C26379Cyf.A01(r1, r4, r5)
            return
        L_0x0421:
            r1 = r7
            goto L_0x0414
        L_0x0423:
            java.lang.String r0 = "Method handlePreviewPhotoTaken must be invoked on a background thread"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x042a:
            X.C22810BPy.A00(r6)
            java.lang.String r0 = "Failed to process photo."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            X.C26379Cyf.A03(r4, r0)
            return
        L_0x0437:
            java.lang.String r0 = "Method handlePreviewPhotoTaken must be invoked on a background thread"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x043e:
            java.lang.Object r5 = r0.A01
            X.1iW r5 = (X.C33251iW) r5
            java.lang.Object r1 = r0.A02
            X.206 r1 = (X.AnonymousClass206) r1
            java.lang.Object r6 = r0.A03
            X.1kd r6 = (X.C34531kd) r6
            java.lang.Object r10 = r0.A04
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r3 = r0.A05
            X.1RU r0 = r5.A0u
            java.util.List r0 = r0.BOf(r1)
            int r11 = r0.size()
            java.util.Iterator r4 = r0.iterator()
        L_0x045e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1bf7
            java.lang.Object r2 = r4.next()
            X.1D6 r2 = (X.AnonymousClass1D6) r2
            X.00H r0 = r5.A1M
            java.lang.Object r1 = r0.get()
            X.1hx r1 = (X.C32911hx) r1
            java.lang.Object r0 = r2.first
            X.206 r0 = (X.AnonymousClass206) r0
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x045e
            java.lang.Object r7 = r2.first
            X.206 r7 = (X.AnonymousClass206) r7
            r12 = 0
            r8 = 0
            r9 = r8
            X.2bF r0 = r5.A0G(r6, r7, r8, r9, r10, r11, r12)
            X.Ael r1 = new X.Ael
            r1.<init>(r2, r3, r5, r12)
            X.Af0 r0 = r0.A00
            r0.A09(r1)
            goto L_0x045e
        L_0x0492:
            java.lang.Object r4 = r0.A01
            com.whatsapp.TextEmojiLabel r4 = (com.whatsapp.TextEmojiLabel) r4
            java.lang.Object r6 = r0.A02
            X.2mz r6 = (X.C59852mz) r6
            java.lang.Object r3 = r0.A03
            com.whatsapp.TextEmojiLabel r3 = (com.whatsapp.TextEmojiLabel) r3
            java.lang.Object r5 = r0.A04
            X.1bI r5 = (X.C28931bI) r5
            java.lang.Object r7 = r0.A05
            r8 = 0
            r10 = 1
            int r0 = r4.getLineCount()
            if (r0 <= r10) goto L_0x0511
            X.11S r0 = r6.A00
            java.lang.String r9 = r0.A0D()
            X.C18070vi.A0X(r9)
            android.text.Layout r0 = r4.getLayout()
            int r1 = r0.getLineStart(r8)
            android.text.Layout r0 = r4.getLayout()
            int r0 = r0.getLineEnd(r8)
            java.lang.String r2 = X.C108955ca.A0q(r1, r0, r9)
            android.text.Layout r0 = r4.getLayout()
            int r0 = r0.getLineStart(r10)
            java.lang.String r1 = X.C108955ca.A0z(r9, r0)
            r0 = 0
            r4.A0S(r2, r0, r8, r8)
            r4 = 8
            r3.A0S(r1, r0, r8, r8)
            r3.setVisibility(r8)
            r1 = 10
            X.AkM r0 = new X.AkM
            r0.<init>(r3, r6, r7, r1)
            r3.post(r0)
            r3 = 2131432353(0x7f0b13a1, float:1.8486461E38)
        L_0x04ee:
            android.view.ViewGroup$LayoutParams r2 = r5.A03()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            X.C18070vi.A0z(r2, r0)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            X.0vb r0 = r6.A04
            boolean r1 = X.AnonymousClass3MW.A1Z(r0)
            r0 = 7
            if (r1 == 0) goto L_0x0503
            r0 = 5
        L_0x0503:
            r2.addRule(r0, r3)
            r0 = 6
            r2.addRule(r0, r3)
            r2.addRule(r4, r3)
            r5.A06(r2)
            return
        L_0x0511:
            r4 = 8
            r3.setVisibility(r4)
            r3 = 2131432351(0x7f0b139f, float:1.8486457E38)
            goto L_0x04ee
        L_0x051a:
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r0.A02
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.A03
            X.1DS r5 = (X.AnonymousClass1DS) r5
            java.lang.Object r4 = r0.A04
            X.4Ys r4 = (X.C88204Ys) r4
            java.lang.Object r8 = r0.A05
            java.util.List r8 = (java.util.List) r8
            r3 = 0
            X.C18070vi.A0d(r1, r3)
            X.C18070vi.A0j(r6, r5)
            java.util.Iterator r10 = r1.iterator()
            r9 = 0
        L_0x053a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0577
            java.lang.Object r7 = r10.next()
            int r2 = r9 + 1
            if (r9 >= 0) goto L_0x054d
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x054d:
            X.72S r7 = (X.AnonymousClass72S) r7
            X.1ka r0 = r4.A05
            int r0 = r0.A01(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A0O(r0)
            X.1Sl r1 = r4.A09     // Catch:{ IOException -> 0x056f }
            android.net.Uri r0 = r7.A0X     // Catch:{ IOException -> 0x056f }
            java.io.File r0 = r1.A0j(r0, r3)     // Catch:{ IOException -> 0x056f }
            r7.A0N(r0)     // Catch:{ IOException -> 0x056f }
            java.lang.Object r0 = r8.get(r9)     // Catch:{ IOException -> 0x056f }
            r6.add(r0)     // Catch:{ IOException -> 0x056f }
            goto L_0x0575
        L_0x056f:
            r1 = move-exception
            java.lang.String r0 = "BotMediaPickerController/LoadMediaParams/Failed to load media file for uri"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0575:
            r9 = r2
            goto L_0x053a
        L_0x0577:
            boolean r0 = X.AnonymousClass000.A1a(r6)
            if (r0 == 0) goto L_0x0581
            r5.A0E(r6)
            return
        L_0x0581:
            X.1KB r1 = r4.A02
            r0 = 2131896087(0x7f122717, float:1.9427025E38)
            r1.A09(r0, r3)
            return
        L_0x058a:
            java.lang.Object r5 = r0.A01
            X.118 r5 = (X.AnonymousClass118) r5
            java.lang.Object r1 = r0.A02
            X.0vb r1 = (X.C18000vb) r1
            java.lang.Object r3 = r0.A03
            android.location.Location r3 = (android.location.Location) r3
            java.lang.Object r2 = r0.A04
            X.1KB r2 = (X.AnonymousClass1KB) r2
            java.lang.Object r4 = r0.A05
            android.content.Context r6 = r5.A00
            java.util.Locale r0 = r1.A0N()
            android.location.Geocoder r7 = new android.location.Geocoder
            r7.<init>(r6, r0)
            r5 = 0
            double r8 = r3.getLatitude()     // Catch:{ Exception -> 0x05b8 }
            double r10 = r3.getLongitude()     // Catch:{ Exception -> 0x05b8 }
            r12 = 1
            java.util.List r1 = r7.getFromLocation(r8, r10, r12)     // Catch:{ Exception -> 0x05b8 }
            if (r1 == 0) goto L_0x05d3
            goto L_0x05bf
        L_0x05b8:
            r1 = move-exception
            java.lang.String r0 = "LocationUpdateListener/geocodeAddress Exception while trying to fetch address"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x05d3
        L_0x05bf:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x05d3
            java.lang.Object r1 = X.C108955ca.A0p(r1)
            android.location.Address r1 = (android.location.Address) r1
            float r0 = r3.getAccuracy()
            java.lang.String r5 = X.C196589vJ.A00(r6, r1, r0)
        L_0x05d3:
            r0 = 46
            X.C21459AkQ.A00(r2, r4, r3, r5, r0)
            return
        L_0x05d9:
            java.lang.Object r2 = r0.A01
            X.1yO r2 = (X.C42571yO) r2
            java.lang.Object r3 = r0.A02
            X.9Bw r3 = (X.C178119Bw) r3
            java.lang.Object r8 = r0.A03
            X.1BI r8 = (X.AnonymousClass1BI) r8
            java.lang.Object r1 = r0.A04
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r9 = r0.A05
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            X.0vl r0 = X.C42571yO.A0I
            r6 = 0
            X.C18070vi.A0k(r8, r1)
            X.0ve r5 = r2.A07
            X.0vf r4 = X.C18040vf.A01
            r0 = 7515(0x1d5b, float:1.0531E-41)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)
            if (r0 == 0) goto L_0x07c8
            X.4cT r7 = r3.A04
            java.lang.String r0 = r7.A02
            java.lang.String r5 = X.C40811vJ.A09(r0)
            X.C18070vi.A0X(r5)
            if (r9 == 0) goto L_0x065b
            boolean r4 = r9.booleanValue()
        L_0x0610:
            boolean r0 = r3.A0M()
            if (r0 == 0) goto L_0x0626
            if (r4 != 0) goto L_0x0626
            X.1VE r0 = r2.A01
            com.whatsapp.jid.UserJid r8 = r0.A02(r5)
            if (r8 != 0) goto L_0x0626
            com.whatsapp.jid.DeviceJid r0 = r3.A02
            if (r0 == 0) goto L_0x0659
            com.whatsapp.jid.UserJid r8 = r0.userJid
        L_0x0626:
            X.1NG r0 = r2.A06
            X.1BI r0 = r0.A01(r8)
            X.205 r9 = X.AnonymousClass205.A01(r0, r5, r4)
            int r1 = r1.intValue()
            r5 = 1
            if (r1 == r6) goto L_0x088b
            r0 = 2
            if (r1 == r0) goto L_0x065e
            if (r1 != r5) goto L_0x1bf7
            X.00H r0 = r2.A0A
            X.206 r5 = X.AnonymousClass1W2.A01(r9, r0)
            if (r5 != 0) goto L_0x0652
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No existing message found for message key: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r9, r0, r1)
        L_0x064e:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0652:
            boolean r0 = r5 instanceof X.C445623x
            if (r0 == 0) goto L_0x0833
            java.lang.String r0 = "Unexpected FMessageTemporaryPlaceholder message"
            goto L_0x064e
        L_0x0659:
            r8 = 0
            goto L_0x0626
        L_0x065b:
            boolean r4 = r7.A03
            goto L_0x0610
        L_0x065e:
            X.22M r8 = new X.22M
            r8.<init>((X.AnonymousClass205) r9, (X.C178119Bw) r3)
            X.C42571yO.A02(r8, r2)
            X.00H r0 = r2.A0B
            java.lang.Object r4 = r0.get()
            X.9fd r4 = (X.C187329fd) r4
            X.00H r0 = r4.A02
            X.1W6 r0 = X.C17880vN.A0c(r0)
            X.205 r14 = r8.A0v
            X.206 r13 = X.C108945cZ.A0s(r14, r0)
            if (r13 == 0) goto L_0x06f2
            long r0 = r13.A0x     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r11 = -1
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x06f2
            boolean r0 = r13 instanceof X.C445623x     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            if (r0 == 0) goto L_0x06e0
            X.121 r0 = r4.A00     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r0.BBY(r8)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.C18070vi.A0W(r14)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            java.lang.String r8 = r14.A01     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.00H r0 = r4.A04     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            java.lang.Object r2 = r0.get()     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.ARP r2 = (X.ARP) r2     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.1Cd r0 = r2.A01     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.1au r7 = r0.A05()     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.1BI r1 = r14.A00     // Catch:{ all -> 0x06d8 }
            if (r1 != 0) goto L_0x06aa
            java.lang.String r0 = "MessageOrphanStore/deleteOrphanMessageForParentKey/chatJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06d8 }
            goto L_0x06d4
        L_0x06aa:
            X.1LW r0 = r2.A00     // Catch:{ all -> 0x06d8 }
            long r2 = r0.A09(r1)     // Catch:{ all -> 0x06d8 }
            boolean r0 = r14.A02     // Catch:{ all -> 0x06d8 }
            if (r0 == 0) goto L_0x06d1
            java.lang.String r1 = "1"
        L_0x06b6:
            java.lang.String[] r4 = X.AnonymousClass8BR.A1b()     // Catch:{ all -> 0x06d8 }
            r4[r6] = r8     // Catch:{ all -> 0x06d8 }
            X.C17880vN.A1V(r4, r5, r2)     // Catch:{ all -> 0x06d8 }
            r0 = 2
            r4[r0] = r1     // Catch:{ all -> 0x06d8 }
            java.lang.String r3 = "message_orphan.key_id = ? AND message_orphan.chat_row_id = ? AND message_orphan.from_me = ?"
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x06d8 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x06d8 }
            java.lang.String r1 = "message_orphan"
            java.lang.String r0 = "MessageOrphanStore/deleteOrphanMessageForParentKey"
            r2.A04(r1, r3, r0, r4)     // Catch:{ all -> 0x06d8 }
            goto L_0x06d4
        L_0x06d1:
            java.lang.String r1 = "0"
            goto L_0x06b6
        L_0x06d4:
            r7.close()     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            return
        L_0x06d8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06da }
        L_0x06da:
            r1 = move-exception
            X.CDX.A00(r7, r0)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            goto L_0x07b2
        L_0x06e0:
            int r1 = r13.A0u     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            int r0 = r8.A0u     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            if (r1 != r0) goto L_0x1bf7
            X.00H r0 = r2.A0A
            X.206 r5 = X.AnonymousClass1W2.A01(r9, r0)
            boolean r0 = r5 instanceof X.AnonymousClass22M
            if (r0 == 0) goto L_0x1bf7
            goto L_0x083c
        L_0x06f2:
            r3 = 0
            X.25F r0 = r8.A00     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            if (r0 == 0) goto L_0x078c
            X.229 r1 = r0.A02     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.AiT r1 = (X.C21340AiT) r1     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            if (r1 == 0) goto L_0x078c
            X.8av r0 = X.C165308av.DEFAULT_INSTANCE     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.Bmt r7 = r0.A0N()     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.8UU r7 = (X.AnonymousClass8UU) r7     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.Bm6 r0 = r7.A00     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.8av r0 = (X.C165308av) r0     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.8Xq r0 = r0.callLogMessageInfo_     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            if (r0 != 0) goto L_0x070f
            X.8Xq r0 = X.C164128Xq.DEFAULT_INSTANCE     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
        L_0x070f:
            X.Bmt r10 = r0.A0O()     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.8UT r10 = (X.AnonymousClass8UT) r10     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            long r1 = r1.A00     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.Bm6 r9 = X.C17880vN.A0G(r10)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.8Xq r9 = (X.C164128Xq) r9     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            int r0 = X.C164128Xq.CALL_LOG_ROW_ID_FIELD_NUMBER     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            int r0 = r9.bitField0_     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r0 = r0 | 1
            r9.bitField0_ = r0     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r9.callLogRowId_ = r1     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.Bm6 r0 = r10.A0C()     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.8Xq r0 = (X.C164128Xq) r0     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.Bm6 r1 = X.C17880vN.A0G(r7)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.8av r1 = (X.C165308av) r1     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r0.getClass()     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r1.callLogMessageInfo_ = r0     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            int r0 = r1.bitField0_     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r0 = r0 | 4
            r1.bitField0_ = r0     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            byte[] r0 = X.AnonymousClass8BT.A1Z(r7)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.1D6 r0 = X.AnonymousClass1D6.A01(r3, r0)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            java.lang.Object r1 = r0.first     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r7 = r1
            byte[] r7 = (byte[]) r7     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            java.lang.Object r0 = r0.second     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r2 = r0
            byte[] r2 = (byte[]) r2     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            if (r1 != 0) goto L_0x0755
            if (r0 != 0) goto L_0x0755
            goto L_0x07a4
        L_0x0755:
            X.C18070vi.A0W(r14)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.1BI r12 = r8.A0H()     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            long r0 = r8.A0I     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r19 = 6
            X.9tq r11 = new X.9tq     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r13 = r12
            r15 = r14
            r17 = r7
            r18 = r2
            r20 = r5
            r21 = r0
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.00H r0 = r4.A04     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.ARP r0 = (X.ARP) r0     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            int r1 = r0.A01(r11)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r0 = 4
            if (r1 == r0) goto L_0x1bf7
            java.lang.String r0 = "MessageOrderPreserver/handleOrphanMessage/orphan storage failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            java.lang.String r0 = "MessageOrderPreserver/Failed to store orphan"
            java.io.IOException r1 = X.C17880vN.A0f(r0)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            goto L_0x07b2
        L_0x078c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            java.lang.String r0 = "CallingMessageUtil/callLog is null for fMessage key: "
            r1.append(r0)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            java.lang.String r0 = r14.A01     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.C17890vO.A19(r1, r0)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.1T8 r1 = new X.1T8     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r1.<init>(r0, r3)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            goto L_0x07b2
        L_0x07a4:
            java.lang.String r0 = "MessageOrderPreserver/no data found to store"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            X.1T8 r1 = new X.1T8     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
            r1.<init>(r0, r3)     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
        L_0x07b2:
            throw r1     // Catch:{ 1T8 -> 0x07b3, Exception -> 0x1bf7 }
        L_0x07b3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageOrderPreserver/updateMessage/Invalid fmessage.key: "
            r1.append(r0)
            java.lang.String r0 = r14.A01
            r1.append(r0)
            java.lang.String r0 = ", exception: "
            X.C17900vP.A0X(r2, r0, r1)
            return
        L_0x07c8:
            X.4cT r4 = r3.A04
            java.lang.String r0 = r4.A02
            java.lang.String r5 = X.C40811vJ.A09(r0)
            X.C18070vi.A0X(r5)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0872
            com.whatsapp.jid.GroupJid r0 = r3.A0C
            if (r0 == 0) goto L_0x081b
            com.whatsapp.jid.GroupJid r4 = r3.A0C
        L_0x07dd:
            X.1BI r4 = (X.AnonymousClass1BI) r4
            if (r4 == 0) goto L_0x1bf7
            X.1NG r0 = r2.A06
            X.1BI r4 = r0.A01(r4)
            X.00H r0 = r2.A0A
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1W6 r1 = (X.AnonymousClass1W6) r1
            X.205 r0 = X.AnonymousClass205.A01(r4, r5, r6)
            X.C18070vi.A0d(r1, r6)
            X.206 r5 = X.C108945cZ.A0s(r0, r1)
            boolean r0 = r5 instanceof X.AnonymousClass22M
            if (r0 == 0) goto L_0x1bf7
            if (r5 == 0) goto L_0x1bf7
            X.00H r0 = r2.A09
            java.lang.Object r1 = r0.get()
            X.2jC r1 = (X.C57512jC) r1
            X.205 r0 = r5.A0v
            X.C18070vi.A0W(r0)
            X.206 r4 = r1.A00(r5, r0)
            X.22M r4 = (X.AnonymousClass22M) r4
            if (r4 == 0) goto L_0x1bf7
            X.25F r0 = r4.A00
            r0.A02(r3)
            goto L_0x0861
        L_0x081b:
            r1 = 0
            boolean r0 = r3.A0M()
            if (r0 == 0) goto L_0x1bf7
            X.1VE r0 = r2.A01
            com.whatsapp.jid.UserJid r4 = r0.A02(r5)
            if (r4 != 0) goto L_0x07dd
            com.whatsapp.jid.DeviceJid r0 = r3.A02
            if (r0 == 0) goto L_0x0831
            com.whatsapp.jid.UserJid r4 = r0.userJid
            goto L_0x07dd
        L_0x0831:
            r4 = r1
            goto L_0x07dd
        L_0x0833:
            boolean r0 = r5 instanceof X.AnonymousClass22M
            if (r0 == 0) goto L_0x1bf7
            X.22M r5 = (X.AnonymousClass22M) r5
            X.C42571yO.A02(r5, r2)
        L_0x083c:
            X.00H r0 = r2.A09
            java.lang.Object r1 = r0.get()
            X.2jC r1 = (X.C57512jC) r1
            X.205 r0 = r5.A0v
            X.C18070vi.A0W(r0)
            X.206 r4 = r1.A00(r5, r0)
            X.22M r4 = (X.AnonymousClass22M) r4
            X.25F r0 = r4.A00
            r0.A02(r3)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x086f
            com.whatsapp.jid.DeviceJid r0 = r3.A02
            if (r0 == 0) goto L_0x0861
            com.whatsapp.jid.UserJid r0 = r0.userJid
        L_0x085e:
            r4.A0d(r0)
        L_0x0861:
            long r0 = r5.A0x
            r4.A0x = r0
            long r0 = r5.A0y
            r4.A0y = r0
            X.121 r0 = r2.A04
            r0.CQw(r4)
            return
        L_0x086f:
            com.whatsapp.jid.UserJid r0 = r7.A01
            goto L_0x085e
        L_0x0872:
            X.1NG r0 = r2.A06
            X.1BI r1 = r0.A01(r8)
            if (r9 == 0) goto L_0x0888
            boolean r0 = r9.booleanValue()
        L_0x087e:
            X.205 r0 = X.AnonymousClass205.A01(r1, r5, r0)
            X.22M r1 = new X.22M
            r1.<init>((X.AnonymousClass205) r0, (X.C178119Bw) r3)
            goto L_0x0893
        L_0x0888:
            boolean r0 = r4.A03
            goto L_0x087e
        L_0x088b:
            X.22M r1 = new X.22M
            r1.<init>((X.AnonymousClass205) r9, (X.C178119Bw) r3)
            X.C42571yO.A02(r1, r2)
        L_0x0893:
            X.121 r0 = r2.A04
            r0.BBM(r1)
            return
        L_0x0899:
            java.lang.Object r10 = r0.A01
            X.A8A r10 = (X.A8A) r10
            java.lang.Object r9 = r0.A02
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r8 = r0.A03
            com.whatsapp.fieldstats.events.WamCall r8 = (com.whatsapp.fieldstats.events.WamCall) r8
            java.lang.Object r7 = r0.A04
            X.8qq r7 = (X.C170898qq) r7
            java.lang.Object r11 = r0.A05
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x0bea
            boolean r0 = r9.isDirectory()
            if (r0 == 0) goto L_0x0bea
            java.lang.String r4 = "call_result"
            if (r8 != 0) goto L_0x08dd
            java.lang.String r0 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs received null fieldStat, skipping injection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x08c2:
            X.118 r0 = r10.A02
            android.content.Context r0 = r0.A00
            java.io.File r2 = X.C40811vJ.A06(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r9.getName()
            r1.append(r0)
            java.lang.String r0 = ".zip"
            java.io.File r6 = X.AnonymousClass8BW.A0X(r2, r0, r1)
            goto L_0x0b03
        L_0x08dd:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x0afc
            boolean r0 = r9.isDirectory()
            if (r0 == 0) goto L_0x0afc
            java.io.File[] r12 = r9.listFiles()
            if (r12 == 0) goto L_0x08c2
            r1 = 15
            X.Akr r0 = new X.Akr
            r0.<init>(r1)
            java.util.Arrays.sort(r12, r0)
            int r6 = r12.length
            r5 = 0
        L_0x08fb:
            java.lang.String r2 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs could not inject into time series file"
            r1 = 1
            if (r5 >= r6) goto L_0x0923
            r0 = r12[r5]
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x091c }
            r3.<init>(r0, r1)     // Catch:{ IOException -> 0x091c }
            java.lang.String r1 = "user_rating"
            java.lang.Long r0 = r8.userRating     // Catch:{ all -> 0x0912 }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0912 }
            r3.close()     // Catch:{ IOException -> 0x091c }
            goto L_0x0920
        L_0x0912:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0917 }
            goto L_0x091b
        L_0x0917:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x091c }
        L_0x091b:
            throw r1     // Catch:{ IOException -> 0x091c }
        L_0x091c:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
        L_0x0920:
            int r5 = r5 + 1
            goto L_0x08fb
        L_0x0923:
            int r6 = r6 - r1
            r0 = r12[r6]
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0af6 }
            r3.<init>(r0, r1)     // Catch:{ IOException -> 0x0af6 }
            java.lang.String r1 = "call_t"
            java.lang.Long r0 = r8.callT     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.Integer r0 = r8.callResult     // Catch:{ all -> 0x0aec }
            X.A8A.A02(r3, r0, r4)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "freeze_t"
            java.lang.Long r0 = r8.videoRenderFreezeT     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "freeze_8x"
            java.lang.Long r0 = r8.videoRenderFreeze8xT     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "num_freezes"
            java.lang.Long r0 = r8.videoRenderNumFreezes     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "jb_lost"
            java.lang.Double r0 = r8.jbLost     // Catch:{ all -> 0x0aec }
            X.A8A.A01(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "jb_empties"
            java.lang.Double r0 = r8.jbEmpties     // Catch:{ all -> 0x0aec }
            X.A8A.A01(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "jb_gets"
            java.lang.Double r0 = r8.jbGets     // Catch:{ all -> 0x0aec }
            X.A8A.A01(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "rtt"
            java.lang.Long r0 = r8.callAvgRtt     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "jb_delay"
            java.lang.Double r0 = r8.jbAvgDelay     // Catch:{ all -> 0x0aec }
            X.A8A.A01(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "max_participants"
            java.lang.Long r0 = r8.maxConnectedParticipants     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "num_participants"
            java.lang.Long r0 = r8.numConnectedParticipants     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "vid_rx_bps"
            java.lang.Double r0 = r8.videoRxBitrate     // Catch:{ all -> 0x0aec }
            X.A8A.A01(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "freeze_high_bwe_t"
            java.lang.Long r0 = r8.renderFreezeHighPeerBweT     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "high_bwe_t"
            java.lang.Long r0 = r8.highPeerBweT     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "freeze_mid_bwe_t"
            java.lang.Long r0 = r8.renderFreezeLowToHighPeerBweT     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "mid_bwe_t"
            java.lang.Long r0 = r8.lowToHighPeerBweT     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "freeze_low_bwe_t"
            java.lang.Long r0 = r8.renderFreezeLowPeerBweT     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "low_bwe_t"
            java.lang.Long r0 = r8.lowPeerBweT     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "jb_lostempty_pct_low_bwe"
            java.lang.Double r0 = r8.jbLostEmptyLowPeerBwePerSec     // Catch:{ all -> 0x0aec }
            X.A8A.A01(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "jb_lostempty_pct_mid_bwe"
            java.lang.Double r0 = r8.jbLostEmptyLowToHighPeerBwePerSec     // Catch:{ all -> 0x0aec }
            X.A8A.A01(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "jb_lostempty_pct_high_bwe"
            java.lang.Double r0 = r8.jbLostEmptyHighPeerBwePerSec     // Catch:{ all -> 0x0aec }
            X.A8A.A01(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "new_end_call_survey_version"
            java.lang.Long r0 = r8.newEndCallSurveyVersion     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "user_problems"
            java.lang.Long r0 = r8.userProblems     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "user_description"
            java.lang.String r0 = r8.userDescription     // Catch:{ all -> 0x0aec }
            X.A8A.A04(r3, r1, r0)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_end_reconnecting"
            java.lang.Boolean r0 = r8.callEndReconnecting     // Catch:{ all -> 0x0aec }
            X.A8A.A00(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_end_reconnecting_signaling_accessible"
            java.lang.Boolean r0 = r8.callEndReconnectingSignalingAccessible     // Catch:{ all -> 0x0aec }
            X.A8A.A00(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_end_reconnecting_relay_pingable"
            java.lang.Boolean r0 = r8.callEndReconnectingRelayPingable     // Catch:{ all -> 0x0aec }
            X.A8A.A00(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_reconnecting_probe_state"
            java.lang.Long r0 = r8.callReconnectingProbeState     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_initial_rtt"
            java.lang.Long r0 = r8.callInitialRtt     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_average_rtt"
            java.lang.Long r0 = r8.callAvgRtt     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_last_rtt"
            java.lang.Long r0 = r8.callLastRtt     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_relay_bind_status"
            java.lang.Integer r0 = r8.callRelayBindStatus     // Catch:{ all -> 0x0aec }
            X.A8A.A02(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.Integer r0 = r8.callResult     // Catch:{ all -> 0x0aec }
            X.A8A.A02(r3, r0, r4)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_transport_relay_to_relay_fallback_count"
            java.lang.Long r0 = r8.callTransportRelayToRelayFallbackCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_transport_p2p_to_relay_fallback_count"
            java.lang.Long r0 = r8.callTransportP2pToRelayFallbackCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_reconnecting_state_count"
            java.lang.Long r0 = r8.callReconnectingStateCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_setup_t"
            java.lang.Long r0 = r8.callSetupT     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_test_bucket"
            java.lang.String r0 = r8.callTestBucket     // Catch:{ all -> 0x0aec }
            X.A8A.A04(r3, r1, r0)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_end_reconnecting_expected_bitmap"
            java.lang.Long r0 = r8.callEndReconnectingExpectedBitmap     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_relay_error_code"
            java.lang.Long r0 = r8.callRelayErrorCode     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_transport"
            java.lang.Integer r0 = r8.callTransport     // Catch:{ all -> 0x0aec }
            X.A8A.A02(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_side"
            java.lang.Integer r0 = r8.callSide     // Catch:{ all -> 0x0aec }
            X.A8A.A02(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_network"
            java.lang.Integer r0 = r8.callNetwork     // Catch:{ all -> 0x0aec }
            X.A8A.A02(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "peer_call_network"
            java.lang.Integer r0 = r8.peerCallNetwork     // Catch:{ all -> 0x0aec }
            X.A8A.A02(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "xpop_call_peer_relay_ip"
            java.lang.String r0 = r8.xpopCallPeerRelayIp     // Catch:{ all -> 0x0aec }
            X.A8A.A04(r3, r1, r0)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "max_unbound_relay_count"
            java.lang.Long r0 = r8.maxUnboundRelayCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_setup_error_type"
            java.lang.Integer r0 = r8.callSetupErrorType     // Catch:{ all -> 0x0aec }
            X.A8A.A02(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_transition_count"
            java.lang.Long r0 = r8.callTransitionCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_end_reconnecting_e2e_pingable"
            java.lang.Boolean r0 = r8.callEndReconnectingE2ePingable     // Catch:{ all -> 0x0aec }
            X.A8A.A00(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "call_end_reconnecting_e2e_signaling_accessible"
            java.lang.Boolean r0 = r8.callEndReconnectingE2eSignalingAccessible     // Catch:{ all -> 0x0aec }
            X.A8A.A00(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "reconnecting_with_e2e_bind_rsp_count"
            java.lang.Long r0 = r8.reconnectingWithE2eBindRspCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "reconnecting_with_e2e_rsp_count"
            java.lang.Long r0 = r8.reconnectingWithE2eRspCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "reconnecting_with_p2p_e2e_bind_rsp_count"
            java.lang.Long r0 = r8.reconnectingWithP2pE2eBindRspCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "reconnecting_with_probe_rsp_count"
            java.lang.Long r0 = r8.reconnectingWithProbeRspCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "reconnecting_with_relay_e2e_bind_rsp_count"
            java.lang.Long r0 = r8.reconnectingWithRelayE2eBindRspCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "reconnecting_with_relay_pingable_count"
            java.lang.Long r0 = r8.reconnectingWithRelayPingableCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "reconnecting_with_signaling_accessible_count"
            java.lang.Long r0 = r8.reconnectingWithSignalingAccessibleCount     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "time_enc_1280w"
            java.lang.Long r0 = r8.timeEnc1280w     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "time_enc_960w"
            java.lang.Long r0 = r8.timeEnc960w     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "time_enc_640w"
            java.lang.Long r0 = r8.timeEnc640w     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "time_dec_1280w"
            java.lang.Long r0 = r8.timeDec1280w     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "time_dec_960w"
            java.lang.Long r0 = r8.timeDec960w     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            java.lang.String r1 = "time_dec_640w"
            java.lang.Long r0 = r8.timeDec640w     // Catch:{ all -> 0x0aec }
            X.A8A.A03(r3, r0, r1)     // Catch:{ all -> 0x0aec }
            r3.close()     // Catch:{ IOException -> 0x0af6 }
            goto L_0x08c2
        L_0x0aec:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0af1 }
            goto L_0x0af5
        L_0x0af1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0af6 }
        L_0x0af5:
            throw r1     // Catch:{ IOException -> 0x0af6 }
        L_0x0af6:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            goto L_0x08c2
        L_0x0afc:
            java.lang.String r0 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs received bad directory path, skipping injection."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x08c2
        L_0x0b03:
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r6)     // Catch:{ IOException -> 0x0bc7 }
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x0bbd }
            r5.<init>(r3)     // Catch:{ all -> 0x0bbd }
            java.io.File[] r14 = r9.listFiles()     // Catch:{ all -> 0x0bb3 }
            if (r14 == 0) goto L_0x0b44
            int r13 = r14.length     // Catch:{ all -> 0x0bb3 }
            r12 = 0
        L_0x0b14:
            if (r12 >= r13) goto L_0x0b44
            r1 = r14[r12]     // Catch:{ all -> 0x0bb3 }
            java.io.FileInputStream r4 = X.C108945cZ.A18(r1)     // Catch:{ all -> 0x0bb3 }
            X.AnonymousClass8BY.A1E(r1, r4, r5)     // Catch:{ all -> 0x0b3a }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0b3a }
            java.lang.String r0 = "app/VoipTimeSeriesLogger: compressed file "
            X.AnonymousClass8BV.A1J(r1, r0, r2)     // Catch:{ all -> 0x0b3a }
            java.lang.String r0 = " with init size "
            r2.append(r0)     // Catch:{ all -> 0x0b3a }
            long r0 = r1.length()     // Catch:{ all -> 0x0b3a }
            X.C17890vO.A16(r2, r0)     // Catch:{ all -> 0x0b3a }
            r4.close()     // Catch:{ all -> 0x0bb3 }
            int r12 = r12 + 1
            goto L_0x0b14
        L_0x0b3a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0b3f }
            goto L_0x0b43
        L_0x0b3f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0bb3 }
        L_0x0b43:
            throw r1     // Catch:{ all -> 0x0bb3 }
        L_0x0b44:
            r5.close()     // Catch:{ all -> 0x0bbd }
            r3.close()     // Catch:{ IOException -> 0x0bc7 }
            r0 = 0
            long r4 = X.C64062u9.A01(r0, r9)
            long r12 = r6.length()
            long r0 = r4 - r12
            double r2 = (double) r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r0
            double r0 = (double) r4
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r7.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r7.A02 = r0
            long r3 = r6.length()
            int r0 = r10.A00
            long r0 = (long) r0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0b7d
            boolean r0 = X.A8A.A05(r10, r8, r6, r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A00 = r0
            goto L_0x0bd0
        L_0x0b7d:
            r3 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r7.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "app/VoipTimeSeriesLogger: aborting upload because file "
            X.AnonymousClass8BV.A1J(r6, r0, r1)
            java.lang.String r0 = " has size "
            X.AnonymousClass8BV.A1I(r6, r0, r1)
            java.lang.String r0 = " which exceeds the threshold "
            r1.append(r0)
            int r0 = r10.A00
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.190 r2 = r10.A01
            long r0 = r6.length()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "voip-time-series-upload-aborted"
            r2.A0G(r0, r1, r3)
            r6.delete()
            goto L_0x0bd0
        L_0x0bb3:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0bb8 }
            goto L_0x0bbc
        L_0x0bb8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0bbd }
        L_0x0bbc:
            throw r1     // Catch:{ all -> 0x0bbd }
        L_0x0bbd:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0bc2 }
            goto L_0x0bc6
        L_0x0bc2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0bc7 }
        L_0x0bc6:
            throw r1     // Catch:{ IOException -> 0x0bc7 }
        L_0x0bc7:
            r1 = move-exception
            java.lang.String r0 = "app/VoipTimeSeriesLogger: could not create compressed time series file"
            com.whatsapp.util.Log.w(r0, r1)
            r6.delete()
        L_0x0bd0:
            boolean r0 = X.C64062u9.A0R(r9)
            if (r0 != 0) goto L_0x0be4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "app/VoipTimeSeriesLogger: time series data directory "
            X.C17900vP.A0N(r9, r0, r1)
            java.lang.String r0 = " could not be deleted"
            X.C17890vO.A1B(r1, r0)
        L_0x0be4:
            X.18K r0 = r10.A03
            r0.CC7(r7)
            return
        L_0x0bea:
            java.lang.String r0 = "app/VoipTimeSeriesLogger: uploadTimeSeries received bad directory path, skipping upload."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0bf0:
            java.lang.Object r5 = r0.A01
            X.4NO r5 = (X.AnonymousClass4NO) r5
            java.lang.Object r4 = r0.A02
            com.whatsapp.chatinfo.EphemeralMessagesInfoView r4 = (com.whatsapp.chatinfo.EphemeralMessagesInfoView) r4
            java.lang.Object r3 = r0.A03
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Object r2 = r0.A04
            X.1EC r2 = (X.AnonymousClass1EC) r2
            java.lang.Object r1 = r0.A05
            X.3zh r1 = (X.C81723zh) r1
            if (r5 == 0) goto L_0x1bf7
            boolean r0 = r5.A02
            r4.A0A(r3, r1, r2, r0)
            return
        L_0x0c0c:
            java.lang.Object r6 = r0.A01
            X.1TQ r6 = (X.AnonymousClass1TQ) r6
            java.lang.Object r7 = r0.A02
            X.4Zh r7 = (X.C88344Zh) r7
            java.lang.Object r1 = r0.A03
            r17 = r1
            r1 = r17
            X.2SB r1 = (X.AnonymousClass2SB) r1
            r17 = r1
            java.lang.Object r1 = r0.A04
            r24 = r1
            r1 = r24
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            r24 = r1
            java.lang.Object r5 = r0.A05
            java.util.List r5 = (java.util.List) r5
            r23 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "HistorySyncManager/startMessageHistorySync for "
            X.C17900vP.A0Y(r7, r0, r1)
            boolean r0 = r7.A0B
            r19 = r0
            r16 = 2
            if (r0 == 0) goto L_0x0c41
            r16 = 3
        L_0x0c41:
            X.1Rw r2 = r6.A03
            if (r17 == 0) goto L_0x0c4b
            r1 = 2
            r0 = r17
            X.C26371Rw.A06(r0, r2, r1)
        L_0x0c4b:
            X.2qr r13 = r7.A07
            if (r13 == 0) goto L_0x0c61
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x0c61
            X.0ve r2 = r6.A0E
            r1 = 3626(0xe2a, float:5.081E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r51 = 1
            if (r0 != 0) goto L_0x0c63
        L_0x0c61:
            r51 = 0
        L_0x0c63:
            X.1TO r0 = r6.A0G
            java.lang.String r1 = r7.A02
            r32 = r1
            X.C17960vV.A07(r32)
            X.1RK r2 = r0.A0O     // Catch:{ Exception -> 0x12c1 }
            int r1 = r24.getDevice()     // Catch:{ Exception -> 0x12c1 }
            X.4Zh r18 = r2.A05(r1)     // Catch:{ Exception -> 0x12c1 }
            if (r18 != 0) goto L_0x0c7f
            java.lang.String r1 = "history-sync-send-methods send-initial-bootstrap: companion device info is null"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x12c1 }
            goto L_0x12d0
        L_0x0c7f:
            r1 = r18
            com.whatsapp.jid.DeviceJid r1 = r1.A08     // Catch:{ Exception -> 0x12c1 }
            X.C62832s4.A00(r1)     // Catch:{ Exception -> 0x12c1 }
            X.8cQ r1 = X.C166148cQ.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x12c1 }
            X.Bmt r3 = r1.A0N()     // Catch:{ Exception -> 0x12c1 }
            X.8X2 r3 = (X.AnonymousClass8X2) r3     // Catch:{ Exception -> 0x12c1 }
            X.9KV r1 = X.AnonymousClass9KV.INITIAL_BOOTSTRAP     // Catch:{ Exception -> 0x12c1 }
            r3.A0K(r1)     // Catch:{ Exception -> 0x12c1 }
            X.1Mx r2 = r0.A08     // Catch:{ Exception -> 0x12c1 }
            X.1My r1 = r2.A01     // Catch:{ Exception -> 0x12c1 }
            java.util.HashMap r22 = r1.A0I()     // Catch:{ Exception -> 0x12c1 }
            java.util.HashMap r20 = r2.A08()     // Catch:{ Exception -> 0x12c1 }
            java.util.HashSet r1 = X.C17880vN.A12()     // Catch:{ Exception -> 0x12c1 }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ Exception -> 0x12c1 }
        L_0x0ca7:
            boolean r2 = r4.hasNext()     // Catch:{ Exception -> 0x12c1 }
            if (r2 == 0) goto L_0x0cbb
            java.lang.Object r2 = r4.next()     // Catch:{ Exception -> 0x12c1 }
            X.9eZ r2 = (X.C186669eZ) r2     // Catch:{ Exception -> 0x12c1 }
            X.97S r2 = r2.A00     // Catch:{ Exception -> 0x12c1 }
            X.1BI r2 = r2.A06     // Catch:{ Exception -> 0x12c1 }
            r1.add(r2)     // Catch:{ Exception -> 0x12c1 }
            goto L_0x0ca7
        L_0x0cbb:
            java.util.HashMap r21 = X.C17880vN.A11()     // Catch:{ Exception -> 0x12c1 }
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ Exception -> 0x12c1 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ Exception -> 0x12c1 }
        L_0x0cc7:
            boolean r1 = r9.hasNext()     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0cf3
            com.whatsapp.jid.Jid r8 = X.C17880vN.A0S(r9)     // Catch:{ Exception -> 0x12c1 }
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A00(r8)     // Catch:{ Exception -> 0x12c1 }
            if (r2 == 0) goto L_0x0ceb
            X.11S r1 = r0.A02     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = r1.A0O(r2)     // Catch:{ Exception -> 0x12c1 }
            if (r1 != 0) goto L_0x0ceb
            com.whatsapp.jid.DeviceJid r1 = r2.getPrimaryDevice()     // Catch:{ Exception -> 0x12c1 }
            X.2nE r1 = X.C63962tz.A02(r1)     // Catch:{ Exception -> 0x12c1 }
            r4.put(r1, r8)     // Catch:{ Exception -> 0x12c1 }
            goto L_0x0cc7
        L_0x0ceb:
            r2 = r21
            r1 = r23
            r2.put(r8, r1)     // Catch:{ Exception -> 0x12c1 }
            goto L_0x0cc7
        L_0x0cf3:
            X.1P3 r2 = r0.A0A     // Catch:{ Exception -> 0x12c1 }
            java.util.Set r1 = r4.keySet()     // Catch:{ Exception -> 0x12c1 }
            java.util.HashMap r1 = r2.A0L(r1)     // Catch:{ Exception -> 0x12c1 }
            java.util.Iterator r9 = X.C17890vO.A0i(r1)     // Catch:{ Exception -> 0x12c1 }
        L_0x0d01:
            boolean r1 = r9.hasNext()     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0d2b
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r9)     // Catch:{ Exception -> 0x12c1 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ Exception -> 0x12c1 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x12c1 }
            X.2kO r1 = (X.C58252kO) r1     // Catch:{ Exception -> 0x12c1 }
            java.lang.Object r8 = r4.get(r2)     // Catch:{ Exception -> 0x12c1 }
            X.C17960vV.A07(r8)     // Catch:{ Exception -> 0x12c1 }
            if (r1 != 0) goto L_0x0d21
            r2 = r23
            goto L_0x0d25
        L_0x0d21:
            X.1jP r1 = r1.A00     // Catch:{ Exception -> 0x12c1 }
            byte[] r2 = r1.A00     // Catch:{ Exception -> 0x12c1 }
        L_0x0d25:
            r1 = r21
            r1.put(r8, r2)     // Catch:{ Exception -> 0x12c1 }
            goto L_0x0d01
        L_0x0d2b:
            java.util.Iterator r25 = r5.iterator()     // Catch:{ Exception -> 0x12c1 }
            r37 = 0
            r45 = 0
        L_0x0d33:
            boolean r1 = r25.hasNext()     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x11b0
            java.lang.Object r14 = r25.next()     // Catch:{ Exception -> 0x12c1 }
            X.9eZ r14 = (X.C186669eZ) r14     // Catch:{ Exception -> 0x12c1 }
            X.97S r10 = r14.A00     // Catch:{ Exception -> 0x12c1 }
            X.1BI r5 = r10.A06     // Catch:{ Exception -> 0x12c1 }
            int r1 = r10.A00     // Catch:{ Exception -> 0x12c1 }
            if (r1 <= 0) goto L_0x0d4e
            X.0ve r2 = r0.A0S     // Catch:{ Exception -> 0x12c1 }
            r1 = 624(0x270, float:8.74E-43)
            r2.A0N(r1)     // Catch:{ Exception -> 0x12c1 }
        L_0x0d4e:
            X.1T7 r1 = r0.A0W     // Catch:{ Exception -> 0x12c1 }
            r28 = r1
            X.C17960vV.A07(r5)     // Catch:{ Exception -> 0x12c1 }
            r4 = r22
            r2 = r20
            X.2Ay r4 = r1.A01(r5, r4, r2)     // Catch:{ Exception -> 0x12c1 }
            r1 = r21
            java.lang.Object r1 = r1.get(r5)     // Catch:{ Exception -> 0x12c1 }
            byte[] r1 = (byte[]) r1     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0d7c
            X.DSQ r2 = X.DSQ.A00     // Catch:{ Exception -> 0x12c1 }
            X.BmB r8 = X.C17900vP.A03(r4, r1)     // Catch:{ Exception -> 0x12c1 }
            X.Bm6 r2 = r4.A00     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = (X.C166298cf) r2     // Catch:{ Exception -> 0x12c1 }
            int r1 = X.C166298cf.ARCHIVED_FIELD_NUMBER     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r9 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r9
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.contactPrimaryIdentityKey_ = r8     // Catch:{ Exception -> 0x12c1 }
        L_0x0d7c:
            int r8 = r10.A01     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = X.C166298cf.ARCHIVED_FIELD_NUMBER     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 128(0x80, float:1.794E-43)
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.ephemeralExpiration_ = r8     // Catch:{ Exception -> 0x12c1 }
            boolean r8 = r10.A0D     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.archived_ = r8     // Catch:{ Exception -> 0x12c1 }
            X.1CJ r15 = r0.A0D     // Catch:{ Exception -> 0x12c1 }
            X.1ci r27 = r15.A0A(r5)     // Catch:{ Exception -> 0x12c1 }
            if (r27 == 0) goto L_0x0db2
            r1 = r27
            boolean r8 = r1.A0m     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.locked_ = r8     // Catch:{ Exception -> 0x12c1 }
        L_0x0db2:
            long r1 = r10.A02     // Catch:{ Exception -> 0x12c1 }
            int r8 = (r1 > r37 ? 1 : (r1 == r37 ? 0 : -1))
            if (r8 <= 0) goto L_0x0dc4
            X.8cf r9 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r8 = r9.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r8 = r8 | 256(0x100, float:3.59E-43)
            r9.bitField0_ = r8     // Catch:{ Exception -> 0x12c1 }
            r9.ephemeralSettingTimestamp_ = r1     // Catch:{ Exception -> 0x12c1 }
        L_0x0dc4:
            com.whatsapp.jid.UserJid r1 = r10.A07     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0ddb
            java.lang.String r8 = r1.getRawString()     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            r8.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 2
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.newJid_ = r8     // Catch:{ Exception -> 0x12c1 }
        L_0x0ddb:
            com.whatsapp.jid.UserJid r1 = r10.A08     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0df2
            java.lang.String r8 = r1.getRawString()     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            r8.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 4
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.oldJid_ = r8     // Catch:{ Exception -> 0x12c1 }
        L_0x0df2:
            java.lang.String r1 = r10.A0A     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x12c1 }
            if (r1 != 0) goto L_0x0e0d
            java.lang.String r8 = r10.A0A     // Catch:{ Exception -> 0x12c1 }
            X.Bm6 r2 = X.C17880vN.A0G(r4)     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = (X.C166298cf) r2     // Catch:{ Exception -> 0x12c1 }
            r8.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.name_ = r8     // Catch:{ Exception -> 0x12c1 }
        L_0x0e0d:
            X.1nh r1 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ Exception -> 0x12c1 }
            com.whatsapp.jid.GroupJid r9 = X.C36321nh.A00(r5)     // Catch:{ Exception -> 0x12c1 }
            if (r9 == 0) goto L_0x0f27
            X.1M9 r12 = r0.A07     // Catch:{ Exception -> 0x12c1 }
            X.1E7 r8 = r12.A0H(r9)     // Catch:{ Exception -> 0x12c1 }
            boolean r11 = r8.A0t     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r26
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.suspended_ = r11     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = r10.A0E     // Catch:{ Exception -> 0x12c1 }
            if (r1 != 0) goto L_0x0e4e
            java.lang.String r2 = r8.A0O     // Catch:{ Exception -> 0x12c1 }
            java.lang.String r1 = "lid"
            boolean r2 = X.AnonymousClass000.A1Z(r2, r1)
            X.1MZ r1 = r0.A0F     // Catch:{ Exception -> 0x12c1 }
            java.lang.String r10 = r1.A07(r9, r2)     // Catch:{ Exception -> 0x12c1 }
            X.Bm6 r2 = X.C17880vN.A0G(r4)     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = (X.C166298cf) r2     // Catch:{ Exception -> 0x12c1 }
            r10.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.pHash_ = r10     // Catch:{ Exception -> 0x12c1 }
        L_0x0e4e:
            boolean r10 = r15.A0R(r9)     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 4
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.isDefaultSubgroup_ = r10     // Catch:{ Exception -> 0x12c1 }
            X.1MZ r1 = r0.A0F     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = r1.A0J(r9)     // Catch:{ Exception -> 0x12c1 }
            if (r1 != 0) goto L_0x0f27
            X.1yX r1 = r8.A0M     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0e84
            java.lang.String r2 = r1.A03     // Catch:{ Exception -> 0x12c1 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x12c1 }
            if (r2 != 0) goto L_0x0e84
            java.lang.String r10 = r1.A03     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            r10.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r11 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r11
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.description_ = r10     // Catch:{ Exception -> 0x12c1 }
        L_0x0e84:
            com.whatsapp.jid.UserJid r1 = r12.A0K(r9)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0e9e
            java.lang.String r10 = r1.getRawString()     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            r10.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 | r11
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.createdBy_ = r10     // Catch:{ Exception -> 0x12c1 }
        L_0x0e9e:
            java.lang.String r1 = r8.A0X     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x12c1 }
            if (r1 != 0) goto L_0x0ebb
            java.lang.String r10 = r8.A0X     // Catch:{ Exception -> 0x12c1 }
            r1 = -9223372036854775808
            long r10 = X.C20099A7c.A04(r10, r1)     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 | r12
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.createdAt_ = r10     // Catch:{ Exception -> 0x12c1 }
        L_0x0ebb:
            int r1 = r15.A06(r9)     // Catch:{ Exception -> 0x12c1 }
            r10 = 0
            r2 = 1
            boolean r12 = X.AnonymousClass000.A1T(r1, r2)
            X.8cf r1 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r11 = r1.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r11 = r11 | 1
            r1.bitField1_ = r11     // Catch:{ Exception -> 0x12c1 }
            r1.isParentGroup_ = r12     // Catch:{ Exception -> 0x12c1 }
            r1 = r28
            r1.A04(r9, r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r8.A03     // Catch:{ Exception -> 0x12c1 }
            if (r1 != r2) goto L_0x0ee6
            X.8cf r1 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r11 = r1.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r11 = r11 | 8192(0x2000, float:1.14794E-41)
            r1.bitField1_ = r11     // Catch:{ Exception -> 0x12c1 }
            r1.capiCreatedGroup_ = r2     // Catch:{ Exception -> 0x12c1 }
        L_0x0ee6:
            X.1EC r9 = X.AnonymousClass3MW.A0i(r9)     // Catch:{ Exception -> 0x12c1 }
            if (r9 == 0) goto L_0x0f07
            X.1MF r1 = r0.A0L     // Catch:{ Exception -> 0x12c1 }
            X.1EC r1 = r1.A03(r9)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0f07
            java.lang.String r11 = r1.getRawString()     // Catch:{ Exception -> 0x12c1 }
            X.8cf r9 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            r11.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r9.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 2
            r9.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r9.parentGroupId_ = r11     // Catch:{ Exception -> 0x12c1 }
        L_0x0f07:
            X.00H r1 = r0.A0c     // Catch:{ Exception -> 0x12c1 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x12c1 }
            X.1xo r1 = (X.C42211xo) r1     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = r1.A00(r8)     // Catch:{ Exception -> 0x12c1 }
            if (r1 != 0) goto L_0x0f19
            int r1 = r8.A05     // Catch:{ Exception -> 0x12c1 }
            if (r1 != r2) goto L_0x0f1a
        L_0x0f19:
            r10 = 1
        L_0x0f1a:
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r8 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 | r8
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.terminated_ = r10     // Catch:{ Exception -> 0x12c1 }
        L_0x0f27:
            boolean r1 = X.C22971Dz.A0d(r5)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x1063
            boolean r1 = X.C22971Dz.A0Y(r5)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0f53
            r2 = r5
            com.whatsapp.jid.PhoneUserJid r2 = (com.whatsapp.jid.PhoneUserJid) r2     // Catch:{ Exception -> 0x12c1 }
            X.1Ln r1 = r0.A0M     // Catch:{ Exception -> 0x12c1 }
            X.1E2 r1 = r1.A0C(r2)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x1016
            java.lang.String r8 = r1.getRawString()     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            r8.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 128(0x80, float:1.794E-43)
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.lidJid_ = r8     // Catch:{ Exception -> 0x12c1 }
            goto L_0x1016
        L_0x0f53:
            boolean r1 = X.C22971Dz.A0T(r5)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x1016
            r10 = r5
            X.1E2 r10 = (X.AnonymousClass1E2) r10     // Catch:{ Exception -> 0x12c1 }
            X.1M4 r9 = r0.A0B     // Catch:{ Exception -> 0x12c1 }
            java.lang.String r8 = r9.BMm(r10)     // Catch:{ Exception -> 0x12c1 }
            if (r8 == 0) goto L_0x0f70
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 8
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.displayName_ = r8     // Catch:{ Exception -> 0x12c1 }
        L_0x0f70:
            java.lang.String r8 = r9.BMn(r10)     // Catch:{ Exception -> 0x12c1 }
            if (r8 == 0) goto L_0x0f82
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 256(0x100, float:3.59E-43)
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.username_ = r8     // Catch:{ Exception -> 0x12c1 }
        L_0x0f82:
            X.1Ln r1 = r0.A0M     // Catch:{ Exception -> 0x12c1 }
            com.whatsapp.jid.PhoneUserJid r1 = r1.A0D(r10)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0f9d
            java.lang.String r8 = r1.getRawString()     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            r8.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 16
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.pnJid_ = r8     // Catch:{ Exception -> 0x12c1 }
        L_0x0f9d:
            X.1RL r9 = r0.A0N     // Catch:{ Exception -> 0x12c1 }
            java.lang.Boolean r1 = r9.A06(r10)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x0fb5
            boolean r8 = r1.booleanValue()     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 32
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.shareOwnPn_ = r8     // Catch:{ Exception -> 0x12c1 }
        L_0x0fb5:
            monitor-enter(r9)     // Catch:{ Exception -> 0x12c1 }
            r1 = 0
            X.C18070vi.A0d(r10, r1)     // Catch:{ all -> 0x11ad }
            X.1DL r1 = r9.A02     // Catch:{ all -> 0x11ad }
            long r1 = r1.A09(r10)     // Catch:{ all -> 0x11ad }
            java.util.Map r11 = r9.A07     // Catch:{ all -> 0x11ad }
            java.lang.Long r8 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x11ad }
            java.lang.Object r8 = r11.get(r8)     // Catch:{ all -> 0x11ad }
            X.2rM r8 = (X.C62412rM) r8     // Catch:{ all -> 0x11ad }
            if (r8 == 0) goto L_0x0fd7
            boolean r8 = r8.A02     // Catch:{ all -> 0x11ad }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x11ad }
            if (r11 == 0) goto L_0x0fd7
            goto L_0x0fee
        L_0x0fd7:
            r11 = -1
            int r8 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0fdf
            r8 = 0
            goto L_0x0fee
        L_0x0fdf:
            X.00H r8 = r9.A05     // Catch:{ all -> 0x11ad }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x11ad }
            X.2nB r8 = (X.C59972nB) r8     // Catch:{ all -> 0x11ad }
            boolean r8 = r8.A02(r1)     // Catch:{ all -> 0x11ad }
            X.AnonymousClass1RL.A02(r9, r1, r8)     // Catch:{ all -> 0x11ad }
        L_0x0fee:
            monitor-exit(r9)     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 64
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.pnhDuplicateLidThread_ = r8     // Catch:{ Exception -> 0x12c1 }
            X.1ci r1 = X.AnonymousClass1CJ.A00(r15, r10)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x1016
            X.2Qs r1 = r1.A0b     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x1016
            java.lang.String r8 = r1.origin     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            r8.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 512(0x200, float:7.175E-43)
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.lidOriginType_ = r8     // Catch:{ Exception -> 0x12c1 }
        L_0x1016:
            if (r27 == 0) goto L_0x1063
            r1 = r22
            java.lang.Object r9 = r1.get(r5)     // Catch:{ Exception -> 0x12c1 }
            X.2lX r9 = (X.C58962lX) r9     // Catch:{ Exception -> 0x12c1 }
            if (r9 == 0) goto L_0x1044
            byte[] r1 = r9.A01     // Catch:{ Exception -> 0x12c1 }
            X.BmB r8 = X.C17900vP.A03(r4, r1)     // Catch:{ Exception -> 0x12c1 }
            X.Bm6 r2 = r4.A00     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = (X.C166298cf) r2     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r10 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r10
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.tcToken_ = r8     // Catch:{ Exception -> 0x12c1 }
            long r1 = r9.A00     // Catch:{ Exception -> 0x12c1 }
            X.8cf r9 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r8 = r9.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r10 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r10
            r9.bitField0_ = r8     // Catch:{ Exception -> 0x12c1 }
            r9.tcTokenTimestamp_ = r1     // Catch:{ Exception -> 0x12c1 }
        L_0x1044:
            r1 = r20
            java.lang.Object r1 = r1.get(r5)     // Catch:{ Exception -> 0x12c1 }
            X.2c1 r1 = (X.C53122c1) r1     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x1063
            java.lang.Long r1 = r1.A01     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x1063
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x12c1 }
            X.8cf r9 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            int r8 = r9.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r10 = 33554432(0x2000000, float:9.403955E-38)
            r8 = r8 | r10
            r9.bitField0_ = r8     // Catch:{ Exception -> 0x12c1 }
            r9.tcTokenSenderTimestamp_ = r1     // Catch:{ Exception -> 0x12c1 }
        L_0x1063:
            X.8ci r1 = X.C166328ci.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x12c1 }
            X.Bmt r9 = r1.A0N()     // Catch:{ Exception -> 0x12c1 }
            X.8Wz r9 = (X.C163958Wz) r9     // Catch:{ Exception -> 0x12c1 }
            r1 = r27
            X.1cl r1 = r1.A0e     // Catch:{ Exception -> 0x12c1 }
            int r2 = r1.disappearingMessagesInitiator     // Catch:{ Exception -> 0x12c1 }
            r1 = 1
            if (r2 == r1) goto L_0x107b
            r1 = 2
            if (r2 == r1) goto L_0x1078
            goto L_0x107e
        L_0x1078:
            X.9K8 r1 = X.AnonymousClass9K8.INITIATED_BY_OTHER     // Catch:{ Exception -> 0x12c1 }
            goto L_0x1080
        L_0x107b:
            X.9K8 r1 = X.AnonymousClass9K8.INITIATED_BY_ME     // Catch:{ Exception -> 0x12c1 }
            goto L_0x1080
        L_0x107e:
            X.9K8 r1 = X.AnonymousClass9K8.CHANGED_IN_CHAT     // Catch:{ Exception -> 0x12c1 }
        L_0x1080:
            r9.A0G(r1)     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = X.C22971Dz.A0d(r5)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x1095
            X.0ve r8 = r0.A0S     // Catch:{ Exception -> 0x12c1 }
            r2 = 5309(0x14bd, float:7.44E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = X.C18020vd.A05(r1, r8, r2)     // Catch:{ Exception -> 0x12c1 }
            if (r1 != 0) goto L_0x10a7
        L_0x1095:
            boolean r1 = X.C22971Dz.A0e(r5)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x10c1
            X.0ve r5 = r0.A0S     // Catch:{ Exception -> 0x12c1 }
            r2 = 7141(0x1be5, float:1.0007E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = X.C18020vd.A05(r1, r5, r2)     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x10c1
        L_0x10a7:
            r1 = r27
            X.2lr r2 = r1.A0d     // Catch:{ Exception -> 0x12c1 }
            if (r2 == 0) goto L_0x10c1
            int r1 = r2.A00     // Catch:{ Exception -> 0x12c1 }
            X.9KQ r1 = X.C196849vk.A01(r1)     // Catch:{ Exception -> 0x12c1 }
            r9.A0H(r1)     // Catch:{ Exception -> 0x12c1 }
            java.lang.Boolean r1 = r2.A01     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x10c1
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x12c1 }
            r9.A0I(r1)     // Catch:{ Exception -> 0x12c1 }
        L_0x10c1:
            X.Bm6 r1 = r9.A0C()     // Catch:{ Exception -> 0x12c1 }
            X.8ci r1 = (X.C166328ci) r1     // Catch:{ Exception -> 0x12c1 }
            X.8cf r2 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            r1.getClass()     // Catch:{ Exception -> 0x12c1 }
            r2.disappearingMode_ = r1     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r5 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r5
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            X.8cf r5 = X.AnonymousClass8BT.A0Y(r4)     // Catch:{ Exception -> 0x12c1 }
            r2 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r5.bitField1_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r5.bitField1_ = r1     // Catch:{ Exception -> 0x12c1 }
            r5.commentsCount_ = r2     // Catch:{ Exception -> 0x12c1 }
            java.util.List r5 = r14.A03     // Catch:{ Exception -> 0x12c1 }
            int r1 = r5.size()     // Catch:{ Exception -> 0x12c1 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x12c1 }
            long r45 = r45 + r1
            boolean r1 = r5.isEmpty()     // Catch:{ Exception -> 0x12c1 }
            if (r1 != 0) goto L_0x1127
            r1 = r18
            X.9te r8 = X.AnonymousClass1TO.A02(r1, r0)     // Catch:{ Exception -> 0x12c1 }
            java.util.HashSet r2 = X.C17880vN.A12()     // Catch:{ Exception -> 0x12c1 }
            java.util.Iterator r9 = r5.iterator()     // Catch:{ Exception -> 0x12c1 }
        L_0x1104:
            boolean r1 = r9.hasNext()     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x111e
            X.206 r5 = X.C17880vN.A0Y(r9)     // Catch:{ Exception -> 0x12c1 }
            r1 = r28
            r1.A05(r5, r2)     // Catch:{ Exception -> 0x1117 }
            r1.A06(r8, r4, r5)     // Catch:{ Exception -> 0x1117 }
            goto L_0x1104
        L_0x1117:
            r5 = move-exception
            java.lang.String r1 = "history-sync-send-methods send-initial-bootstrap addMessage exception"
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ Exception -> 0x12c1 }
            goto L_0x1104
        L_0x111e:
            r1 = r28
            java.util.ArrayList r1 = r1.A02(r2)     // Catch:{ Exception -> 0x12c1 }
            r3.A0L(r1)     // Catch:{ Exception -> 0x12c1 }
        L_0x1127:
            java.lang.Long r8 = r14.A01     // Catch:{ Exception -> 0x12c1 }
            java.lang.Long r9 = r14.A02     // Catch:{ Exception -> 0x12c1 }
            java.lang.String r1 = "history-sync-send-methods/setEndOfHistoryStatusForInitialSync"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x12c1 }
            if (r8 != 0) goto L_0x1133
            goto L_0x1168
        L_0x1133:
            X.1SI r5 = r0.A05     // Catch:{ Exception -> 0x12c1 }
            r2 = 2
            if (r19 == 0) goto L_0x1139
            r2 = 3
        L_0x1139:
            r1 = r19
            long r10 = r5.A00(r13, r2, r1)     // Catch:{ Exception -> 0x12c1 }
            X.11P r1 = r0.A09     // Catch:{ Exception -> 0x12c1 }
            long r14 = X.AnonymousClass11P.A01(r1)     // Catch:{ Exception -> 0x12c1 }
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r10 = r10 * r1
            long r14 = r14 - r10
            long r10 = r8.longValue()     // Catch:{ Exception -> 0x12c1 }
            r5 = 1
            int r1 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            boolean r2 = X.C108975cc.A1A(r1)
            if (r9 == 0) goto L_0x1160
            long r8 = r9.longValue()     // Catch:{ Exception -> 0x12c1 }
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 > 0) goto L_0x1160
            goto L_0x1161
        L_0x1160:
            r5 = 0
        L_0x1161:
            if (r2 != 0) goto L_0x1165
            if (r5 == 0) goto L_0x116d
        L_0x1165:
            X.2R7 r1 = X.AnonymousClass2R7.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ Exception -> 0x12c1 }
            goto L_0x116a
        L_0x1168:
            X.2R7 r1 = X.AnonymousClass2R7.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ Exception -> 0x12c1 }
        L_0x116a:
            r4.A0G(r1)     // Catch:{ Exception -> 0x12c1 }
        L_0x116d:
            X.Bm6 r1 = r4.A0C()     // Catch:{ Exception -> 0x12c1 }
            X.8cf r1 = (X.C166298cf) r1     // Catch:{ Exception -> 0x12c1 }
            r3.A0J(r1)     // Catch:{ Exception -> 0x12c1 }
            X.1Nl r5 = r0.A0U     // Catch:{ Exception -> 0x12c1 }
            java.security.SecureRandom r1 = r0.A0d     // Catch:{ Exception -> 0x12c1 }
            long r8 = r5.A02(r1)     // Catch:{ Exception -> 0x12c1 }
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 % r1
            long r1 = X.C17880vN.A04(r8)     // Catch:{ Exception -> 0x12c1 }
            int r4 = (int) r1     // Catch:{ Exception -> 0x12c1 }
            X.Bm6 r2 = X.C17880vN.A0G(r3)     // Catch:{ Exception -> 0x12c1 }
            X.8cQ r2 = (X.C166148cQ) r2     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 32
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.threadDsTimeframeOffset_ = r4     // Catch:{ Exception -> 0x12c1 }
            byte[] r1 = r5.A08()     // Catch:{ Exception -> 0x12c1 }
            X.DSQ r2 = X.DSQ.A00     // Catch:{ Exception -> 0x12c1 }
            X.BmB r4 = X.C17900vP.A03(r3, r1)     // Catch:{ Exception -> 0x12c1 }
            X.Bm6 r2 = r3.A00     // Catch:{ Exception -> 0x12c1 }
            X.8cQ r2 = (X.C166148cQ) r2     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 16
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.threadIdUserSecret_ = r4     // Catch:{ Exception -> 0x12c1 }
            goto L_0x0d33
        L_0x11ad:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ Exception -> 0x12c1 }
            throw r1     // Catch:{ Exception -> 0x12c1 }
        L_0x11b0:
            X.8cV r1 = X.C166198cV.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x12c1 }
            X.Bmt r5 = r1.A0N()     // Catch:{ Exception -> 0x12c1 }
            X.8UD r5 = (X.AnonymousClass8UD) r5     // Catch:{ Exception -> 0x12c1 }
            X.00H r1 = r0.A0Z     // Catch:{ Exception -> 0x12c1 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x12c1 }
            X.2nD r1 = (X.C59992nD) r1     // Catch:{ Exception -> 0x12c1 }
            X.8ax r4 = r1.A00()     // Catch:{ Exception -> 0x12c1 }
            if (r4 == 0) goto L_0x12ac
            X.8Yg r1 = X.C164288Yg.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x12c1 }
            X.Bmt r2 = r1.A0N()     // Catch:{ Exception -> 0x12c1 }
            X.8Wp r2 = (X.C163858Wp) r2     // Catch:{ Exception -> 0x12c1 }
            X.1TK r1 = r0.A04     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = r1.A04()     // Catch:{ Exception -> 0x12c1 }
            r2.A0H(r1)     // Catch:{ Exception -> 0x12c1 }
            r2.A0G(r4)     // Catch:{ Exception -> 0x12c1 }
            X.Bm6 r1 = r2.A0C()     // Catch:{ Exception -> 0x12c1 }
            X.8Yg r1 = (X.C164288Yg) r1     // Catch:{ Exception -> 0x12c1 }
            X.8cV r2 = X.AnonymousClass8BS.A0N(r5)     // Catch:{ Exception -> 0x12c1 }
            r1.getClass()     // Catch:{ Exception -> 0x12c1 }
            r2.chatLockSettings_ = r1     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r4 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r4
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
        L_0x11f0:
            X.Bm6 r1 = r5.A0C()     // Catch:{ Exception -> 0x12c1 }
            X.8cV r1 = (X.C166198cV) r1     // Catch:{ Exception -> 0x12c1 }
            X.Bm6 r2 = X.C17880vN.A0G(r3)     // Catch:{ Exception -> 0x12c1 }
            X.8cQ r2 = (X.C166148cQ) r2     // Catch:{ Exception -> 0x12c1 }
            r1.getClass()     // Catch:{ Exception -> 0x12c1 }
            r2.globalSettings_ = r1     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 8
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            X.Bm6 r2 = X.C17880vN.A0G(r3)     // Catch:{ Exception -> 0x12c1 }
            X.8cQ r2 = (X.C166148cQ) r2     // Catch:{ Exception -> 0x12c1 }
            r32.getClass()     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 128(0x80, float:1.794E-43)
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r1 = r32
            r2.companionMetaNonce_ = r1     // Catch:{ Exception -> 0x12c1 }
            X.0zA r2 = r0.A00     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = r2.A07()     // Catch:{ Exception -> 0x12c1 }
            if (r1 == 0) goto L_0x1247
            r1 = r18
            X.2RG r4 = r1.A09     // Catch:{ Exception -> 0x12c1 }
            X.2RG r1 = X.AnonymousClass2RG.AR_WRIST     // Catch:{ Exception -> 0x12c1 }
            if (r4 == r1) goto L_0x122e
            X.2RG r1 = X.AnonymousClass2RG.SMARTGLASSES     // Catch:{ Exception -> 0x12c1 }
            if (r4 != r1) goto L_0x1247
        L_0x122e:
            java.lang.Object r8 = r2.A03()     // Catch:{ Exception -> 0x12c1 }
            X.1TN r8 = (X.AnonymousClass1TN) r8     // Catch:{ Exception -> 0x12c1 }
            X.1TM r1 = r8.A00     // Catch:{ Exception -> 0x12c1 }
            X.0ve r4 = r1.A01     // Catch:{ Exception -> 0x12c1 }
            r2 = 9695(0x25df, float:1.3586E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x12c1 }
            boolean r1 = X.C18020vd.A05(r1, r4, r2)     // Catch:{ Exception -> 0x12c1 }
            if (r1 != 0) goto L_0x126b
            java.lang.String r1 = "InstrumentationShareableEncryptionManager/getOrCreateSciek: AB prop is disabled"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x12c1 }
        L_0x1247:
            r39 = -1
            r33 = 0
            r35 = 100
            r30 = r23
            r31 = r23
            r36 = r33
            r43 = r39
            r49 = r39
            r25 = r17
            r26 = r24
            r27 = r0
            r28 = r3
            r29 = r23
            r34 = r33
            r41 = r39
            r47 = r37
            X.AnonymousClass1TO.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r45, r47, r49, r51)     // Catch:{ Exception -> 0x12c1 }
            goto L_0x12d0
        L_0x126b:
            byte[] r5 = r8.A01()     // Catch:{ Exception -> 0x12c1 }
            if (r5 != 0) goto L_0x1299
            monitor-enter(r8)     // Catch:{ Exception -> 0x12c1 }
            byte[] r5 = r8.A01()     // Catch:{ all -> 0x12be }
            if (r5 != 0) goto L_0x1298
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ all -> 0x12be }
            r1.<init>()     // Catch:{ all -> 0x12be }
            r2 = 32
            byte[] r5 = new byte[r2]     // Catch:{ all -> 0x12be }
            r1.nextBytes(r5)     // Catch:{ all -> 0x12be }
            r1 = 3
            java.lang.String r4 = android.util.Base64.encodeToString(r5, r1)     // Catch:{ all -> 0x12be }
            X.1HY r1 = r8.A01     // Catch:{ all -> 0x12be }
            android.content.SharedPreferences r1 = X.AnonymousClass1HY.A00(r1)     // Catch:{ all -> 0x12be }
            android.content.SharedPreferences$Editor r2 = r1.edit()     // Catch:{ all -> 0x12be }
            java.lang.String r1 = "sciek/key"
            X.C17880vN.A1E(r2, r1, r4)     // Catch:{ all -> 0x12be }
        L_0x1298:
            monitor-exit(r8)     // Catch:{ Exception -> 0x12c1 }
        L_0x1299:
            X.DSQ r1 = X.DSQ.A00     // Catch:{ Exception -> 0x12c1 }
            X.BmB r4 = X.C17900vP.A03(r3, r5)     // Catch:{ Exception -> 0x12c1 }
            X.Bm6 r2 = r3.A00     // Catch:{ Exception -> 0x12c1 }
            X.8cQ r2 = (X.C166148cQ) r2     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r1 = r1 | 256(0x100, float:3.59E-43)
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            r2.shareableChatIdentifierEncryptionKey_ = r4     // Catch:{ Exception -> 0x12c1 }
            goto L_0x1247
        L_0x12ac:
            X.8cV r2 = X.AnonymousClass8BS.A0N(r5)     // Catch:{ Exception -> 0x12c1 }
            r1 = r23
            r2.chatLockSettings_ = r1     // Catch:{ Exception -> 0x12c1 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x12c1 }
            r4 = -262145(0xfffffffffffbffff, float:NaN)
            r1 = r1 & r4
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x12c1 }
            goto L_0x11f0
        L_0x12be:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ Exception -> 0x12c1 }
            throw r1     // Catch:{ Exception -> 0x12c1 }
        L_0x12c1:
            r4 = move-exception
            X.190 r3 = r0.A01
            java.lang.String r2 = "history-sync-send-methods/send-initial-bootstrap/exception"
            r1 = r23
            r3.A0E(r2, r1, r4)
            java.lang.String r1 = "history-sync-send-methods/send-initial-bootstrap: recent msgs error"
            com.whatsapp.util.Log.e(r1, r4)
        L_0x12d0:
            boolean r1 = X.C62832s4.A00(r24)
            if (r1 != 0) goto L_0x13c6
            java.lang.String r1 = "HistorySyncManager/ sendStatusV3 messages and push names"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r4 = r7.A02
            X.1TG r3 = r0.A0J     // Catch:{ Exception -> 0x13c8 }
            r2 = -1
            r1 = r23
            java.util.ArrayList r2 = r3.A04(r1, r2)     // Catch:{ Exception -> 0x13c8 }
            java.util.Collections.reverse(r2)     // Catch:{ Exception -> 0x13c8 }
            X.8cQ r1 = X.C166148cQ.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x13c8 }
            X.Bmt r3 = r1.A0N()     // Catch:{ Exception -> 0x13c8 }
            X.8X2 r3 = (X.AnonymousClass8X2) r3     // Catch:{ Exception -> 0x13c8 }
            X.9KV r1 = X.AnonymousClass9KV.INITIAL_STATUS_V3     // Catch:{ Exception -> 0x13c8 }
            r3.A0K(r1)     // Catch:{ Exception -> 0x13c8 }
            X.0ve r11 = r0.A0S     // Catch:{ Exception -> 0x13c8 }
            r1 = 1182(0x49e, float:1.656E-42)
            X.0vf r10 = X.C18040vf.A02     // Catch:{ Exception -> 0x13c8 }
            int r9 = X.C18020vd.A00(r10, r11, r1)     // Catch:{ Exception -> 0x13c8 }
            java.util.Iterator r15 = r2.iterator()     // Catch:{ Exception -> 0x13c8 }
            r8 = 0
        L_0x1305:
            boolean r1 = r15.hasNext()     // Catch:{ Exception -> 0x13c8 }
            if (r1 == 0) goto L_0x1391
            X.206 r5 = X.C17880vN.A0Y(r15)     // Catch:{ Exception -> 0x13c8 }
            java.lang.Integer r26 = X.AnonymousClass00R.A00     // Catch:{ 1T8 -> 0x1380 }
            r27 = 0
            r2 = 1
            X.9te r1 = new X.9te     // Catch:{ 1T8 -> 0x1380 }
            r29 = r27
            r30 = r27
            r31 = r27
            r32 = r27
            r33 = r27
            r34 = r27
            r28 = r27
            r25 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ 1T8 -> 0x1380 }
            X.00H r12 = r0.A0b     // Catch:{ 1T8 -> 0x1380 }
            java.lang.Object r12 = r12.get()     // Catch:{ 1T8 -> 0x1380 }
            X.9p6 r12 = (X.C192859p6) r12     // Catch:{ 1T8 -> 0x1380 }
            X.8X1 r14 = r12.A00(r1, r5)     // Catch:{ 1T8 -> 0x1380 }
            X.205 r1 = r5.A0v     // Catch:{ Exception -> 0x13c8 }
            boolean r1 = r1.A02     // Catch:{ Exception -> 0x13c8 }
            if (r1 != 0) goto L_0x1358
            X.1Le r12 = r0.A0K     // Catch:{ Exception -> 0x13c8 }
            r1 = 8880(0x22b0, float:1.2444E-41)
            boolean r1 = X.C18020vd.A05(r10, r11, r1)     // Catch:{ Exception -> 0x13c8 }
            boolean r1 = r12.A0K(r5, r1)     // Catch:{ Exception -> 0x13c8 }
            if (r1 != 0) goto L_0x1358
            X.8co r5 = X.C17880vN.A0X(r14)     // Catch:{ Exception -> 0x13c8 }
            int r1 = r5.bitField0_     // Catch:{ Exception -> 0x13c8 }
            r1 = r1 | 64
            r5.bitField0_ = r1     // Catch:{ Exception -> 0x13c8 }
            r5.ignore_ = r2     // Catch:{ Exception -> 0x13c8 }
            r14.A0C()     // Catch:{ Exception -> 0x13c8 }
        L_0x1358:
            int r8 = r8 + 1
            X.Bm6 r12 = X.C17880vN.A0G(r3)     // Catch:{ Exception -> 0x13c8 }
            X.8cQ r12 = (X.C166148cQ) r12     // Catch:{ Exception -> 0x13c8 }
            X.Bm6 r5 = r14.A0C()     // Catch:{ Exception -> 0x13c8 }
            X.8co r5 = (X.C166388co) r5     // Catch:{ Exception -> 0x13c8 }
            r5.getClass()     // Catch:{ Exception -> 0x13c8 }
            X.EE9 r2 = r12.statusV3Messages_     // Catch:{ Exception -> 0x13c8 }
            r1 = r2
            X.DbR r1 = (X.C27296DbR) r1     // Catch:{ Exception -> 0x13c8 }
            boolean r1 = r1.A00     // Catch:{ Exception -> 0x13c8 }
            if (r1 != 0) goto L_0x1378
            X.EE9 r2 = X.C23577Bm6.A09(r2)     // Catch:{ Exception -> 0x13c8 }
            r12.statusV3Messages_ = r2     // Catch:{ Exception -> 0x13c8 }
        L_0x1378:
            r2.add(r5)     // Catch:{ Exception -> 0x13c8 }
            if (r9 <= 0) goto L_0x1305
            if (r8 < r9) goto L_0x1305
            goto L_0x1388
        L_0x1380:
            r2 = move-exception
            java.lang.String r1 = "HistorySyncSendMethods/sendStatusV3Messages/invalid message"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x13c8 }
            goto L_0x1305
        L_0x1388:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x13c8 }
            java.lang.String r1 = "history-sync-send-methods/sendStatusV3Messages reach max status msg, count="
            X.C17900vP.A0j(r1, r2, r8)     // Catch:{ Exception -> 0x13c8 }
        L_0x1391:
            X.Bm6 r1 = r3.A00     // Catch:{ Exception -> 0x13c8 }
            X.8cQ r1 = (X.C166148cQ) r1     // Catch:{ Exception -> 0x13c8 }
            X.EE9 r1 = r1.statusV3Messages_     // Catch:{ Exception -> 0x13c8 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x13c8 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x13c8 }
            r39 = -1
            r37 = 0
            r33 = 0
            r34 = 1
            r35 = 100
            r30 = r23
            r31 = r23
            r43 = r39
            r49 = r39
            r25 = r17
            r26 = r24
            r27 = r0
            r28 = r3
            r29 = r23
            r32 = r4
            r36 = r33
            r41 = r39
            r45 = r1
            r47 = r37
            X.AnonymousClass1TO.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r45, r47, r49, r51)     // Catch:{ Exception -> 0x13c8 }
            goto L_0x13ce
        L_0x13c6:
            r4 = 2
            goto L_0x13de
        L_0x13c8:
            r2 = move-exception
            java.lang.String r1 = "history-sync-send-methods/send-status-v3: error"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x13ce:
            r29 = 0
            r4 = 2
            r25 = r0
            r26 = r17
            r27 = r24
            r28 = r23
            r30 = r51
            r25.A08(r26, r27, r28, r29, r30)
        L_0x13de:
            r19 = 0
            r8 = 0
            java.lang.String r5 = r7.A02
            boolean r1 = X.C62832s4.A00(r24)
            if (r1 != 0) goto L_0x141a
            X.1MX r1 = r6.A09
            X.0ve r2 = r1.A02
            r1 = 1613(0x64d, float:2.26E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r3, r2, r1)
            if (r1 == 0) goto L_0x1400
            r1 = 1598(0x63e, float:2.239E-42)
            boolean r1 = X.C18020vd.A05(r3, r2, r1)
            if (r1 == 0) goto L_0x1400
            r8 = 1
        L_0x1400:
            if (r13 == 0) goto L_0x141a
            boolean r1 = r13.A09
            if (r1 == 0) goto L_0x141a
            X.0ve r2 = r6.A0E
            r1 = 5417(0x1529, float:7.591E-42)
            int r1 = X.C18020vd.A00(r3, r2, r1)
            if (r1 >= r4) goto L_0x1418
            r1 = 6646(0x19f6, float:9.313E-42)
            int r1 = X.C18020vd.A00(r3, r2, r1)
            if (r1 < r4) goto L_0x141a
        L_0x1418:
            r19 = 1
        L_0x141a:
            X.11S r9 = r0.A02
            boolean r1 = r9.A0N()
            if (r1 != 0) goto L_0x15d8
            X.8cQ r1 = X.C166148cQ.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x15d2 }
            X.Bmt r3 = r1.A0N()     // Catch:{ Exception -> 0x15d2 }
            X.8X2 r3 = (X.AnonymousClass8X2) r3     // Catch:{ Exception -> 0x15d2 }
            X.9KV r1 = X.AnonymousClass9KV.NON_BLOCKING_DATA     // Catch:{ Exception -> 0x15d2 }
            r3.A0K(r1)     // Catch:{ Exception -> 0x15d2 }
            X.AnonymousClass1TO.A07(r0, r3)     // Catch:{ Exception -> 0x15d2 }
            if (r8 == 0) goto L_0x1559
            X.1MX r12 = r0.A0G     // Catch:{ Exception -> 0x15d2 }
            X.11P r1 = r0.A09     // Catch:{ Exception -> 0x15d2 }
            long r1 = X.AnonymousClass11P.A01(r1)     // Catch:{ Exception -> 0x15d2 }
            r10 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r1 = r1 - r10
            r11 = 1000(0x3e8, float:1.401E-42)
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ Exception -> 0x15d2 }
            r8 = 0
            X.C17880vN.A1V(r10, r8, r1)     // Catch:{ Exception -> 0x15d2 }
            r1 = 1
            X.C17880vN.A1S(r10, r11, r1)     // Catch:{ Exception -> 0x15d2 }
            X.1Cd r1 = r12.A01     // Catch:{ Exception -> 0x15d2 }
            X.1at r11 = r1.get()     // Catch:{ Exception -> 0x15d2 }
            r1 = r11
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x154f }
            X.1Ev r8 = r1.A02     // Catch:{ all -> 0x154f }
            java.lang.String r2 = "SELECT group_jid_row_id, user_jid_row_id, is_leave, timestamp FROM group_past_participant_user WHERE timestamp >= ? ORDER BY timestamp DESC LIMIT ?"
            java.lang.String r1 = "GET_ALL_GROUP_PAST_PARTICIPANT_USERS_SQL"
            android.database.Cursor r2 = r8.A0A(r2, r1, r10)     // Catch:{ all -> 0x154f }
            java.util.ArrayList r1 = X.AnonymousClass1MX.A00(r2)     // Catch:{ all -> 0x1543 }
            if (r2 == 0) goto L_0x146a
            r2.close()     // Catch:{ all -> 0x154f }
        L_0x146a:
            r11.close()     // Catch:{ Exception -> 0x15d2 }
            java.util.HashMap r1 = X.AnonymousClass1MX.A01(r12, r1)     // Catch:{ Exception -> 0x15d2 }
            java.util.Iterator r18 = X.C17890vO.A0i(r1)     // Catch:{ Exception -> 0x15d2 }
        L_0x1475:
            boolean r1 = r18.hasNext()     // Catch:{ Exception -> 0x15d2 }
            if (r1 == 0) goto L_0x1559
            java.util.Map$Entry r10 = X.AnonymousClass000.A16(r18)     // Catch:{ Exception -> 0x15d2 }
            X.8ZO r1 = X.AnonymousClass8ZO.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x15d2 }
            X.Bmt r11 = r1.A0N()     // Catch:{ Exception -> 0x15d2 }
            X.8UI r11 = (X.AnonymousClass8UI) r11     // Catch:{ Exception -> 0x15d2 }
            java.lang.Object r1 = r10.getKey()     // Catch:{ Exception -> 0x15d2 }
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1     // Catch:{ Exception -> 0x15d2 }
            java.lang.String r8 = X.AnonymousClass8BS.A0d(r11, r1)     // Catch:{ Exception -> 0x15d2 }
            X.Bm6 r2 = r11.A00     // Catch:{ Exception -> 0x15d2 }
            X.8ZO r2 = (X.AnonymousClass8ZO) r2     // Catch:{ Exception -> 0x15d2 }
            r8.getClass()     // Catch:{ Exception -> 0x15d2 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x15d2 }
            r1 = r1 | 1
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x15d2 }
            r2.groupJid_ = r8     // Catch:{ Exception -> 0x15d2 }
            java.lang.Object r1 = r10.getValue()     // Catch:{ Exception -> 0x15d2 }
            java.util.Iterator r15 = X.AnonymousClass8BR.A13(r1)     // Catch:{ Exception -> 0x15d2 }
        L_0x14a8:
            boolean r1 = r15.hasNext()     // Catch:{ Exception -> 0x15d2 }
            if (r1 == 0) goto L_0x1520
            java.lang.Object r10 = r15.next()     // Catch:{ Exception -> 0x15d2 }
            X.4O4 r10 = (X.AnonymousClass4O4) r10     // Catch:{ Exception -> 0x15d2 }
            X.8aL r1 = X.AnonymousClass8aL.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x15d2 }
            X.Bmt r8 = r1.A0N()     // Catch:{ Exception -> 0x15d2 }
            X.8UH r8 = (X.AnonymousClass8UH) r8     // Catch:{ Exception -> 0x15d2 }
            com.whatsapp.jid.UserJid r1 = r10.A01     // Catch:{ Exception -> 0x15d2 }
            java.lang.String r12 = X.AnonymousClass8BS.A0d(r8, r1)     // Catch:{ Exception -> 0x15d2 }
            X.Bm6 r2 = r8.A00     // Catch:{ Exception -> 0x15d2 }
            X.8aL r2 = (X.AnonymousClass8aL) r2     // Catch:{ Exception -> 0x15d2 }
            r12.getClass()     // Catch:{ Exception -> 0x15d2 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x15d2 }
            r1 = r1 | 1
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x15d2 }
            r2.userJid_ = r12     // Catch:{ Exception -> 0x15d2 }
            long r1 = r10.A00     // Catch:{ Exception -> 0x15d2 }
            long r1 = X.C17880vN.A04(r1)     // Catch:{ Exception -> 0x15d2 }
            X.Bm6 r14 = X.C17880vN.A0G(r8)     // Catch:{ Exception -> 0x15d2 }
            X.8aL r14 = (X.AnonymousClass8aL) r14     // Catch:{ Exception -> 0x15d2 }
            int r12 = r14.bitField0_     // Catch:{ Exception -> 0x15d2 }
            r12 = r12 | 4
            r14.bitField0_ = r12     // Catch:{ Exception -> 0x15d2 }
            r14.leaveTs_ = r1     // Catch:{ Exception -> 0x15d2 }
            boolean r1 = r10.A02     // Catch:{ Exception -> 0x15d2 }
            if (r1 == 0) goto L_0x151d
            X.9Jk r1 = X.AnonymousClass9Jk.LEFT     // Catch:{ Exception -> 0x15d2 }
        L_0x14eb:
            X.Bm6 r2 = X.C17880vN.A0G(r8)     // Catch:{ Exception -> 0x15d2 }
            X.8aL r2 = (X.AnonymousClass8aL) r2     // Catch:{ Exception -> 0x15d2 }
            int r1 = r1.value     // Catch:{ Exception -> 0x15d2 }
            r2.leaveReason_ = r1     // Catch:{ Exception -> 0x15d2 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x15d2 }
            r1 = r1 | 2
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x15d2 }
            X.Bm6 r10 = r8.A0C()     // Catch:{ Exception -> 0x15d2 }
            X.8aL r10 = (X.AnonymousClass8aL) r10     // Catch:{ Exception -> 0x15d2 }
            X.Bm6 r8 = X.C17880vN.A0G(r11)     // Catch:{ Exception -> 0x15d2 }
            X.8ZO r8 = (X.AnonymousClass8ZO) r8     // Catch:{ Exception -> 0x15d2 }
            r10.getClass()     // Catch:{ Exception -> 0x15d2 }
            X.EE9 r2 = r8.pastParticipants_     // Catch:{ Exception -> 0x15d2 }
            r1 = r2
            X.DbR r1 = (X.C27296DbR) r1     // Catch:{ Exception -> 0x15d2 }
            boolean r1 = r1.A00     // Catch:{ Exception -> 0x15d2 }
            if (r1 != 0) goto L_0x1519
            X.EE9 r2 = X.C23577Bm6.A09(r2)     // Catch:{ Exception -> 0x15d2 }
            r8.pastParticipants_ = r2     // Catch:{ Exception -> 0x15d2 }
        L_0x1519:
            r2.add(r10)     // Catch:{ Exception -> 0x15d2 }
            goto L_0x14a8
        L_0x151d:
            X.9Jk r1 = X.AnonymousClass9Jk.REMOVED     // Catch:{ Exception -> 0x15d2 }
            goto L_0x14eb
        L_0x1520:
            X.Bm6 r10 = r11.A0C()     // Catch:{ Exception -> 0x15d2 }
            X.8ZO r10 = (X.AnonymousClass8ZO) r10     // Catch:{ Exception -> 0x15d2 }
            X.Bm6 r8 = X.C17880vN.A0G(r3)     // Catch:{ Exception -> 0x15d2 }
            X.8cQ r8 = (X.C166148cQ) r8     // Catch:{ Exception -> 0x15d2 }
            r10.getClass()     // Catch:{ Exception -> 0x15d2 }
            X.EE9 r2 = r8.pastParticipants_     // Catch:{ Exception -> 0x15d2 }
            r1 = r2
            X.DbR r1 = (X.C27296DbR) r1     // Catch:{ Exception -> 0x15d2 }
            boolean r1 = r1.A00     // Catch:{ Exception -> 0x15d2 }
            if (r1 != 0) goto L_0x153e
            X.EE9 r2 = X.C23577Bm6.A09(r2)     // Catch:{ Exception -> 0x15d2 }
            r8.pastParticipants_ = r2     // Catch:{ Exception -> 0x15d2 }
        L_0x153e:
            r2.add(r10)     // Catch:{ Exception -> 0x15d2 }
            goto L_0x1475
        L_0x1543:
            r1 = move-exception
            if (r2 == 0) goto L_0x154e
            r2.close()     // Catch:{ all -> 0x154a }
            goto L_0x154e
        L_0x154a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x154f }
        L_0x154e:
            throw r1     // Catch:{ all -> 0x154f }
        L_0x154f:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x1554 }
            goto L_0x1558
        L_0x1554:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x15d2 }
        L_0x1558:
            throw r1     // Catch:{ Exception -> 0x15d2 }
        L_0x1559:
            if (r19 == 0) goto L_0x15a6
            X.1TD r10 = r0.A0C     // Catch:{ Exception -> 0x15d2 }
            r8 = 200(0xc8, float:2.8E-43)
            r2 = 0
            r1 = r23
            java.util.ArrayList r8 = r10.A09(r1, r2, r8)     // Catch:{ Exception -> 0x15d2 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x15d2 }
            java.lang.String r1 = "history-sync-send-methods/attachRecentCallLogsToHistorySync call log size = "
            r2.append(r1)     // Catch:{ Exception -> 0x15d2 }
            int r1 = r8.size()     // Catch:{ Exception -> 0x15d2 }
            X.C17900vP.A0o(r2, r1)     // Catch:{ Exception -> 0x15d2 }
            java.util.Iterator r11 = r8.iterator()     // Catch:{ Exception -> 0x15d2 }
        L_0x157a:
            boolean r1 = r11.hasNext()     // Catch:{ Exception -> 0x15d2 }
            if (r1 == 0) goto L_0x15a6
            java.lang.Object r1 = r11.next()     // Catch:{ Exception -> 0x15d2 }
            X.9Bw r1 = (X.C178119Bw) r1     // Catch:{ Exception -> 0x15d2 }
            X.8cO r10 = X.A77.A02(r9, r1)     // Catch:{ Exception -> 0x15d2 }
            X.Bm6 r8 = X.C17880vN.A0G(r3)     // Catch:{ Exception -> 0x15d2 }
            X.8cQ r8 = (X.C166148cQ) r8     // Catch:{ Exception -> 0x15d2 }
            r10.getClass()     // Catch:{ Exception -> 0x15d2 }
            X.EE9 r2 = r8.callLogRecords_     // Catch:{ Exception -> 0x15d2 }
            r1 = r2
            X.DbR r1 = (X.C27296DbR) r1     // Catch:{ Exception -> 0x15d2 }
            boolean r1 = r1.A00     // Catch:{ Exception -> 0x15d2 }
            if (r1 != 0) goto L_0x15a2
            X.EE9 r2 = X.C23577Bm6.A09(r2)     // Catch:{ Exception -> 0x15d2 }
            r8.callLogRecords_ = r2     // Catch:{ Exception -> 0x15d2 }
        L_0x15a2:
            r2.add(r10)     // Catch:{ Exception -> 0x15d2 }
            goto L_0x157a
        L_0x15a6:
            r37 = 0
            r33 = 0
            r34 = 5
            r35 = 100
            r39 = -1
            r30 = r23
            r31 = r23
            r43 = r39
            r47 = r37
            r49 = r39
            r51 = r33
            r25 = r17
            r26 = r24
            r27 = r0
            r28 = r3
            r29 = r23
            r32 = r5
            r36 = r33
            r41 = r39
            r45 = r37
            X.AnonymousClass1TO.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r45, r47, r49, r51)     // Catch:{ Exception -> 0x15d2 }
            goto L_0x15d8
        L_0x15d2:
            r1 = move-exception
            java.lang.String r0 = "history-sync-send-methods/sendNonBlockingDataMessages: error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x15d8:
            long r0 = r7.A06
            r24.toString()
            r2 = r24
            long r2 = r6.A02(r2, r0)
            r8 = 0
            r9 = 3
            r0 = r16
            boolean r23 = X.AnonymousClass000.A1T(r0, r9)
            r18 = r6
            r19 = r13
            r20 = r0
            r21 = r2
            long r30 = r18.A01(r19, r20, r21, r23)
            X.1SI r7 = r6.A01
            if (r0 != r9) goto L_0x15fc
            r8 = 1
        L_0x15fc:
            boolean r18 = X.C62832s4.A00(r24)
            r14 = 1000000(0xf4240, double:4.940656E-318)
            r0 = -1
            r5 = r16
            if (r5 == r4) goto L_0x1679
            if (r13 == 0) goto L_0x1670
            java.lang.Integer r0 = r13.A01
            if (r0 == 0) goto L_0x1670
            int r5 = r0.intValue()
            if (r5 <= 0) goto L_0x1670
        L_0x1615:
            long r0 = (long) r5
            long r0 = r0 * r14
        L_0x1617:
            boolean r5 = X.C62832s4.A00(r24)
            if (r5 == 0) goto L_0x1669
            X.0ve r10 = r6.A0E
            r8 = 11085(0x2b4d, float:1.5533E-41)
            X.0vf r5 = X.C18040vf.A02
            int r5 = X.C18020vd.A00(r5, r10, r8)
            if (r5 < r4) goto L_0x1669
            X.1NK r5 = r6.A0A
            long r26 = r5.A03(r2)
        L_0x162f:
            r10 = 1
            int r5 = (r26 > r10 ? 1 : (r26 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x1637
            long r26 = r26 + r10
        L_0x1637:
            r5 = r16
            if (r5 != r9) goto L_0x1666
            r14 = 1
            r9 = r6
            r10 = r13
            r11 = r4
            r12 = r2
            long r28 = r9.A01(r10, r11, r12, r14)
            X.0ve r3 = r7.A01
            r2 = 2645(0xa55, float:3.706E-42)
            r3.A0G(r2)
            r32 = -1
            r22 = r6
            r23 = r17
            r25 = r4
            r22.A03(r23, r24, r25, r26, r28, r30, r32)
        L_0x1656:
            r10 = r30
            r2 = r6
            r3 = r17
            r4 = r24
            r6 = r28
            r8 = r30
            r12 = r0
            r2.A03(r3, r4, r5, r6, r8, r10, r12)
            return
        L_0x1666:
            r28 = r26
            goto L_0x1656
        L_0x1669:
            X.1NK r5 = r6.A0A
            long r26 = r5.A01()
            goto L_0x162f
        L_0x1670:
            X.18O r1 = r7.A00
            X.18Q r0 = X.AnonymousClass18O.A0t
            int r5 = r1.A04(r0)
            goto L_0x1615
        L_0x1679:
            X.0ve r12 = r7.A01
            r5 = 2645(0xa55, float:3.706E-42)
            X.0vf r11 = X.C18040vf.A02
            int r10 = X.C18020vd.A00(r11, r12, r5)
            if (r8 != 0) goto L_0x1617
            if (r13 == 0) goto L_0x1617
            java.lang.Integer r8 = r13.A03
            if (r8 == 0) goto L_0x1617
            r5 = -1
            if (r10 == r5) goto L_0x1617
            int r5 = r8.intValue()
            if (r5 <= r10) goto L_0x1617
            r5 = 2706(0xa92, float:3.792E-42)
            if (r18 == 0) goto L_0x169a
            r5 = 8491(0x212b, float:1.1898E-41)
        L_0x169a:
            int r5 = X.C18020vd.A00(r11, r12, r5)
            if (r5 <= 0) goto L_0x1617
            goto L_0x1615
        L_0x16a2:
            java.lang.Object r5 = r0.A02
            X.77d r5 = (X.C1418377d) r5
            java.lang.Object r2 = r0.A03
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            java.lang.Object r3 = r0.A04
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r1 = r0.A05
            X.1GP r1 = (X.AnonymousClass1GP) r1
            java.lang.String r7 = r2.getRawString()
            X.6Ra r6 = X.C122606Ra.TRANSPARENT_IMAGE
            r4 = 0
            r8 = 1
            r9 = 0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r0 = X.C124156Xg.A00(r3, r4, r5, r6, r7, r8, r9)
            X.C20098A7b.A03(r0, r1, r4)
            return
        L_0x16c3:
            java.lang.Object r6 = r0.A01
            X.21V r6 = (X.AnonymousClass21V) r6
            java.lang.Object r4 = r0.A02
            X.0vb r4 = (X.C18000vb) r4
            java.lang.Object r3 = r0.A03
            X.1KB r3 = (X.AnonymousClass1KB) r3
            java.lang.Object r5 = r0.A04
            java.lang.Object r7 = r0.A05
            int r0 = r6.A0D
            if (r0 != 0) goto L_0x16f4
            X.2rc r0 = r6.A02
            java.io.File r0 = r0.A0G
            int r0 = X.C26511Sk.A03(r0)
            r6.A0D = r0
            if (r0 != 0) goto L_0x16f4
            long r0 = r6.A01
            java.lang.String r8 = X.C88584aA.A02(r4, r0)
        L_0x16e9:
            r9 = 22
            X.AkN r4 = new X.AkN
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A0J(r4)
            return
        L_0x16f4:
            long r1 = (long) r0
            r0 = 0
            java.lang.String r8 = X.C64052u8.A0D(r4, r0, r1)
            goto L_0x16e9
        L_0x16fb:
            java.lang.Object r6 = r0.A01
            X.9oj r6 = (X.C192639oj) r6
            java.lang.Object r5 = r0.A02
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            java.lang.Object r4 = r0.A03
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r0.A04
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r0.A05
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.8rL r1 = new X.8rL
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A00 = r0
            r1.A01 = r0
            X.9jB r0 = r6.A02
            java.lang.String r0 = r0.A00(r5)
            r1.A06 = r0
            r1.A02 = r4
            r1.A03 = r3
            r1.A04 = r2
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A04
            int r0 = r0.getAndIncrement()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r1.A05 = r0
            X.18K r0 = r6.A01
            r0.CC7(r1)
            return
        L_0x173c:
            java.lang.Object r6 = r0.A01
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r5 = r0.A02
            X.206 r5 = (X.AnonymousClass206) r5
            java.lang.Object r4 = r0.A03
            X.4a2 r4 = (X.C88524a2) r4
            java.lang.Object r3 = r0.A04
            java.lang.Object r2 = r0.A05
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            if (r5 == 0) goto L_0x1760
            r1 = 2
            X.4ks r0 = new X.4ks
            r0.<init>(r2, r3, r1)
            X.3uP r0 = r4.A05(r0, r5)
        L_0x175c:
            r6.addView(r0)
            return
        L_0x1760:
            r0 = 0
            goto L_0x175c
        L_0x1762:
            java.lang.Object r3 = r0.A01
            X.3xk r3 = (X.C80663xk) r3
            java.lang.Object r5 = r0.A02
            java.lang.Object r6 = r0.A03
            java.lang.Object r8 = r0.A04
            java.lang.Object r4 = r0.A05
            r0 = 2
            X.C18070vi.A0d(r6, r0)
            X.5bc r1 = r3.A00
            boolean r0 = r1 instanceof X.C95734mi
            r7 = 0
            if (r0 == 0) goto L_0x1787
            X.4mi r1 = (X.C95734mi) r1
            if (r1 == 0) goto L_0x1787
            long r0 = r1.A01
            X.1W6 r2 = r3.A02
            X.1W2 r2 = r2.A01
            X.206 r7 = r2.A03(r0)
        L_0x1787:
            X.1KB r0 = r3.A00
            r9 = 21
            X.AkZ r3 = new X.AkZ
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.CGP(r3)
            return
        L_0x1794:
            java.lang.Object r7 = r0.A01
            X.01E r7 = (X.AnonymousClass01E) r7
            java.lang.Object r6 = r0.A02
            java.lang.Object r4 = r0.A03
            android.view.Menu r4 = (android.view.Menu) r4
            java.lang.Object r1 = r0.A04
            X.4rD r1 = (X.C98474rD) r1
            java.lang.Object r3 = r0.A05
            java.util.List r3 = (java.util.List) r3
            X.C72473Md.A1I(r6, r1)
            r0 = 4
            X.C18070vi.A0d(r3, r0)
            int r8 = r1.element
            boolean r0 = r7.isFinishing()
            if (r0 != 0) goto L_0x1bf7
            android.view.MenuInflater r1 = r7.getMenuInflater()
            r0 = 2131820567(0x7f110017, float:1.9273853E38)
            r1.inflate(r0, r4)
            r0 = 2131432784(0x7f0b1550, float:1.8487335E38)
            android.view.MenuItem r0 = r4.findItem(r0)
            android.view.SubMenu r5 = r0.getSubMenu()
            X.C17960vV.A07(r5)
            r5.clear()
            r2 = 2131233368(0x7f080a58, float:1.8082872E38)
            r1 = 2130970284(0x7f0406ac, float:1.7549274E38)
            r0 = 2131101275(0x7f06065b, float:1.7814955E38)
            int r0 = X.AnonymousClass1YL.A00(r7, r1, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r7, r2, r0)
            r5.setIcon(r0)
            r0 = 2131429854(0x7f0b09de, float:1.8481392E38)
            android.view.MenuItem r1 = r4.findItem(r0)
            r0 = 0
            r1.setVisible(r0)
            java.util.Iterator r4 = r3.iterator()
        L_0x17f3:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1bf7
            java.lang.Object r3 = r4.next()
            X.6sj r3 = (X.C135766sj) r3
            android.content.res.Resources r1 = r7.getResources()
            android.graphics.drawable.Drawable r0 = r3.A00
            android.graphics.drawable.Drawable r1 = X.AnonymousClass4aX.A07(r1, r0, r8)
            X.C18070vi.A0X(r1)
            java.lang.CharSequence r0 = r3.A01
            android.view.MenuItem r2 = r5.add(r0)
            r2.setIcon(r1)
            r1 = 3
            X.4cq r0 = new X.4cq
            r0.<init>(r6, r3, r7, r1)
            r2.setOnMenuItemClickListener(r0)
            goto L_0x17f3
        L_0x181f:
            java.lang.Object r5 = r0.A01
            X.126 r5 = (X.AnonymousClass126) r5
            java.lang.Object r1 = r0.A02
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r3 = r0.A03
            X.1EC r3 = (X.AnonymousClass1EC) r3
            java.lang.Object r4 = r0.A04
            java.util.AbstractCollection r4 = (java.util.AbstractCollection) r4
            java.lang.Object r6 = r0.A05
            X.10w r6 = (X.C201110w) r6
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x1844
            X.00H r0 = r5.A19
            java.lang.Object r0 = r0.get()
            X.1fv r0 = (X.C31661fv) r0
            r0.A01(r1)
        L_0x1844:
            X.1Ux r2 = r5.A0M
            X.11P r0 = r5.A0F
            long r0 = X.AnonymousClass11P.A00(r0)
            java.util.ArrayList r0 = r2.A00(r3, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x1854:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1bf7
            java.lang.Object r2 = r3.next()
            X.23S r2 = (X.AnonymousClass23S) r2
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3Ma.A0o(r2)
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x187f
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x1854
            java.lang.Object r0 = r6.get(r1)
            X.C17960vV.A07(r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x1854
        L_0x187f:
            r0 = 1
            r2.A07 = r0
            r0 = 0
            r2.A01 = r0
            X.122 r0 = r5.A0K
            r0.CQw(r2)
            goto L_0x1854
        L_0x188c:
            java.lang.Object r8 = r0.A01
            X.A8q r8 = (X.C20130A8q) r8
            java.lang.Object r6 = r0.A02
            X.9rx r6 = (X.C194579rx) r6
            java.lang.Object r9 = r0.A03
            X.1ca r9 = (X.C29621ca) r9
            java.lang.Object r3 = r0.A04
            X.9F6 r3 = (X.AnonymousClass9F6) r3
            java.lang.Object r5 = r0.A05
            X.BBN r5 = (X.BBN) r5
            r0 = 3
            X.C18070vi.A0d(r3, r0)
            int r1 = r6.hashCode()
            java.lang.String r0 = "iqResponse"
            X.8zt r7 = r8.A08
            X.19a r4 = r7.A01
            r4.A03(r1, r0)
            java.util.Map r0 = r6.A02
            if (r0 == 0) goto L_0x18cd
            X.C17960vV.A07(r0)
            java.lang.String r2 = "action"
            java.lang.Object r1 = r0.get(r2)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x18cd
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x18cd
            int r0 = r6.hashCode()
            r7.A01(r0, r2, r1)
        L_0x18cd:
            X.C108945cZ.A1N(r9)
            java.lang.Object r3 = r3.A00
            X.2rm r2 = X.AnonymousClass8BR.A0s()
            X.A6w r1 = X.A6w.A00
            r0 = 35
            java.lang.Object r3 = X.C21290Ahb.A02(r9, r2, r3, r1, r0)
            X.9DP r3 = (X.AnonymousClass9DP) r3
            if (r3 == 0) goto L_0x1932
            java.lang.Object r2 = r3.A00
            X.9DE r2 = (X.AnonymousClass9DE) r2
            java.lang.Object r0 = r2.A03
            X.9DO r0 = (X.AnonymousClass9DO) r0
            if (r0 == 0) goto L_0x1906
            java.lang.Object r0 = r0.A00
            X.9DO r0 = (X.AnonymousClass9DO) r0
            java.lang.Object r0 = r0.A00
            java.util.Iterator r1 = X.AnonymousClass8BR.A13(r0)
        L_0x18f6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1906
            java.lang.Object r0 = r1.next()
            X.9DH r0 = (X.AnonymousClass9DH) r0
            X.C20130A8q.A08(r8, r0)
            goto L_0x18f6
        L_0x1906:
            java.lang.Object r0 = r2.A01
            X.9DO r0 = (X.AnonymousClass9DO) r0
            if (r0 == 0) goto L_0x1925
            int r2 = r6.hashCode()
            java.lang.Object r0 = r0.A00
            X.9DN r0 = (X.AnonymousClass9DN) r0
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "num_screens_to_prefetch"
            r7.A01(r2, r0, r1)
        L_0x1925:
            int r1 = r6.hashCode()
            r0 = 467(0x1d3, float:6.54E-43)
            r4.A04(r1, r0)
            r5.Bu5(r3)
            return
        L_0x1932:
            X.1UI r0 = X.AnonymousClass1O9.A00(r2)
            throw r0
        L_0x1937:
            java.lang.Object r4 = r0.A01
            X.A8q r4 = (X.C20130A8q) r4
            java.lang.Object r8 = r0.A02
            java.lang.Object r7 = r0.A03
            X.1ca r7 = (X.C29621ca) r7
            java.lang.Object r3 = r0.A04
            X.9F6 r3 = (X.AnonymousClass9F6) r3
            java.lang.Object r5 = r0.A05
            X.BBN r5 = (X.BBN) r5
            r0 = 3
            X.C18070vi.A0d(r3, r0)
            int r2 = r8.hashCode()
            java.lang.String r1 = "iqResponse"
            X.8zt r0 = r4.A08
            X.19a r6 = r0.A01
            r6.A03(r2, r1)
            X.C108945cZ.A1N(r7)
            java.lang.Object r2 = r3.A00
            X.2rm r3 = X.AnonymousClass8BR.A0s()
            X.A6w r1 = X.A6w.A00
            r0 = 37
            java.lang.Object r2 = X.C21290Ahb.A02(r7, r3, r2, r1, r0)
            X.9DP r2 = (X.AnonymousClass9DP) r2
            if (r2 == 0) goto L_0x19a0
            int r1 = r8.hashCode()
            r0 = 467(0x1d3, float:6.54E-43)
            r6.A04(r1, r0)
            java.lang.Object r0 = r2.A00
            X.9DE r0 = (X.AnonymousClass9DE) r0
            java.lang.Object r0 = r0.A03
            X.9DO r0 = (X.AnonymousClass9DO) r0
            if (r0 == 0) goto L_0x199c
            java.lang.Object r0 = r0.A00
            X.9DO r0 = (X.AnonymousClass9DO) r0
            java.lang.Object r0 = r0.A00
            java.util.Iterator r1 = X.AnonymousClass8BR.A13(r0)
        L_0x198c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x199c
            java.lang.Object r0 = r1.next()
            X.9DH r0 = (X.AnonymousClass9DH) r0
            X.C20130A8q.A08(r4, r0)
            goto L_0x198c
        L_0x199c:
            r5.Bu5(r2)
            return
        L_0x19a0:
            X.1UI r0 = X.AnonymousClass1O9.A00(r3)
            throw r0
        L_0x19a5:
            java.lang.Object r1 = r0.A01
            X.11S r1 = (X.AnonymousClass11S) r1
            java.lang.Object r2 = r0.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r5 = r0.A03
            X.0z4 r5 = (X.C19830z4) r5
            java.lang.Object r3 = r0.A04
            X.190 r3 = (X.AnonymousClass190) r3
            java.lang.Object r4 = r0.A05
            X.11P r4 = (X.AnonymousClass11P) r4
            com.whatsapp.Me r0 = r1.A07()
            if (r0 == 0) goto L_0x19cd
            java.lang.String r0 = "BackupTokenUtils/saveBackupToken/delete old phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.Me r0 = r1.A07()
            java.lang.String r0 = r0.number
            X.C20138A8z.A03(r2, r3, r5, r0)
        L_0x19cd:
            java.lang.String r0 = "BackupTokenUtils/saveBackupToken/encrypt and save (new) phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x19e0 }
            byte[] r8 = r5.A2d()     // Catch:{ IOException -> 0x19e0 }
            java.lang.String r7 = r5.A0n()     // Catch:{ IOException -> 0x19e0 }
            r9 = 1
            r6 = 0
            X.C20138A8z.A02(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x19e0 }
            return
        L_0x19e0:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenUtils/saveBackupToken/failed with IOException:"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x19e7:
            java.lang.Object r7 = r0.A01
            X.724 r7 = (X.AnonymousClass724) r7
            java.lang.Object r9 = r0.A03
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r1 = r0.A04
            X.6sH r1 = (X.C135486sH) r1
            java.lang.Object r6 = r0.A05
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r0 = 3
            X.C18070vi.A0d(r1, r0)
            r8 = 1
            X.6u5 r0 = X.AnonymousClass6WB.A00(r9)
            android.content.Context r5 = X.AnonymousClass3MY.A04(r9)
            com.whatsapp.TextEmojiLabel r4 = r0.A09
            com.whatsapp.TextEmojiLabel r3 = r0.A07
            boolean r2 = r1.A01
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            if (r2 == 0) goto L_0x1a18
            r1 = 2130971114(0x7f0409ea, float:1.7550957E38)
            r0 = 2131102444(0x7f060aec, float:1.7817326E38)
        L_0x1a18:
            int r0 = X.AnonymousClass3Ma.A00(r5, r1, r0)
            r4.setTextColor(r0)
            r3.setTextColor(r0)
            r0 = 0
            r4.setVisibility(r0)
            android.content.Context r3 = r9.getContext()
            android.text.TextPaint r2 = r4.getPaint()
            r0 = 512(0x200, float:7.175E-43)
            X.4mw r1 = new X.4mw
            r1.<init>(r8, r0)
            X.1KW r0 = r7.A0A
            java.lang.CharSequence r0 = X.C43251zV.A02(r3, r2, r1, r0, r6)
            r4.setText(r0)
            return
        L_0x1a3f:
            java.lang.Object r4 = r0.A01
            X.71y r4 = (X.C1405571y) r4
            java.lang.Object r3 = r0.A02
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.Object r2 = r0.A03
            X.02n r2 = (X.AnonymousClass02n) r2
            java.lang.Object r1 = r0.A04
            X.89c r1 = (X.C1605989c) r1
            java.lang.Object r0 = r0.A05
            X.77S r0 = (X.AnonymousClass77S) r0
            r4.A02(r2, r3, r0, r1)
            return
        L_0x1a57:
            java.lang.Object r8 = r0.A01
            X.6ws r8 = (X.C138316ws) r8
            java.lang.Object r4 = r0.A02
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r0.A03
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r6 = r0.A04
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r2 = r0.A05
            X.6cp r2 = (X.C126496cp) r2
            X.C108985cd.A1D(r6, r2)
            X.6GK r1 = r8.A02
            r7 = 0
            r5 = 1
            r13 = r7
            r9 = r1
            r10 = r4
            r11 = r7
            r12 = r3
            r14 = r5
            X.72S r11 = r9.A01(r10, r11, r12, r13, r14)
            if (r11 == 0) goto L_0x1bf7
            boolean r0 = r3 instanceof X.AnonymousClass21X
            if (r0 == 0) goto L_0x1b5c
            X.6hT r4 = new X.6hT
            r4.<init>(r3, r2, r8, r6)
            X.6ye r3 = r1.A00
            r8 = 0
            java.lang.Object r10 = r6.get()
            android.content.Context r10 = (android.content.Context) r10
            if (r10 == 0) goto L_0x1bf7
            X.1T6 r6 = r3.A05
            X.2qf r1 = new X.2qf
            r1.<init>(r8, r8, r8)
            X.1So r2 = X.C26551So.A0q
            android.net.Uri r0 = r11.A0X
            r32 = r0
            r22 = 23
            r17 = r7
            r20 = r7
            r21 = r7
            r25 = r8
            r15 = r0
            r16 = r7
            r18 = r1
            r19 = r2
            r23 = r8
            r24 = r5
            X.2ta r0 = X.C63722ta.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.34B r1 = r6.A0C(r0, r5)
            java.io.File r16 = r11.A0C()
            if (r16 == 0) goto L_0x1bf7
            android.graphics.Point r9 = r11.A03()
            if (r9 == 0) goto L_0x1bf7
            java.lang.String r0 = X.C26511Sk.A0K()
            X.C18070vi.A0X(r0)
            X.17r r6 = r3.A01
            java.io.File r8 = X.C26511Sk.A0H(r6, r0)
            X.6yp r23 = X.C1409573s.A06
            java.lang.String r31 = r11.A0F()
            X.1KW r6 = r3.A03
            r17 = r6
            X.0vb r15 = r3.A02
            X.1Sw r14 = r3.A09
            X.0ve r13 = r3.A04
            X.1Nq r12 = r3.A06
            X.1T1 r6 = r3.A00
            r24 = r10
            r25 = r6
            r26 = r15
            r27 = r17
            r28 = r13
            r29 = r12
            r30 = r14
            X.73s r6 = r23.A02(r24, r25, r26, r27, r28, r29, r30, r31)
            if (r6 == 0) goto L_0x1b00
            r6.A0C(r8)
        L_0x1b00:
            android.graphics.RectF r24 = r11.A06()
            int r10 = r9.x
            int r8 = r9.y
            r6 = 0
            X.C18070vi.A0d(r2, r6)
            java.lang.String r18 = r32.toString()
            X.CmO r12 = new X.CmO
            r26 = r7
            r30 = r6
            r31 = r6
            r32 = r6
            r23 = r12
            r25 = r7
            r27 = r10
            r28 = r8
            r29 = r6
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r28 = X.C63972u0.A06(r2)
            r23 = 0
            r19 = r7
            r27 = r6
            r30 = r5
            r33 = r6
            r34 = r6
            r35 = r6
            r13 = r7
            X.2kI r11 = new X.2kI
            r21 = r6
            r25 = r23
            r29 = r5
            r15 = r7
            r17 = r0
            r14 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.1T5 r0 = r3.A07
            X.2gh r2 = r0.A01(r1, r11)
            r0 = 25
            X.7Nc r1 = new X.7Nc
            r1.<init>(r4, r0)
            X.1TJ r0 = r2.A05
            r0.A03(r1, r7)
            return
        L_0x1b5c:
            X.C138316ws.A00(r11, r3, r8, r6)
            return
        L_0x1b60:
            java.lang.Object r2 = r0.A01
            com.whatsapp.storage.StorageUsageActivity r2 = (com.whatsapp.storage.StorageUsageActivity) r2
            java.lang.Object r6 = r0.A02
            X.6gb r6 = (X.C128736gb) r6
            java.lang.Object r5 = r0.A03
            X.6ga r5 = (X.C128726ga) r5
            java.lang.Object r4 = r0.A04
            X.6ga r4 = (X.C128726ga) r4
            java.lang.Object r3 = r0.A05
            X.6jP r3 = (X.C130426jP) r3
            r0 = 4
            X.C18070vi.A0d(r3, r0)
            X.5lJ r1 = r2.A0H
            if (r1 != 0) goto L_0x1b83
            java.lang.String r0 = "storageUsageAdapter"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x1b83:
            if (r6 == 0) goto L_0x1b93
            X.6gb r0 = r1.A03
            if (r0 != 0) goto L_0x1b93
            r1.A03 = r6
            r0 = 1
            int r0 = X.C112335lJ.A02(r1, r0)
            r1.A0G(r0)
        L_0x1b93:
            if (r5 == 0) goto L_0x1b9e
            X.6ga r0 = r1.A02
            if (r0 != 0) goto L_0x1b9e
            r1.A02 = r5
            X.C112335lJ.A03(r1)
        L_0x1b9e:
            if (r4 == 0) goto L_0x1ba9
            X.6ga r0 = r1.A01
            if (r0 != 0) goto L_0x1ba9
            r1.A01 = r4
            X.C112335lJ.A03(r1)
        L_0x1ba9:
            java.lang.Long r0 = r3.A04
            if (r0 == 0) goto L_0x1bb7
            java.lang.String r0 = "storage-usage-activity/fetch cache/fetched media size"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6R0 r0 = X.AnonymousClass6R0.MEDIA_SIZE
            com.whatsapp.storage.StorageUsageActivity.A0V(r0, r2)
        L_0x1bb7:
            if (r5 == 0) goto L_0x1bc3
            java.lang.String r0 = "storage-usage-activity/fetch cache/fetched large files"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6R0 r0 = X.AnonymousClass6R0.LARGE_FILES
            com.whatsapp.storage.StorageUsageActivity.A0V(r0, r2)
        L_0x1bc3:
            if (r4 == 0) goto L_0x1bf7
            java.lang.String r0 = "storage-usage-activity/fetch cache/fetched forwarded files"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6R0 r0 = X.AnonymousClass6R0.FORWARDED_FILES
            com.whatsapp.storage.StorageUsageActivity.A0V(r0, r2)
            return
        L_0x1bd0:
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A02
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r0.A03
            X.3M2 r3 = (X.AnonymousClass3M2) r3
            java.lang.Object r2 = r0.A04
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.Object r1 = r0.A05
            X.206 r1 = (X.AnonymousClass206) r1
            android.graphics.BitmapFactory$Options r0 = X.C32021gV.A0E
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x1bf7
            r3.CMa(r2, r4, r1)
            return
        L_0x1bf2:
            if (r5 == 0) goto L_0x1bf7
            r5.close()
        L_0x1bf7:
            return
        L_0x1bf8:
            java.lang.Object r5 = r0.A01
            X.3M2 r5 = (X.AnonymousClass3M2) r5
            java.lang.Object r4 = r0.A02
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r0.A03
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r2 = r0.A04
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r1 = r0.A05
            X.2SA r1 = (X.AnonymousClass2SA) r1
            android.graphics.BitmapFactory$Options r0 = X.C32021gV.A0E
            r5.CMa(r3, r4, r2)
            r0 = 0
            r1.A02(r0)
            return
        L_0x1c16:
            java.lang.Object r4 = r0.A01
            X.6wU r4 = (X.C138076wU) r4
            java.lang.Object r3 = r0.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r0.A03
            X.77S r2 = (X.AnonymousClass77S) r2
            java.lang.Object r1 = r0.A04
            X.6n1 r1 = (X.C132566n1) r1
            java.lang.Object r0 = r0.A05
            X.705 r0 = (X.AnonymousClass705) r0
            X.C138076wU.A00(r0, r2, r1, r4, r3)
            return
        L_0x1c2e:
            java.lang.Object r7 = r0.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r7 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r7
            java.lang.Object r6 = r0.A02
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r5 = r0.A03
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r4 = r0.A04
            X.6Sn r4 = (X.C122946Sn) r4
            java.lang.Object r3 = r0.A05
            X.6p4 r3 = (X.C133616p4) r3
            X.00H r0 = r7.A02
            if (r0 == 0) goto L_0x1c5c
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 0
            X.7KW r0 = new X.7KW
            r0.<init>(r4, r6, r5, r1)
            r2.notifyAllObservers(r0)
            if (r3 == 0) goto L_0x1c58
            r3.A00()
        L_0x1c58:
            r7.finish()
            return
        L_0x1c5c:
            java.lang.String r0 = "accountLinkingResultObservers"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21468AkZ.run():void");
    }

    public C21468AkZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A00 = i;
        this.A05 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A04 = obj5;
    }

    public C21468AkZ(Bitmap bitmap, C24986CSm cSm, E7R e7r, C24851CMu cMu, C22810BPy bPy) {
        this.A00 = 7;
        this.A02 = bPy;
        this.A03 = cSm;
        this.A01 = bitmap;
        this.A05 = cMu;
        this.A04 = e7r;
    }

    public C21468AkZ(C26154CtM ctM, CJ1 cj1, CTB ctb, C22563BCy bCy, Object obj) {
        this.A00 = 4;
        this.A01 = ctM;
        this.A02 = bCy;
        this.A03 = cj1;
        this.A05 = ctb;
        this.A04 = obj;
    }

    public C21468AkZ(C190889lg r2, C191589mq r3, C187129fJ r4, A4D a4d, List list) {
        this.A00 = 6;
        this.A01 = r4;
        this.A04 = list;
        this.A05 = r2;
        this.A03 = r3;
        this.A02 = a4d;
    }
}
