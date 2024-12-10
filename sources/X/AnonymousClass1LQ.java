package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* renamed from: X.1LQ  reason: invalid class name */
public class AnonymousClass1LQ extends BroadcastReceiver {
    public final Context A00;
    public final AnonymousClass11E A01;
    public final AnonymousClass12L A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass00H A06;

    public static AnonymousClass1LR A00(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        boolean z = true;
        boolean z2 = false;
        if (networkInfo.getType() == 1) {
            z2 = true;
        }
        if (networkInfo.getType() != 0) {
            z = false;
        }
        return new AnonymousClass1LR(networkInfo.getTypeName(), networkInfo.getSubtypeName(), networkInfo.getSubtype(), z2, z, networkInfo.isConnected(), networkInfo.isRoaming());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass1LQ r9) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r5 = r9
            if (r1 < r0) goto L_0x004f
            X.12L r0 = r9.A02
            X.0ve r2 = r0.A00
            r1 = 614(0x266, float:8.6E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x004f
            boolean r4 = r9.A02()
        L_0x0019:
            X.00H r0 = r5.A06
            java.lang.Object r0 = r0.get()
            X.1Kh r0 = (X.C24431Kh) r0
            android.net.NetworkInfo r0 = r0.A01()
            X.1LR r3 = A00(r0)
            long r1 = android.os.SystemClock.uptimeMillis()
            if (r4 == 0) goto L_0x0034
            X.11E r0 = r5.A01
            r0.A08(r3)
        L_0x0034:
            java.lang.Boolean r0 = X.C17970vW.A03
            X.2mn r4 = new X.2mn
            r4.<init>(r3, r1)
            X.11E r3 = r5.A01
            X.00H r0 = r3.A03
            r0.get()
            X.11A r2 = r3.A02
            r1 = 14
            X.3Bv r0 = new X.3Bv
            r0.<init>(r3, r4, r1)
            r2.A00(r0)
            return
        L_0x004f:
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r6 = new android.content.IntentFilter
            r6.<init>(r0)
            X.00H r0 = r9.A03
            java.lang.Object r3 = r0.get()
            X.1cw r3 = (X.C29831cw) r3
            android.content.Context r4 = r9.A00
            X.00H r0 = r9.A04
            java.lang.Object r0 = r0.get()
            X.1Nc r0 = (X.C25151Nc) r0
            android.os.Looper r0 = r0.A00()
            android.os.Handler r8 = new android.os.Handler
            r8.<init>(r0)
            r9 = 1
            r7 = 0
            r3.A00(r4, r5, r6, r7, r8, r9)
            r4 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LQ.A01(X.1LQ):void");
    }

    private boolean A02() {
        return this.A01.A0C();
    }

    public void onReceive(Context context, Intent intent) {
        this.A01.A07();
    }

    public AnonymousClass1LQ(Context context, AnonymousClass11E r2, AnonymousClass11P r3, AnonymousClass12L r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        this.A05 = r3;
        this.A00 = context;
        this.A02 = r4;
        this.A06 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A01 = r2;
    }
}
