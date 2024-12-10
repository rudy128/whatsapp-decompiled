package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Csk  reason: case insensitive filesystem */
public final class C26122Csk {
    public static HandlerThread A05;
    public static C26122Csk A06;
    public static final Object A07 = C17880vN.A0p();
    public final Context A00;
    public final C26111CsX A01;
    public final HashMap A02;
    public final C26369CyV A03;
    public volatile Handler A04;

    public C26122Csk() {
    }

    public static C26122Csk A00(Context context) {
        synchronized (A07) {
            if (A06 == null) {
                A06 = new C26122Csk(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return A06;
    }

    public final void A01(ServiceConnection serviceConnection, C26021Cqe cqe) {
        IllegalStateException illegalStateException;
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            Cy0 cy0 = (Cy0) hashMap.get(cqe);
            if (cy0 != null) {
                Map map = cy0.A05;
                if (map.containsKey(serviceConnection)) {
                    map.remove(serviceConnection);
                    if (map.isEmpty()) {
                        this.A04.sendMessageDelayed(this.A04.obtainMessage(0, cqe), 5000);
                    }
                } else {
                    String obj = cqe.toString();
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    illegalStateException = AnonymousClass000.A0o(obj, A10);
                }
            } else {
                String obj2 = cqe.toString();
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Nonexistent connection status for service config: ");
                illegalStateException = AnonymousClass000.A0o(obj2, A102);
            }
            throw illegalStateException;
        }
    }

    public final boolean A02(ServiceConnection serviceConnection, C26021Cqe cqe, String str) {
        boolean z;
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            Cy0 cy0 = (Cy0) hashMap.get(cqe);
            if (cy0 == null) {
                cy0 = new Cy0(cqe, this);
                cy0.A05.put(serviceConnection, serviceConnection);
                cy0.A00(str);
                hashMap.put(cqe, cy0);
            } else {
                this.A04.removeMessages(0, cqe);
                Map map = cy0.A05;
                if (!map.containsKey(serviceConnection)) {
                    map.put(serviceConnection, serviceConnection);
                    int i = cy0.A00;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(cy0.A01, cy0.A02);
                    } else if (i == 2) {
                        cy0.A00(str);
                    }
                } else {
                    String obj = cqe.toString();
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    throw AnonymousClass000.A0o(obj, A10);
                }
            }
            z = cy0.A03;
        }
        return z;
    }

    public C26122Csk(Context context, Looper looper) {
        this.A02 = C17880vN.A11();
        C26369CyV cyV = new C26369CyV(this);
        this.A03 = cyV;
        this.A00 = context.getApplicationContext();
        this.A04 = new BG7(looper, cyV);
        this.A01 = C26111CsX.A00();
    }
}
