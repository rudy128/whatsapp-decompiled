package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.8CR  reason: invalid class name */
public class AnonymousClass8CR extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C20075A6b A00;
    public final /* synthetic */ ScheduledFuture A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ void A00(Network network, ScheduledFuture scheduledFuture, boolean z) {
        scheduledFuture.cancel(false);
        C20075A6b a6b = this.A00;
        if (a6b.A00 == null) {
            Log.i("voip/weak-wifi/onAvailable: network callback is already unregistered");
        } else if (a6b.A02 != null) {
            Log.i("voip/weak-wifi/onAvailable: onAvailable() is called multiple times");
            Voip.notifyLostOfAlternativeNetwork();
        } else {
            C20075A6b.A00(network, a6b, z);
        }
    }

    public /* synthetic */ void A01(ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
        if (this.A00.A00 == null) {
            Log.i("voip/weak-wifi/onLost: network callback is already unregistered");
        } else {
            Voip.notifyLostOfAlternativeNetwork();
        }
    }

    public /* synthetic */ void A02(ScheduledFuture scheduledFuture, boolean z) {
        scheduledFuture.cancel(false);
        C20075A6b a6b = this.A00;
        if (a6b.A00 == null) {
            Log.i("voip/weak-wifi/onUnavailable: network callback is already unregistered");
            return;
        }
        a6b.A00 = null;
        a6b.A01 = null;
        Voip.notifyFailureToCreateAlternativeSocket(z);
    }

    public AnonymousClass8CR(C20075A6b a6b, ScheduledFuture scheduledFuture, boolean z) {
        this.A00 = a6b;
        this.A01 = scheduledFuture;
        this.A02 = z;
    }

    public void onAvailable(Network network) {
        Log.i("voip/weak-wifi/onAvailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
            return;
        }
        scheduledExecutorService.execute(new AnonymousClass7RT(this, this.A01, network, 9, this.A02));
    }

    public void onLost(Network network) {
        Log.i("voip/weak-wifi/onLost");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new C21431Ajy(this, this.A01, 1));
        }
    }

    public void onUnavailable() {
        Log.i("voip/weak-wifi/onUnavailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new AnonymousClass7RF(this, this.A01, 14, this.A02));
        }
    }
}
