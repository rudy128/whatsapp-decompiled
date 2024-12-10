package X;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: X.1eb  reason: invalid class name and case insensitive filesystem */
public final class C30841eb extends BroadcastReceiver {
    public static final C30841eb A08 = new C30841eb(0);
    public AnonymousClass11C A00;
    public AnonymousClass12L A01;
    public AnonymousClass1LD A02;
    public AnonymousClass11A A03;
    public AnonymousClass10I A04;
    public C200710s A05;
    public final Object A06;
    public volatile boolean A07;

    public static boolean A00(AnonymousClass11C r2) {
        AnonymousClass11C.A0P = true;
        PowerManager A0G = r2.A0G();
        KeyguardManager A062 = r2.A06();
        AnonymousClass11C.A0P = false;
        if (A0G == null || !A0G.isScreenOn()) {
            return true;
        }
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            return false;
        }
        Boolean bool = C17970vW.A03;
        if (!A062.isKeyguardLocked() || !A062.inKeyguardRestrictedInputMode()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x0053
            java.lang.Object r2 = r4.A06
            monitor-enter(r2)
            boolean r0 = r4.A07     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x004e
            java.lang.Object r0 = X.C02800Fk.A00(r5)     // Catch:{ all -> 0x0050 }
            X.00c r0 = (X.C000100c) r0     // Catch:{ all -> 0x0050 }
            X.10E r0 = (X.AnonymousClass10E) r0     // Catch:{ all -> 0x0050 }
            X.10E r0 = r0.Ao8     // Catch:{ all -> 0x0050 }
            X.10G r0 = r0.A00     // Catch:{ all -> 0x0050 }
            X.10E r1 = r0.AJU     // Catch:{ all -> 0x0050 }
            X.00S r0 = r1.AAp     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0050 }
            X.11C r0 = (X.AnonymousClass11C) r0     // Catch:{ all -> 0x0050 }
            r4.A00 = r0     // Catch:{ all -> 0x0050 }
            X.00S r0 = r1.A9j     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0050 }
            X.1LD r0 = (X.AnonymousClass1LD) r0     // Catch:{ all -> 0x0050 }
            r4.A02 = r0     // Catch:{ all -> 0x0050 }
            X.00S r0 = r1.AC1     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0050 }
            X.10I r0 = (X.AnonymousClass10I) r0     // Catch:{ all -> 0x0050 }
            r4.A04 = r0     // Catch:{ all -> 0x0050 }
            X.00S r0 = r1.A90     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0050 }
            X.12L r0 = (X.AnonymousClass12L) r0     // Catch:{ all -> 0x0050 }
            r4.A01 = r0     // Catch:{ all -> 0x0050 }
            X.00S r0 = r1.A62     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0050 }
            X.11A r0 = (X.AnonymousClass11A) r0     // Catch:{ all -> 0x0050 }
            r4.A03 = r0     // Catch:{ all -> 0x0050 }
            r0 = 1
            r4.A07 = r0     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            goto L_0x0053
        L_0x0050:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            throw r0
        L_0x0053:
            java.lang.String r1 = r6.getAction()
            if (r1 == 0) goto L_0x0060
            int r0 = r1.hashCode()
            switch(r0) {
                case -2128145023: goto L_0x008f;
                case -1454123155: goto L_0x009a;
                case 823795052: goto L_0x00a5;
                default: goto L_0x0060;
            }
        L_0x0060:
            java.lang.String r3 = "unknown"
        L_0x0063:
            X.12L r0 = r4.A01
            X.0ve r2 = r0.A00
            r1 = 11755(0x2deb, float:1.6472E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00b1
            X.10s r2 = r4.A05
            if (r2 != 0) goto L_0x007f
            X.10I r1 = r4.A04
            r0 = 0
            X.10s r2 = new X.10s
            r2.<init>(r1, r0)
            r4.A05 = r2
        L_0x007f:
            r2.A03()
            X.10s r2 = r4.A05
            r1 = 9
            X.7RS r0 = new X.7RS
            r0.<init>(r1, r3, r4)
            r2.execute(r0)
            return
        L_0x008f:
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r3 = "off"
            goto L_0x0063
        L_0x009a:
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r3 = "on"
            goto L_0x0063
        L_0x00a5:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r3 = "unlock"
            goto L_0x0063
        L_0x00b1:
            X.1LD r0 = r4.A02
            r0.A01()
            X.11C r0 = r4.A00
            boolean r1 = A00(r0)
            X.1LD r0 = r4.A02
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30841eb.onReceive(android.content.Context, android.content.Intent):void");
    }

    public C30841eb(int i) {
        this.A07 = false;
        this.A06 = new Object();
    }

    public C30841eb() {
        this(0);
    }
}
