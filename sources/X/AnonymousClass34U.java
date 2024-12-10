package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.34U  reason: invalid class name */
public class AnonymousClass34U implements C30031dH {
    public BroadcastReceiver A00;
    public Handler A01;
    public final AnonymousClass11E A02;
    public final C24431Kh A03;
    public final C29831cw A04;
    public final C29781cr A05;
    public final AnonymousClass118 A06;
    public final C219017v A07;

    public void CNt(Handler handler) {
        this.A01 = handler;
        Context context = this.A06.A00;
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        C161128Bv r2 = new C161128Bv(this, 12);
        this.A00 = r2;
        if (this.A04.A00(context, r2, intentFilter, (String) null, handler, true) == null) {
            C17960vV.A07(handler);
            if (!handler.post(new C70593Bs(this, 11))) {
                Log.w("failed to post checkNetworkState isRetry: false");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (X.AnonymousClass11E.A01() == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass34U r7, boolean r8) {
        /*
            X.1Kh r0 = r7.A03
            android.net.NetworkInfo r2 = r0.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "xmpp/handler/network/active "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " isRetry="
            X.C17900vP.A0n(r0, r1, r8)
            r6 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0049
            boolean r4 = r2.isConnected()
            int r1 = r2.getType()
            boolean r0 = X.AnonymousClass000.A1T(r1, r6)
            if (r4 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0033
            boolean r0 = X.AnonymousClass11E.A01()
            r3 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            X.1cr r0 = r7.A05
            r0.A00()
            X.17v r2 = r7.A07
            if (r4 == 0) goto L_0x0047
            if (r3 != 0) goto L_0x0047
        L_0x003f:
            long r0 = (long) r1
            r2.A0C(r0, r6, r5)
            r2.A0G(r3, r8)
            return
        L_0x0047:
            r6 = 0
            goto L_0x003f
        L_0x0049:
            r1 = -1
            r4 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34U.A00(X.34U, boolean):void");
    }

    public long BPz() {
        NetworkInfo A012 = this.A03.A01();
        if (A012 != null) {
            return (long) A012.getType();
        }
        return -1;
    }

    public void CFW() {
        Handler handler = this.A01;
        C17960vV.A07(handler);
        handler.post(new C70593Bs(this, 12));
    }

    public void COY() {
        this.A04.A02(this.A00, this.A06.A00);
        this.A00 = null;
        this.A01 = null;
    }

    public boolean isConnected() {
        NetworkInfo A012 = this.A03.A01();
        if (A012 == null || !A012.isConnected()) {
            return false;
        }
        return true;
    }

    public AnonymousClass34U(AnonymousClass11E r1, C24431Kh r2, C29831cw r3, C29781cr r4, AnonymousClass118 r5, C219017v r6) {
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
        this.A02 = r1;
    }
}
