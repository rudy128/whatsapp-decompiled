package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1kM  reason: invalid class name and case insensitive filesystem */
public class C34361kM {
    public AnonymousClass3DM A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C32501hI A02;
    public final AnonymousClass1P3 A03;
    public final AnonymousClass1U5 A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C25571Os A08;

    public void A00(DeviceJid deviceJid) {
        StringBuilder sb = new StringBuilder();
        sb.append("Prekey request returned none or signature invalid; jid=");
        sb.append(deviceJid);
        Log.i(sb.toString());
        C60002nE A022 = C63962tz.A02(deviceJid);
        C25571Os r0 = this.A08;
        C71363Ez A002 = C25571Os.A00(A022, r0);
        C25571Os.A03(A002, r0);
        try {
            this.A03.A0a((C58252kO) null, A022);
            C32501hI r2 = this.A02;
            synchronized (r2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("prekeysmanager/onGetPreKeyNone ");
                sb2.append(deviceJid);
                Log.i(sb2.toString());
                r2.A08.remove(deviceJid);
            }
            if (deviceJid.getDevice() != 0) {
                this.A04.A0B(deviceJid, true);
            }
            if (A002 != null) {
                A002.close();
            }
        } catch (Throwable th) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x000e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.List r21) {
        /*
            r20 = this;
            java.lang.String r0 = "RecvPreKeyMessageListener/processPrekeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r6 = r21.iterator()
        L_0x000e:
            boolean r0 = r6.hasNext()
            r3 = r20
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r6.next()
            X.2gT r0 = (X.C55852gT) r0
            com.whatsapp.jid.DeviceJid r15 = r0.A01
            byte[] r11 = r0.A05
            byte[] r12 = r0.A06
            byte[] r1 = r0.A04
            byte r13 = r0.A00
            X.2eE r9 = r0.A02
            X.2eE r10 = r0.A03
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "prekey request successful; initiating signal protocol session; jid="
            r2.append(r0)
            r2.append(r15)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Os r0 = r3.A08
            X.3Ez r5 = r0.A08(r15)
            int r0 = r15.getDevice()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0063
            X.1U5 r14 = r3.A04     // Catch:{ all -> 0x0094 }
            r19 = 4
            r16 = r1
            r17 = r11
            r18 = r13
            boolean r0 = r14.A0E(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "recvprekeymessagelistener/onGetPreKeySuccess adv verification fails"
        L_0x005c:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0094 }
            r3.A00(r15)     // Catch:{ all -> 0x0094 }
            goto L_0x008d
        L_0x0063:
            X.2nE r8 = X.C63962tz.A02(r15)     // Catch:{ all -> 0x0094 }
            X.1P3 r7 = r3.A03     // Catch:{ all -> 0x0094 }
            int r2 = r7.A07(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0094 }
            if (r2 != 0) goto L_0x0070
            goto L_0x0082
        L_0x0070:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r1.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "Error received from SignalCoordinator; status="
            r1.append(r0)     // Catch:{ all -> 0x0094 }
            r1.append(r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0094 }
            goto L_0x005c
        L_0x0082:
            r0 = 0
            if (r9 != 0) goto L_0x0086
            r0 = 1
        L_0x0086:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0094 }
            r4.put(r15, r0)     // Catch:{ all -> 0x0094 }
        L_0x008d:
            if (r5 == 0) goto L_0x000e
            r5.close()
            goto L_0x000e
        L_0x0094:
            r1 = move-exception
            if (r5 == 0) goto L_0x009f
            r5.close()     // Catch:{ all -> 0x009b }
            throw r1
        L_0x009b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x009f:
            throw r1
        L_0x00a0:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00b2
            android.os.Handler r2 = r3.A01
            r1 = 37
            X.3By r0 = new X.3By
            r0.<init>(r3, r4, r1)
            r2.post(r0)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34361kM.A01(java.util.List):void");
    }

    public C34361kM(C32501hI r3, AnonymousClass1P3 r4, C25571Os r5, AnonymousClass1U5 r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        this.A05 = r7;
        this.A08 = r5;
        this.A03 = r4;
        this.A06 = r8;
        this.A04 = r6;
        this.A02 = r3;
        this.A07 = r9;
    }
}
