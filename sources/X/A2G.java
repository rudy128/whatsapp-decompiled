package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;

public abstract class A2G {
    public static final IntentFilter A08 = new AnonymousClass8CC();
    public WifiP2pManager.Channel A00;
    public WifiP2pManager A01;
    public AnonymousClass8Bq A02;
    public BCZ A03;
    public String A04;
    public final C29831cw A05;
    public final AnonymousClass118 A06;
    public final HandlerThread A07;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.8Bq, android.content.BroadcastReceiver] */
    public final void A03(BCZ bcz, String str) {
        String str2;
        C18070vi.A0d(str, 0);
        this.A03 = bcz;
        if (this.A01 == null || this.A00 == null) {
            Context context = this.A06.A00;
            WifiP2pManager wifiP2pManager = (WifiP2pManager) C19740yt.A06(context, WifiP2pManager.class);
            this.A01 = wifiP2pManager;
            if (wifiP2pManager != null) {
                WifiP2pManager.Channel initialize = wifiP2pManager.initialize(context, this.A07.getLooper(), new AAE(this));
                this.A00 = initialize;
                if (initialize != null) {
                    wifiP2pManager.clearServiceRequests(initialize, (WifiP2pManager.ActionListener) null);
                    wifiP2pManager.stopPeerDiscovery(initialize, (WifiP2pManager.ActionListener) null);
                    wifiP2pManager.clearLocalServices(initialize, (WifiP2pManager.ActionListener) null);
                    wifiP2pManager.removeGroup(initialize, (WifiP2pManager.ActionListener) null);
                    ? broadcastReceiver = new BroadcastReceiver();
                    broadcastReceiver.A00 = bcz;
                    this.A02 = broadcastReceiver;
                    C29831cw r2 = this.A05;
                    C18070vi.A0X(context);
                    r2.A00(context, this.A02, A08, C19620yd.A0B, (Handler) null, false);
                    this.A04 = AnonymousClass000.A0y("_chattransfer._whatsapp.com", AnonymousClass000.A11(str));
                    Log.i("p2p/WifiDirectManager/ initialize/success");
                    return;
                }
                str2 = " p2p/WifiDirectManager/ Unable to initialize channel";
            } else {
                str2 = "p2p/WifiDirectManager/ Unable to get WifiP2pManager";
            }
            Log.i(str2);
            A01();
            return;
        }
        Log.w("p2p/WifiDirectManager/ Already initialized, do not need to initialize twice");
    }

    public final void A01() {
        Log.i("p2p/WifiDirectManager/ shutting down WiFi Direct");
        this.A03 = null;
        WifiP2pManager.Channel channel = this.A00;
        if (channel != null) {
            WifiP2pManager wifiP2pManager = this.A01;
            if (wifiP2pManager != null) {
                wifiP2pManager.clearServiceRequests(channel, (WifiP2pManager.ActionListener) null);
                wifiP2pManager.stopPeerDiscovery(channel, (WifiP2pManager.ActionListener) null);
                wifiP2pManager.clearLocalServices(channel, (WifiP2pManager.ActionListener) null);
                wifiP2pManager.removeGroup(channel, (WifiP2pManager.ActionListener) null);
            }
            if (AnonymousClass112.A04()) {
                channel.close();
            }
        }
        this.A01 = null;
        this.A00 = null;
        A02();
        HandlerThread handlerThread = this.A07;
        handlerThread.quit();
        handlerThread.interrupt();
    }

    public final void A02() {
        AnonymousClass8Bq r2 = this.A02;
        if (r2 != null) {
            try {
                r2.A00 = null;
                this.A05.A02(r2, C108945cZ.A0E(this.A06));
            } catch (IllegalArgumentException e) {
                Log.e("p2p/WifiDirectManager/ Receiver not registered", e);
            }
        }
        this.A02 = null;
    }

    public A2G(C29831cw r3, AnonymousClass118 r4) {
        this.A06 = r4;
        this.A05 = r3;
        HandlerThread handlerThread = new HandlerThread("WifiDirectCallbackHandler");
        this.A07 = handlerThread;
        handlerThread.start();
    }
}
