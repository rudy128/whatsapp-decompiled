package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.1dI  reason: invalid class name and case insensitive filesystem */
public class C30041dI implements C30031dH {
    public AnonymousClass26v A00;
    public Handler A01;
    public final AnonymousClass11C A02;
    public final C29781cr A03;
    public final C219017v A04;
    public final C29971dB A05;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r6 != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A00() {
        /*
            r8 = this;
            X.26v r0 = r8.A00
            X.C17960vV.A07(r0)
            android.net.Network r1 = r0.A00
            if (r1 == 0) goto L_0x0045
            r7 = 1
            long r2 = r1.getNetworkHandle()
        L_0x000e:
            X.11C r0 = r8.A02
            android.net.ConnectivityManager r0 = r0.A0E()
            r6 = 0
            if (r0 == 0) goto L_0x002f
            if (r1 == 0) goto L_0x002f
            android.net.NetworkCapabilities r1 = r0.getNetworkCapabilities(r1)
            if (r1 == 0) goto L_0x002f
            r0 = 1
            boolean r0 = r1.hasTransport(r0)
            if (r0 == 0) goto L_0x002f
            r0 = 17
            boolean r0 = r1.hasCapability(r0)
            if (r0 == 0) goto L_0x002f
            r6 = 1
        L_0x002f:
            r5 = 1
            r4 = 0
            X.1cr r0 = r8.A03
            r0.A00()
            X.17v r1 = r8.A04
            if (r7 == 0) goto L_0x003d
            r0 = 1
            if (r6 == 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r1.A0C(r2, r0, r4)
            r1.A0G(r6, r5)
            return
        L_0x0045:
            r7 = 0
            r2 = -1
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30041dI.A00():void");
    }

    public long BPz() {
        Network activeNetwork;
        ConnectivityManager A0E = this.A02.A0E();
        if (A0E == null || (activeNetwork = A0E.getActiveNetwork()) == null) {
            return -1;
        }
        return activeNetwork.getNetworkHandle();
    }

    public void CFW() {
        Handler handler = this.A01;
        C17960vV.A07(handler);
        handler.post(new C70593Bs(this, 10));
    }

    public void CNt(Handler handler) {
        boolean z = false;
        if (this.A00 == null) {
            z = true;
        }
        C17960vV.A0D(z);
        this.A01 = handler;
        this.A00 = new AnonymousClass26v(this);
        ConnectivityManager A0E = this.A02.A0E();
        if (A0E != null) {
            try {
                A0E.registerDefaultNetworkCallback(this.A00, handler);
            } catch (SecurityException unused) {
            }
        } else {
            Log.e("xmpp/handler/network/startNetworkCallbacks cm null");
        }
    }

    public void COY() {
        boolean z = false;
        if (this.A00 != null) {
            z = true;
        }
        C17960vV.A0D(z);
        ConnectivityManager A0E = this.A02.A0E();
        if (A0E != null) {
            A0E.unregisterNetworkCallback(this.A00);
        }
        this.A00 = null;
        this.A01 = null;
    }

    public boolean isConnected() {
        AnonymousClass26v r0 = this.A00;
        if (r0 == null || r0.A00 == null) {
            return false;
        }
        return true;
    }

    public C30041dI(AnonymousClass11C r1, C29781cr r2, C219017v r3, C29971dB r4) {
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
    }
}
